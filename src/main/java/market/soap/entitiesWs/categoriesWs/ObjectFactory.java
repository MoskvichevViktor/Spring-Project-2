package market.soap.entitiesWs.categoriesWs;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCategoryByTitleRequest }
     * 
     */
    public GetCategoryByTitleRequest createGetCategoryByTitleRequest() {
        return new GetCategoryByTitleRequest();
    }

    /**
     * Create an instance of {@link GetCategoryByTitleResponse }
     * 
     */
    public GetCategoryByTitleResponse createGetCategoryByTitleResponse() {
        return new GetCategoryByTitleResponse();
    }

    /**
     * Create an instance of {@link CategoryWs }
     * 
     */
    public CategoryWs createCategoryWs() {
        return new CategoryWs();
    }

}
