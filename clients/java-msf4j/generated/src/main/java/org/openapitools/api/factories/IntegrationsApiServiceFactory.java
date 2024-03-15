package org.openapitools.api.factories;

import org.openapitools.api.IntegrationsApiService;
import org.openapitools.api.impl.IntegrationsApiServiceImpl;

public class IntegrationsApiServiceFactory {
    private static final IntegrationsApiService service = new IntegrationsApiServiceImpl();

    public static IntegrationsApiService getIntegrationsApi() {
        return service;
    }
}
