package market.soap.endpoints;

import lombok.RequiredArgsConstructor;
import market.soap.entitiesWs.productsWs.GetAllProductsResponse;
import market.soap.entitiesWs.productsWs.GetProductByIdRequest;
import market.soap.entitiesWs.productsWs.GetProductResponse;
import market.soap.services.ProductWsService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
@RequiredArgsConstructor
public class ProductEndpoint {
    private static final String NAMESPACE_URI = "http://ru.market/spring/market/ws/productsWs";
    private final ProductWsService productWsService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductByTitleRequest")
    @ResponsePayload
    public GetProductResponse getProductByTitle(@RequestPayload GetProductByTitleRequest req) {
        GetProductResponse response = new GetProductResponse();
        response.setProduct(productWsService.getProductByTitle(req.getTitle()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProductByIdRequest")
    @ResponsePayload
    public GetProductResponse getProductById(@RequestPayload GetProductByIdRequest req) {
        GetProductResponse response = new GetProductResponse();
        response.setProduct(productWsService.getProductById(req.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllProductsRequest")
    @ResponsePayload
    public GetAllProductsResponse getAllProductsResponse(@RequestPayload GetAllProductsRequest req) {
        GetAllProductsResponse response = new GetAllProductsResponse();
        productWsService.getAllProducts().forEach(response.getProducts()::add);
        return response;
    }
}
