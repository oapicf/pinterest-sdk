package org.openapitools.api.factories;

import org.openapitools.api.SearchApiService;
import org.openapitools.api.impl.SearchApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class SearchApiServiceFactory {
    private static final SearchApiService service = new SearchApiServiceImpl();

    public static SearchApiService getSearchApi() {
        return service;
    }
}
