package com.argonavis.filmes.client.soap;

import com.argonavis.filmes.client.soap.generated.Filme;
import com.argonavis.filmes.client.soap.generated.FilmeFacade;
import com.argonavis.filmes.client.soap.generated.FilmeFacadeService;
import java.util.List;

/**
 * Hello world!
 *
 */
public class FilmeClient {

    public static void main(String[] args) {
        FilmeFacadeService service = new FilmeFacadeService();
        FilmeFacade proxy = service.getFilmeFacadePort();
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
