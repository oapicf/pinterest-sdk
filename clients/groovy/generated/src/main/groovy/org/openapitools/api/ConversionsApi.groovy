package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdvertiserDefinedEventsCreate200Response
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest
import org.openapitools.model.AdvertiserDefinedEventsGet200Response
import org.openapitools.model.PinterestLibError

class ConversionsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def advertiserDefinedEventsCreate ( String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/advertiser_defined_events"

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
        if (advertiserDefinedEventsCreateRequest == null) {
            throw new RuntimeException("missing required params advertiserDefinedEventsCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = advertiserDefinedEventsCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdvertiserDefinedEventsCreate200Response.class )

    }

    def advertiserDefinedEventsDelete ( String adAccountId, List<String> eventNames, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/advertiser_defined_events"

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
        if (eventNames == null) {
            throw new RuntimeException("missing required params eventNames")
        }

        if (eventNames != null) {
            queryParams.put("event_names", eventNames)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    AdvertiserDefinedEventsCreate200Response.class )

    }

    def advertiserDefinedEventsGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/advertiser_defined_events"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdvertiserDefinedEventsGet200Response.class )

    }

    def advertiserDefinedEventsUpdate ( String adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/advertiser_defined_events"

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
        if (advertiserDefinedEventsCreateRequest == null) {
            throw new RuntimeException("missing required params advertiserDefinedEventsCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = advertiserDefinedEventsCreateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AdvertiserDefinedEventsCreate200Response.class )

    }

}
