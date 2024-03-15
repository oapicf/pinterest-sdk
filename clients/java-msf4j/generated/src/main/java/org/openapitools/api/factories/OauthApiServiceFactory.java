package org.openapitools.api.factories;

import org.openapitools.api.OauthApiService;
import org.openapitools.api.impl.OauthApiServiceImpl;

public class OauthApiServiceFactory {
    private static final OauthApiService service = new OauthApiServiceImpl();

    public static OauthApiService getOauthApi() {
        return service;
    }
}
