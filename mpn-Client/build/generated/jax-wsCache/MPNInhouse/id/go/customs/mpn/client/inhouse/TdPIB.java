
package id.go.customs.mpn.client.inhouse;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdPIB complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdPIB">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idImportir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPPJK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nilaiBM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="noPIB" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seqPIB" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "tdPIB", propOrder = {
    "car",
    "errorCode",
    "idImportir",
    "idPPJK",
    "nilaiBM",
    "noPIB",
    "seqPIB",
    "tglPIB"
})
public class TdPIB {

    protected String car;
    protected String errorCode;
    protected String idImportir;
    protected String idPPJK;
    protected BigDecimal nilaiBM;
    protected int noPIB;
    protected long seqPIB;
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
     * Gets the value of the idImportir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdImportir() {
        return idImportir;
    }

    /**
     * Sets the value of the idImportir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdImportir(String value) {
        this.idImportir = value;
    }

    /**
     * Gets the value of the idPPJK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPPJK() {
        return idPPJK;
    }

    /**
     * Sets the value of the idPPJK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPPJK(String value) {
        this.idPPJK = value;
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
     * Gets the value of the seqPIB property.
     * 
     */
    public long getSeqPIB() {
        return seqPIB;
    }

    /**
     * Sets the value of the seqPIB property.
     * 
     */
    public void setSeqPIB(long value) {
        this.seqPIB = value;
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
