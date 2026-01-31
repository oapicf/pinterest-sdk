package org.openapitools.api.factories;

import org.openapitools.api.OauthApiService;
import org.openapitools.api.impl.OauthApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-26T05:37:28.314128517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class OauthApiServiceFactory {
    private static final OauthApiService service = new OauthApiServiceImpl();

    public static OauthApiService getOauthApi() {
        return service;
    }
}
