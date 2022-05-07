package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Paginated;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AdAccountsApi  {
    //ad_account/analytics
    void adAccountAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<Map<String, Object>>>> handler);

    //ad_accounts/list
    void adAccountsList(String bookmark, Integer pageSize, Boolean includeSharedAccounts, Handler<AsyncResult<Paginated>> handler);

    //ad_groups/analytics
    void adGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<Map<String, Object>>>> handler);

    //ad_groups/list
    void adGroupsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames, Handler<AsyncResult<Paginated>> handler);

    //ads/analytics
    void adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<Map<String, Object>>>> handler);

    //ads/list
    void adsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Handler<AsyncResult<Paginated>> handler);

    //analytics/create_report
    void analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest, Handler<AsyncResult<AdsAnalyticsCreateAsyncResponse>> handler);

    //analytics/get_report
    void analyticsGetReport(String adAccountId, String token, Handler<AsyncResult<AdsAnalyticsGetAsyncResponse>> handler);

    //campaigns/analytics
    void campaignsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<Map<String, Object>>>> handler);

    //campaigns/list
    void campaignsList(String adAccountId, List<String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Handler<AsyncResult<Paginated>> handler);

    //product_groups/analytics
    void productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<Map<String, Object>>>> handler);

}
