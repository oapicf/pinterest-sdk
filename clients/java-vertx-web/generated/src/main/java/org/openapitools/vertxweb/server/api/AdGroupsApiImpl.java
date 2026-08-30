package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdGroup;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizing;
import org.openapitools.vertxweb.server.model.AdGroupAudienceSizingCreate;
import org.openapitools.vertxweb.server.model.AdGroupCreateCreate;
import org.openapitools.vertxweb.server.model.AdGroupUpdateBatchUpdate;
import org.openapitools.vertxweb.server.model.AdGroupsAnalyticsMetrics;
import org.openapitools.vertxweb.server.model.AdGroupsCreate200Response;
import org.openapitools.vertxweb.server.model.AdGroupsList200Response;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.vertxweb.server.model.BidFloor;
import org.openapitools.vertxweb.server.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.DynamicTitlesDownloadCSV;
import org.openapitools.vertxweb.server.model.DynamicTitlesGetStatus;
import org.openapitools.vertxweb.server.model.DynamicTitlesProcessCSV;
import org.openapitools.vertxweb.server.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.vertxweb.server.model.DynamicTitlesUploadURL;
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

public class AdGroupsApiImpl implements AdGroupsApi {
    public Future<ApiResponse<List<AdGroupsAnalyticsMetrics>>> adGroupsAnalytics(LocalDate startDate, LocalDate endDate, List<String> adGroupIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdGroupAudienceSizing>> adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<BidFloor>> adGroupsBidFloorGet(String adAccountId, BidFloorCreate bidFloorCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdGroupsCreate200Response>> adGroupsCreate(String adAccountId, List<AdGroupCreateCreate> adGroupCreateCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DynamicTitlesDownloadCSV>> adGroupsDynamicTitlesDownloadCsv(String adAccountId, String adGroupId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DynamicTitlesGetStatus>> adGroupsDynamicTitlesGetStatus(String adAccountId, String adGroupId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DynamicTitlesUploadURL>> adGroupsDynamicTitlesGetUploadUrl(String adAccountId, String adGroupId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<DynamicTitlesProcessCSV>> adGroupsDynamicTitlesProcessCsv(String adAccountId, String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdGroup>> adGroupsGet(String adGroupId, String adAccountId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdGroupsList200Response>> adGroupsList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<String> adGroupIds, List<EntityStatus> entityStatuses, Boolean translateInterestsToNames) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MetricsResponse>> adGroupsTargetingAnalyticsGet(String adAccountId, List<String> adGroupIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAdGroupTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, List<String> sortColumns, Boolean sortAscending) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdGroupsCreate200Response>> adGroupsUpdate(String adAccountId, List<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdGroupsList200Response>> getAdGroupsByPromotionIdsList(String adAccountId, List<String> promotionIds, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        return Future.failedFuture(new HttpException(501));
    }

}
