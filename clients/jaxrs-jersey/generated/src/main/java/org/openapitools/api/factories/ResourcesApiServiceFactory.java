package org.openapitools.api.factories;

import org.openapitools.api.ResourcesApiService;
import org.openapitools.api.impl.ResourcesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T02:51:20.133823354Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ResourcesApiServiceFactory {
    private static final ResourcesApiService service = new ResourcesApiServiceImpl();

    public static ResourcesApiService getResourcesApi() {
        return service;
    }
}
