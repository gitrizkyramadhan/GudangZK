
package id.go.customs.mpn.client.background;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDokMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdDokMaster">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flCicil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagBatal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdIdWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdKantor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noSkep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglJtTempo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglJtTempoTunda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglSkep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTagihan" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "tdDokMaster", propOrder = {
    "currency",
    "errorCode",
    "flAuto",
    "flCicil",
    "flagBatal",
    "idWajibBayar",
    "kdDok",
    "kdIdWajibBayar",
    "kdKantor",
    "kodeBilling",
    "namaWajibBayar",
    "nipRekam",
    "nipUpd",
    "noDok",
    "noSkep",
    "seqDok",
    "status",
    "tglDok",
    "tglJtTempo",
    "tglJtTempoTunda",
    "tglSkep",
    "totalTagihan",
    "wkRekam",
    "wkStatus",
    "wkUpd"
})
public class TdDokMaster {

    protected String currency;
    protected String errorCode;
    protected String flAuto;
    protected String flCicil;
    protected String flagBatal;
    protected String idWajibBayar;
    protected String kdDok;
    protected String kdIdWajibBayar;
    protected String kdKantor;
    protected String kodeBilling;
    protected String namaWajibBayar;
    protected String nipRekam;
    protected String nipUpd;
    protected String noDok;
    protected String noSkep;
    protected String seqDok;
    protected String status;
    protected String tglDok;
    protected String tglJtTempo;
    protected String tglJtTempoTunda;
    protected String tglSkep;
    protected long totalTagihan;
    protected String wkRekam;
    protected String wkStatus;
    protected String wkUpd;

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
     * Gets the value of the flAuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlAuto() {
        return flAuto;
    }

    /**
     * Sets the value of the flAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlAuto(String value) {
        this.flAuto = value;
    }

    /**
     * Gets the value of the flCicil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlCicil() {
        return flCicil;
    }

    /**
     * Sets the value of the flCicil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlCicil(String value) {
        this.flCicil = value;
    }

    /**
     * Gets the value of the flagBatal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagBatal() {
        return flagBatal;
    }

    /**
     * Sets the value of the flagBatal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagBatal(String value) {
        this.flagBatal = value;
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
     * Gets the value of the namaWajibBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaWajibBayar() {
        return namaWajibBayar;
    }

    /**
     * Sets the value of the namaWajibBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaWajibBayar(String value) {
        this.namaWajibBayar = value;
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
     * Gets the value of the noSkep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSkep() {
        return noSkep;
    }

    /**
     * Sets the value of the noSkep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSkep(String value) {
        this.noSkep = value;
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
     * Gets the value of the tglJtTempo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglJtTempo() {
        return tglJtTempo;
    }

    /**
     * Sets the value of the tglJtTempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglJtTempo(String value) {
        this.tglJtTempo = value;
    }

    /**
     * Gets the value of the tglJtTempoTunda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglJtTempoTunda() {
        return tglJtTempoTunda;
    }

    /**
     * Sets the value of the tglJtTempoTunda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglJtTempoTunda(String value) {
        this.tglJtTempoTunda = value;
    }

    /**
     * Gets the value of the tglSkep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglSkep() {
        return tglSkep;
    }

    /**
     * Sets the value of the tglSkep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglSkep(String value) {
        this.tglSkep = value;
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
