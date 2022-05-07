package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.Paginated;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AdAccountsApi  {
    Future<ApiResponse<List<Map<String, Object>>>> adAccountAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
    Future<ApiResponse<Paginated>> adAccountsList(String bookmark, Integer pageSize, Boolean includeSharedAccounts);
    Future<ApiResponse<List<Map<String, Object>>>> adGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
    Future<ApiResponse<Paginated>> adGroupsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames);
    Future<ApiResponse<List<Map<String, Object>>>> adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
    Future<ApiResponse<Paginated>> adsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark);
    Future<ApiResponse<AdsAnalyticsCreateAsyncResponse>> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest);
    Future<ApiResponse<AdsAnalyticsGetAsyncResponse>> analyticsGetReport(String adAccountId, String token);
    Future<ApiResponse<List<Map<String, Object>>>> campaignsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
    Future<ApiResponse<Paginated>> campaignsList(String adAccountId, List<String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark);
    Future<ApiResponse<List<Map<String, Object>>>> productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
}
