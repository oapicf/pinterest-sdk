package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountsCountryResponse;
import org.openapitools.server.api.model.BookClosedResponse;
import org.openapitools.server.api.model.DeliveryMetricsResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SingleInterestTargetingOptionResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ResourcesApi  {
    //ad_account_countries/get
    void adAccountCountriesGet(Handler<AsyncResult<AdAccountsCountryResponse>> handler);

    //delivery_metrics/get
    void deliveryMetricsGet(String reportType, Handler<AsyncResult<DeliveryMetricsResponse>> handler);

    //interest_targeting_options/get
    void interestTargetingOptionsGet(String interestId, Handler<AsyncResult<SingleInterestTargetingOptionResponse>> handler);

    //lead_form_questions/get
    void leadFormQuestionsGet(Handler<AsyncResult<Void>> handler);

    //metrics_ready_state/get
    void metricsReadyStateGet(String date, Handler<AsyncResult<BookClosedResponse>> handler);

    //targeting_options/get
    void targetingOptionsGet(String targetingType, String clientId, String oauthSignature, String timestamp, String adAccountId, Handler<AsyncResult<List<Object>>> handler);

}
