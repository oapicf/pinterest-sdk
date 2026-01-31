package org.openapitools.api.factories;

import org.openapitools.api.NotificationsApiService;
import org.openapitools.api.impl.NotificationsApiServiceImpl;

public class NotificationsApiServiceFactory {
    private static final NotificationsApiService service = new NotificationsApiServiceImpl();

    public static NotificationsApiService getNotificationsApi() {
        return service;
    }
}
