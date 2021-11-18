
package market.soap.entitiesWs.productsWs;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductByTitleRequest }
     * 
     */
    public GetProductByTitleRequest createGetProductByTitleRequest() {
        return new GetProductByTitleRequest();
    }

    /**
     * Create an instance of {@link GetProductByIdRequest }
     * 
     */
    public GetProductByIdRequest createGetProductByIdRequest() {
        return new GetProductByIdRequest();
    }

    /**
     * Create an instance of {@link GetAllProductsRequest }
     * 
     */
    public GetAllProductsRequest createGetAllProductsRequest() {
        return new GetAllProductsRequest();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link ProductWs }
     * 
     */
    public ProductWs createProductWs() {
        return new ProductWs();
    }

    /**
     * Create an instance of {@link GetAllProductsResponse }
     * 
     */
    public GetAllProductsResponse createGetAllProductsResponse() {
        return new GetAllProductsResponse();
    }

}
