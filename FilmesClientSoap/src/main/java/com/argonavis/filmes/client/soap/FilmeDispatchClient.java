package com.argonavis.filmes.client.soap;

import com.argonavis.filmes.client.soap.generated.Filme;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * Hello world!
 *
 */
public class FilmeDispatchClient {

    public static void main(String[] args) throws MalformedURLException, SOAPException, TransformerConfigurationException, TransformerException, FileNotFoundException {
        // SEI
        //QName serviceName = new QName("http://soap.filmes.argonavis.com/", "FilmeFacadeService");
        //QName portName = new QName("http://soap.filmes.argonavis.com/", "FilmeFacadePort");
        //String endpointUrl = "http://localhost:8080/FilmesServiceSoap/FilmeFacadeService";
        
        // SPE
        QName serviceName = new QName("http://soap.filmes.argonavis.com/", "FilmeFacadeService");
        QName portName = new QName("http://soap.filmes.argonavis.com/", "FilmeFacadePort");
        String endpointUrl = "http://localhost:8080/FilmesServiceSoapProvider/FilmeFacadeService";
        
        
        Service service = Service.create(serviceName);
        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endpointUrl);
        Dispatch<Source> dispatch = service.createDispatch(portName, Source.class, Service.Mode.PAYLOAD);

        String reqPayload  = "<ans1:getFilmes xmlns:ans1=\"http://soap.filmes.argonavis.com/\"></ans1:getFilmes>";
        //String reqPayload  = "<ans1:getFilme xmlns:ans1=\"http://soap.filmes.argonavis.com/\">tt0081505</ans1:getFilme>";
        
        Source resPayload = dispatch.invoke(new StreamSource(new StringReader(reqPayload)));
        
        DOMResult domTree = new DOMResult();
        TransformerFactory.newInstance().newTransformer().transform(resPayload, domTree);
        Document document = (Document)domTree.getNode();
        Element root = document.getDocumentElement();
        
        printXML(root);
        
        NodeList results = root.getElementsByTagName("return");
        List<Filme> filmes = new ArrayList<>();
        
        for(int i = 0; i < results.getLength(); i++) {
            Element filmeElement = (Element)results.item(i);
            String ano = filmeElement.getElementsByTagName("ano").item(0).getFirstChild().getTextContent();
            String diretor = filmeElement.getElementsByTagName("diretor").item(0).getFirstChild().getTextContent();
            String duracao = filmeElement.getElementsByTagName("duracao").item(0).getFirstChild().getTextContent();
            String imdb = filmeElement.getElementsByTagName("imdb").item(0).getFirstChild().getTextContent();
            String titulo = filmeElement.getElementsByTagName("titulo").item(0).getFirstChild().getTextContent();
            String id = filmeElement.getElementsByTagName("id").item(0).getFirstChild().getTextContent();
            
            Filme filme = new Filme();
            filme.setAno(Long.parseLong(ano));
            filme.setDiretor(diretor);
            filme.setDuracao(Long.parseLong(duracao));
            filme.setImdb(imdb);
            filme.setId(Long.parseLong(id));
            filme.setTitulo(titulo);
            
            filmes.add(filme);
        }

        listarFilmes(filmes);
    }

    public static void listarFilmes(List<Filme> filmes) {
        for (Filme filme : filmes) {
            System.out.println(filme.getImdb() + ": " + filme.getTitulo() + "(" + filme.getAno() + ")");
            System.out.println("           " + filme.getDiretor());
            System.out.println("           " + filme.getDuracao() + " minutos\n");
        }
    }
    
    private static void printXML(Element rootElement) throws TransformerConfigurationException, TransformerException {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transformer = tFactory.newTransformer();
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        
        DOMSource source = new DOMSource(rootElement);
        StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);
    }
}
