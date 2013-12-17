/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.argonavis.filmes.soap;

import com.argonavis.filmes.entity.Filme;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@WebService
public class FilmeFacade {
    @PersistenceContext(unitName = "FilmesServiceSoap")
    EntityManager em;
    
    @WebMethod
    public String getTituloFilme(String imdbCode) {
        return getFilmeObject(imdbCode).getTitulo();
    }
    
    @WebMethod
    public Filme getFilme(String imdbCode) {
        return getFilmeObject(imdbCode);
    }
    
    @WebMethod
    public List<Filme> getFilmes() {
        String jpql = "select filme from Filme filme";
        Query query = em.createQuery(jpql);
        return (List<Filme>)query.getResultList();
    }
    
    public Filme getFilmeObject(String imdbCode) {
        String jpql = "select filme from Filme filme where filme.imdb = :imdb";
        Query query = em.createQuery(jpql);
        query.setParameter("imdb", imdbCode);
        Filme filme = (Filme)query.getSingleResult();
        return filme;
    }
}
