package org.openapitools.api.factories;

import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.impl.UserAccountApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UserAccountApiServiceFactory {
    private static final UserAccountApiService service = new UserAccountApiServiceImpl();

    public static UserAccountApiService getUserAccountApi() {
        return service;
    }
}
