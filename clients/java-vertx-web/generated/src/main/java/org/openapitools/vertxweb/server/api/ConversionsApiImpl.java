package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsResponse;
import org.openapitools.vertxweb.server.model.Error;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionsApiImpl implements ConversionsApi {
    public Future<ApiResponse<AdvertiserDefinedEventsResponse>> advertiserDefinedEventsGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
