
package id.go.customs.mpn.client.referensi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.go.customs.mpn.client.referensi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDokumen_QNAME = new QName("http://service.mpn.customs.go.id/", "getDokumen");
    private final static QName _GetDokumenResponse_QNAME = new QName("http://service.mpn.customs.go.id/", "getDokumenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.go.customs.mpn.client.referensi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrBillingDokumen }
     * 
     */
    public TrBillingDokumen createTrBillingDokumen() {
        return new TrBillingDokumen();
    }

    /**
     * Create an instance of {@link GetDokumen }
     * 
     */
    public GetDokumen createGetDokumen() {
        return new GetDokumen();
    }

    /**
     * Create an instance of {@link GetDokumenResponse }
     * 
     */
    public GetDokumenResponse createGetDokumenResponse() {
        return new GetDokumenResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDokumen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "getDokumen")
    public JAXBElement<GetDokumen> createGetDokumen(GetDokumen value) {
        return new JAXBElement<GetDokumen>(_GetDokumen_QNAME, GetDokumen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDokumenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "getDokumenResponse")
    public JAXBElement<GetDokumenResponse> createGetDokumenResponse(GetDokumenResponse value) {
        return new JAXBElement<GetDokumenResponse>(_GetDokumenResponse_QNAME, GetDokumenResponse.class, null, value);
    }

}
