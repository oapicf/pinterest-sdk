package org.openapitools.api.factories;

import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.impl.UserAccountApiServiceImpl;

public class UserAccountApiServiceFactory {
    private static final UserAccountApiService service = new UserAccountApiServiceImpl();

    public static UserAccountApiService getUserAccountApi() {
        return service;
    }
}
