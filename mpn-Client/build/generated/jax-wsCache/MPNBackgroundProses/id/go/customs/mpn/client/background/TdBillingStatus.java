
package id.go.customs.mpn.client.background;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdBillingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdBillingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeBilling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "tdBillingStatus", propOrder = {
    "errorCode",
    "idStatus",
    "kodeBilling",
    "nipRekam",
    "nipUpd",
    "wkRekam",
    "wkStatus",
    "wkUpd"
})
public class TdBillingStatus {

    protected String errorCode;
    protected String idStatus;
    protected String kodeBilling;
    protected String nipRekam;
    protected String nipUpd;
    protected String wkRekam;
    protected String wkStatus;
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
     * Gets the value of the idStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdStatus() {
        return idStatus;
    }

    /**
     * Sets the value of the idStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdStatus(String value) {
        this.idStatus = value;
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
