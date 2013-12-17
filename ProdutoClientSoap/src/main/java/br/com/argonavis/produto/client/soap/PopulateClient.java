package br.com.argonavis.produto.client.soap;

import br.com.argonavis.produto.service.soap.ProdutoFacade;
import br.com.argonavis.produto.service.soap.ProdutoFacade;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Hello world!
 *
 */
public class PopulateClient {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://localhost:8080/ProdutoFacadeService/ProdutoFacade?wsdl");
        QName serviceName = new QName("http://soap.service.produto.argonavis.com.br/", "ProdutoFacadeService");
        Service service = Service.create(wsdlLocation, serviceName);
        ProdutoFacade proxy = service.getPort(ProdutoFacade.class);
        
        proxy.criarProduto("Pen-drive Phony com 500GB Flash Memory", 35.99);
        proxy.criarProduto("Capa de chuva de kevlar iWet", 1.99);
        proxy.criarProduto("Barraca de camping Monga", 132.90);
        proxy.criarProduto("Pincel atômico (césio-137) Fukushima", 5.99);
        proxy.criarProduto("Bicicleta Mountain Bike Tomby Kai", 588.90);
        proxy.criarProduto("Mini-forno Kay-May", 260.00);
        proxy.criarProduto("Máquina fotográfica 10 Giga Pixels iFaykit", 739.99);
        proxy.criarProduto("TV de LEDs ultra-quântica Ling Bing 70 pol.", 999.99);
        proxy.criarProduto("Sandálias originais Lawayannas", 2.45);
        proxy.criarProduto("Smartphone xPhone Xing Ling", 21.70);
        
        System.out.println("Produtos criados!");
        
    }
}
