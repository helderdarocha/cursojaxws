package com.argonavis.filmes.client.soap;

import com.argonavis.filmes.client.soap.generated.FilmeFacade;
import com.argonavis.filmes.client.soap.generated.FilmeFacadeService;

/**
 * Hello world!
 *
 */
public class TituloFilmeClient {

    public static void main(String[] args) {
        FilmeFacadeService service = new FilmeFacadeService();
        FilmeFacade proxy = service.getFilmeFacadePort();
        String titulo = proxy.getTituloFilme("tt0081505");
        System.out.println("Filme encontrado: " + titulo);
    }
}
