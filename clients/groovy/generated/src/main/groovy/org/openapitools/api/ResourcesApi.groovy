package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountCountriesGet200Response
import org.openapitools.model.BookClosed
import org.openapitools.model.DeliveryMetricsGet200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PublicTargetingType
import org.openapitools.model.ReportType
import org.openapitools.model.SingleInterestTargetingOption

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
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdAccountCountriesGet200Response.class )

    }

    def deliveryMetricsGet ( ReportType reportType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/delivery_metrics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (reportType != null) {
            queryParams.put("report_type", reportType)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DeliveryMetricsGet200Response.class )

    }

    def interestTargetingOptionsGet ( String interestId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/targeting/interests/${interest_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (interestId == null) {
            throw new RuntimeException("missing required params interestId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SingleInterestTargetingOption.class )

    }

    def leadFormQuestionsGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/lead_form_questions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def metricsReadyStateGet ( String date, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/metrics_ready_state"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (date == null) {
            throw new RuntimeException("missing required params date")
        }

        if (date != null) {
            queryParams.put("date", date)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BookClosed.class )

    }

    def targetingOptionsGet ( PublicTargetingType targetingType, String adAccountId, String clientId, String oauthSignature, String timestamp, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/resources/targeting/${targeting_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (targetingType == null) {
            throw new RuntimeException("missing required params targetingType")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Object.class )

    }

}
