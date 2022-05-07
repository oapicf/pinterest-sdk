package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Pin;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface PinsApi  {
    Future<ApiResponse<Map<String, AnalyticsMetricsResponse>>> pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId);
    Future<ApiResponse<Pin>> pinsCreate(Pin pin);
    Future<ApiResponse<Void>> pinsDelete(String pinId);
    Future<ApiResponse<Pin>> pinsGet(String pinId, String adAccountId);
}
