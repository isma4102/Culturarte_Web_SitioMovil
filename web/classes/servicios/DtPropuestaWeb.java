
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtPropuestaWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtPropuestaWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tituloP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tiempoR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="recaudacion" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="porcentaje" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="colaboradores" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtPropuestaWeb", propOrder = {
    "tituloP",
    "descrip",
    "tiempoR",
    "recaudacion",
    "porcentaje",
    "colaboradores"
})
public class DtPropuestaWeb {

    protected String tituloP;
    protected String descrip;
    protected int tiempoR;
    protected float recaudacion;
    protected int porcentaje;
    protected int colaboradores;

    /**
     * Obtiene el valor de la propiedad tituloP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloP() {
        return tituloP;
    }

    /**
     * Define el valor de la propiedad tituloP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloP(String value) {
        this.tituloP = value;
    }

    /**
     * Obtiene el valor de la propiedad descrip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrip() {
        return descrip;
    }

    /**
     * Define el valor de la propiedad descrip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrip(String value) {
        this.descrip = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoR.
     * 
     */
    public int getTiempoR() {
        return tiempoR;
    }

    /**
     * Define el valor de la propiedad tiempoR.
     * 
     */
    public void setTiempoR(int value) {
        this.tiempoR = value;
    }

    /**
     * Obtiene el valor de la propiedad recaudacion.
     * 
     */
    public float getRecaudacion() {
        return recaudacion;
    }

    /**
     * Define el valor de la propiedad recaudacion.
     * 
     */
    public void setRecaudacion(float value) {
        this.recaudacion = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     */
    public int getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     */
    public void setPorcentaje(int value) {
        this.porcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad colaboradores.
     * 
     */
    public int getColaboradores() {
        return colaboradores;
    }

    /**
     * Define el valor de la propiedad colaboradores.
     * 
     */
    public void setColaboradores(int value) {
        this.colaboradores = value;
    }

}
