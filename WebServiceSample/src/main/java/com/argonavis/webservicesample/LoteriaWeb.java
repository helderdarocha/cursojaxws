/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argonavis.webservicesample;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.jboss.ejb3.annotation.Clustered;

/**
 *
 * @author helderdarocha
 */
@Stateless
@WebService
@Clustered
public class LoteriaWeb {
    
    @Resource
    SessionContext ctx;
    
    @WebMethod
    public java.lang.String[] numerosDaSorte() {
        String[] numeros = new String[6];
        for(int i = 0; i < numeros.length; i++) {
            int numero = (int)Math.ceil(Math.random() * 60);
            numeros[i] = (numero < 10)?"0"+numero:""+numero;
        }
        return numeros;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
