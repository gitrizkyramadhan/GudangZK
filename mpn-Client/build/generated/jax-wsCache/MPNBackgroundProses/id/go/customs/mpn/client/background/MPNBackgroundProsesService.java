
package id.go.customs.mpn.client.background;

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
@WebServiceClient(name = "MPNBackgroundProsesService", targetNamespace = "http://service.mpn.customs.go.id/", wsdlLocation = "http://10.0.16.126/MPNBackgroundProsesService/MPNBackgroundProses?wsdl")
public class MPNBackgroundProsesService
    extends Service
{

    private final static URL MPNBACKGROUNDPROSESSERVICE_WSDL_LOCATION;
    private final static WebServiceException MPNBACKGROUNDPROSESSERVICE_EXCEPTION;
    private final static QName MPNBACKGROUNDPROSESSERVICE_QNAME = new QName("http://service.mpn.customs.go.id/", "MPNBackgroundProsesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.16.126/MPNBackgroundProsesService/MPNBackgroundProses?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MPNBACKGROUNDPROSESSERVICE_WSDL_LOCATION = url;
        MPNBACKGROUNDPROSESSERVICE_EXCEPTION = e;
    }

    public MPNBackgroundProsesService() {
        super(__getWsdlLocation(), MPNBACKGROUNDPROSESSERVICE_QNAME);
    }

    public MPNBackgroundProsesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MPNBACKGROUNDPROSESSERVICE_QNAME, features);
    }

    public MPNBackgroundProsesService(URL wsdlLocation) {
        super(wsdlLocation, MPNBACKGROUNDPROSESSERVICE_QNAME);
    }

    public MPNBackgroundProsesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MPNBACKGROUNDPROSESSERVICE_QNAME, features);
    }

    public MPNBackgroundProsesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MPNBackgroundProsesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MPNBackgroundProses
     */
    @WebEndpoint(name = "MPNBackgroundProsesPort")
    public MPNBackgroundProses getMPNBackgroundProsesPort() {
        return super.getPort(new QName("http://service.mpn.customs.go.id/", "MPNBackgroundProsesPort"), MPNBackgroundProses.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MPNBackgroundProses
     */
    @WebEndpoint(name = "MPNBackgroundProsesPort")
    public MPNBackgroundProses getMPNBackgroundProsesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.mpn.customs.go.id/", "MPNBackgroundProsesPort"), MPNBackgroundProses.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MPNBACKGROUNDPROSESSERVICE_EXCEPTION!= null) {
            throw MPNBACKGROUNDPROSESSERVICE_EXCEPTION;
        }
        return MPNBACKGROUNDPROSESSERVICE_WSDL_LOCATION;
    }

}