
package com.argonavis.filmes.client.soap.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.argonavis.filmes.client.soap.generated package. 
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

    private final static QName _GetFilmeResponse_QNAME = new QName("http://soap.filmes.argonavis.com/", "getFilmeResponse");
    private final static QName _GetTituloFilmeResponse_QNAME = new QName("http://soap.filmes.argonavis.com/", "getTituloFilmeResponse");
    private final static QName _GetTituloFilme_QNAME = new QName("http://soap.filmes.argonavis.com/", "getTituloFilme");
    private final static QName _GetFilmeObject_QNAME = new QName("http://soap.filmes.argonavis.com/", "getFilmeObject");
    private final static QName _GetFilme_QNAME = new QName("http://soap.filmes.argonavis.com/", "getFilme");
    private final static QName _GetFilmes_QNAME = new QName("http://soap.filmes.argonavis.com/", "getFilmes");
    private final static QName _GetFilmesResponse_QNAME = new QName("http://soap.filmes.argonavis.com/", "getFilmesResponse");
    private final static QName _GetFilmeObjectResponse_QNAME = new QName("http://soap.filmes.argonavis.com/", "getFilmeObjectResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.argonavis.filmes.client.soap.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFilmeObjectResponse }
     * 
     */
    public GetFilmeObjectResponse createGetFilmeObjectResponse() {
        return new GetFilmeObjectResponse();
    }

    /**
     * Create an instance of {@link GetFilmeObject }
     * 
     */
    public GetFilmeObject createGetFilmeObject() {
        return new GetFilmeObject();
    }

    /**
     * Create an instance of {@link GetFilme }
     * 
     */
    public GetFilme createGetFilme() {
        return new GetFilme();
    }

    /**
     * Create an instance of {@link GetFilmes }
     * 
     */
    public GetFilmes createGetFilmes() {
        return new GetFilmes();
    }

    /**
     * Create an instance of {@link GetFilmesResponse }
     * 
     */
    public GetFilmesResponse createGetFilmesResponse() {
        return new GetFilmesResponse();
    }

    /**
     * Create an instance of {@link GetTituloFilmeResponse }
     * 
     */
    public GetTituloFilmeResponse createGetTituloFilmeResponse() {
        return new GetTituloFilmeResponse();
    }

    /**
     * Create an instance of {@link GetTituloFilme }
     * 
     */
    public GetTituloFilme createGetTituloFilme() {
        return new GetTituloFilme();
    }

    /**
     * Create an instance of {@link GetFilmeResponse }
     * 
     */
    public GetFilmeResponse createGetFilmeResponse() {
        return new GetFilmeResponse();
    }

    /**
     * Create an instance of {@link Filme }
     * 
     */
    public Filme createFilme() {
        return new Filme();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getFilmeResponse")
    public JAXBElement<GetFilmeResponse> createGetFilmeResponse(GetFilmeResponse value) {
        return new JAXBElement<GetFilmeResponse>(_GetFilmeResponse_QNAME, GetFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTituloFilmeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getTituloFilmeResponse")
    public JAXBElement<GetTituloFilmeResponse> createGetTituloFilmeResponse(GetTituloFilmeResponse value) {
        return new JAXBElement<GetTituloFilmeResponse>(_GetTituloFilmeResponse_QNAME, GetTituloFilmeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTituloFilme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getTituloFilme")
    public JAXBElement<GetTituloFilme> createGetTituloFilme(GetTituloFilme value) {
        return new JAXBElement<GetTituloFilme>(_GetTituloFilme_QNAME, GetTituloFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmeObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getFilmeObject")
    public JAXBElement<GetFilmeObject> createGetFilmeObject(GetFilmeObject value) {
        return new JAXBElement<GetFilmeObject>(_GetFilmeObject_QNAME, GetFilmeObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getFilme")
    public JAXBElement<GetFilme> createGetFilme(GetFilme value) {
        return new JAXBElement<GetFilme>(_GetFilme_QNAME, GetFilme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getFilmes")
    public JAXBElement<GetFilmes> createGetFilmes(GetFilmes value) {
        return new JAXBElement<GetFilmes>(_GetFilmes_QNAME, GetFilmes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getFilmesResponse")
    public JAXBElement<GetFilmesResponse> createGetFilmesResponse(GetFilmesResponse value) {
        return new JAXBElement<GetFilmesResponse>(_GetFilmesResponse_QNAME, GetFilmesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilmeObjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.filmes.argonavis.com/", name = "getFilmeObjectResponse")
    public JAXBElement<GetFilmeObjectResponse> createGetFilmeObjectResponse(GetFilmeObjectResponse value) {
        return new JAXBElement<GetFilmeObjectResponse>(_GetFilmeObjectResponse_QNAME, GetFilmeObjectResponse.class, null, value);
    }

}
