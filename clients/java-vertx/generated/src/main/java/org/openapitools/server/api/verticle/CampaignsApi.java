package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.CampaignCreateRequest;
import org.openapitools.server.api.model.CampaignCreateResponse;
import org.openapitools.server.api.model.CampaignResponse;
import org.openapitools.server.api.model.CampaignUpdateRequest;
import org.openapitools.server.api.model.CampaignUpdateResponse;
import org.openapitools.server.api.model.CampaignsAnalyticsResponseInner;
import org.openapitools.server.api.model.CampaignsList200Response;
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

public interface CampaignsApi  {
    //campaign_targeting_analytics/get
    void campaignTargetingAnalyticsGet(String adAccountId, List<String> campaignIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Handler<AsyncResult<MetricsResponse>> handler);

    //campaigns/analytics
    void campaignsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Handler<AsyncResult<List<CampaignsAnalyticsResponseInner>>> handler);

    //campaigns/create
    void campaignsCreate(String adAccountId, List<CampaignCreateRequest> campaignCreateRequest, Handler<AsyncResult<CampaignCreateResponse>> handler);

    //campaigns/get
    void campaignsGet(String adAccountId, String campaignId, Handler<AsyncResult<CampaignResponse>> handler);

    //campaigns/list
    void campaignsList(String adAccountId, List<String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Handler<AsyncResult<CampaignsList200Response>> handler);

    //campaigns/update
    void campaignsUpdate(String adAccountId, List<CampaignUpdateRequest> campaignUpdateRequest, Handler<AsyncResult<CampaignUpdateResponse>> handler);

}
