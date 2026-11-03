package org.openapitools.api.factories;

import org.openapitools.api.TermsApiService;
import org.openapitools.api.impl.TermsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:15:21.978491780Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TermsApiServiceFactory {
    private static final TermsApiService service = new TermsApiServiceImpl();

    public static TermsApiService getTermsApi() {
        return service;
    }
}
