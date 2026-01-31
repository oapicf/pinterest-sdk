package org.openapitools.api.factories;

import org.openapitools.api.TermsApiService;
import org.openapitools.api.impl.TermsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TermsApiServiceFactory {
    private static final TermsApiService service = new TermsApiServiceImpl();

    public static TermsApiService getTermsApi() {
        return service;
    }
}
