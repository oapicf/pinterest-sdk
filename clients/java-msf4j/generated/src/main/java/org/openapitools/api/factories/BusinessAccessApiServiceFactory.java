package org.openapitools.api.factories;

import org.openapitools.api.BusinessAccessApiService;
import org.openapitools.api.impl.BusinessAccessApiServiceImpl;

public class BusinessAccessApiServiceFactory {
    private static final BusinessAccessApiService service = new BusinessAccessApiServiceImpl();

    public static BusinessAccessApiService getBusinessAccessApi() {
        return service;
    }
}
