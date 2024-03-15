package org.openapitools.api.factories;

import org.openapitools.api.IntegrationsApiService;
import org.openapitools.api.impl.IntegrationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationsApiServiceFactory {
    private static final IntegrationsApiService service = new IntegrationsApiServiceImpl();

    public static IntegrationsApiService getIntegrationsApi() {
        return service;
    }
}
