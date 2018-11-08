
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoE.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ingresada"/>
 *     &lt;enumeration value="Publicada"/>
 *     &lt;enumeration value="enFinanciacion"/>
 *     &lt;enumeration value="Financiada"/>
 *     &lt;enumeration value="noFinanciada"/>
 *     &lt;enumeration value="Cancelada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoE")
@XmlEnum
public enum TipoE {

    @XmlEnumValue("Ingresada")
    INGRESADA("Ingresada"),
    @XmlEnumValue("Publicada")
    PUBLICADA("Publicada"),
    @XmlEnumValue("enFinanciacion")
    EN_FINANCIACION("enFinanciacion"),
    @XmlEnumValue("Financiada")
    FINANCIADA("Financiada"),
    @XmlEnumValue("noFinanciada")
    NO_FINANCIADA("noFinanciada"),
    @XmlEnumValue("Cancelada")
    CANCELADA("Cancelada");
    private final String value;

    TipoE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoE fromValue(String v) {
        for (TipoE c: TipoE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
