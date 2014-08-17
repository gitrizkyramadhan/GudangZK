
package id.go.customs.mpn.client.cukai;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTagihanCukaiByTgl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTagihanCukaiByTgl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdKantor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jnsDok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglAwal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tglAkhir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTagihanCukaiByTgl", propOrder = {
    "kdKantor",
    "jnsDok",
    "tglAwal",
    "tglAkhir"
})
public class GetTagihanCukaiByTgl {

    protected String kdKantor;
    protected String jnsDok;
    protected String tglAwal;
    protected String tglAkhir;

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
     * Gets the value of the tglAwal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglAwal() {
        return tglAwal;
    }

    /**
     * Sets the value of the tglAwal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglAwal(String value) {
        this.tglAwal = value;
    }

    /**
     * Gets the value of the tglAkhir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglAkhir() {
        return tglAkhir;
    }

    /**
     * Sets the value of the tglAkhir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglAkhir(String value) {
        this.tglAkhir = value;
    }

}
