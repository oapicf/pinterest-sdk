package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Ad;
import org.openapitools.vertxweb.server.model.AdBatchUpdate;
import org.openapitools.vertxweb.server.model.AdBatchWriteResponseModel;
import org.openapitools.vertxweb.server.model.AdCreate;
import org.openapitools.vertxweb.server.model.AdPreviewRequest;
import org.openapitools.vertxweb.server.model.AdPreviewURLResponse;
import org.openapitools.vertxweb.server.model.AdsAnalytics;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAdTargetingType;
import org.openapitools.vertxweb.server.model.AdsList200Response;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.CampaignAdPreview;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewCreate;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.vertxweb.server.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.vertxweb.server.model.ConversionAttributionWindowDays;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibPaginationOrder;
import org.openapitools.vertxweb.server.model.ReportingColumnSync;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AdsApi  {
    Future<ApiResponse<AdPreviewURLResponse>> adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest);
    Future<ApiResponse<MetricsResponse>> adTargetingAnalyticsGet(String adAccountId, List<String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, List<String> sortColumns, Boolean sortAscending);
    Future<ApiResponse<List<AdsAnalytics>>> adsAnalytics(LocalDate startDate, LocalDate endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, List<String> pinIds, List<String> adIds, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<String> campaignIds, ReportingTimeZone reportingTimezone);
    Future<ApiResponse<AdBatchWriteResponseModel>> adsCreate(String adAccountId, List<AdCreate> adCreate);
    Future<ApiResponse<Ad>> adsGet(String adId, String adAccountId);
    Future<ApiResponse<AdsList200Response>> adsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<EntityStatus> entityStatuses);
    Future<ApiResponse<AdBatchWriteResponseModel>> adsUpdate(String adAccountId, List<AdBatchUpdate> adBatchUpdate);
    Future<ApiResponse<List<CampaignAdPreviewCreate200ResponseInner>>> campaignAdPreviewCreate(String adAccountId, List<CampaignAdPreviewCreate> campaignAdPreviewCreate);
    Future<ApiResponse<List<CampaignAdPreviewDelete200ResponseInner>>> campaignAdPreviewDelete(List<String> adGroupIds, String adAccountId);
    Future<ApiResponse<List<CampaignAdPreview>>> campaignAdPreviewRead(List<String> adGroupIds, String adAccountId);
}
