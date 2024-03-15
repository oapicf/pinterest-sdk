package org.openapitools.api.factories;

import org.openapitools.api.TermsApiService;
import org.openapitools.api.impl.TermsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TermsApiServiceFactory {
    private static final TermsApiService service = new TermsApiServiceImpl();

    public static TermsApiService getTermsApi() {
        return service;
    }
}
