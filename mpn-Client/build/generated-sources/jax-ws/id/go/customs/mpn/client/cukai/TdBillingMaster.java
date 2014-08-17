
package id.go.customs.mpn.client.cukai;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdBillingMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdBillingMaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alasanBatal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flBatal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flRekon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jmlRecordDetail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kdDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdIdWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdKantor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyUnik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBankCabang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noRekening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noStrukBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriBilling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tdBillingDetail" type="{http://bean.cukai.billing.customs.go.id/}tdBillingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tglBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglBuku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglNtb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglNtpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totTagihan" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalDibayar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="totalTagihan" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="traceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeMedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeSumberData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wkRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wkStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wkUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tdBillingMaster", propOrder = {
    "alasanBatal",
    "currency",
    "errorCode",
    "flBatal",
    "flRekon",
    "idWajibBayar",
    "jmlRecordDetail",
    "kdDok",
    "kdIdWajibBayar",
    "kdKantor",
    "keyUnik",
    "kodeBank",
    "kodeBankCabang",
    "kodeBilling",
    "nipRekam",
    "nipUpd",
    "nmWajibBayar",
    "noDok",
    "noRekening",
    "noStrukBayar",
    "ntb",
    "ntpn",
    "seqDok",
    "seriBilling",
    "status",
    "tdBillingDetail",
    "tglBilling",
    "tglBuku",
    "tglDok",
    "tglExpired",
    "tglNtb",
    "tglNtpn",
    "totTagihan",
    "totalDibayar",
    "totalTagihan",
    "traceId",
    "typeMedia",
    "typeSumberData",
    "wkRekam",
    "wkStatus",
    "wkUpd"
})
public class TdBillingMaster {

    protected String alasanBatal;
    protected String currency;
    protected String errorCode;
    protected String flBatal;
    protected String flRekon;
    protected String idWajibBayar;
    protected int jmlRecordDetail;
    protected String kdDok;
    protected String kdIdWajibBayar;
    protected String kdKantor;
    protected String keyUnik;
    protected String kodeBank;
    protected String kodeBankCabang;
    protected String kodeBilling;
    protected String nipRekam;
    protected String nipUpd;
    protected String nmWajibBayar;
    protected String noDok;
    protected String noRekening;
    protected String noStrukBayar;
    protected String ntb;
    protected String ntpn;
    protected String seqDok;
    protected int seriBilling;
    protected String status;
    @XmlElement(nillable = true)
    protected List<TdBillingDetail> tdBillingDetail;
    protected String tglBilling;
    protected String tglBuku;
    protected String tglDok;
    protected String tglExpired;
    protected String tglNtb;
    protected String tglNtpn;
    protected long totTagihan;
    protected long totalDibayar;
    protected long totalTagihan;
    protected String traceId;
    protected String typeMedia;
    protected String typeSumberData;
    protected String wkRekam;
    protected String wkStatus;
    protected String wkUpd;

    /**
     * Gets the value of the alasanBatal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlasanBatal() {
        return alasanBatal;
    }

    /**
     * Sets the value of the alasanBatal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlasanBatal(String value) {
        this.alasanBatal = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the flBatal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlBatal() {
        return flBatal;
    }

    /**
     * Sets the value of the flBatal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlBatal(String value) {
        this.flBatal = value;
    }

    /**
     * Gets the value of the flRekon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlRekon() {
        return flRekon;
    }

    /**
     * Sets the value of the flRekon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlRekon(String value) {
        this.flRekon = value;
    }

    /**
     * Gets the value of the idWajibBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdWajibBayar() {
        return idWajibBayar;
    }

    /**
     * Sets the value of the idWajibBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdWajibBayar(String value) {
        this.idWajibBayar = value;
    }

    /**
     * Gets the value of the jmlRecordDetail property.
     * 
     */
    public int getJmlRecordDetail() {
        return jmlRecordDetail;
    }

    /**
     * Sets the value of the jmlRecordDetail property.
     * 
     */
    public void setJmlRecordDetail(int value) {
        this.jmlRecordDetail = value;
    }

    /**
     * Gets the value of the kdDok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdDok() {
        return kdDok;
    }

    /**
     * Sets the value of the kdDok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdDok(String value) {
        this.kdDok = value;
    }

    /**
     * Gets the value of the kdIdWajibBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdIdWajibBayar() {
        return kdIdWajibBayar;
    }

    /**
     * Sets the value of the kdIdWajibBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdIdWajibBayar(String value) {
        this.kdIdWajibBayar = value;
    }

    /**
     * Gets the value of the kdKantor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdKantor() {
        return kdKantor;
    }

    /**
     * Sets the value of the kdKantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdKantor(String value) {
        this.kdKantor = value;
    }

    /**
     * Gets the value of the keyUnik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyUnik() {
        return keyUnik;
    }

    /**
     * Sets the value of the keyUnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyUnik(String value) {
        this.keyUnik = value;
    }

    /**
     * Gets the value of the kodeBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeBank() {
        return kodeBank;
    }

    /**
     * Sets the value of the kodeBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeBank(String value) {
        this.kodeBank = value;
    }

    /**
     * Gets the value of the kodeBankCabang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeBankCabang() {
        return kodeBankCabang;
    }

    /**
     * Sets the value of the kodeBankCabang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeBankCabang(String value) {
        this.kodeBankCabang = value;
    }

    /**
     * Gets the value of the kodeBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeBilling() {
        return kodeBilling;
    }

    /**
     * Sets the value of the kodeBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeBilling(String value) {
        this.kodeBilling = value;
    }

    /**
     * Gets the value of the nipRekam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNipRekam() {
        return nipRekam;
    }

    /**
     * Sets the value of the nipRekam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNipRekam(String value) {
        this.nipRekam = value;
    }

    /**
     * Gets the value of the nipUpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNipUpd() {
        return nipUpd;
    }

    /**
     * Sets the value of the nipUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNipUpd(String value) {
        this.nipUpd = value;
    }

    /**
     * Gets the value of the nmWajibBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmWajibBayar() {
        return nmWajibBayar;
    }

    /**
     * Sets the value of the nmWajibBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmWajibBayar(String value) {
        this.nmWajibBayar = value;
    }

    /**
     * Gets the value of the noDok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDok() {
        return noDok;
    }

    /**
     * Sets the value of the noDok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDok(String value) {
        this.noDok = value;
    }

    /**
     * Gets the value of the noRekening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRekening() {
        return noRekening;
    }

    /**
     * Sets the value of the noRekening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRekening(String value) {
        this.noRekening = value;
    }

    /**
     * Gets the value of the noStrukBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoStrukBayar() {
        return noStrukBayar;
    }

    /**
     * Sets the value of the noStrukBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoStrukBayar(String value) {
        this.noStrukBayar = value;
    }

    /**
     * Gets the value of the ntb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtb() {
        return ntb;
    }

    /**
     * Sets the value of the ntb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtb(String value) {
        this.ntb = value;
    }

    /**
     * Gets the value of the ntpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtpn() {
        return ntpn;
    }

    /**
     * Sets the value of the ntpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtpn(String value) {
        this.ntpn = value;
    }

    /**
     * Gets the value of the seqDok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqDok() {
        return seqDok;
    }

    /**
     * Sets the value of the seqDok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqDok(String value) {
        this.seqDok = value;
    }

    /**
     * Gets the value of the seriBilling property.
     * 
     */
    public int getSeriBilling() {
        return seriBilling;
    }

    /**
     * Sets the value of the seriBilling property.
     * 
     */
    public void setSeriBilling(int value) {
        this.seriBilling = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tdBillingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdBillingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTdBillingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TdBillingDetail }
     * 
     * 
     */
    public List<TdBillingDetail> getTdBillingDetail() {
        if (tdBillingDetail == null) {
            tdBillingDetail = new ArrayList<TdBillingDetail>();
        }
        return this.tdBillingDetail;
    }

    /**
     * Gets the value of the tglBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglBilling() {
        return tglBilling;
    }

    /**
     * Sets the value of the tglBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglBilling(String value) {
        this.tglBilling = value;
    }

    /**
     * Gets the value of the tglBuku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglBuku() {
        return tglBuku;
    }

    /**
     * Sets the value of the tglBuku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglBuku(String value) {
        this.tglBuku = value;
    }

    /**
     * Gets the value of the tglDok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglDok() {
        return tglDok;
    }

    /**
     * Sets the value of the tglDok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglDok(String value) {
        this.tglDok = value;
    }

    /**
     * Gets the value of the tglExpired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglExpired() {
        return tglExpired;
    }

    /**
     * Sets the value of the tglExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglExpired(String value) {
        this.tglExpired = value;
    }

    /**
     * Gets the value of the tglNtb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglNtb() {
        return tglNtb;
    }

    /**
     * Sets the value of the tglNtb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglNtb(String value) {
        this.tglNtb = value;
    }

    /**
     * Gets the value of the tglNtpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglNtpn() {
        return tglNtpn;
    }

    /**
     * Sets the value of the tglNtpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglNtpn(String value) {
        this.tglNtpn = value;
    }

    /**
     * Gets the value of the totTagihan property.
     * 
     */
    public long getTotTagihan() {
        return totTagihan;
    }

    /**
     * Sets the value of the totTagihan property.
     * 
     */
    public void setTotTagihan(long value) {
        this.totTagihan = value;
    }

    /**
     * Gets the value of the totalDibayar property.
     * 
     */
    public long getTotalDibayar() {
        return totalDibayar;
    }

    /**
     * Sets the value of the totalDibayar property.
     * 
     */
    public void setTotalDibayar(long value) {
        this.totalDibayar = value;
    }

    /**
     * Gets the value of the totalTagihan property.
     * 
     */
    public long getTotalTagihan() {
        return totalTagihan;
    }

    /**
     * Sets the value of the totalTagihan property.
     * 
     */
    public void setTotalTagihan(long value) {
        this.totalTagihan = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the typeMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeMedia() {
        return typeMedia;
    }

    /**
     * Sets the value of the typeMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeMedia(String value) {
        this.typeMedia = value;
    }

    /**
     * Gets the value of the typeSumberData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSumberData() {
        return typeSumberData;
    }

    /**
     * Sets the value of the typeSumberData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSumberData(String value) {
        this.typeSumberData = value;
    }

    /**
     * Gets the value of the wkRekam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWkRekam() {
        return wkRekam;
    }

    /**
     * Sets the value of the wkRekam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWkRekam(String value) {
        this.wkRekam = value;
    }

    /**
     * Gets the value of the wkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWkStatus() {
        return wkStatus;
    }

    /**
     * Sets the value of the wkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWkStatus(String value) {
        this.wkStatus = value;
    }

    /**
     * Gets the value of the wkUpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWkUpd() {
        return wkUpd;
    }

    /**
     * Sets the value of the wkUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWkUpd(String value) {
        this.wkUpd = value;
    }

}
