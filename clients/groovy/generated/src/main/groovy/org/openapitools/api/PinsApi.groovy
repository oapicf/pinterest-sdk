package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.Pin
import org.openapitools.model.PinAnalyticsMetricsResponse
import org.openapitools.model.PinCreate
import org.openapitools.model.PinUpdate
import org.openapitools.model.PinsAnalyticsMetricTypesParameterInner
import org.openapitools.model.PinsList200Response
import org.openapitools.model.PinsSaveRequest

class PinsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def multiPinsAnalytics ( List<String> pinIds, Date startDate, Date endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pinIds == null) {
            throw new RuntimeException("missing required params pinIds")
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

        if (pinIds != null) {
            queryParams.put("pin_ids", pinIds)
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
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "map",
                    Map.class )

    }

    def pinsAnalytics ( String pinId, Date startDate, Date endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField, String adAccountId, Closure onSuccess, Closure onFailure)  {
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
                    PinAnalyticsMetricsResponse.class )

    }

    def pinsCreate ( PinCreate pinCreate, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (pinCreate == null) {
            throw new RuntimeException("missing required params pinCreate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = pinCreate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Pin.class )

    }

    def pinsDelete ( String pinId, String adAccountId, Closure onSuccess, Closure onFailure)  {
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
                    "DELETE", "",
                    null )

    }

    def pinsGet ( String pinId, Boolean pinMetrics, String adAccountId, Closure onSuccess, Closure onFailure)  {
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

        if (pinMetrics != null) {
            queryParams.put("pin_metrics", pinMetrics)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Pin.class )

    }

    def pinsList ( String bookmark, Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes, String adAccountId, Boolean pinMetrics, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (pinFilter != null) {
            queryParams.put("pin_filter", pinFilter)
        }
        if (includeProtectedPins != null) {
            queryParams.put("include_protected_pins", includeProtectedPins)
        }
        if (pinType != null) {
            queryParams.put("pin_type", pinType)
        }
        if (creativeTypes != null) {
            queryParams.put("creative_types", creativeTypes)
        }
        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }
        if (pinMetrics != null) {
            queryParams.put("pin_metrics", pinMetrics)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PinsList200Response.class )

    }

    def pinsSave ( String pinId, PinsSaveRequest pinsSaveRequest, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/pins/${pin_id}/save"

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
        if (pinsSaveRequest == null) {
            throw new RuntimeException("missing required params pinsSaveRequest")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = pinsSaveRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Pin.class )

    }

    def pinsUpdate ( String pinId, PinUpdate pinUpdate, String adAccountId, Closure onSuccess, Closure onFailure)  {
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
        // verify required params are set
        if (pinUpdate == null) {
            throw new RuntimeException("missing required params pinUpdate")
        }

        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }


        contentType = 'application/json';
        bodyParams = pinUpdate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    Pin.class )

    }

}
