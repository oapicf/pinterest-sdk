package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsCountryResponse;
import org.openapitools.vertxweb.server.model.BookClosedResponse;
import org.openapitools.vertxweb.server.model.DeliveryMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SingleInterestTargetingOptionResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ResourcesApi  {
    Future<ApiResponse<AdAccountsCountryResponse>> adAccountCountriesGet();
    Future<ApiResponse<DeliveryMetricsResponse>> deliveryMetricsGet(String reportType);
    Future<ApiResponse<SingleInterestTargetingOptionResponse>> interestTargetingOptionsGet(String interestId);
    Future<ApiResponse<Void>> leadFormQuestionsGet();
    Future<ApiResponse<BookClosedResponse>> metricsReadyStateGet(String date);
    Future<ApiResponse<List<Object>>> targetingOptionsGet(String targetingType, String clientId, String oauthSignature, String timestamp, String adAccountId);
}
