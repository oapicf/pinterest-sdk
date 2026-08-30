package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountCountriesGet200Response;
import org.openapitools.vertxweb.server.model.BookClosed;
import org.openapitools.vertxweb.server.model.DeliveryMetricsGet200Response;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PublicTargetingType;
import org.openapitools.vertxweb.server.model.ReportType;
import org.openapitools.vertxweb.server.model.SingleInterestTargetingOption;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface ResourcesApi  {
    Future<ApiResponse<AdAccountCountriesGet200Response>> adAccountCountriesGet();
    Future<ApiResponse<DeliveryMetricsGet200Response>> deliveryMetricsGet(ReportType reportType);
    Future<ApiResponse<SingleInterestTargetingOption>> interestTargetingOptionsGet(String interestId);
    Future<ApiResponse<Void>> leadFormQuestionsGet();
    Future<ApiResponse<BookClosed>> metricsReadyStateGet(String date);
    Future<ApiResponse<List<Object>>> targetingOptionsGet(PublicTargetingType targetingType, String adAccountId, String clientId, String oauthSignature, String timestamp);
}
