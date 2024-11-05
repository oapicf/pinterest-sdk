package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pin;
import org.openapitools.server.api.model.PinAnalyticsMetricsResponse;
import org.openapitools.server.api.model.PinCreate;
import org.openapitools.server.api.model.PinUpdate;
import org.openapitools.server.api.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.server.api.model.PinsList200Response;
import org.openapitools.server.api.model.PinsSaveRequest;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PinsApi  {
    //multi_pins/analytics
    void multiPinsAnalytics(List<String> pinIds, LocalDate startDate, LocalDate endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String adAccountId, Handler<AsyncResult<Map<String, Map<String, PinAnalyticsMetricsResponse>>>> handler);

    //pins/analytics
    void pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField, String adAccountId, Handler<AsyncResult<Map<String, PinAnalyticsMetricsResponse>>> handler);

    //pins/create
    void pinsCreate(PinCreate pinCreate, String adAccountId, Handler<AsyncResult<Pin>> handler);

    //pins/delete
    void pinsDelete(String pinId, String adAccountId, Handler<AsyncResult<Void>> handler);

    //pins/get
    void pinsGet(String pinId, Boolean pinMetrics, String adAccountId, Handler<AsyncResult<Pin>> handler);

    //pins/list
    void pinsList(String bookmark, Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes, String adAccountId, Boolean pinMetrics, Handler<AsyncResult<PinsList200Response>> handler);

    //pins/save
    void pinsSave(String pinId, PinsSaveRequest pinsSaveRequest, String adAccountId, Handler<AsyncResult<Pin>> handler);

    //pins/update
    void pinsUpdate(String pinId, PinUpdate pinUpdate, String adAccountId, Handler<AsyncResult<Pin>> handler);

}
