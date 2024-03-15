package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdArrayResponse;
import org.openapitools.vertxweb.server.model.AdCreateRequest;
import org.openapitools.vertxweb.server.model.AdPreviewRequest;
import org.openapitools.vertxweb.server.model.AdPreviewURLResponse;
import org.openapitools.vertxweb.server.model.AdResponse;
import org.openapitools.vertxweb.server.model.AdUpdateRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.AdsList200Response;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface AdsApi  {
    Future<ApiResponse<AdPreviewURLResponse>> adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest);
    Future<ApiResponse<MetricsResponse>> adTargetingAnalyticsGet(String adAccountId, List<String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes);
    Future<ApiResponse<List<AdsAnalyticsResponseInner>>> adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
    Future<ApiResponse<AdArrayResponse>> adsCreate(String adAccountId, List<AdCreateRequest> adCreateRequest);
    Future<ApiResponse<AdResponse>> adsGet(String adAccountId, String adId);
    Future<ApiResponse<AdsList200Response>> adsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark);
    Future<ApiResponse<AdArrayResponse>> adsUpdate(String adAccountId, List<AdUpdateRequest> adUpdateRequest);
}
