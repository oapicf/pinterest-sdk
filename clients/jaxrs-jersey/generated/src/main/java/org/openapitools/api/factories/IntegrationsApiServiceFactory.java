package org.openapitools.api.factories;

import org.openapitools.api.IntegrationsApiService;
import org.openapitools.api.impl.IntegrationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T04:06:30.634820227Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class IntegrationsApiServiceFactory {
    private static final IntegrationsApiService service = new IntegrationsApiServiceImpl();

    public static IntegrationsApiService getIntegrationsApi() {
        return service;
    }
}
