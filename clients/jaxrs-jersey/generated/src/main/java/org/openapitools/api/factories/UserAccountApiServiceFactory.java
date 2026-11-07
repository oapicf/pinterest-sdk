package org.openapitools.api.factories;

import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.impl.UserAccountApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-07T04:06:30.634820227Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class UserAccountApiServiceFactory {
    private static final UserAccountApiService service = new UserAccountApiServiceImpl();

    public static UserAccountApiService getUserAccountApi() {
        return service;
    }
}
