package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdAccount;
import org.openapitools.vertxweb.server.model.AdAccountAnalyticsItems;
import org.openapitools.vertxweb.server.model.AdAccountCreate;
import org.openapitools.vertxweb.server.model.AdAccountsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.vertxweb.server.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.ConversionProductReport;
import org.openapitools.vertxweb.server.model.ConversionProductReportCreate;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MMMReport;
import org.openapitools.vertxweb.server.model.MMMReportCreate;
import org.openapitools.vertxweb.server.model.MetricsResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.ReportingColumnSync;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;
import org.openapitools.vertxweb.server.model.TemplateBasedReport;
import org.openapitools.vertxweb.server.model.TemplatesList200Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class AdAccountsApiImpl implements AdAccountsApi {
    public Future<ApiResponse<List<AdAccountAnalyticsItems>>> adAccountAnalytics(LocalDate startDate, LocalDate endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MetricsResponse>> adAccountTargetingAnalyticsGet(String adAccountId, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAccountTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccount>> adAccountsCreate(AdAccountCreate adAccountCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccount>> adAccountsGet(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdAccountsList200Response>> adAccountsList(Boolean includeSharedAccounts, String bookmark, Integer pageSize) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionProductReport>> analyticsCreateConversionProductReport(String adAccountId, ConversionProductReportCreate conversionProductReportCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MMMReport>> analyticsCreateMmmReport(String adAccountId, MMMReportCreate mmMReportCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdsAnalyticsCreateAsyncResponse>> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TemplateBasedReport>> analyticsCreateTemplateReport(String adAccountId, String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<ConversionProductReport>> analyticsGetConversionProductReport(String adAccountId, String token) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MMMReport>> analyticsGetMmmReport(String adAccountId, String token) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdsAnalyticsGetAsyncResponse>> analyticsGetReport(String adAccountId, String token) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<String>> sandboxDelete(String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<TemplatesList200Response>> templatesList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        return Future.failedFuture(new HttpException(501));
    }

}
