
package id.go.customs.mpn.client.cukai;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setBillingPiutangCukai complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setBillingPiutangCukai">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tdDokMaster" type="{http://bean.cukai.billing.customs.go.id/}tdDokMaster" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBillingPiutangCukai", propOrder = {
    "tdDokMaster"
})
public class SetBillingPiutangCukai {

    protected TdDokMaster tdDokMaster;

    /**
     * Gets the value of the tdDokMaster property.
     * 
     * @return
     *     possible object is
     *     {@link TdDokMaster }
     *     
     */
    public TdDokMaster getTdDokMaster() {
        return tdDokMaster;
    }

    /**
     * Sets the value of the tdDokMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdDokMaster }
     *     
     */
    public void setTdDokMaster(TdDokMaster value) {
        this.tdDokMaster = value;
    }

}
