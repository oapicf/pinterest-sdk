package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.Error
import org.openapitools.model.Pin

class PinsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def pinsAnalytics ( String pinId, Date startDate, Date endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pinId == null) {
            throw new RuntimeException("missing required params pinId")
        }
        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }
        // verify required params are set
        if (metricTypes == null) {
            throw new RuntimeException("missing required params metricTypes")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (appTypes != null) {
            queryParams.put("app_types", appTypes)
        }
        if (metricTypes != null) {
            queryParams.put("metric_types", metricTypes)
        }
        if (splitField != null) {
            queryParams.put("split_field", splitField)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "map",
                    AnalyticsMetricsResponse.class )

    }

    def pinsCreate ( Pin pin, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pin == null) {
            throw new RuntimeException("missing required params pin")
        }



        contentType = 'application/json';
        bodyParams = pin


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Pin.class )

    }

    def pinsDelete ( String pinId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pinId == null) {
            throw new RuntimeException("missing required params pinId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def pinsGet ( String pinId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pinId == null) {
            throw new RuntimeException("missing required params pinId")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Pin.class )

    }

}
