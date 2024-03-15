package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.CampaignCreateRequest
import org.openapitools.model.CampaignCreateResponse
import org.openapitools.model.CampaignResponse
import org.openapitools.model.CampaignUpdateRequest
import org.openapitools.model.CampaignUpdateResponse
import org.openapitools.model.CampaignsAnalyticsResponseInner
import org.openapitools.model.CampaignsList200Response
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.Error
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsResponse

class CampaignsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def campaignTargetingAnalyticsGet ( String adAccountId, List<String> campaignIds, Date startDate, Date endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/targeting_analytics"

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
        if (campaignIds == null) {
            throw new RuntimeException("missing required params campaignIds")
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

        if (campaignIds != null) {
            queryParams.put("campaign_ids", campaignIds)
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

    def campaignsAnalytics ( String adAccountId, Date startDate, Date endDate, List<String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/analytics"

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
        if (campaignIds == null) {
            throw new RuntimeException("missing required params campaignIds")
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
        if (campaignIds != null) {
            queryParams.put("campaign_ids", campaignIds)
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
                    CampaignsAnalyticsResponseInner.class )

    }

    def campaignsCreate ( String adAccountId, List<CampaignCreateRequest> campaignCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns"

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
        if (campaignCreateRequest == null) {
            throw new RuntimeException("missing required params campaignCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = campaignCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CampaignCreateResponse.class )

    }

    def campaignsGet ( String adAccountId, String campaignId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/${campaign_id}"

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
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CampaignResponse.class )

    }

    def campaignsList ( String adAccountId, List<String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns"

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
                    CampaignsList200Response.class )

    }

    def campaignsUpdate ( String adAccountId, List<CampaignUpdateRequest> campaignUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns"

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
        if (campaignUpdateRequest == null) {
            throw new RuntimeException("missing required params campaignUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = campaignUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    CampaignUpdateResponse.class )

    }

}
