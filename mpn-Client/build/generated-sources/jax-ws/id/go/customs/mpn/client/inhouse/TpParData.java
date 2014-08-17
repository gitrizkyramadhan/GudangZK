
package id.go.customs.mpn.client.inhouse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tpParData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tpParData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kdPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmPar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tpParData", propOrder = {
    "kdPar",
    "nmPar"
})
public class TpParData {

    protected String kdPar;
    protected String nmPar;

    /**
     * Gets the value of the kdPar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdPar() {
        return kdPar;
    }

    /**
     * Sets the value of the kdPar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdPar(String value) {
        this.kdPar = value;
    }

    /**
     * Gets the value of the nmPar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmPar() {
        return nmPar;
    }

    /**
     * Sets the value of the nmPar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmPar(String value) {
        this.nmPar = value;
    }

}
