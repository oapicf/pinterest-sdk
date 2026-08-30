package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdPinAnalytics;
import org.openapitools.vertxweb.server.model.AdsAnalyticsCampaignTargetingType;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.Campaign;
import org.openapitools.vertxweb.server.model.CampaignBatchUpdateItem;
import org.openapitools.vertxweb.server.model.CampaignBatchWriteResponseModel;
import org.openapitools.vertxweb.server.model.CampaignCreateItem;
import org.openapitools.vertxweb.server.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.vertxweb.server.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.vertxweb.server.model.CampaignsAnalyticsMetrics;
import org.openapitools.vertxweb.server.model.CampaignsList200Response;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
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
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class CampaignsApiImpl implements CampaignsApi {
    public Future<ApiResponse<List<AdPinAnalytics>>> adPinsAnalytics(String campaignId, List<String> pinIds, LocalDate startDate, LocalDate endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MetricsResponse>> campaignTargetingAnalyticsGet(String adAccountId, List<String> campaignIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsCampaignTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<CampaignsAnalyticsMetrics>>> campaignsAnalytics(LocalDate startDate, LocalDate endDate, List<String> campaignIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignBatchWriteResponseModel>> campaignsCreate(String adAccountId, List<CampaignCreateItem> campaignCreateItem) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Campaign>> campaignsGet(String campaignId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignsList200Response>> campaignsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<EntityStatus> entityStatuses) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignBatchWriteResponseModel>> campaignsUpdate(String adAccountId, List<CampaignBatchUpdateItem> campaignBatchUpdateItem) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<CampaignDeliveryEstimatesResponse>> getCampaignDeliveryEstimates(String adAccountId, List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign) {
        return Future.failedFuture(new HttpException(501));
    }

}
