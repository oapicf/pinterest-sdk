package org.openapitools.api.factories;

import org.openapitools.api.AdAccountsApiService;
import org.openapitools.api.impl.AdAccountsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-08T00:33:19.615491Z[Etc/UTC]")
public class AdAccountsApiServiceFactory {
    private static final AdAccountsApiService service = new AdAccountsApiServiceImpl();

    public static AdAccountsApiService getAdAccountsApi() {
        return service;
    }
}
