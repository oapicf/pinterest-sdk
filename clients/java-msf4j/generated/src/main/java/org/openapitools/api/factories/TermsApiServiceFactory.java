package org.openapitools.api.factories;

import org.openapitools.api.TermsApiService;
import org.openapitools.api.impl.TermsApiServiceImpl;

public class TermsApiServiceFactory {
    private static final TermsApiService service = new TermsApiServiceImpl();

    public static TermsApiService getTermsApi() {
        return service;
    }
}
