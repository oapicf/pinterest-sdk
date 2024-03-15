package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdGroupArrayResponse;
import org.openapitools.server.api.model.AdGroupAudienceSizingRequest;
import org.openapitools.server.api.model.AdGroupAudienceSizingResponse;
import org.openapitools.server.api.model.AdGroupCreateRequest;
import org.openapitools.server.api.model.AdGroupResponse;
import org.openapitools.server.api.model.AdGroupUpdateRequest;
import org.openapitools.server.api.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.server.api.model.AdGroupsList200Response;
import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.BidFloor;
import org.openapitools.server.api.model.BidFloorRequest;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AdGroupsApi  {
    //ad_groups/analytics
    void adGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<AdGroupsAnalyticsResponseInner>>> handler);

    //ad_groups/audience_sizing
    void adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest, Handler<AsyncResult<AdGroupAudienceSizingResponse>> handler);

    //ad_groups_bid_floor/get
    void adGroupsBidFloorGet(String adAccountId, BidFloorRequest bidFloorRequest, Handler<AsyncResult<BidFloor>> handler);

    //ad_groups/create
    void adGroupsCreate(String adAccountId, List<AdGroupCreateRequest> adGroupCreateRequest, Handler<AsyncResult<AdGroupArrayResponse>> handler);

    //ad_groups/get
    void adGroupsGet(String adAccountId, String adGroupId, Handler<AsyncResult<AdGroupResponse>> handler);

    //ad_groups/list
    void adGroupsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames, Handler<AsyncResult<AdGroupsList200Response>> handler);

    //ad_groups_targeting_analytics/get
    void adGroupsTargetingAnalyticsGet(String adAccountId, List<String> adGroupIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Handler<AsyncResult<MetricsResponse>> handler);

    //ad_groups/update
    void adGroupsUpdate(String adAccountId, List<AdGroupUpdateRequest> adGroupUpdateRequest, Handler<AsyncResult<AdGroupArrayResponse>> handler);

}
