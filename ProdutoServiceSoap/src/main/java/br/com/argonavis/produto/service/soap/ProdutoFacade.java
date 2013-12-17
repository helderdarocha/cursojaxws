/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.argonavis.produto.service.soap;

import br.com.argonavis.produto.entity.Produto;
import java.util.List;
import javax.ejb.Local;
import javax.jws.WebService;

/**
 *
 * @author helderdarocha
 */
@Local
@WebService
public interface ProdutoFacade {

    List<Produto> listarProdutos();

    Produto detalharProduto(long id);

    Produto criarProduto(String descricao, double preco);

    Produto removerProduto(long id);
    
}
