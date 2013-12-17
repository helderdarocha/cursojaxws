
package com.argonavis.webservice.port;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.argonavis.webservice.port package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NumerosDaSorteResponse_QNAME = new QName("http://webservicesample.argonavis.com/", "numerosDaSorteResponse");
    private final static QName _NumerosDaSorte_QNAME = new QName("http://webservicesample.argonavis.com/", "numerosDaSorte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.argonavis.webservice.port
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumerosDaSorteResponse }
     * 
     */
    public NumerosDaSorteResponse createNumerosDaSorteResponse() {
        return new NumerosDaSorteResponse();
    }

    /**
     * Create an instance of {@link NumerosDaSorte }
     * 
     */
    public NumerosDaSorte createNumerosDaSorte() {
        return new NumerosDaSorte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerosDaSorteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesample.argonavis.com/", name = "numerosDaSorteResponse")
    public JAXBElement<NumerosDaSorteResponse> createNumerosDaSorteResponse(NumerosDaSorteResponse value) {
        return new JAXBElement<NumerosDaSorteResponse>(_NumerosDaSorteResponse_QNAME, NumerosDaSorteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumerosDaSorte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservicesample.argonavis.com/", name = "numerosDaSorte")
    public JAXBElement<NumerosDaSorte> createNumerosDaSorte(NumerosDaSorte value) {
        return new JAXBElement<NumerosDaSorte>(_NumerosDaSorte_QNAME, NumerosDaSorte.class, null, value);
    }

}
