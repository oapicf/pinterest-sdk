package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Account;
import org.openapitools.vertxweb.server.model.AnalyticsMetricsResponse;
import org.openapitools.vertxweb.server.model.Error;
import java.time.LocalDate;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface UserAccountApi  {
    Future<ApiResponse<Map<String, AnalyticsMetricsResponse>>> userAccountAnalytics(LocalDate startDate, LocalDate endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField, String adAccountId);
    Future<ApiResponse<Account>> userAccountGet(String adAccountId);
}
