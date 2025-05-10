package org.openapitools.api.factories;

import org.openapitools.api.IntegrationsApiService;
import org.openapitools.api.impl.IntegrationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class IntegrationsApiServiceFactory {
    private static final IntegrationsApiService service = new IntegrationsApiServiceImpl();

    public static IntegrationsApiService getIntegrationsApi() {
        return service;
    }
}
