package org.openapitools.api;

import org.openapitools.api.ApiUtils
import java.math.BigDecimal
import org.openapitools.model.EntityStatus
import org.openapitools.model.Granularity
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.ProductGroupAnalyticsItems
import org.openapitools.model.ProductGroupPromotion
import org.openapitools.model.ProductGroupPromotions
import org.openapitools.model.ProductGroupPromotionsCreate
import org.openapitools.model.ProductGroupPromotionsList200Response
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.model.ReportingColumnSync
import org.openapitools.model.ReportingTimeZone

class ProductGroupPromotionsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def productGroupPromotionsCreate ( String adAccountId, ProductGroupPromotionsCreate productGroupPromotionsCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions"

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
        if (productGroupPromotionsCreate == null) {
            throw new RuntimeException("missing required params productGroupPromotionsCreate")
        }



        contentType = 'application/json';
        bodyParams = productGroupPromotionsCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProductGroupPromotions.class )

    }

    def productGroupPromotionsGet ( String adAccountId, String productGroupPromotionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions/${product_group_promotion_id}"

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
        if (productGroupPromotionId == null) {
            throw new RuntimeException("missing required params productGroupPromotionId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductGroupPromotion.class )

    }

    def productGroupPromotionsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, List<String> productGroupPromotionIds, List<EntityStatus> entityStatuses, String adGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions"

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
        if (productGroupPromotionIds != null) {
            queryParams.put("product_group_promotion_ids", productGroupPromotionIds)
        }
        if (entityStatuses != null) {
            queryParams.put("entity_statuses", entityStatuses)
        }
        if (adGroupId != null) {
            queryParams.put("ad_group_id", adGroupId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductGroupPromotionsList200Response.class )

    }

    def productGroupPromotionsUpdate ( String adAccountId, ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions"

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
        if (productGroupPromotionsUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params productGroupPromotionsUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = productGroupPromotionsUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    ProductGroupPromotions.class )

    }

    def productGroupsAnalytics ( Date startDate, Date endDate, List<String> productGroupIds, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_groups/analytics"

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
        if (productGroupIds == null) {
            throw new RuntimeException("missing required params productGroupIds")
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
        if (productGroupIds != null) {
            queryParams.put("product_group_ids", productGroupIds)
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
        if (reportingTimezone != null) {
            queryParams.put("reporting_timezone", reportingTimezone)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProductGroupAnalyticsItems.class )

    }

}
