package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Pin;
import org.openapitools.vertxweb.server.model.PinAnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.PinCreate;
import org.openapitools.vertxweb.server.model.PinUpdate;
import org.openapitools.vertxweb.server.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.vertxweb.server.model.PinsList200Response;
import org.openapitools.vertxweb.server.model.PinsSaveRequest;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface PinsApi  {
    Future<ApiResponse<Map<String, Map<String, PinAnalyticsMetricsResponse>>>> multiPinsAnalytics(List<String> pinIds, LocalDate startDate, LocalDate endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String adAccountId);
    Future<ApiResponse<Map<String, PinAnalyticsMetricsResponse>>> pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField, String adAccountId);
    Future<ApiResponse<Pin>> pinsCreate(PinCreate pinCreate, String adAccountId);
    Future<ApiResponse<Void>> pinsDelete(String pinId, String adAccountId);
    Future<ApiResponse<Pin>> pinsGet(String pinId, Boolean pinMetrics, String adAccountId);
    Future<ApiResponse<PinsList200Response>> pinsList(String bookmark, Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes, String adAccountId, Boolean pinMetrics);
    Future<ApiResponse<Pin>> pinsSave(String pinId, PinsSaveRequest pinsSaveRequest, String adAccountId);
    Future<ApiResponse<Pin>> pinsUpdate(String pinId, PinUpdate pinUpdate, String adAccountId);
}
