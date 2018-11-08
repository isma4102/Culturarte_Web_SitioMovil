
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtConsultaPropuesta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtConsultaPropuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoActual" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="EstadoActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoE" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="montoTot" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="tipoRet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nickproponente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esExtendible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="esCancelable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="esComentable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="esColaborable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtConsultaPropuesta", propOrder = {
    "titulo",
    "descripcion",
    "categoria",
    "lugar",
    "fechaR",
    "imagen",
    "montoActual",
    "estadoActual",
    "montoE",
    "montoTot",
    "tipoRet",
    "nickproponente",
    "esExtendible",
    "esCancelable",
    "esComentable",
    "esColaborable"
})
public class DtConsultaPropuesta {

    protected String titulo;
    protected String descripcion;
    protected String categoria;
    protected String lugar;
    protected String fechaR;
    protected String imagen;
    protected float montoActual;
    @XmlElement(name = "EstadoActual")
    protected String estadoActual;
    protected float montoE;
    protected float montoTot;
    protected String tipoRet;
    protected String nickproponente;
    protected boolean esExtendible;
    protected boolean esCancelable;
    protected boolean esComentable;
    protected boolean esColaborable;

    /**
     * Obtiene el valor de la propiedad titulo.
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
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad lugar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Define el valor de la propiedad lugar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugar(String value) {
        this.lugar = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaR() {
        return fechaR;
    }

    /**
     * Define el valor de la propiedad fechaR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaR(String value) {
        this.fechaR = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Obtiene el valor de la propiedad montoActual.
     * 
     */
    public float getMontoActual() {
        return montoActual;
    }

    /**
     * Define el valor de la propiedad montoActual.
     * 
     */
    public void setMontoActual(float value) {
        this.montoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoActual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoActual() {
        return estadoActual;
    }

    /**
     * Define el valor de la propiedad estadoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoActual(String value) {
        this.estadoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad montoE.
     * 
     */
    public float getMontoE() {
        return montoE;
    }

    /**
     * Define el valor de la propiedad montoE.
     * 
     */
    public void setMontoE(float value) {
        this.montoE = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTot.
     * 
     */
    public float getMontoTot() {
        return montoTot;
    }

    /**
     * Define el valor de la propiedad montoTot.
     * 
     */
    public void setMontoTot(float value) {
        this.montoTot = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRet() {
        return tipoRet;
    }

    /**
     * Define el valor de la propiedad tipoRet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRet(String value) {
        this.tipoRet = value;
    }

    /**
     * Obtiene el valor de la propiedad nickproponente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickproponente() {
        return nickproponente;
    }

    /**
     * Define el valor de la propiedad nickproponente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickproponente(String value) {
        this.nickproponente = value;
    }

    /**
     * Obtiene el valor de la propiedad esExtendible.
     * 
     */
    public boolean isEsExtendible() {
        return esExtendible;
    }

    /**
     * Define el valor de la propiedad esExtendible.
     * 
     */
    public void setEsExtendible(boolean value) {
        this.esExtendible = value;
    }

    /**
     * Obtiene el valor de la propiedad esCancelable.
     * 
     */
    public boolean isEsCancelable() {
        return esCancelable;
    }

    /**
     * Define el valor de la propiedad esCancelable.
     * 
     */
    public void setEsCancelable(boolean value) {
        this.esCancelable = value;
    }

    /**
     * Obtiene el valor de la propiedad esComentable.
     * 
     */
    public boolean isEsComentable() {
        return esComentable;
    }

    /**
     * Define el valor de la propiedad esComentable.
     * 
     */
    public void setEsComentable(boolean value) {
        this.esComentable = value;
    }

    /**
     * Obtiene el valor de la propiedad esColaborable.
     * 
     */
    public boolean isEsColaborable() {
        return esColaborable;
    }

    /**
     * Define el valor de la propiedad esColaborable.
     * 
     */
    public void setEsColaborable(boolean value) {
        this.esColaborable = value;
    }

}
