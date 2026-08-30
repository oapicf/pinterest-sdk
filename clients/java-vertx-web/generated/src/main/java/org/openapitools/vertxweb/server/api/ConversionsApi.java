package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventsGet200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ConversionsApi  {
    Future<ApiResponse<AdvertiserDefinedEventsCreate200Response>> advertiserDefinedEventsCreate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest);
    Future<ApiResponse<AdvertiserDefinedEventsCreate200Response>> advertiserDefinedEventsDelete(String adAccountId, List<String> eventNames);
    Future<ApiResponse<AdvertiserDefinedEventsGet200Response>> advertiserDefinedEventsGet(String adAccountId);
    Future<ApiResponse<AdvertiserDefinedEventsCreate200Response>> advertiserDefinedEventsUpdate(String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest);
}
