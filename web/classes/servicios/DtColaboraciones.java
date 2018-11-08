
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para dtColaboraciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtColaboraciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UColaborador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fechaRealiz" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Entradas" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Propuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtColaboraciones", propOrder = {
    "uColaborador",
    "montoC",
    "fechaRealiz",
    "entradas",
    "propuesta"
})
public class DtColaboraciones {

    @XmlElement(name = "UColaborador")
    protected String uColaborador;
    protected float montoC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRealiz;
    @XmlElement(name = "Entradas")
    protected boolean entradas;
    @XmlElement(name = "Propuesta")
    protected String propuesta;

    /**
     * Obtiene el valor de la propiedad uColaborador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUColaborador() {
        return uColaborador;
    }

    /**
     * Define el valor de la propiedad uColaborador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUColaborador(String value) {
        this.uColaborador = value;
    }

    /**
     * Obtiene el valor de la propiedad montoC.
     * 
     */
    public float getMontoC() {
        return montoC;
    }

    /**
     * Define el valor de la propiedad montoC.
     * 
     */
    public void setMontoC(float value) {
        this.montoC = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRealiz.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRealiz() {
        return fechaRealiz;
    }

    /**
     * Define el valor de la propiedad fechaRealiz.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRealiz(XMLGregorianCalendar value) {
        this.fechaRealiz = value;
    }

    /**
     * Obtiene el valor de la propiedad entradas.
     * 
     */
    public boolean isEntradas() {
        return entradas;
    }

    /**
     * Define el valor de la propiedad entradas.
     * 
     */
    public void setEntradas(boolean value) {
        this.entradas = value;
    }

    /**
     * Obtiene el valor de la propiedad propuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropuesta() {
        return propuesta;
    }

    /**
     * Define el valor de la propiedad propuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropuesta(String value) {
        this.propuesta = value;
    }

}
