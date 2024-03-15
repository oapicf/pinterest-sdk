package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdsCreditRedeemRequest
import org.openapitools.model.AdsCreditRedeemResponse
import org.openapitools.model.AdsCreditsDiscountsGet200Response
import org.openapitools.model.BillingProfilesGet200Response
import org.openapitools.model.Error
import org.openapitools.model.SSIOAccountResponse
import org.openapitools.model.SSIOCreateInsertionOrderRequest
import org.openapitools.model.SSIOCreateInsertionOrderResponse
import org.openapitools.model.SSIOEditInsertionOrderRequest
import org.openapitools.model.SSIOEditInsertionOrderResponse
import org.openapitools.model.SSIOInsertionOrderStatusResponse
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response

class BillingApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adsCreditRedeem ( String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads_credit/redeem"

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
        if (adsCreditRedeemRequest == null) {
            throw new RuntimeException("missing required params adsCreditRedeemRequest")
        }



        contentType = 'application/json';
        bodyParams = adsCreditRedeemRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdsCreditRedeemResponse.class )

    }

    def adsCreditsDiscountsGet ( String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ads_credit/discounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdsCreditsDiscountsGet200Response.class )

    }

    def billingProfilesGet ( String adAccountId, Boolean isActive, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/billing_profiles"

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
        if (isActive == null) {
            throw new RuntimeException("missing required params isActive")
        }

        if (isActive != null) {
            queryParams.put("is_active", isActive)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BillingProfilesGet200Response.class )

    }

    def ssioAccountsGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    SSIOAccountResponse.class )

    }

    def ssioInsertionOrderCreate ( String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders"

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
        if (ssIOCreateInsertionOrderRequest == null) {
            throw new RuntimeException("missing required params ssIOCreateInsertionOrderRequest")
        }



        contentType = 'application/json';
        bodyParams = ssIOCreateInsertionOrderRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    SSIOCreateInsertionOrderResponse.class )

    }

    def ssioInsertionOrderEdit ( String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders"

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
        if (ssIOEditInsertionOrderRequest == null) {
            throw new RuntimeException("missing required params ssIOEditInsertionOrderRequest")
        }



        contentType = 'application/json';
        bodyParams = ssIOEditInsertionOrderRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    SSIOEditInsertionOrderResponse.class )

    }

    def ssioInsertionOrdersStatusGetByAdAccount ( String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    SsioInsertionOrdersStatusGetByAdAccount200Response.class )

    }

    def ssioInsertionOrdersStatusGetByPinOrderId ( String adAccountId, String pinOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/insertion_orders/${pin_order_id}/status"

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
        if (pinOrderId == null) {
            throw new RuntimeException("missing required params pinOrderId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    SSIOInsertionOrderStatusResponse.class )

    }

    def ssioOrderLinesGetByAdAccount ( String adAccountId, String bookmark, Integer pageSize, String pinOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/ssio/order_lines"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
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
        if (pinOrderId != null) {
            queryParams.put("pin_order_id", pinOrderId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    SsioOrderLinesGetByAdAccount200Response.class )

    }

}
