package org.openapitools.api.factories;

import org.openapitools.api.BusinessesApiService;
import org.openapitools.api.impl.BusinessesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessesApiServiceFactory {
    private static final BusinessesApiService service = new BusinessesApiServiceImpl();

    public static BusinessesApiService getBusinessesApi() {
        return service;
    }
}
