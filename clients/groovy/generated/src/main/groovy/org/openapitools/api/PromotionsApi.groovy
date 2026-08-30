package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder
import org.openapitools.model.Promotion
import org.openapitools.model.PromotionBatchUpdate
import org.openapitools.model.PromotionCreate
import org.openapitools.model.PromotionsList200Response
import org.openapitools.model.PromotionsResponse

class PromotionsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def promotionsCreate ( String adAccountId, List<PromotionCreate> promotionCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/promotions"

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
        if (promotionCreate == null) {
            throw new RuntimeException("missing required params promotionCreate")
        }



        contentType = 'application/json';
        bodyParams = promotionCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PromotionsResponse.class )

    }

    def promotionsDelete ( String promotionId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/promotions/${promotion_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (promotionId == null) {
            throw new RuntimeException("missing required params promotionId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    Promotion.class )

    }

    def promotionsGet ( String promotionId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/promotions/${promotion_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (promotionId == null) {
            throw new RuntimeException("missing required params promotionId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Promotion.class )

    }

    def promotionsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/promotions"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PromotionsList200Response.class )

    }

    def promotionsUpdate ( String adAccountId, List<PromotionBatchUpdate> promotionBatchUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/promotions"

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
        if (promotionBatchUpdate == null) {
            throw new RuntimeException("missing required params promotionBatchUpdate")
        }



        contentType = 'application/json';
        bodyParams = promotionBatchUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    PromotionsResponse.class )

    }

}
