package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdPinAnalytics
import org.openapitools.model.AdsAnalyticsCampaignTargetingType
import java.math.BigDecimal
import org.openapitools.model.Campaign
import org.openapitools.model.CampaignBatchUpdateItem
import org.openapitools.model.CampaignBatchWriteResponseModel
import org.openapitools.model.CampaignCreateItem
import org.openapitools.model.CampaignDeliveryEstimatesCampaign
import org.openapitools.model.CampaignDeliveryEstimatesResponse
import org.openapitools.model.CampaignsAnalyticsMetrics
import org.openapitools.model.CampaignsList200Response
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.EntityStatus
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsResponse
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone

class CampaignsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adPinsAnalytics ( String campaignId, List<String> pinIds, Date startDate, Date endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/pins/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (pinIds == null) {
            throw new RuntimeException("missing required params pinIds")
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

        if (campaignId != null) {
            queryParams.put("campaign_id", campaignId)
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    AdPinAnalytics.class )

    }

    def campaignTargetingAnalyticsGet ( String adAccountId, List<String> campaignIds, Date startDate, Date endDate, List<AdsAnalyticsCampaignTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/targeting_analytics"

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
        if (reportingTimezone != null) {
            queryParams.put("reporting_timezone", reportingTimezone)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    MetricsResponse.class )

    }

    def campaignsAnalytics ( Date startDate, Date endDate, List<String> campaignIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/analytics"

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
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
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
        if (aggregateReportRows != null) {
            queryParams.put("aggregate_report_rows", aggregateReportRows)
        }
        if (reportingTimezone != null) {
            queryParams.put("reporting_timezone", reportingTimezone)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    CampaignsAnalyticsMetrics.class )

    }

    def campaignsCreate ( String adAccountId, List<CampaignCreateItem> campaignCreateItem, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns"

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
        if (campaignCreateItem == null) {
            throw new RuntimeException("missing required params campaignCreateItem")
        }



        contentType = 'application/json';
        bodyParams = campaignCreateItem


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CampaignBatchWriteResponseModel.class )

    }

    def campaignsGet ( String campaignId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/${campaign_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (campaignId == null) {
            throw new RuntimeException("missing required params campaignId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Campaign.class )

    }

    def campaignsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<EntityStatus> entityStatuses, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns"

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
        if (entityStatuses != null) {
            queryParams.put("entity_statuses", entityStatuses)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CampaignsList200Response.class )

    }

    def campaignsUpdate ( String adAccountId, List<CampaignBatchUpdateItem> campaignBatchUpdateItem, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns"

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
        if (campaignBatchUpdateItem == null) {
            throw new RuntimeException("missing required params campaignBatchUpdateItem")
        }



        contentType = 'application/json';
        bodyParams = campaignBatchUpdateItem


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    CampaignBatchWriteResponseModel.class )

    }

    def getCampaignDeliveryEstimates ( String adAccountId, List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/campaigns/delivery_estimates"

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
        if (campaignDeliveryEstimatesCampaign == null) {
            throw new RuntimeException("missing required params campaignDeliveryEstimatesCampaign")
        }



        contentType = 'application/json';
        bodyParams = campaignDeliveryEstimatesCampaign


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CampaignDeliveryEstimatesResponse.class )

    }

}
