package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.model.LeadSubscription
import org.openapitools.model.LeadSubscriptionPostParamsCreate
import org.openapitools.model.PinterestLibError

class LeadAdsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adAccountsSubscriptionsDelById ( String adAccountId, String subscriptionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads/subscriptions/${subscription_id}"

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
        if (subscriptionId == null) {
            throw new RuntimeException("missing required params subscriptionId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def adAccountsSubscriptionsGetById ( String adAccountId, String subscriptionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads/subscriptions/${subscription_id}"

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
        if (subscriptionId == null) {
            throw new RuntimeException("missing required params subscriptionId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    LeadSubscription.class )

    }

    def adAccountsSubscriptionsGetList ( String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads/subscriptions"

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
                    AdAccountsSubscriptionsGetList200Response.class )

    }

    def adAccountsSubscriptionsPost ( String adAccountId, LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/leads/subscriptions"

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
        if (leadSubscriptionPostParamsCreate == null) {
            throw new RuntimeException("missing required params leadSubscriptionPostParamsCreate")
        }



        contentType = 'application/json';
        bodyParams = leadSubscriptionPostParamsCreate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    LeadSubscription.class )

    }

}
