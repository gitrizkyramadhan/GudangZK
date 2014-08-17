
package id.go.customs.mpn.client.cukai;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRekonTagihanCukai complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRekonTagihanCukai">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tdBillingMaster" type="{http://bean.cukai.billing.customs.go.id/}tdBillingMaster" minOccurs="0"/>
 *         &lt;element name="listTdBillingDetail" type="{http://bean.cukai.billing.customs.go.id/}tdBillingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRekonTagihanCukai", propOrder = {
    "tdBillingMaster",
    "listTdBillingDetail"
})
public class GetRekonTagihanCukai {

    protected TdBillingMaster tdBillingMaster;
    protected List<TdBillingDetail> listTdBillingDetail;

    /**
     * Gets the value of the tdBillingMaster property.
     * 
     * @return
     *     possible object is
     *     {@link TdBillingMaster }
     *     
     */
    public TdBillingMaster getTdBillingMaster() {
        return tdBillingMaster;
    }

    /**
     * Sets the value of the tdBillingMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdBillingMaster }
     *     
     */
    public void setTdBillingMaster(TdBillingMaster value) {
        this.tdBillingMaster = value;
    }

    /**
     * Gets the value of the listTdBillingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listTdBillingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListTdBillingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TdBillingDetail }
     * 
     * 
     */
    public List<TdBillingDetail> getListTdBillingDetail() {
        if (listTdBillingDetail == null) {
            listTdBillingDetail = new ArrayList<TdBillingDetail>();
        }
        return this.listTdBillingDetail;
    }

}
