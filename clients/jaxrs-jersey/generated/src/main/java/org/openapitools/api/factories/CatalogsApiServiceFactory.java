package org.openapitools.api.factories;

import org.openapitools.api.CatalogsApiService;
import org.openapitools.api.impl.CatalogsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T04:06:30.634820227Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class CatalogsApiServiceFactory {
    private static final CatalogsApiService service = new CatalogsApiServiceImpl();

    public static CatalogsApiService getCatalogsApi() {
        return service;
    }
}
