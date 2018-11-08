
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtConsultaPropuesta2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtConsultaPropuesta2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nickColab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreColab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellidoColab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoColab" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fechaR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtConsultaPropuesta2", propOrder = {
    "nickColab",
    "nombreColab",
    "apellidoColab",
    "montoColab",
    "fechaR"
})
public class DtConsultaPropuesta2 {

    protected String nickColab;
    protected String nombreColab;
    protected String apellidoColab;
    protected float montoColab;
    protected String fechaR;

    /**
     * Obtiene el valor de la propiedad nickColab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickColab() {
        return nickColab;
    }

    /**
     * Define el valor de la propiedad nickColab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickColab(String value) {
        this.nickColab = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreColab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreColab() {
        return nombreColab;
    }

    /**
     * Define el valor de la propiedad nombreColab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreColab(String value) {
        this.nombreColab = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoColab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoColab() {
        return apellidoColab;
    }

    /**
     * Define el valor de la propiedad apellidoColab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoColab(String value) {
        this.apellidoColab = value;
    }

    /**
     * Obtiene el valor de la propiedad montoColab.
     * 
     */
    public float getMontoColab() {
        return montoColab;
    }

    /**
     * Define el valor de la propiedad montoColab.
     * 
     */
    public void setMontoColab(float value) {
        this.montoColab = value;
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

}
