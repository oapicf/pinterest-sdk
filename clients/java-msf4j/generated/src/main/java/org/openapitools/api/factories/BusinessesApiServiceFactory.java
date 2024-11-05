package org.openapitools.api.factories;

import org.openapitools.api.BusinessesApiService;
import org.openapitools.api.impl.BusinessesApiServiceImpl;

public class BusinessesApiServiceFactory {
    private static final BusinessesApiService service = new BusinessesApiServiceImpl();

    public static BusinessesApiService getBusinessesApi() {
        return service;
    }
}
