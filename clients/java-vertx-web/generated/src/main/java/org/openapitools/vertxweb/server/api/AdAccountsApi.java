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

import java.util.List;
import java.util.Map;

public interface AdAccountsApi  {
    Future<ApiResponse<List<AdAccountAnalyticsItems>>> adAccountAnalytics(LocalDate startDate, LocalDate endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone);
    Future<ApiResponse<MetricsResponse>> adAccountTargetingAnalyticsGet(String adAccountId, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAccountTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone);
    Future<ApiResponse<AdAccount>> adAccountsCreate(AdAccountCreate adAccountCreate);
    Future<ApiResponse<AdAccount>> adAccountsGet(String adAccountId);
    Future<ApiResponse<AdAccountsList200Response>> adAccountsList(Boolean includeSharedAccounts, String bookmark, Integer pageSize);
    Future<ApiResponse<ConversionProductReport>> analyticsCreateConversionProductReport(String adAccountId, ConversionProductReportCreate conversionProductReportCreate);
    Future<ApiResponse<MMMReport>> analyticsCreateMmmReport(String adAccountId, MMMReportCreate mmMReportCreate);
    Future<ApiResponse<AdsAnalyticsCreateAsyncResponse>> analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest);
    Future<ApiResponse<TemplateBasedReport>> analyticsCreateTemplateReport(String adAccountId, String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity);
    Future<ApiResponse<ConversionProductReport>> analyticsGetConversionProductReport(String adAccountId, String token);
    Future<ApiResponse<MMMReport>> analyticsGetMmmReport(String adAccountId, String token);
    Future<ApiResponse<AdsAnalyticsGetAsyncResponse>> analyticsGetReport(String adAccountId, String token);
    Future<ApiResponse<String>> sandboxDelete(String adAccountId);
    Future<ApiResponse<TemplatesList200Response>> templatesList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order);
}
