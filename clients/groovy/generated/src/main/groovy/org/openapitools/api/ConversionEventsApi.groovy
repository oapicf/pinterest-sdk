package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionEvents
import org.openapitools.model.ConversionEventsCreate
import org.openapitools.model.DetailedError
import org.openapitools.model.PinterestLibError

class ConversionEventsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def eventsCreate ( String adAccountId, ConversionEventsCreate conversionEventsCreate, Boolean test, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/events"

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
        if (conversionEventsCreate == null) {
            throw new RuntimeException("missing required params conversionEventsCreate")
        }

        if (test != null) {
            queryParams.put("test", test)
        }


        contentType = 'application/json';
        bodyParams = conversionEventsCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ConversionEvents.class )

    }

}
