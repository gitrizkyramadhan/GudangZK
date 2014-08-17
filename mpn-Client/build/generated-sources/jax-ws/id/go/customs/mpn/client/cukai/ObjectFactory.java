
package id.go.customs.mpn.client.cukai;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.go.customs.mpn.client.cukai package. 
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

    private final static QName _GetKodePungutanResponse_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getKodePungutanResponse");
    private final static QName _GetKodePungutan_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getKodePungutan");
    private final static QName _SetBillingPiutangCukai_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "setBillingPiutangCukai");
    private final static QName _GetTagihanCukaiByNomor_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getTagihanCukaiByNomor");
    private final static QName _GetRekonTagihanCukaiResponse_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getRekonTagihanCukaiResponse");
    private final static QName _GetTagihanCukaiByNomorResponse_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getTagihanCukaiByNomorResponse");
    private final static QName _GetTagihanCukaiByTglResponse_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getTagihanCukaiByTglResponse");
    private final static QName _GetRekonTagihanCukai_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getRekonTagihanCukai");
    private final static QName _GetTagihanCukaiByTgl_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "getTagihanCukaiByTgl");
    private final static QName _SetBillingPiutangCukaiResponse_QNAME = new QName("http://bean.cukai.billing.customs.go.id/", "setBillingPiutangCukaiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.go.customs.mpn.client.cukai
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTagihanCukaiByTgl }
     * 
     */
    public GetTagihanCukaiByTgl createGetTagihanCukaiByTgl() {
        return new GetTagihanCukaiByTgl();
    }

    /**
     * Create an instance of {@link GetRekonTagihanCukaiResponse }
     * 
     */
    public GetRekonTagihanCukaiResponse createGetRekonTagihanCukaiResponse() {
        return new GetRekonTagihanCukaiResponse();
    }

    /**
     * Create an instance of {@link TdDokMaster }
     * 
     */
    public TdDokMaster createTdDokMaster() {
        return new TdDokMaster();
    }

    /**
     * Create an instance of {@link GetTagihanCukaiByNomor }
     * 
     */
    public GetTagihanCukaiByNomor createGetTagihanCukaiByNomor() {
        return new GetTagihanCukaiByNomor();
    }

    /**
     * Create an instance of {@link TdBillingDetail }
     * 
     */
    public TdBillingDetail createTdBillingDetail() {
        return new TdBillingDetail();
    }

    /**
     * Create an instance of {@link GetRekonTagihanCukai }
     * 
     */
    public GetRekonTagihanCukai createGetRekonTagihanCukai() {
        return new GetRekonTagihanCukai();
    }

    /**
     * Create an instance of {@link GetTagihanCukaiByNomorResponse }
     * 
     */
    public GetTagihanCukaiByNomorResponse createGetTagihanCukaiByNomorResponse() {
        return new GetTagihanCukaiByNomorResponse();
    }

    /**
     * Create an instance of {@link GetKodePungutanResponse }
     * 
     */
    public GetKodePungutanResponse createGetKodePungutanResponse() {
        return new GetKodePungutanResponse();
    }

    /**
     * Create an instance of {@link SetBillingPiutangCukai }
     * 
     */
    public SetBillingPiutangCukai createSetBillingPiutangCukai() {
        return new SetBillingPiutangCukai();
    }

    /**
     * Create an instance of {@link TdBillingMaster }
     * 
     */
    public TdBillingMaster createTdBillingMaster() {
        return new TdBillingMaster();
    }

    /**
     * Create an instance of {@link TdDokDetail }
     * 
     */
    public TdDokDetail createTdDokDetail() {
        return new TdDokDetail();
    }

    /**
     * Create an instance of {@link GetKodePungutan }
     * 
     */
    public GetKodePungutan createGetKodePungutan() {
        return new GetKodePungutan();
    }

    /**
     * Create an instance of {@link SetBillingPiutangCukaiResponse }
     * 
     */
    public SetBillingPiutangCukaiResponse createSetBillingPiutangCukaiResponse() {
        return new SetBillingPiutangCukaiResponse();
    }

    /**
     * Create an instance of {@link GetTagihanCukaiByTglResponse }
     * 
     */
    public GetTagihanCukaiByTglResponse createGetTagihanCukaiByTglResponse() {
        return new GetTagihanCukaiByTglResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKodePungutanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getKodePungutanResponse")
    public JAXBElement<GetKodePungutanResponse> createGetKodePungutanResponse(GetKodePungutanResponse value) {
        return new JAXBElement<GetKodePungutanResponse>(_GetKodePungutanResponse_QNAME, GetKodePungutanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKodePungutan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getKodePungutan")
    public JAXBElement<GetKodePungutan> createGetKodePungutan(GetKodePungutan value) {
        return new JAXBElement<GetKodePungutan>(_GetKodePungutan_QNAME, GetKodePungutan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBillingPiutangCukai }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "setBillingPiutangCukai")
    public JAXBElement<SetBillingPiutangCukai> createSetBillingPiutangCukai(SetBillingPiutangCukai value) {
        return new JAXBElement<SetBillingPiutangCukai>(_SetBillingPiutangCukai_QNAME, SetBillingPiutangCukai.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagihanCukaiByNomor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getTagihanCukaiByNomor")
    public JAXBElement<GetTagihanCukaiByNomor> createGetTagihanCukaiByNomor(GetTagihanCukaiByNomor value) {
        return new JAXBElement<GetTagihanCukaiByNomor>(_GetTagihanCukaiByNomor_QNAME, GetTagihanCukaiByNomor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRekonTagihanCukaiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getRekonTagihanCukaiResponse")
    public JAXBElement<GetRekonTagihanCukaiResponse> createGetRekonTagihanCukaiResponse(GetRekonTagihanCukaiResponse value) {
        return new JAXBElement<GetRekonTagihanCukaiResponse>(_GetRekonTagihanCukaiResponse_QNAME, GetRekonTagihanCukaiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagihanCukaiByNomorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getTagihanCukaiByNomorResponse")
    public JAXBElement<GetTagihanCukaiByNomorResponse> createGetTagihanCukaiByNomorResponse(GetTagihanCukaiByNomorResponse value) {
        return new JAXBElement<GetTagihanCukaiByNomorResponse>(_GetTagihanCukaiByNomorResponse_QNAME, GetTagihanCukaiByNomorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagihanCukaiByTglResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getTagihanCukaiByTglResponse")
    public JAXBElement<GetTagihanCukaiByTglResponse> createGetTagihanCukaiByTglResponse(GetTagihanCukaiByTglResponse value) {
        return new JAXBElement<GetTagihanCukaiByTglResponse>(_GetTagihanCukaiByTglResponse_QNAME, GetTagihanCukaiByTglResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRekonTagihanCukai }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getRekonTagihanCukai")
    public JAXBElement<GetRekonTagihanCukai> createGetRekonTagihanCukai(GetRekonTagihanCukai value) {
        return new JAXBElement<GetRekonTagihanCukai>(_GetRekonTagihanCukai_QNAME, GetRekonTagihanCukai.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagihanCukaiByTgl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "getTagihanCukaiByTgl")
    public JAXBElement<GetTagihanCukaiByTgl> createGetTagihanCukaiByTgl(GetTagihanCukaiByTgl value) {
        return new JAXBElement<GetTagihanCukaiByTgl>(_GetTagihanCukaiByTgl_QNAME, GetTagihanCukaiByTgl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBillingPiutangCukaiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean.cukai.billing.customs.go.id/", name = "setBillingPiutangCukaiResponse")
    public JAXBElement<SetBillingPiutangCukaiResponse> createSetBillingPiutangCukaiResponse(SetBillingPiutangCukaiResponse value) {
        return new JAXBElement<SetBillingPiutangCukaiResponse>(_SetBillingPiutangCukaiResponse_QNAME, SetBillingPiutangCukaiResponse.class, null, value);
    }

}
