package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdGroup
import org.openapitools.model.AdGroupAudienceSizing
import org.openapitools.model.AdGroupAudienceSizingCreate
import org.openapitools.model.AdGroupCreateCreate
import org.openapitools.model.AdGroupUpdateBatchUpdate
import org.openapitools.model.AdGroupsAnalyticsMetrics
import org.openapitools.model.AdGroupsCreate200Response
import org.openapitools.model.AdGroupsList200Response
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType
import org.openapitools.model.BidFloor
import org.openapitools.model.BidFloorCreate
import java.math.BigDecimal
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.DynamicTitlesDownloadCSV
import org.openapitools.model.DynamicTitlesGetStatus
import org.openapitools.model.DynamicTitlesProcessCSV
import org.openapitools.model.DynamicTitlesProcessCSVCreate
import org.openapitools.model.DynamicTitlesUploadURL
import org.openapitools.model.EntityStatus
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsResponse
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone

class AdGroupsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adGroupsAnalytics ( Date startDate, Date endDate, List<String> adGroupIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, Boolean aggregateReportRows, ReportingTimeZone reportingTimezone, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/analytics"

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
        if (adGroupIds == null) {
            throw new RuntimeException("missing required params adGroupIds")
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
        if (adGroupIds != null) {
            queryParams.put("ad_group_ids", adGroupIds)
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
                    AdGroupsAnalyticsMetrics.class )

    }

    def adGroupsAudienceSizing ( String adAccountId, AdGroupAudienceSizingCreate adGroupAudienceSizingCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/audience_sizing"

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
        if (adGroupAudienceSizingCreate == null) {
            throw new RuntimeException("missing required params adGroupAudienceSizingCreate")
        }



        contentType = 'application/json';
        bodyParams = adGroupAudienceSizingCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdGroupAudienceSizing.class )

    }

    def adGroupsBidFloorGet ( String adAccountId, BidFloorCreate bidFloorCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bid_floor"

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
        if (bidFloorCreate == null) {
            throw new RuntimeException("missing required params bidFloorCreate")
        }



        contentType = 'application/json';
        bodyParams = bidFloorCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    BidFloor.class )

    }

    def adGroupsCreate ( String adAccountId, List<AdGroupCreateCreate> adGroupCreateCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups"

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
        if (adGroupCreateCreate == null) {
            throw new RuntimeException("missing required params adGroupCreateCreate")
        }



        contentType = 'application/json';
        bodyParams = adGroupCreateCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdGroupsCreate200Response.class )

    }

    def adGroupsDynamicTitlesDownloadCsv ( String adAccountId, String adGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/${ad_group_id}/dynamic_titles/csv"

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
        if (adGroupId == null) {
            throw new RuntimeException("missing required params adGroupId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DynamicTitlesDownloadCSV.class )

    }

    def adGroupsDynamicTitlesGetStatus ( String adAccountId, String adGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/${ad_group_id}/dynamic_titles/status"

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
        if (adGroupId == null) {
            throw new RuntimeException("missing required params adGroupId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DynamicTitlesGetStatus.class )

    }

    def adGroupsDynamicTitlesGetUploadUrl ( String adAccountId, String adGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/${ad_group_id}/dynamic_titles/uploads"

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
        if (adGroupId == null) {
            throw new RuntimeException("missing required params adGroupId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DynamicTitlesUploadURL.class )

    }

    def adGroupsDynamicTitlesProcessCsv ( String adAccountId, String adGroupId, DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/${ad_group_id}/dynamic_titles"

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
        if (adGroupId == null) {
            throw new RuntimeException("missing required params adGroupId")
        }
        // verify required params are set
        if (dynamicTitlesProcessCSVCreate == null) {
            throw new RuntimeException("missing required params dynamicTitlesProcessCSVCreate")
        }



        contentType = 'application/json';
        bodyParams = dynamicTitlesProcessCSVCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DynamicTitlesProcessCSV.class )

    }

    def adGroupsGet ( String adGroupId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/${ad_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adGroupId == null) {
            throw new RuntimeException("missing required params adGroupId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdGroup.class )

    }

    def adGroupsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> campaignIds, List<String> adGroupIds, List<EntityStatus> entityStatuses, Boolean translateInterestsToNames, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups"

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
        if (entityStatuses != null) {
            queryParams.put("entity_statuses", entityStatuses)
        }
        if (translateInterestsToNames != null) {
            queryParams.put("translate_interests_to_names", translateInterestsToNames)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdGroupsList200Response.class )

    }

    def adGroupsTargetingAnalyticsGet ( String adAccountId, List<String> adGroupIds, Date startDate, Date endDate, List<AdsAnalyticsAdGroupTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, List<String> sortColumns, Boolean sortAscending, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups/targeting_analytics"

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
        if (adGroupIds == null) {
            throw new RuntimeException("missing required params adGroupIds")
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

        if (adGroupIds != null) {
            queryParams.put("ad_group_ids", adGroupIds)
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

    def adGroupsUpdate ( String adAccountId, List<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ad_groups"

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
        if (adGroupUpdateBatchUpdate == null) {
            throw new RuntimeException("missing required params adGroupUpdateBatchUpdate")
        }



        contentType = 'application/json';
        bodyParams = adGroupUpdateBatchUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AdGroupsCreate200Response.class )

    }

    def getAdGroupsByPromotionIdsList ( String adAccountId, List<String> promotionIds, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/promotion_applied_entities"

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
        if (promotionIds == null) {
            throw new RuntimeException("missing required params promotionIds")
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
        if (promotionIds != null) {
            queryParams.put("promotion_ids", promotionIds)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdGroupsList200Response.class )

    }

}
