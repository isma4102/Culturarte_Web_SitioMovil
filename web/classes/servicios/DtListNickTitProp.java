
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtListNickTitProp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtListNickTitProp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListPropuestas" type="{http://Servicios/}dtNickTitProp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtListNickTitProp", propOrder = {
    "listPropuestas"
})
public class DtListNickTitProp {

    @XmlElement(name = "ListPropuestas", nillable = true)
    protected List<DtNickTitProp> listPropuestas;

    /**
     * Gets the value of the listPropuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listPropuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListPropuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DtNickTitProp }
     * 
     * 
     */
    public List<DtNickTitProp> getListPropuestas() {
        if (listPropuestas == null) {
            listPropuestas = new ArrayList<DtNickTitProp>();
        }
        return this.listPropuestas;
    }

}