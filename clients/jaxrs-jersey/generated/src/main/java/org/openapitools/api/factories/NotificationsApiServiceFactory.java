package org.openapitools.api.factories;

import org.openapitools.api.NotificationsApiService;
import org.openapitools.api.impl.NotificationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-11-03T06:15:21.978491780Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NotificationsApiServiceFactory {
    private static final NotificationsApiService service = new NotificationsApiServiceImpl();

    public static NotificationsApiService getNotificationsApi() {
        return service;
    }
}
