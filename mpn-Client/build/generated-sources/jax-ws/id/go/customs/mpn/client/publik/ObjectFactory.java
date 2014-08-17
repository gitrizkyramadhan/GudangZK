
package id.go.customs.mpn.client.publik;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.go.customs.mpn.client.publik package. 
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

    private final static QName _InsertTtBillingRes_QNAME = new QName("http://service.mpn.customs.go.id/", "insertTtBillingRes");
    private final static QName _InsertDokDetailSKP_QNAME = new QName("http://service.mpn.customs.go.id/", "insertDokDetailSKP");
    private final static QName _InsertTpLOgResponse_QNAME = new QName("http://service.mpn.customs.go.id/", "insertTpLOgResponse");
    private final static QName _InsertTpLOg_QNAME = new QName("http://service.mpn.customs.go.id/", "insertTpLOg");
    private final static QName _KirimBilling_QNAME = new QName("http://service.mpn.customs.go.id/", "kirimBilling");
    private final static QName _InsertDokDetailSKPResponse_QNAME = new QName("http://service.mpn.customs.go.id/", "insertDokDetailSKPResponse");
    private final static QName _InsertDokMasterSKPResponse_QNAME = new QName("http://service.mpn.customs.go.id/", "insertDokMasterSKPResponse");
    private final static QName _KirimBillingResponse_QNAME = new QName("http://service.mpn.customs.go.id/", "kirimBillingResponse");
    private final static QName _InsertDokMasterSKP_QNAME = new QName("http://service.mpn.customs.go.id/", "insertDokMasterSKP");
    private final static QName _InsertTtBillingResResponse_QNAME = new QName("http://service.mpn.customs.go.id/", "insertTtBillingResResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.go.customs.mpn.client.publik
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertDokDetailSKPResponse }
     * 
     */
    public InsertDokDetailSKPResponse createInsertDokDetailSKPResponse() {
        return new InsertDokDetailSKPResponse();
    }

    /**
     * Create an instance of {@link KirimBillingResponse }
     * 
     */
    public KirimBillingResponse createKirimBillingResponse() {
        return new KirimBillingResponse();
    }

    /**
     * Create an instance of {@link InsertTtBillingRes }
     * 
     */
    public InsertTtBillingRes createInsertTtBillingRes() {
        return new InsertTtBillingRes();
    }

    /**
     * Create an instance of {@link InsertDokMasterSKP }
     * 
     */
    public InsertDokMasterSKP createInsertDokMasterSKP() {
        return new InsertDokMasterSKP();
    }

    /**
     * Create an instance of {@link InsertDokMasterSKPResponse }
     * 
     */
    public InsertDokMasterSKPResponse createInsertDokMasterSKPResponse() {
        return new InsertDokMasterSKPResponse();
    }

    /**
     * Create an instance of {@link InsertTpLOgResponse }
     * 
     */
    public InsertTpLOgResponse createInsertTpLOgResponse() {
        return new InsertTpLOgResponse();
    }

    /**
     * Create an instance of {@link InsertTtBillingResResponse }
     * 
     */
    public InsertTtBillingResResponse createInsertTtBillingResResponse() {
        return new InsertTtBillingResResponse();
    }

    /**
     * Create an instance of {@link TdDokMaster }
     * 
     */
    public TdDokMaster createTdDokMaster() {
        return new TdDokMaster();
    }

    /**
     * Create an instance of {@link InsertDokDetailSKP }
     * 
     */
    public InsertDokDetailSKP createInsertDokDetailSKP() {
        return new InsertDokDetailSKP();
    }

    /**
     * Create an instance of {@link TdDokDetail }
     * 
     */
    public TdDokDetail createTdDokDetail() {
        return new TdDokDetail();
    }

    /**
     * Create an instance of {@link KirimBilling }
     * 
     */
    public KirimBilling createKirimBilling() {
        return new KirimBilling();
    }

    /**
     * Create an instance of {@link InsertTpLOg }
     * 
     */
    public InsertTpLOg createInsertTpLOg() {
        return new InsertTpLOg();
    }

    /**
     * Create an instance of {@link TtBillingRes }
     * 
     */
    public TtBillingRes createTtBillingRes() {
        return new TtBillingRes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTtBillingRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertTtBillingRes")
    public JAXBElement<InsertTtBillingRes> createInsertTtBillingRes(InsertTtBillingRes value) {
        return new JAXBElement<InsertTtBillingRes>(_InsertTtBillingRes_QNAME, InsertTtBillingRes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDokDetailSKP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertDokDetailSKP")
    public JAXBElement<InsertDokDetailSKP> createInsertDokDetailSKP(InsertDokDetailSKP value) {
        return new JAXBElement<InsertDokDetailSKP>(_InsertDokDetailSKP_QNAME, InsertDokDetailSKP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTpLOgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertTpLOgResponse")
    public JAXBElement<InsertTpLOgResponse> createInsertTpLOgResponse(InsertTpLOgResponse value) {
        return new JAXBElement<InsertTpLOgResponse>(_InsertTpLOgResponse_QNAME, InsertTpLOgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTpLOg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertTpLOg")
    public JAXBElement<InsertTpLOg> createInsertTpLOg(InsertTpLOg value) {
        return new JAXBElement<InsertTpLOg>(_InsertTpLOg_QNAME, InsertTpLOg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KirimBilling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "kirimBilling")
    public JAXBElement<KirimBilling> createKirimBilling(KirimBilling value) {
        return new JAXBElement<KirimBilling>(_KirimBilling_QNAME, KirimBilling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDokDetailSKPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertDokDetailSKPResponse")
    public JAXBElement<InsertDokDetailSKPResponse> createInsertDokDetailSKPResponse(InsertDokDetailSKPResponse value) {
        return new JAXBElement<InsertDokDetailSKPResponse>(_InsertDokDetailSKPResponse_QNAME, InsertDokDetailSKPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDokMasterSKPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertDokMasterSKPResponse")
    public JAXBElement<InsertDokMasterSKPResponse> createInsertDokMasterSKPResponse(InsertDokMasterSKPResponse value) {
        return new JAXBElement<InsertDokMasterSKPResponse>(_InsertDokMasterSKPResponse_QNAME, InsertDokMasterSKPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KirimBillingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "kirimBillingResponse")
    public JAXBElement<KirimBillingResponse> createKirimBillingResponse(KirimBillingResponse value) {
        return new JAXBElement<KirimBillingResponse>(_KirimBillingResponse_QNAME, KirimBillingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertDokMasterSKP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertDokMasterSKP")
    public JAXBElement<InsertDokMasterSKP> createInsertDokMasterSKP(InsertDokMasterSKP value) {
        return new JAXBElement<InsertDokMasterSKP>(_InsertDokMasterSKP_QNAME, InsertDokMasterSKP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertTtBillingResResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mpn.customs.go.id/", name = "insertTtBillingResResponse")
    public JAXBElement<InsertTtBillingResResponse> createInsertTtBillingResResponse(InsertTtBillingResResponse value) {
        return new JAXBElement<InsertTtBillingResResponse>(_InsertTtBillingResResponse_QNAME, InsertTtBillingResResponse.class, null, value);
    }

}
