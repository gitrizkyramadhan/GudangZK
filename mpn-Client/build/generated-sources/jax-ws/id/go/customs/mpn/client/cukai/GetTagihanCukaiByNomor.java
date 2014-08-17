
package id.go.customs.mpn.client.cukai;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTagihanCukaiByNomor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTagihanCukaiByNomor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdKantor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jnsDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTagihanCukaiByNomor", propOrder = {
    "kdKantor",
    "jnsDok",
    "noDok",
    "tglDok"
})
public class GetTagihanCukaiByNomor {

    protected String kdKantor;
    protected String jnsDok;
    protected String noDok;
    protected String tglDok;

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
     * Gets the value of the jnsDok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJnsDok() {
        return jnsDok;
    }

    /**
     * Sets the value of the jnsDok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJnsDok(String value) {
        this.jnsDok = value;
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

}
