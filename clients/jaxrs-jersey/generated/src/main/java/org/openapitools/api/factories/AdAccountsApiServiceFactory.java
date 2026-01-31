package org.openapitools.api.factories;

import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.impl.AdAccountsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdAccountsApiServiceFactory {
    private static final AdAccountsApiService service = new AdAccountsApiServiceImpl();

    public static AdAccountsApiService getAdAccountsApi() {
        return service;
    }
}
