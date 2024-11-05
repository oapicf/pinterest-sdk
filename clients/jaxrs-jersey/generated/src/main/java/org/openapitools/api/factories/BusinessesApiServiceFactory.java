package org.openapitools.api.factories;

import org.openapitools.api.BusinessesApiService;
import org.openapitools.api.impl.BusinessesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessesApiServiceFactory {
    private static final BusinessesApiService service = new BusinessesApiServiceImpl();

    public static BusinessesApiService getBusinessesApi() {
        return service;
    }
}
