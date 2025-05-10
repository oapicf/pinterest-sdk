package org.openapitools.api.factories;

import org.openapitools.api.ResourcesApiService;
import org.openapitools.api.impl.ResourcesApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ResourcesApiServiceFactory {
    private static final ResourcesApiService service = new ResourcesApiServiceImpl();

    public static ResourcesApiService getResourcesApi() {
        return service;
    }
}
