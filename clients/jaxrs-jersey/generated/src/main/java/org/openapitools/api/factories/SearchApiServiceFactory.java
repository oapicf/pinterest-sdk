package org.openapitools.api.factories;

import org.openapitools.api.SearchApiService;
import org.openapitools.api.impl.SearchApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class SearchApiServiceFactory {
    private static final SearchApiService service = new SearchApiServiceImpl();

    public static SearchApiService getSearchApi() {
        return service;
    }
}
