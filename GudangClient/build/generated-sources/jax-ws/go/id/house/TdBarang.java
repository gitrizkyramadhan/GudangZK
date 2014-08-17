
package go.id.house;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tdBarang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tdBarang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdBarang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmBarang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stok" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tdBarang", propOrder = {
    "kdBarang",
    "nmBarang",
    "stok"
})
public class TdBarang {

    protected String kdBarang;
    protected String nmBarang;
    protected int stok;

    /**
     * Gets the value of the kdBarang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdBarang() {
        return kdBarang;
    }

    /**
     * Sets the value of the kdBarang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdBarang(String value) {
        this.kdBarang = value;
    }

    /**
     * Gets the value of the nmBarang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmBarang() {
        return nmBarang;
    }

    /**
     * Sets the value of the nmBarang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmBarang(String value) {
        this.nmBarang = value;
    }

    /**
     * Gets the value of the stok property.
     * 
     */
    public int getStok() {
        return stok;
    }

    /**
     * Sets the value of the stok property.
     * 
     */
    public void setStok(int value) {
        this.stok = value;
    }

}
