package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccount;
import org.openapitools.vertxweb.server.model.AdAccountAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdAccountCreateRequest;
import org.openapitools.vertxweb.server.model.AdAccountsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.CreateMMMReportRequest;
import org.openapitools.vertxweb.server.model.CreateMMMReportResponse;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.GetMMMReportResponse;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;
import org.openapitools.vertxweb.server.model.TemplatesList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AdAccountsApiImpl implements AdAccountsApi {
    public Future<ApiResponse<List<AdAccountAnalyticsResponseInner>>> adAccountAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MetricsResponse>> adAccountTargetingAnalyticsGet(String adAccountId, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccount>> adAccountsCreate(AdAccountCreateRequest adAccountCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccount>> adAccountsGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsList200Response>> adAccountsList(String bookmark, Integer pageSize, Boolean includeSharedAccounts) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CreateMMMReportResponse>> analyticsCreateMmmReport(String adAccountId, CreateMMMReportRequest createMMMReportRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdsAnalyticsCreateAsyncResponse>> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdsAnalyticsCreateAsyncResponse>> analyticsCreateTemplateReport(String adAccountId, String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<GetMMMReportResponse>> analyticsGetMmmReport(String adAccountId, String token) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdsAnalyticsGetAsyncResponse>> analyticsGetReport(String adAccountId, String token) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> sandboxDelete(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TemplatesList200Response>> templatesList(String adAccountId, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

}
