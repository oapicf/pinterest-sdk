package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.EventQualityScore
import org.openapitools.model.IngestionSourceOptions
import org.openapitools.model.LookbackPeriodOptions
import org.openapitools.model.PinterestLibError
import org.openapitools.model.SourcePlatformOptions

class ConversionEqsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def conversionEqsList ( LookbackPeriodOptions lookbackPeriod, String adAccountId, SourcePlatformOptions sourcePlatform, IngestionSourceOptions ingestionSource, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_eqs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (lookbackPeriod == null) {
            throw new RuntimeException("missing required params lookbackPeriod")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (lookbackPeriod != null) {
            queryParams.put("lookback_period", lookbackPeriod)
        }
        if (sourcePlatform != null) {
            queryParams.put("source_platform", sourcePlatform)
        }
        if (ingestionSource != null) {
            queryParams.put("ingestion_source", ingestionSource)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    EventQualityScore.class )

    }

}
