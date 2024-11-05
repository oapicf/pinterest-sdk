package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountsCountryResponse
import org.openapitools.model.BookClosedResponse
import org.openapitools.model.DeliveryMetricsResponse
import org.openapitools.model.Error
import org.openapitools.model.SingleInterestTargetingOptionResponse

class ResourcesApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adAccountCountriesGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/ad_account_countries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdAccountsCountryResponse.class )

    }

    def deliveryMetricsGet ( String reportType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/delivery_metrics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (reportType != null) {
            queryParams.put("report_type", reportType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    DeliveryMetricsResponse.class )

    }

    def interestTargetingOptionsGet ( String interestId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/targeting/interests/${interest_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (interestId == null) {
            throw new RuntimeException("missing required params interestId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    SingleInterestTargetingOptionResponse.class )

    }

    def leadFormQuestionsGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/lead_form_questions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    null )

    }

    def metricsReadyStateGet ( String date, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/metrics_ready_state"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (date == null) {
            throw new RuntimeException("missing required params date")
        }

        if (date != null) {
            queryParams.put("date", date)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BookClosedResponse.class )

    }

    def targetingOptionsGet ( String targetingType, String clientId, String oauthSignature, String timestamp, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/targeting/${targeting_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (targetingType == null) {
            throw new RuntimeException("missing required params targetingType")
        }

        if (clientId != null) {
            queryParams.put("client_id", clientId)
        }
        if (oauthSignature != null) {
            queryParams.put("oauth_signature", oauthSignature)
        }
        if (timestamp != null) {
            queryParams.put("timestamp", timestamp)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    Object.class )

    }

}
