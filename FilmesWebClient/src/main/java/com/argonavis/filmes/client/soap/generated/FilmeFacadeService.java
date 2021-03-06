
package com.argonavis.filmes.client.soap.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FilmeFacadeService", targetNamespace = "http://soap.filmes.argonavis.com/", wsdlLocation = "http://localhost:8080/FilmesServiceSoap/FilmeFacadeService?wsdl")
public class FilmeFacadeService
    extends Service
{

    private final static URL FILMEFACADESERVICE_WSDL_LOCATION;
    private final static WebServiceException FILMEFACADESERVICE_EXCEPTION;
    private final static QName FILMEFACADESERVICE_QNAME = new QName("http://soap.filmes.argonavis.com/", "FilmeFacadeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/FilmesServiceSoap/FilmeFacadeService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FILMEFACADESERVICE_WSDL_LOCATION = url;
        FILMEFACADESERVICE_EXCEPTION = e;
    }

    public FilmeFacadeService() {
        super(__getWsdlLocation(), FILMEFACADESERVICE_QNAME);
    }

    public FilmeFacadeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FILMEFACADESERVICE_QNAME, features);
    }

    public FilmeFacadeService(URL wsdlLocation) {
        super(wsdlLocation, FILMEFACADESERVICE_QNAME);
    }

    public FilmeFacadeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FILMEFACADESERVICE_QNAME, features);
    }

    public FilmeFacadeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FilmeFacadeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FilmeFacade
     */
    @WebEndpoint(name = "FilmeFacadePort")
    public FilmeFacade getFilmeFacadePort() {
        return super.getPort(new QName("http://soap.filmes.argonavis.com/", "FilmeFacadePort"), FilmeFacade.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FilmeFacade
     */
    @WebEndpoint(name = "FilmeFacadePort")
    public FilmeFacade getFilmeFacadePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.filmes.argonavis.com/", "FilmeFacadePort"), FilmeFacade.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FILMEFACADESERVICE_EXCEPTION!= null) {
            throw FILMEFACADESERVICE_EXCEPTION;
        }
        return FILMEFACADESERVICE_WSDL_LOCATION;
    }

}
