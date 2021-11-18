
package market.soap.entitiesWs.categoriesWs;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "category"
})
@XmlRootElement(name = "getCategoryByTitleResponse")
public class GetCategoryByTitleResponse {

    @XmlElement(required = true)
    protected CategoryWs category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryWs }
     *     
     */
    public CategoryWs getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryWs }
     *     
     */
    public void setCategory(CategoryWs value) {
        this.category = value;
    }

}
