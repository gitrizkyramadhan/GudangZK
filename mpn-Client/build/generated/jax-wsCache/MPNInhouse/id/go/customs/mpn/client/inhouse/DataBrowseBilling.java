
package id.go.customs.mpn.client.inhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataBrowseBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataBrowseBilling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdKantor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noRek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noStrukBay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglBuku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglExpired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglNtb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglNtpn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTagihan" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataBrowseBilling", propOrder = {
    "cabBank",
    "currency",
    "errorCode",
    "idWajibBayar",
    "kdDok",
    "kdId",
    "kdKantor",
    "kodeBank",
    "kodeBilling",
    "nmWajibBayar",
    "noDok",
    "noRek",
    "noStrukBay",
    "ntb",
    "ntpn",
    "status",
    "tglBilling",
    "tglBuku",
    "tglDok",
    "tglExpired",
    "tglNtb",
    "tglNtpn",
    "totalTagihan"
})
public class DataBrowseBilling {

    protected String cabBank;
    protected String currency;
    protected String errorCode;
    protected String idWajibBayar;
    protected String kdDok;
    protected String kdId;
    protected String kdKantor;
    protected String kodeBank;
    protected String kodeBilling;
    protected String nmWajibBayar;
    protected String noDok;
    protected String noRek;
    protected String noStrukBay;
    protected String ntb;
    protected String ntpn;
    protected String status;
    protected String tglBilling;
    protected String tglBuku;
    protected String tglDok;
    protected String tglExpired;
    protected String tglNtb;
    protected String tglNtpn;
    protected Long totalTagihan;

    /**
     * Gets the value of the cabBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabBank() {
        return cabBank;
    }

    /**
     * Sets the value of the cabBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabBank(String value) {
        this.cabBank = value;
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
     * Gets the value of the kdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdId() {
        return kdId;
    }

    /**
     * Sets the value of the kdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdId(String value) {
        this.kdId = value;
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
     * Gets the value of the noRek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoRek() {
        return noRek;
    }

    /**
     * Sets the value of the noRek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoRek(String value) {
        this.noRek = value;
    }

    /**
     * Gets the value of the noStrukBay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoStrukBay() {
        return noStrukBay;
    }

    /**
     * Sets the value of the noStrukBay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoStrukBay(String value) {
        this.noStrukBay = value;
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
     * Gets the value of the totalTagihan property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalTagihan() {
        return totalTagihan;
    }

    /**
     * Sets the value of the totalTagihan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalTagihan(Long value) {
        this.totalTagihan = value;
    }

}
