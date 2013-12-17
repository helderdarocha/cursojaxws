/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.argonavis.filmes.soap.provider;

import com.argonavis.filmes.entity.Filme;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.ws.Provider;
import javax.xml.ws.Service;
import javax.xml.ws.ServiceMode;
import javax.xml.ws.WebServiceProvider;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@WebServiceProvider(wsdlLocation = "WEB-INF/wsdl/FilmeFacadeProvider/FilmeFacadeProvider.xsd",
        targetNamespace = "http://soap.filmes.argonavis.com/",
        serviceName = "FilmeFacadeService",
        portName = "FilmeFacadePort")
@ServiceMode(Service.Mode.PAYLOAD)
public class FilmeFacadeProvider implements Provider<Source> {

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    @PersistenceContext(unitName = "FilmesServiceSoap")
    EntityManager em;

    @Override
    public Source invoke(Source source) {
        try {

            DOMResult dom = new DOMResult();
            Transformer trans = TransformerFactory.newInstance().newTransformer();
            trans.transform(source, dom);
            Document document = (Document) dom.getNode();
            Element root = document.getDocumentElement();
            String op = root.getLocalName();
            if ("getFilmes".equals(op)) {
                return sendGetFilmes();
            } else if ("getFilme".equals(op)) {
                String input = root.getFirstChild().getNodeValue();
                return sendGetFilme(input);
            }
            return new DOMSource();
        } catch (Exception e) {
            throw new RuntimeException("Error in provider endpoint", e);
        }
    }

    private Source sendGetFilmes() throws ParserConfigurationException {
        List<Filme> filmes = getFilmes();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document newDocument = documentBuilder.newDocument();

        Element rootElement = newDocument.createElementNS("http://soap.filmes.argonavis.com/", "ans1:getFilmesResponse");
        for (Filme filme : filmes) {
            Element resultNode = buildResult(filme, newDocument);
            rootElement.appendChild(resultNode);
        }

        return new DOMSource(rootElement);
    }

    private Source sendGetFilme(String input) throws ParserConfigurationException {
        System.out.println(input);
        Filme filme = getFilme(input);
        
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document newDocument = documentBuilder.newDocument();

        Element rootElement = newDocument.createElementNS("http://soap.filmes.argonavis.com/", "ans1:getFilmeResponse");
        Element resultNode = buildResult(filme, newDocument);
        rootElement.appendChild(resultNode);

        return new DOMSource(rootElement);
    }

    private Element buildResult(Filme filme, Document newDocument) {
        Element resultNode = newDocument.createElementNS(null, "return");

        Element ano = newDocument.createElement("ano");
        ano.appendChild(newDocument.createTextNode("" + filme.getAno()));
        resultNode.appendChild(ano);
        Element diretor = newDocument.createElement("diretor");
        diretor.appendChild(newDocument.createTextNode(filme.getDiretor()));
        resultNode.appendChild(diretor);
        Element duracao = newDocument.createElement("duracao");
        duracao.appendChild(newDocument.createTextNode("" + filme.getDuracao()));
        resultNode.appendChild(duracao);
        Element id = newDocument.createElement("id");
        id.appendChild(newDocument.createTextNode("" + filme.getId()));
        resultNode.appendChild(id);
        Element imdb = newDocument.createElement("imdb");
        imdb.appendChild(newDocument.createTextNode(filme.getImdb()));
        resultNode.appendChild(imdb);
        Element titulo = newDocument.createElement("titulo");
        titulo.appendChild(newDocument.createTextNode(filme.getTitulo()));
        resultNode.appendChild(titulo);
        
        return resultNode;
    }
    
    public Filme getFilme(String imdbCode) {
        String jpql = "select filme from Filme filme where filme.imdb = :imdb";
        Query query = em.createQuery(jpql);
        query.setParameter("imdb", imdbCode);
        Filme filme = (Filme) query.getSingleResult();
        return filme;
    }

    public List<Filme> getFilmes() {
        String jpql = "select filme from Filme filme";
        Query query = em.createQuery(jpql);
        return (List<Filme>) query.getResultList();
    }
}
