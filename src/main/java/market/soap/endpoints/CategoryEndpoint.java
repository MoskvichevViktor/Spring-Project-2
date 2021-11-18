package market.soap.endpoints;

import lombok.RequiredArgsConstructor;
import market.soap.entitiesWs.categoriesWs.GetCategoryByTitleRequest;
import market.soap.entitiesWs.categoriesWs.GetCategoryByTitleResponse;
import market.soap.services.CategoryWsService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
@RequiredArgsConstructor
public class CategoryEndpoint {
    private static final String NAMESPACE_URI = "http://ru.market/spring/market/ws/categoriesWs";
    private final CategoryWsService categoryWsService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCategoryByTitleRequest")
    @ResponsePayload
    @Transactional
    public GetCategoryByTitleResponse getGroupByTitle(@RequestPayload GetCategoryByTitleRequest request) {
        GetCategoryByTitleResponse response = new GetCategoryByTitleResponse();
        response.setCategory(categoryWsService.getByCategoryTitle(request.getTitle()));
        return response;
    }
}
