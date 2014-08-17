
package id.go.customs.mpn.client.inhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trBillingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trBillingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "trBillingStatus", propOrder = {
    "errorCode",
    "idStatus",
    "kdStatus",
    "uraian"
})
public class TrBillingStatus {

    protected String errorCode;
    protected String idStatus;
    protected String kdStatus;
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
     * Gets the value of the kdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdStatus() {
        return kdStatus;
    }

    /**
     * Sets the value of the kdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdStatus(String value) {
        this.kdStatus = value;
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
