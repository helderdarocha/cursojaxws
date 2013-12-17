package br.com.argonavis.produto.client.soap;

import br.com.argonavis.produto.entity.Produto;
import br.com.argonavis.produto.service.soap.ProdutoFacade;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Hello world!
 *
 */
public class ListAllClient {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:8080/ProdutoFacadeService/ProdutoFacade?wsdl");
        QName serviceName = new QName("http://soap.service.produto.argonavis.com.br/", "ProdutoFacadeService");
        Service service = Service.create(wsdlLocation, serviceName);
        ProdutoFacade proxy = service.getPort(ProdutoFacade.class);
        
        List<Produto> produtos = proxy.listarProdutos();
        for(Produto p : produtos) {
            System.out.println(p.getId() +": " + p.getDescricao() + ". $" + p.getPreco());
        }
        
    }
}
