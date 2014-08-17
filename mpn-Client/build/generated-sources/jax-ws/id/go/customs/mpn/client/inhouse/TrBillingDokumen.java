
package id.go.customs.mpn.client.inhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trBillingDokumen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trBillingDokumen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uraian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trBillingDokumen", propOrder = {
    "errorCode",
    "flAuto",
    "kdDok",
    "nmDok",
    "uraian"
})
public class TrBillingDokumen {

    protected String errorCode;
    protected String flAuto;
    protected String kdDok;
    protected String nmDok;
    protected String uraian;

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
     * Gets the value of the nmDok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmDok() {
        return nmDok;
    }

    /**
     * Sets the value of the nmDok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmDok(String value) {
        this.nmDok = value;
    }

    /**
     * Gets the value of the uraian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUraian() {
        return uraian;
    }

    /**
     * Sets the value of the uraian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUraian(String value) {
        this.uraian = value;
    }

}
