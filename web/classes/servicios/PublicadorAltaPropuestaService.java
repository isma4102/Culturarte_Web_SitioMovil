
package servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PublicadorAltaPropuestaService", targetNamespace = "http://Servicios/", wsdlLocation = "http://127.0.0.1:8280/servicioAltaP?wsdl")
public class PublicadorAltaPropuestaService
    extends Service
{

    private final static URL PUBLICADORALTAPROPUESTASERVICE_WSDL_LOCATION;
    private final static WebServiceException PUBLICADORALTAPROPUESTASERVICE_EXCEPTION;
    private final static QName PUBLICADORALTAPROPUESTASERVICE_QNAME = new QName("http://Servicios/", "PublicadorAltaPropuestaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8280/servicioAltaP?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PUBLICADORALTAPROPUESTASERVICE_WSDL_LOCATION = url;
        PUBLICADORALTAPROPUESTASERVICE_EXCEPTION = e;
    }

    public PublicadorAltaPropuestaService() {
        super(__getWsdlLocation(), PUBLICADORALTAPROPUESTASERVICE_QNAME);
    }

    public PublicadorAltaPropuestaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PUBLICADORALTAPROPUESTASERVICE_QNAME, features);
    }

    public PublicadorAltaPropuestaService(URL wsdlLocation) {
        super(wsdlLocation, PUBLICADORALTAPROPUESTASERVICE_QNAME);
    }

    public PublicadorAltaPropuestaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PUBLICADORALTAPROPUESTASERVICE_QNAME, features);
    }

    public PublicadorAltaPropuestaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublicadorAltaPropuestaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PublicadorAltaPropuesta
     */
    @WebEndpoint(name = "PublicadorAltaPropuestaPort")
    public PublicadorAltaPropuesta getPublicadorAltaPropuestaPort() {
        return super.getPort(new QName("http://Servicios/", "PublicadorAltaPropuestaPort"), PublicadorAltaPropuesta.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublicadorAltaPropuesta
     */
    @WebEndpoint(name = "PublicadorAltaPropuestaPort")
    public PublicadorAltaPropuesta getPublicadorAltaPropuestaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios/", "PublicadorAltaPropuestaPort"), PublicadorAltaPropuesta.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PUBLICADORALTAPROPUESTASERVICE_EXCEPTION!= null) {
            throw PUBLICADORALTAPROPUESTASERVICE_EXCEPTION;
        }
        return PUBLICADORALTAPROPUESTASERVICE_WSDL_LOCATION;
    }

}