package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.NotificationPostRequest;
import org.openapitools.vertxweb.server.model.NotificationResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface NotificationApi  {
    Future<ApiResponse<NotificationResponse>> notificationPost(NotificationPostRequest notificationPostRequest);
}
