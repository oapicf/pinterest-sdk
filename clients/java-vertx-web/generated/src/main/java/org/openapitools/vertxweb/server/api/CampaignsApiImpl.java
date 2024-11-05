package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.vertxweb.server.model.CampaignCreateRequest;
import org.openapitools.vertxweb.server.model.CampaignCreateResponse;
import org.openapitools.vertxweb.server.model.CampaignResponse;
import org.openapitools.vertxweb.server.model.CampaignUpdateRequest;
import org.openapitools.vertxweb.server.model.CampaignUpdateResponse;
import org.openapitools.vertxweb.server.model.CampaignsAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.CampaignsList200Response;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.Granularity;
import java.time.LocalDate;
import org.openapitools.vertxweb.server.model.MetricsResponse;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CampaignsApiImpl implements CampaignsApi {
    public Future<ApiResponse<MetricsResponse>> campaignTargetingAnalyticsGet(String adAccountId, List<String> campaignIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsCampaignTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<CampaignsAnalyticsResponseInner>>> campaignsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignCreateResponse>> campaignsCreate(String adAccountId, List<CampaignCreateRequest> campaignCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignResponse>> campaignsGet(String adAccountId, String campaignId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignsList200Response>> campaignsList(String adAccountId, List<String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignUpdateResponse>> campaignsUpdate(String adAccountId, List<CampaignUpdateRequest> campaignUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
