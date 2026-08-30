package org.openapitools.api.factories;

import org.openapitools.api.BusinessesApiService;
import org.openapitools.api.impl.BusinessesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessesApiServiceFactory {
    private static final BusinessesApiService service = new BusinessesApiServiceImpl();

    public static BusinessesApiService getBusinessesApi() {
        return service;
    }
}
