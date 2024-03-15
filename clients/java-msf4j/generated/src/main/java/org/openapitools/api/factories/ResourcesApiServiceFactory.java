package org.openapitools.api.factories;

import org.openapitools.api.ResourcesApiService;
import org.openapitools.api.impl.ResourcesApiServiceImpl;

public class ResourcesApiServiceFactory {
    private static final ResourcesApiService service = new ResourcesApiServiceImpl();

    public static ResourcesApiService getResourcesApi() {
        return service;
    }
}
