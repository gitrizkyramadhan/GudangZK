
package id.go.customs.mpn.client.cukai;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getKodePungutan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getKodePungutan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdAkun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getKodePungutan", propOrder = {
    "kdAkun"
})
public class GetKodePungutan {

    protected String kdAkun;

    /**
     * Gets the value of the kdAkun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdAkun() {
        return kdAkun;
    }

    /**
     * Sets the value of the kdAkun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdAkun(String value) {
        this.kdAkun = value;
    }

}
