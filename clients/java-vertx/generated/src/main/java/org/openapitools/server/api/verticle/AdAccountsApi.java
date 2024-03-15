package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccount;
import org.openapitools.server.api.model.AdAccountAnalyticsResponseInner;
import org.openapitools.server.api.model.AdAccountCreateRequest;
import org.openapitools.server.api.model.AdAccountsList200Response;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.CreateMMMReportRequest;
import org.openapitools.server.api.model.CreateMMMReportResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetMMMReportResponse;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;
import org.openapitools.server.api.model.TemplatesList200Response;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AdAccountsApi  {
    //ad_account/analytics
    void adAccountAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<AdAccountAnalyticsResponseInner>>> handler);

    //ad_account_targeting_analytics/get
    void adAccountTargetingAnalyticsGet(String adAccountId, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Handler<AsyncResult<MetricsResponse>> handler);

    //ad_accounts/create
    void adAccountsCreate(AdAccountCreateRequest adAccountCreateRequest, Handler<AsyncResult<AdAccount>> handler);

    //ad_accounts/get
    void adAccountsGet(String adAccountId, Handler<AsyncResult<AdAccount>> handler);

    //ad_accounts/list
    void adAccountsList(String bookmark, Integer pageSize, Boolean includeSharedAccounts, Handler<AsyncResult<AdAccountsList200Response>> handler);

    //analytics/create_mmm_report
    void analyticsCreateMmmReport(String adAccountId, CreateMMMReportRequest createMMMReportRequest, Handler<AsyncResult<CreateMMMReportResponse>> handler);

    //analytics/create_report
    void analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest, Handler<AsyncResult<AdsAnalyticsCreateAsyncResponse>> handler);

    //analytics/create_template_report
    void analyticsCreateTemplateReport(String adAccountId, String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity, Handler<AsyncResult<AdsAnalyticsCreateAsyncResponse>> handler);

    //analytics/get_mmm_report
    void analyticsGetMmmReport(String adAccountId, String token, Handler<AsyncResult<GetMMMReportResponse>> handler);

    //analytics/get_report
    void analyticsGetReport(String adAccountId, String token, Handler<AsyncResult<AdsAnalyticsGetAsyncResponse>> handler);

    //sandbox/delete
    void sandboxDelete(String adAccountId, Handler<AsyncResult<String>> handler);

    //templates/list
    void templatesList(String adAccountId, Integer pageSize, String order, String bookmark, Handler<AsyncResult<TemplatesList200Response>> handler);

}
