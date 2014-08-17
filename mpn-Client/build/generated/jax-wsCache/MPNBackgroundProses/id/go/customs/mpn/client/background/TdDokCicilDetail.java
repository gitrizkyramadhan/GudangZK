
package id.go.customs.mpn.client.background;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdDokCicilDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdDokCicilDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="akun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nilaiCicil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nipRekam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nipUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seqDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seriCicil" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "tdDokCicilDetail", propOrder = {
    "akun",
    "errorCode",
    "nilaiCicil",
    "nipRekam",
    "nipUpd",
    "seqDok",
    "seriCicil",
    "wkRekam",
    "wkUpd"
})
public class TdDokCicilDetail {

    protected String akun;
    protected String errorCode;
    protected int nilaiCicil;
    protected String nipRekam;
    protected String nipUpd;
    protected String seqDok;
    protected int seriCicil;
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
     * Gets the value of the nilaiCicil property.
     * 
     */
    public int getNilaiCicil() {
        return nilaiCicil;
    }

    /**
     * Sets the value of the nilaiCicil property.
     * 
     */
    public void setNilaiCicil(int value) {
        this.nilaiCicil = value;
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
     * Gets the value of the seriCicil property.
     * 
     */
    public int getSeriCicil() {
        return seriCicil;
    }

    /**
     * Sets the value of the seriCicil property.
     * 
     */
    public void setSeriCicil(int value) {
        this.seriCicil = value;
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
