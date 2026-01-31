package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.NotificationPostRequest;
import org.openapitools.vertxweb.server.model.NotificationResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class NotificationApiImpl implements NotificationApi {
    public Future<ApiResponse<NotificationResponse>> notificationPost(NotificationPostRequest notificationPostRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
