package org.openapitools.api.factories;

import org.openapitools.api.UsersApiService;
import org.openapitools.api.impl.UsersApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class UsersApiServiceFactory {
    private static final UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}
