package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Account;
import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.impl.HttpStatusException;

import java.util.List;
import java.util.Map;

// Implement this class

public class UserAccountApiImpl implements UserAccountApi {
    public Future<ApiResponse<Map<String, AnalyticsMetricsResponse>>> userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField, String adAccountId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

    public Future<ApiResponse<Account>> userAccountGet(String adAccountId) {
        return Future.failedFuture(new HttpStatusException(501));
    }

}
