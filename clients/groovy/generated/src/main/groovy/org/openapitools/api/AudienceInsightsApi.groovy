package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AudienceDefinitionResponse
import org.openapitools.model.AudienceInsightType
import org.openapitools.model.AudienceInsightsResponse
import org.openapitools.model.Error

class AudienceInsightsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def audienceInsightsGet ( String adAccountId, AudienceInsightType audienceInsightType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audience_insights"

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
        if (audienceInsightType == null) {
            throw new RuntimeException("missing required params audienceInsightType")
        }

        if (audienceInsightType != null) {
            queryParams.put("audience_insight_type", audienceInsightType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AudienceInsightsResponse.class )

    }

    def audienceInsightsScopeAndTypeGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/insights/audiences"

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
                    AudienceDefinitionResponse.class )

    }

}
