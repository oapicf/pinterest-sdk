package org.openapitools.api.factories;

import org.openapitools.api.NotificationsApiService;
import org.openapitools.api.impl.NotificationsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NotificationsApiServiceFactory {
    private static final NotificationsApiService service = new NotificationsApiServiceImpl();

    public static NotificationsApiService getNotificationsApi() {
        return service;
    }
}
