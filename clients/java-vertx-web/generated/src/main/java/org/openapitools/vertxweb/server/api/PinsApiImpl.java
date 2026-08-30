package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.CreativeType;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MultiPinsAnalyticsMetricTypesItem;
import org.openapitools.vertxweb.server.model.Pin;
import org.openapitools.vertxweb.server.model.PinAnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.PinCreate;
import org.openapitools.vertxweb.server.model.PinFilter;
import org.openapitools.vertxweb.server.model.PinType;
import org.openapitools.vertxweb.server.model.PinUpdate;
import org.openapitools.vertxweb.server.model.PinsList200Response;
import org.openapitools.vertxweb.server.model.PinsSaveRequestCreate;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.QuerypinanalyticsmetrictypesItems;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class PinsApiImpl implements PinsApi {
    public Future<ApiResponse<Map<String, Map<String, PinAnalyticsMetricsResponse>>>> multiPinsAnalytics(List<String> pinIds, LocalDate startDate, LocalDate endDate, List<MultiPinsAnalyticsMetricTypesItem> metricTypes, String appTypes, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Map<String, PinAnalyticsMetricsResponse>>> pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<QuerypinanalyticsmetrictypesItems> metricTypes, String appTypes, String splitField, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Pin>> pinsCreate(PinCreate pinCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Pin>> pinsDelete(String pinId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Pin>> pinsGet(String pinId, String adAccountId, Boolean pinMetrics) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<PinsList200Response>> pinsList(PinFilter pinFilter, Boolean pinMetrics, Boolean includeProtectedPins, PinType pinType, List<CreativeType> creativeTypes, String adAccountId, String domain, List<String> domains, Boolean includeProductTagObj, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Pin>> pinsSave(String pinId, PinsSaveRequestCreate pinsSaveRequestCreate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Pin>> pinsUpdate(String pinId, PinUpdate pinUpdate, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

}
