package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdGroupArrayResponse;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingRequest;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingResponse;
import org.openapitools.vertxweb.server.model.AdGroupCreateRequest;
import org.openapitools.vertxweb.server.model.AdGroupResponse;
import org.openapitools.vertxweb.server.model.AdGroupUpdateRequest;
import org.openapitools.vertxweb.server.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdGroupsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.BidFloor;
import org.openapitools.vertxweb.server.model.BidFloorRequest;
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

public interface AdGroupsApi  {
    Future<ApiResponse<List<AdGroupsAnalyticsResponseInner>>> adGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime);
    Future<ApiResponse<AdGroupAudienceSizingResponse>> adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest);
    Future<ApiResponse<BidFloor>> adGroupsBidFloorGet(String adAccountId, BidFloorRequest bidFloorRequest);
    Future<ApiResponse<AdGroupArrayResponse>> adGroupsCreate(String adAccountId, List<AdGroupCreateRequest> adGroupCreateRequest);
    Future<ApiResponse<AdGroupResponse>> adGroupsGet(String adAccountId, String adGroupId);
    Future<ApiResponse<AdGroupsList200Response>> adGroupsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames);
    Future<ApiResponse<MetricsResponse>> adGroupsTargetingAnalyticsGet(String adAccountId, List<String> adGroupIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes);
    Future<ApiResponse<AdGroupArrayResponse>> adGroupsUpdate(String adAccountId, List<AdGroupUpdateRequest> adGroupUpdateRequest);
}
