package org.openapitools.api.factories;

import org.openapitools.api.UsersApiService;
import org.openapitools.api.impl.UsersApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T02:51:20.133823354Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class UsersApiServiceFactory {
    private static final UsersApiService service = new UsersApiServiceImpl();

    public static UsersApiService getUsersApi() {
        return service;
    }
}
