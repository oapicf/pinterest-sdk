package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdvancedAuctionItems
import org.openapitools.model.AdvancedAuctionItemsGetRequest
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.model.AdvancedAuctionProcessedItems
import org.openapitools.model.Error

class AdvancedAuctionApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def advancedAuctionItemsGetPost ( AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/advanced_auction/items/get"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (advancedAuctionItemsGetRequest == null) {
            throw new RuntimeException("missing required params advancedAuctionItemsGetRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = advancedAuctionItemsGetRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdvancedAuctionItems.class )

    }

    def advancedAuctionItemsSubmitPost ( AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/advanced_auction/items/submit"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (advancedAuctionItemsSubmitRequest == null) {
            throw new RuntimeException("missing required params advancedAuctionItemsSubmitRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = advancedAuctionItemsSubmitRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    AdvancedAuctionProcessedItems.class )

    }

}
