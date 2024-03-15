package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccountsCountryResponse;
import org.openapitools.vertxweb.server.model.BookClosedResponse;
import org.openapitools.vertxweb.server.model.DeliveryMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.SingleInterestTargetingOptionResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ResourcesApiImpl implements ResourcesApi {
    public Future<ApiResponse<AdAccountsCountryResponse>> adAccountCountriesGet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeliveryMetricsResponse>> deliveryMetricsGet(String reportType) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SingleInterestTargetingOptionResponse>> interestTargetingOptionsGet(String interestId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> leadFormQuestionsGet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BookClosedResponse>> metricsReadyStateGet(String date) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<Object>>> targetingOptionsGet(String targetingType, String clientId, String oauthSignature, String timestamp) {
        return Future.failedFuture(new HttpException(501));
    }

}
