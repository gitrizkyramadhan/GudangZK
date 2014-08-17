
package id.go.customs.mpn.client.cukai;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdBillingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdBillingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="akun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idWajibBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyUnik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nilaiTagihan" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nipRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tdBillingDetail", propOrder = {
    "akun",
    "errorCode",
    "idWajibBayar",
    "keyUnik",
    "kodeBilling",
    "nilaiTagihan",
    "nipRekam",
    "nipUpd",
    "parameterId",
    "wkRekam",
    "wkUpd"
})
public class TdBillingDetail {

    protected String akun;
    protected String errorCode;
    protected String idWajibBayar;
    protected String keyUnik;
    protected String kodeBilling;
    protected long nilaiTagihan;
    protected String nipRekam;
    protected String nipUpd;
    protected String parameterId;
    protected String wkRekam;
    protected String wkUpd;

    /**
     * Gets the value of the akun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkun() {
        return akun;
    }

    /**
     * Sets the value of the akun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkun(String value) {
        this.akun = value;
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
     * Gets the value of the nilaiTagihan property.
     * 
     */
    public long getNilaiTagihan() {
        return nilaiTagihan;
    }

    /**
     * Sets the value of the nilaiTagihan property.
     * 
     */
    public void setNilaiTagihan(long value) {
        this.nilaiTagihan = value;
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
     * Gets the value of the parameterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterId() {
        return parameterId;
    }

    /**
     * Sets the value of the parameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterId(String value) {
        this.parameterId = value;
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
