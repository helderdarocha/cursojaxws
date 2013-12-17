/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.filmes.soap.webclient;

import com.argonavis.filmes.client.soap.generated.Filme;
import com.argonavis.filmes.client.soap.generated.FilmeFacade;
import com.argonavis.filmes.client.soap.generated.FilmeFacadeService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author helderdarocha
 */
@ManagedBean(name = "filmesBean")
@RequestScoped
public class FilmesManagedBean {
    
    @WebServiceRef(wsdlLocation="http://localhost:8080/FilmesServiceSoap/FilmeFacadeService?wsdl")
    private FilmeFacadeService service;
    
    private List<Filme> filmes;
    
    @PostConstruct
    public void init() {
        FilmeFacade proxy = service.getFilmeFacadePort();
        this.filmes = proxy.getFilmes();
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
    
}
