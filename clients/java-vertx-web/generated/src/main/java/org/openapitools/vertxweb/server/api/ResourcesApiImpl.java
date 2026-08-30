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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class ResourcesApiImpl implements ResourcesApi {
    public Future<ApiResponse<AdAccountCountriesGet200Response>> adAccountCountriesGet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DeliveryMetricsGet200Response>> deliveryMetricsGet(ReportType reportType) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<SingleInterestTargetingOption>> interestTargetingOptionsGet(String interestId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Void>> leadFormQuestionsGet() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BookClosed>> metricsReadyStateGet(String date) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<Object>>> targetingOptionsGet(PublicTargetingType targetingType, String adAccountId, String clientId, String oauthSignature, String timestamp) {
        return Future.failedFuture(new HttpException(501));
    }

}
