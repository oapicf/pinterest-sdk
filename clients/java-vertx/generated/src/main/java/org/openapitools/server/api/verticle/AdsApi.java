package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdArrayResponse;
import org.openapitools.server.api.model.AdCreateRequest;
import org.openapitools.server.api.model.AdPreviewRequest;
import org.openapitools.server.api.model.AdPreviewURLResponse;
import org.openapitools.server.api.model.AdResponse;
import org.openapitools.server.api.model.AdUpdateRequest;
import org.openapitools.server.api.model.AdsAnalyticsAdTargetingType;
import org.openapitools.server.api.model.AdsAnalyticsResponseInner;
import org.openapitools.server.api.model.AdsList200Response;
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

public interface AdsApi  {
    //ad_previews/create
    void adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest, Handler<AsyncResult<AdPreviewURLResponse>> handler);

    //ad_targeting_analytics/get
    void adTargetingAnalyticsGet(String adAccountId, List<String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Handler<AsyncResult<MetricsResponse>> handler);

    //ads/analytics
    void adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, List<String> adIds, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, List<String> pinIds, List<String> campaignIds, Handler<AsyncResult<List<AdsAnalyticsResponseInner>>> handler);

    //ads/create
    void adsCreate(String adAccountId, List<AdCreateRequest> adCreateRequest, Handler<AsyncResult<AdArrayResponse>> handler);

    //ads/get
    void adsGet(String adAccountId, String adId, Handler<AsyncResult<AdResponse>> handler);

    //ads/list
    void adsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Handler<AsyncResult<AdsList200Response>> handler);

    //ads/update
    void adsUpdate(String adAccountId, List<AdUpdateRequest> adUpdateRequest, Handler<AsyncResult<AdArrayResponse>> handler);

}
