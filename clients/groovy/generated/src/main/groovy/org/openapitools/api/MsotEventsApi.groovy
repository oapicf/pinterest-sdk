package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionMSOTEvents
import org.openapitools.model.Error

class MsotEventsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def msotEventsCreate ( String adAccountId, ConversionMSOTEvents conversionMSOTEvents, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/msot/events"

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
        if (conversionMSOTEvents == null) {
            throw new RuntimeException("missing required params conversionMSOTEvents")
        }



        contentType = 'application/json';
        bodyParams = conversionMSOTEvents


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

}
