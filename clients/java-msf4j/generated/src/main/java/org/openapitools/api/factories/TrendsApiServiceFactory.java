package org.openapitools.api.factories;

import org.openapitools.api.TrendsApiService;
import org.openapitools.api.impl.TrendsApiServiceImpl;

public class TrendsApiServiceFactory {
    private static final TrendsApiService service = new TrendsApiServiceImpl();

    public static TrendsApiService getTrendsApi() {
        return service;
    }
}
