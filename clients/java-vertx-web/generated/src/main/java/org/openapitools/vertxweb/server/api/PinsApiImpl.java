package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Pin;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class PinsApiImpl implements PinsApi {
    public Future<ApiResponse<Map<String, AnalyticsMetricsResponse>>> pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Pin>> pinsCreate(Pin pin) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Void>> pinsDelete(String pinId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Pin>> pinsGet(String pinId, String adAccountId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
