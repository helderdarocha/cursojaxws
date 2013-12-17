
package com.argonavis.filmes.client.soap.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filme">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="diretor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duracao" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imdb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filme", propOrder = {
    "ano",
    "diretor",
    "duracao",
    "id",
    "imdb",
    "titulo"
})
public class Filme {

    protected Long ano;
    protected String diretor;
    protected long duracao;
    protected Long id;
    protected String imdb;
    protected String titulo;

    /**
     * Gets the value of the ano property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAno() {
        return ano;
    }

    /**
     * Sets the value of the ano property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAno(Long value) {
        this.ano = value;
    }

    /**
     * Gets the value of the diretor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * Sets the value of the diretor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiretor(String value) {
        this.diretor = value;
    }

    /**
     * Gets the value of the duracao property.
     * 
     */
    public long getDuracao() {
        return duracao;
    }

    /**
     * Sets the value of the duracao property.
     * 
     */
    public void setDuracao(long value) {
        this.duracao = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the imdb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImdb() {
        return imdb;
    }

    /**
     * Sets the value of the imdb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImdb(String value) {
        this.imdb = value;
    }

    /**
     * Gets the value of the titulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
