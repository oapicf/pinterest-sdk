package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionMSOTEventsCreate
import org.openapitools.model.PinterestLibError

class MsotEventsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def msotEventsCreate ( String adAccountId, ConversionMSOTEventsCreate conversionMSOTEventsCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/msot/events"

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
        if (conversionMSOTEventsCreate == null) {
            throw new RuntimeException("missing required params conversionMSOTEventsCreate")
        }



        contentType = 'application/json';
        bodyParams = conversionMSOTEventsCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

}
