package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.Granularity
import org.openapitools.model.ProductGroupAnalyticsResponseInner
import org.openapitools.model.ProductGroupPromotionCreateRequest
import org.openapitools.model.ProductGroupPromotionResponse
import org.openapitools.model.ProductGroupPromotionUpdateRequest
import org.openapitools.model.ProductGroupPromotionsList200Response

class ProductGroupPromotionsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def productGroupPromotionsCreate ( String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions"

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
        if (productGroupPromotionCreateRequest == null) {
            throw new RuntimeException("missing required params productGroupPromotionCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = productGroupPromotionCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ProductGroupPromotionResponse.class )

    }

    def productGroupPromotionsGet ( String adAccountId, String productGroupPromotionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions/${product_group_promotion_id}"

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
        if (productGroupPromotionId == null) {
            throw new RuntimeException("missing required params productGroupPromotionId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ProductGroupPromotionResponse.class )

    }

    def productGroupPromotionsList ( String adAccountId, List<String> productGroupPromotionIds, List<String> entityStatuses, String adGroupId, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
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
                    ProductGroupPromotionsList200Response.class )

    }

    def productGroupPromotionsUpdate ( String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_group_promotions"

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
        if (productGroupPromotionUpdateRequest == null) {
            throw new RuntimeException("missing required params productGroupPromotionUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = productGroupPromotionUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    ProductGroupPromotionResponse.class )

    }

    def productGroupsAnalytics ( String adAccountId, Date startDate, Date endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/product_groups/analytics"

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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    ProductGroupAnalyticsResponseInner.class )

    }

}
