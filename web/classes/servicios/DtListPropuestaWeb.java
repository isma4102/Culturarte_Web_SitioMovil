
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtListPropuestaWeb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtListPropuestaWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicadas" type="{http://Servicios/}dtPropuestaWeb" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="financiadas" type="{http://Servicios/}dtPropuestaWeb" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enFinanciacion" type="{http://Servicios/}dtPropuestaWeb" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noFinanciadas" type="{http://Servicios/}dtPropuestaWeb" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="canceladas" type="{http://Servicios/}dtPropuestaWeb" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtListPropuestaWeb", propOrder = {
    "publicadas",
    "financiadas",
    "enFinanciacion",
    "noFinanciadas",
    "canceladas"
})
public class DtListPropuestaWeb {

    @XmlElement(nillable = true)
    protected List<DtPropuestaWeb> publicadas;
    @XmlElement(nillable = true)
    protected List<DtPropuestaWeb> financiadas;
    @XmlElement(nillable = true)
    protected List<DtPropuestaWeb> enFinanciacion;
    @XmlElement(nillable = true)
    protected List<DtPropuestaWeb> noFinanciadas;
    @XmlElement(nillable = true)
    protected List<DtPropuestaWeb> canceladas;

    /**
     * Gets the value of the publicadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtPropuestaWeb }
     * 
     * 
     */
    public List<DtPropuestaWeb> getPublicadas() {
        if (publicadas == null) {
            publicadas = new ArrayList<DtPropuestaWeb>();
        }
        return this.publicadas;
    }

    /**
     * Gets the value of the financiadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financiadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinanciadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtPropuestaWeb }
     * 
     * 
     */
    public List<DtPropuestaWeb> getFinanciadas() {
        if (financiadas == null) {
            financiadas = new ArrayList<DtPropuestaWeb>();
        }
        return this.financiadas;
    }

    /**
     * Gets the value of the enFinanciacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enFinanciacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnFinanciacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtPropuestaWeb }
     * 
     * 
     */
    public List<DtPropuestaWeb> getEnFinanciacion() {
        if (enFinanciacion == null) {
            enFinanciacion = new ArrayList<DtPropuestaWeb>();
        }
        return this.enFinanciacion;
    }

    /**
     * Gets the value of the noFinanciadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noFinanciadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoFinanciadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtPropuestaWeb }
     * 
     * 
     */
    public List<DtPropuestaWeb> getNoFinanciadas() {
        if (noFinanciadas == null) {
            noFinanciadas = new ArrayList<DtPropuestaWeb>();
        }
        return this.noFinanciadas;
    }

    /**
     * Gets the value of the canceladas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canceladas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanceladas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtPropuestaWeb }
     * 
     * 
     */
    public List<DtPropuestaWeb> getCanceladas() {
        if (canceladas == null) {
            canceladas = new ArrayList<DtPropuestaWeb>();
        }
        return this.canceladas;
    }

}
