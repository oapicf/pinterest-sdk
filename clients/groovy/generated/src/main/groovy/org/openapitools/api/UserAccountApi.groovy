package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Account
import org.openapitools.model.AnalyticsMetricsResponse
import org.openapitools.model.Error

class UserAccountApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def userAccountAnalytics ( Date startDate, Date endDate, String fromClaimedContent, String pinFormat, String appTypes, List<String> metricTypes, String splitField, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account/analytics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (startDate == null) {
            throw new RuntimeException("missing required params startDate")
        }
        // verify required params are set
        if (endDate == null) {
            throw new RuntimeException("missing required params endDate")
        }

        if (startDate != null) {
            queryParams.put("start_date", startDate)
        }
        if (endDate != null) {
            queryParams.put("end_date", endDate)
        }
        if (fromClaimedContent != null) {
            queryParams.put("from_claimed_content", fromClaimedContent)
        }
        if (pinFormat != null) {
            queryParams.put("pin_format", pinFormat)
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

    def userAccountGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user_account"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (adAccountId != null) {
            queryParams.put("ad_account_id", adAccountId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Account.class )

    }

}
