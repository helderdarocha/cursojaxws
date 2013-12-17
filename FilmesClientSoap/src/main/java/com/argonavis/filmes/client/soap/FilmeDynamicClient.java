package com.argonavis.filmes.client.soap;

import com.argonavis.filmes.client.soap.generated.Filme;
import com.argonavis.filmes.client.soap.generated.FilmeFacade;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Hello world!
 *
 */
public class FilmeDynamicClient {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:8080/FilmesServiceSoap/FilmeFacadeService?wsdl");
        QName serviceName = new QName("http://soap.filmes.argonavis.com/", "FilmeFacadeService");
        Service service = Service.create(wsdlLocation, serviceName);
        
        FilmeFacade proxy = service.getPort(FilmeFacade.class);
        listarFilmes(proxy.getFilmes());
    }
    
    public static void listarFilmes(List<Filme> filmes) {
        for(Filme filme : filmes) {
            System.out.println(filme.getImdb()+": " + filme.getTitulo() + "(" + filme.getAno() + ")");
            System.out.println("           " + filme.getDiretor());
            System.out.println("           " + filme.getDuracao() + " minutos\n");
        }
    }
}
