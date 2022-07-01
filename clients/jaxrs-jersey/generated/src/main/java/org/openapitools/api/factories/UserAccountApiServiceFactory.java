package org.openapitools.api.factories;

import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.impl.UserAccountApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-07-01T12:00:52.037403Z[Etc/UTC]")
public class UserAccountApiServiceFactory {
    private static final UserAccountApiService service = new UserAccountApiServiceImpl();

    public static UserAccountApiService getUserAccountApi() {
        return service;
    }
}
