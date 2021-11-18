package market.soap.entitiesWs.productsWs;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "product"
})
@XmlRootElement(name = "getProductResponse")
public class GetProductResponse {

    @XmlElement(required = true)
    protected ProductWs product;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductWs }
     *     
     */
    public ProductWs getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductWs }
     *     
     */
    public void setProduct(ProductWs value) {
        this.product = value;
    }

}
