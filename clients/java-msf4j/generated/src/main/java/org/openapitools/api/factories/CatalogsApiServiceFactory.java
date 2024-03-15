package org.openapitools.api.factories;

import org.openapitools.api.CatalogsApiService;
import org.openapitools.api.impl.CatalogsApiServiceImpl;

public class CatalogsApiServiceFactory {
    private static final CatalogsApiService service = new CatalogsApiServiceImpl();

    public static CatalogsApiService getCatalogsApi() {
        return service;
    }
}
