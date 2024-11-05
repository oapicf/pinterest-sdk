package org.openapitools.api.factories;

import org.openapitools.api.TermsApiService;
import org.openapitools.api.impl.TermsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TermsApiServiceFactory {
    private static final TermsApiService service = new TermsApiServiceImpl();

    public static TermsApiService getTermsApi() {
        return service;
    }
}
