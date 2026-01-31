package org.openapitools.api.factories;

import org.openapitools.api.ResourcesApiService;
import org.openapitools.api.impl.ResourcesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ResourcesApiServiceFactory {
    private static final ResourcesApiService service = new ResourcesApiServiceImpl();

    public static ResourcesApiService getResourcesApi() {
        return service;
    }
}
