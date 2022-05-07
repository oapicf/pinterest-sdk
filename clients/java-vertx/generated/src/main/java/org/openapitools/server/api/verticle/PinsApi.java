package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Pin;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface PinsApi  {
    //pins/analytics
    void pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId, Handler<AsyncResult<Map<String, AnalyticsMetricsResponse>>> handler);

    //pins/create
    void pinsCreate(Pin pin, Handler<AsyncResult<Pin>> handler);

    //pins/delete
    void pinsDelete(String pinId, Handler<AsyncResult<Void>> handler);

    //pins/get
    void pinsGet(String pinId, String adAccountId, Handler<AsyncResult<Pin>> handler);

}
