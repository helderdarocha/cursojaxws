package com.argonavis.webserviceclient;

import com.argonavis.webservice.port.LoteriaWeb;
import com.argonavis.webservice.port.LoteriaWebService;
import java.util.List;

/**
 * Hello world!
 *
 */
public class WSClient {

    public static void main(String[] args) throws Exception {
        
        LoteriaWebService service = new LoteriaWebService();
        LoteriaWeb port = service.getLoteriaWebPort();
        List<String> numeros = port.numerosDaSorte();
        
        System.out.println("Numeros a jogar na SENA:");
        for(String numero : numeros) {
            System.out.println(numero);
        }

    }
}
