package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Ad
import org.openapitools.model.AdBatchUpdate
import org.openapitools.model.AdBatchWriteResponseModel
import org.openapitools.model.AdCreate
import org.openapitools.model.AdPreviewRequest
import org.openapitools.model.AdPreviewURLResponse
import org.openapitools.model.AdsAnalytics
import org.openapitools.model.AdsAnalyticsAdTargetingType
import org.openapitools.model.AdsList200Response
import java.math.BigDecimal
import org.openapitools.model.CampaignAdPreview
import org.openapitools.model.CampaignAdPreviewCreate
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.EntityStatus
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsResponse
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone

class AdsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adPreviewsCreate ( String adAccountId, AdPreviewRequest adPreviewRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_previews"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adPreviewRequest == null) {
            throw new RuntimeException("missing required params adPreviewRequest")
        }



        contentType = 'application/json';
        bodyParams = adPreviewRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdPreviewURLResponse.class )

    }

    def adTargetingAnalyticsGet ( String adAccountId, List<String> adIds, Date startDate, Date endDate, List<AdsAnalyticsAdTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, List<String> sortColumns, Boolean sortAscending, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads/targeting_analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adIds == null) {
            throw new RuntimeException("missing required params adIds")
        }
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (targetingTypes == null) {
            throw new RuntimeException("missing required params targetingTypes")
        }
        // verify required params are set
        if (columns == null) {
            throw new RuntimeException("missing required params columns")
        }
        // verify required params are set
        if (granularity == null) {
            throw new RuntimeException("missing required params granularity")
        }

        if (adIds != null) {
            queryParams.put("ad_ids", adIds)
        }
        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (targetingTypes != null) {
            queryParams.put("targeting_types", targetingTypes)
        }
        if (columns != null) {
            queryParams.put("columns", columns)
        }
        if (granularity != null) {
            queryParams.put("granularity", granularity)
        }
        if (clickWindowDays != null) {
            queryParams.put("click_window_days", clickWindowDays)
        }
        if (engagementWindowDays != null) {
            queryParams.put("engagement_window_days", engagementWindowDays)
        }
        if (viewWindowDays != null) {
            queryParams.put("view_window_days", viewWindowDays)
        }
        if (conversionReportTime != null) {
            queryParams.put("conversion_report_time", conversionReportTime)
        }
        if (attributionTypes != null) {
            queryParams.put("attribution_types", attributionTypes)
        }
        if (reportingTimezone != null) {
            queryParams.put("reporting_timezone", reportingTimezone)
        }
        if (sortColumns != null) {
            queryParams.put("sort_columns", sortColumns)
        }
        if (sortAscending != null) {
            queryParams.put("sort_ascending", sortAscending)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    MetricsResponse.class )

    }

    def adsAnalytics ( Date startDate, Date endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, List<String> pinIds, List<String> adIds, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<String> campaignIds, ReportingTimeZone reportingTimezone, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (columns == null) {
            throw new RuntimeException("missing required params columns")
        }
        // verify required params are set
        if (granularity == null) {
            throw new RuntimeException("missing required params granularity")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (pinIds != null) {
            queryParams.put("pin_ids", pinIds)
        }
        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (adIds != null) {
            queryParams.put("ad_ids", adIds)
        }
        if (columns != null) {
            queryParams.put("columns", columns)
        }
        if (granularity != null) {
            queryParams.put("granularity", granularity)
        }
        if (clickWindowDays != null) {
            queryParams.put("click_window_days", clickWindowDays)
        }
        if (engagementWindowDays != null) {
            queryParams.put("engagement_window_days", engagementWindowDays)
        }
        if (viewWindowDays != null) {
            queryParams.put("view_window_days", viewWindowDays)
        }
        if (conversionReportTime != null) {
            queryParams.put("conversion_report_time", conversionReportTime)
        }
        if (campaignIds != null) {
            queryParams.put("campaign_ids", campaignIds)
        }
        if (reportingTimezone != null) {
            queryParams.put("reporting_timezone", reportingTimezone)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    AdsAnalytics.class )

    }

    def adsCreate ( String adAccountId, List<AdCreate> adCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adCreate == null) {
            throw new RuntimeException("missing required params adCreate")
        }



        contentType = 'application/json';
        bodyParams = adCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdBatchWriteResponseModel.class )

    }

    def adsGet ( String adId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads/${ad_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adId == null) {
            throw new RuntimeException("missing required params adId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Ad.class )

    }

    def adsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<EntityStatus> entityStatuses, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (campaignIds != null) {
            queryParams.put("campaign_ids", campaignIds)
        }
        if (adGroupIds != null) {
            queryParams.put("ad_group_ids", adGroupIds)
        }
        if (adIds != null) {
            queryParams.put("ad_ids", adIds)
        }
        if (entityStatuses != null) {
            queryParams.put("entity_statuses", entityStatuses)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdsList200Response.class )

    }

    def adsUpdate ( String adAccountId, List<AdBatchUpdate> adBatchUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adBatchUpdate == null) {
            throw new RuntimeException("missing required params adBatchUpdate")
        }



        contentType = 'application/json';
        bodyParams = adBatchUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AdBatchWriteResponseModel.class )

    }

    def campaignAdPreviewCreate ( String adAccountId, List<CampaignAdPreviewCreate> campaignAdPreviewCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaign_ad_preview"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (campaignAdPreviewCreate == null) {
            throw new RuntimeException("missing required params campaignAdPreviewCreate")
        }



        contentType = 'application/json';
        bodyParams = campaignAdPreviewCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "array",
                    CampaignAdPreviewCreate200ResponseInner.class )

    }

    def campaignAdPreviewDelete ( List<String> adGroupIds, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaign_ad_preview"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adGroupIds == null) {
            throw new RuntimeException("missing required params adGroupIds")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (adGroupIds != null) {
            queryParams.put("ad_group_ids", adGroupIds)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "array",
                    CampaignAdPreviewDelete200ResponseInner.class )

    }

    def campaignAdPreviewRead ( List<String> adGroupIds, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaign_ad_preview"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adGroupIds == null) {
            throw new RuntimeException("missing required params adGroupIds")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (adGroupIds != null) {
            queryParams.put("ad_group_ids", adGroupIds)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    CampaignAdPreview.class )

    }

}
