package org.openapitools.api.factories;

import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.impl.UserAccountApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UserAccountApiServiceFactory {
    private static final UserAccountApiService service = new UserAccountApiServiceImpl();

    public static UserAccountApiService getUserAccountApi() {
        return service;
    }
}
