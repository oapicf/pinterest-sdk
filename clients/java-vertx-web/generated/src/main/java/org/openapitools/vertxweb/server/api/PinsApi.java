package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Pin;
import org.openapitools.vertxweb.server.model.PinAnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.PinCreate;
import org.openapitools.vertxweb.server.model.PinUpdate;
import org.openapitools.vertxweb.server.model.PinsList200Response;
import org.openapitools.vertxweb.server.model.PinsSaveRequest;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface PinsApi  {
    Future<ApiResponse<Map<String, Map<String, PinAnalyticsMetricsResponse>>>> multiPinsAnalytics(List<String> pinIds, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String adAccountId);
    Future<ApiResponse<Map<String, PinAnalyticsMetricsResponse>>> pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId);
    Future<ApiResponse<Pin>> pinsCreate(PinCreate pinCreate, String adAccountId);
    Future<ApiResponse<Void>> pinsDelete(String pinId, String adAccountId);
    Future<ApiResponse<Pin>> pinsGet(String pinId, String adAccountId, Boolean pinMetrics);
    Future<ApiResponse<PinsList200Response>> pinsList(String pinFilter, Boolean pinMetrics, Boolean includeProtectedPins, String pinType, List<CreativeType> creativeTypes, String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<Pin>> pinsSave(String pinId, PinsSaveRequest pinsSaveRequest, String adAccountId);
    Future<ApiResponse<Pin>> pinsUpdate(String pinId, PinUpdate pinUpdate, String adAccountId);
}
