
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtComentarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtComentarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Colaborador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Propuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtComentarios", propOrder = {
    "colaborador",
    "propuesta",
    "comentario"
})
public class DtComentarios {

    @XmlElement(name = "Colaborador")
    protected String colaborador;
    @XmlElement(name = "Propuesta")
    protected String propuesta;
    @XmlElement(name = "Comentario")
    protected String comentario;

    /**
     * Obtiene el valor de la propiedad colaborador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColaborador() {
        return colaborador;
    }

    /**
     * Define el valor de la propiedad colaborador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColaborador(String value) {
        this.colaborador = value;
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

    /**
     * Obtiene el valor de la propiedad comentario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Define el valor de la propiedad comentario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

}
