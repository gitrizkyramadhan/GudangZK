
package id.go.customs.mpn.client.inhouse;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MPNInhouseService", targetNamespace = "http://service.mpn.customs.go.id/", wsdlLocation = "http://10.0.16.126/MPNInhouseService/MPNInhouse?WSDL")
public class MPNInhouseService
    extends Service
{

    private final static URL MPNINHOUSESERVICE_WSDL_LOCATION;
    private final static WebServiceException MPNINHOUSESERVICE_EXCEPTION;
    private final static QName MPNINHOUSESERVICE_QNAME = new QName("http://service.mpn.customs.go.id/", "MPNInhouseService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.16.126/MPNInhouseService/MPNInhouse?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MPNINHOUSESERVICE_WSDL_LOCATION = url;
        MPNINHOUSESERVICE_EXCEPTION = e;
    }

    public MPNInhouseService() {
        super(__getWsdlLocation(), MPNINHOUSESERVICE_QNAME);
    }

    public MPNInhouseService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MPNINHOUSESERVICE_QNAME, features);
    }

    public MPNInhouseService(URL wsdlLocation) {
        super(wsdlLocation, MPNINHOUSESERVICE_QNAME);
    }

    public MPNInhouseService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MPNINHOUSESERVICE_QNAME, features);
    }

    public MPNInhouseService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MPNInhouseService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MPNInhouse
     */
    @WebEndpoint(name = "MPNInhousePort")
    public MPNInhouse getMPNInhousePort() {
        return super.getPort(new QName("http://service.mpn.customs.go.id/", "MPNInhousePort"), MPNInhouse.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MPNInhouse
     */
    @WebEndpoint(name = "MPNInhousePort")
    public MPNInhouse getMPNInhousePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.mpn.customs.go.id/", "MPNInhousePort"), MPNInhouse.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MPNINHOUSESERVICE_EXCEPTION!= null) {
            throw MPNINHOUSESERVICE_EXCEPTION;
        }
        return MPNINHOUSESERVICE_WSDL_LOCATION;
    }

}