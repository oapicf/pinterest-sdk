package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.AdArrayResponse;
import org.openapitools.vertxweb.server.model.AdCreateRequest;
import org.openapitools.vertxweb.server.model.AdPreviewRequest;
import org.openapitools.vertxweb.server.model.AdPreviewURLResponse;
import org.openapitools.vertxweb.server.model.AdResponse;
import org.openapitools.vertxweb.server.model.AdUpdateRequest;
import org.openapitools.vertxweb.server.model.AdsAnalyticsAdTargetingType;
import org.openapitools.vertxweb.server.model.AdsAnalyticsResponseInner;
import org.openapitools.vertxweb.server.model.AdsList200Response;
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

public class AdsApiImpl implements AdsApi {
    public Future<ApiResponse<AdPreviewURLResponse>> adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<MetricsResponse>> adTargetingAnalyticsGet(String adAccountId, List<String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<AdsAnalyticsResponseInner>>> adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, List<String> adIds, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, List<String> pinIds, List<String> campaignIds) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdArrayResponse>> adsCreate(String adAccountId, List<AdCreateRequest> adCreateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdResponse>> adsGet(String adAccountId, String adId) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdsList200Response>> adsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<AdArrayResponse>> adsUpdate(String adAccountId, List<AdUpdateRequest> adUpdateRequest) {
        return Future.failedFuture(new HttpException(501));
    }

}
