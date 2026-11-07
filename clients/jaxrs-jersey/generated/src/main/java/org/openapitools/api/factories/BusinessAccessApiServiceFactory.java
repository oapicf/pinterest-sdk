package org.openapitools.api.factories;

import org.openapitools.api.BusinessAccessApiService;
import org.openapitools.api.impl.BusinessAccessApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T04:06:30.634820227Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BusinessAccessApiServiceFactory {
    private static final BusinessAccessApiService service = new BusinessAccessApiServiceImpl();

    public static BusinessAccessApiService getBusinessAccessApi() {
        return service;
    }
}
