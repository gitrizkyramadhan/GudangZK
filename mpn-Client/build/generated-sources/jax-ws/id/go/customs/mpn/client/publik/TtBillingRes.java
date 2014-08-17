
package id.go.customs.mpn.client.publik;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ttBillingRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ttBillingRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdKantor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nilaiBayar" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nipRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noRekening" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noStrukBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqRespon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglBuku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglExpBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglNtb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglNtpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeMedia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wkRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ttBillingRes", propOrder = {
    "errorCode",
    "idWajibBayar",
    "kdDok",
    "kdKantor",
    "kodeBank",
    "kodeBilling",
    "nilaiBayar",
    "nipRekam",
    "nipUpd",
    "nmWajibBayar",
    "noDok",
    "noRekening",
    "noStrukBayar",
    "ntb",
    "ntpn",
    "seqRespon",
    "status",
    "tglBilling",
    "tglBuku",
    "tglExpBilling",
    "tglNtb",
    "tglNtpn",
    "typeMedia",
    "wkRekam",
    "wkUpd"
})
public class TtBillingRes {

    protected String errorCode;
    protected String idWajibBayar;
    protected String kdDok;
    protected String kdKantor;
    protected String kodeBank;
    protected String kodeBilling;
    protected long nilaiBayar;
    protected String nipRekam;
    protected String nipUpd;
    protected String nmWajibBayar;
    protected String noDok;
    protected String noRekening;
    protected String noStrukBayar;
    protected String ntb;
    protected String ntpn;
    protected String seqRespon;
    protected String status;
    protected String tglBilling;
    protected String tglBuku;
    protected String tglExpBilling;
    protected String tglNtb;
    protected String tglNtpn;
    protected String typeMedia;
    protected String wkRekam;
    protected String wkUpd;

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
     * Gets the value of the nilaiBayar property.
     * 
     */
    public long getNilaiBayar() {
        return nilaiBayar;
    }

    /**
     * Sets the value of the nilaiBayar property.
     * 
     */
    public void setNilaiBayar(long value) {
        this.nilaiBayar = value;
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
     * Gets the value of the seqRespon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqRespon() {
        return seqRespon;
    }

    /**
     * Sets the value of the seqRespon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqRespon(String value) {
        this.seqRespon = value;
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
     * Gets the value of the tglExpBilling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglExpBilling() {
        return tglExpBilling;
    }

    /**
     * Sets the value of the tglExpBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglExpBilling(String value) {
        this.tglExpBilling = value;
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
