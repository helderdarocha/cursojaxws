package com.argonavis.webservice.port;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2013-11-21T11:32:54.592-04:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://webservicesample.argonavis.com/", name = "LoteriaWeb")
@XmlSeeAlso({ObjectFactory.class})
public interface LoteriaWeb {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "numerosDaSorte", targetNamespace = "http://webservicesample.argonavis.com/", className = "com.argonavis.webservice.port.NumerosDaSorte")
    @WebMethod
    @ResponseWrapper(localName = "numerosDaSorteResponse", targetNamespace = "http://webservicesample.argonavis.com/", className = "com.argonavis.webservice.port.NumerosDaSorteResponse")
    public java.util.List<java.lang.String> numerosDaSorte();
}