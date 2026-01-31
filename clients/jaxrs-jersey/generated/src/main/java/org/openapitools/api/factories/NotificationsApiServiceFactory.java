package org.openapitools.api.factories;

import org.openapitools.api.NotificationsApiService;
import org.openapitools.api.impl.NotificationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NotificationsApiServiceFactory {
    private static final NotificationsApiService service = new NotificationsApiServiceImpl();

    public static NotificationsApiService getNotificationsApi() {
        return service;
    }
}
