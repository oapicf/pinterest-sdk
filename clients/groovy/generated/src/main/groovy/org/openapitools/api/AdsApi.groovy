package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdArrayResponse
import org.openapitools.model.AdCreateRequest
import org.openapitools.model.AdPreviewRequest
import org.openapitools.model.AdPreviewURLResponse
import org.openapitools.model.AdResponse
import org.openapitools.model.AdUpdateRequest
import org.openapitools.model.AdsAnalyticsResponseInner
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.AdsList200Response
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.Error
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsResponse

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


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdPreviewURLResponse.class )

    }

    def adTargetingAnalyticsGet ( String adAccountId, List<String> adIds, Date startDate, Date endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads/targeting_analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    MetricsResponse.class )

    }

    def adsAnalytics ( String adAccountId, Date startDate, Date endDate, List<String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
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
        if (adIds == null) {
            throw new RuntimeException("missing required params adIds")
        }
        // verify required params are set
        if (columns == null) {
            throw new RuntimeException("missing required params columns")
        }
        // verify required params are set
        if (granularity == null) {
            throw new RuntimeException("missing required params granularity")
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    AdsAnalyticsResponseInner.class )

    }

    def adsCreate ( String adAccountId, List<AdCreateRequest> adCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adCreateRequest == null) {
            throw new RuntimeException("missing required params adCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = adCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdArrayResponse.class )

    }

    def adsGet ( String adAccountId, String adId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads/${ad_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adId == null) {
            throw new RuntimeException("missing required params adId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdResponse.class )

    }

    def adsList ( String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
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
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdsList200Response.class )

    }

    def adsUpdate ( String adAccountId, List<AdUpdateRequest> adUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adUpdateRequest == null) {
            throw new RuntimeException("missing required params adUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = adUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    AdArrayResponse.class )

    }

}
