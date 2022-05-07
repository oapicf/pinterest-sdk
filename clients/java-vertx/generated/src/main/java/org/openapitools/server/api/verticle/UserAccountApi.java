package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Account;
import org.openapitools.server.api.model.AnalyticsMetricsResponse;
import org.openapitools.server.api.model.Error;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface UserAccountApi  {
    //user_account/analytics
    void userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField, String adAccountId, Handler<AsyncResult<Map<String, AnalyticsMetricsResponse>>> handler);

    //user_account/get
    void userAccountGet(String adAccountId, Handler<AsyncResult<Account>> handler);

}
