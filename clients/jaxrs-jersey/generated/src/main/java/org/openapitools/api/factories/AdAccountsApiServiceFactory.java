package org.openapitools.api.factories;

import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.impl.AdAccountsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:15:21.978491780Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AdAccountsApiServiceFactory {
    private static final AdAccountsApiService service = new AdAccountsApiServiceImpl();

    public static AdAccountsApiService getAdAccountsApi() {
        return service;
    }
}
