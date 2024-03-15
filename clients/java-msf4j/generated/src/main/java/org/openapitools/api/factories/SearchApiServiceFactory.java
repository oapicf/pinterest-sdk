package org.openapitools.api.factories;

import org.openapitools.api.SearchApiService;
import org.openapitools.api.impl.SearchApiServiceImpl;

public class SearchApiServiceFactory {
    private static final SearchApiService service = new SearchApiServiceImpl();

    public static SearchApiService getSearchApi() {
        return service;
    }
}
