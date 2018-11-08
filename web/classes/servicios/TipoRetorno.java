
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoRetorno.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoRetorno">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Entradas"/>
 *     &lt;enumeration value="porGanancias"/>
 *     &lt;enumeration value="EntGan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoRetorno")
@XmlEnum
public enum TipoRetorno {

    @XmlEnumValue("Entradas")
    ENTRADAS("Entradas"),
    @XmlEnumValue("porGanancias")
    POR_GANANCIAS("porGanancias"),
    @XmlEnumValue("EntGan")
    ENT_GAN("EntGan");
    private final String value;

    TipoRetorno(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoRetorno fromValue(String v) {
        for (TipoRetorno c: TipoRetorno.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
