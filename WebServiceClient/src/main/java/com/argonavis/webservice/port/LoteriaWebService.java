package com.argonavis.webservice.port;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2013-11-21T11:32:54.635-04:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "LoteriaWebService", 
                  wsdlLocation = "http://localhost:8080/WebServiceSample-1.0-SNAPSHOT/LoteriaWeb?wsdl",
                  targetNamespace = "http://webservicesample.argonavis.com/") 
public class LoteriaWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservicesample.argonavis.com/", "LoteriaWebService");
    public final static QName LoteriaWebPort = new QName("http://webservicesample.argonavis.com/", "LoteriaWebPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/WebServiceSample-1.0-SNAPSHOT/LoteriaWeb?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LoteriaWebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/WebServiceSample-1.0-SNAPSHOT/LoteriaWeb?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LoteriaWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LoteriaWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoteriaWebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoteriaWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoteriaWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LoteriaWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns LoteriaWeb
     */
    @WebEndpoint(name = "LoteriaWebPort")
    public LoteriaWeb getLoteriaWebPort() {
        return super.getPort(LoteriaWebPort, LoteriaWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoteriaWeb
     */
    @WebEndpoint(name = "LoteriaWebPort")
    public LoteriaWeb getLoteriaWebPort(WebServiceFeature... features) {
        return super.getPort(LoteriaWebPort, LoteriaWeb.class, features);
    }

}
