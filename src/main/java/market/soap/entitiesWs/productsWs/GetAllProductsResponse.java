
package market.soap.entitiesWs.productsWs;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "products"
})
@XmlRootElement(name = "getAllProductsResponse")
public class GetAllProductsResponse {

    @XmlElement(required = true)
    protected List<ProductWs> products;


    public List<ProductWs> getProducts() {
        if (products == null) {
            products = new ArrayList<ProductWs>();
        }
        return this.products;
    }

}
