
package id.go.customs.mpn.client.inhouse;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataPIB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataPIB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nilaiBM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nmPPJK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noPIB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tglPIB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataPIB", propOrder = {
    "car",
    "errorCode",
    "nilaiBM",
    "nmPPJK",
    "noPIB",
    "tglPIB"
})
public class DataPIB {

    protected String car;
    protected String errorCode;
    protected BigDecimal nilaiBM;
    protected String nmPPJK;
    protected int noPIB;
    protected String tglPIB;

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCar(String value) {
        this.car = value;
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
     * Gets the value of the nilaiBM property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNilaiBM() {
        return nilaiBM;
    }

    /**
     * Sets the value of the nilaiBM property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNilaiBM(BigDecimal value) {
        this.nilaiBM = value;
    }

    /**
     * Gets the value of the nmPPJK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmPPJK() {
        return nmPPJK;
    }

    /**
     * Sets the value of the nmPPJK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmPPJK(String value) {
        this.nmPPJK = value;
    }

    /**
     * Gets the value of the noPIB property.
     * 
     */
    public int getNoPIB() {
        return noPIB;
    }

    /**
     * Sets the value of the noPIB property.
     * 
     */
    public void setNoPIB(int value) {
        this.noPIB = value;
    }

    /**
     * Gets the value of the tglPIB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglPIB() {
        return tglPIB;
    }

    /**
     * Sets the value of the tglPIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglPIB(String value) {
        this.tglPIB = value;
    }

}
