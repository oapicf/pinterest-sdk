package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsGet200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ConversionsApiImpl implements ConversionsApi {
    public Future<ApiResponse<AdvertiserDefinedEventsCreate200Response>> advertiserDefinedEventsCreate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdvertiserDefinedEventsCreate200Response>> advertiserDefinedEventsDelete(String adAccountId, List<String> eventNames) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdvertiserDefinedEventsGet200Response>> advertiserDefinedEventsGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdvertiserDefinedEventsCreate200Response>> advertiserDefinedEventsUpdate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
