/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.argonavis.produto.service.soap;

import br.com.argonavis.produto.entity.Produto;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author helderdarocha
 */

@WebService(endpointInterface="br.com.argonavis.produto.service.soap.ProdutoFacade",
            serviceName="ProdutoFacadeService",
            portName="ProdutoFacade",
            name="ProdutoFacade")
@Stateless
public class ProdutoFacadeImpl implements ProdutoFacade {
    @PersistenceContext(unitName = "br.com.argonavis_ProdutoServiceSoap")
    private EntityManager em;

    @Override
    public List<Produto> listarProdutos() {
        return em.createQuery("select p from Produto p", Produto.class).getResultList();
    }

    @Override
    public Produto detalharProduto(long id) {
        return em.find(Produto.class, id);
    }

    @Override
    public Produto criarProduto(String descricao, double preco) {
        Produto produto = new Produto(descricao, preco);
        em.persist(produto);
        return em.merge(produto);
    }

    @Override
    public Produto removerProduto(long id) {
        Produto produto = em.find(Produto.class, id);
        em.remove(produto);
        return produto;
    }

}
