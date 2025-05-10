package org.openapitools.api.factories;

import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.impl.AdAccountsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class AdAccountsApiServiceFactory {
    private static final AdAccountsApiService service = new AdAccountsApiServiceImpl();

    public static AdAccountsApiService getAdAccountsApi() {
        return service;
    }
}
