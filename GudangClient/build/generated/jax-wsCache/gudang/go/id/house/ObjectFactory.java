
package go.id.house;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the go.id.house package. 
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

    private final static QName _GetAllBarang_QNAME = new QName("http://service.go.id/", "getAllBarang");
    private final static QName _NvlResponse_QNAME = new QName("http://service.go.id/", "nvlResponse");
    private final static QName _GetAllBarangResponse_QNAME = new QName("http://service.go.id/", "getAllBarangResponse");
    private final static QName _Nvl_QNAME = new QName("http://service.go.id/", "nvl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: go.id.house
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TdBarang }
     * 
     */
    public TdBarang createTdBarang() {
        return new TdBarang();
    }

    /**
     * Create an instance of {@link Nvl }
     * 
     */
    public Nvl createNvl() {
        return new Nvl();
    }

    /**
     * Create an instance of {@link NvlResponse }
     * 
     */
    public NvlResponse createNvlResponse() {
        return new NvlResponse();
    }

    /**
     * Create an instance of {@link GetAllBarangResponse }
     * 
     */
    public GetAllBarangResponse createGetAllBarangResponse() {
        return new GetAllBarangResponse();
    }

    /**
     * Create an instance of {@link GetAllBarang }
     * 
     */
    public GetAllBarang createGetAllBarang() {
        return new GetAllBarang();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBarang }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.go.id/", name = "getAllBarang")
    public JAXBElement<GetAllBarang> createGetAllBarang(GetAllBarang value) {
        return new JAXBElement<GetAllBarang>(_GetAllBarang_QNAME, GetAllBarang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NvlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.go.id/", name = "nvlResponse")
    public JAXBElement<NvlResponse> createNvlResponse(NvlResponse value) {
        return new JAXBElement<NvlResponse>(_NvlResponse_QNAME, NvlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBarangResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.go.id/", name = "getAllBarangResponse")
    public JAXBElement<GetAllBarangResponse> createGetAllBarangResponse(GetAllBarangResponse value) {
        return new JAXBElement<GetAllBarangResponse>(_GetAllBarangResponse_QNAME, GetAllBarangResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nvl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.go.id/", name = "nvl")
    public JAXBElement<Nvl> createNvl(Nvl value) {
        return new JAXBElement<Nvl>(_Nvl_QNAME, Nvl.class, null, value);
    }

}
