package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BulkDownloadRequest
import org.openapitools.model.BulkDownloadResponse
import org.openapitools.model.BulkUpsertRequest
import org.openapitools.model.BulkUpsertResponse
import org.openapitools.model.BulkUpsertStatusResponse
import org.openapitools.model.Error

class BulkApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def bulkDownloadCreate ( String adAccountId, BulkDownloadRequest bulkDownloadRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bulk/download"

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
        if (bulkDownloadRequest == null) {
            throw new RuntimeException("missing required params bulkDownloadRequest")
        }



        contentType = 'application/json';
        bodyParams = bulkDownloadRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    BulkDownloadResponse.class )

    }

    def bulkRequestGet ( String adAccountId, String bulkRequestId, Boolean includeDetails, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bulk/${bulk_request_id}"

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
        if (bulkRequestId == null) {
            throw new RuntimeException("missing required params bulkRequestId")
        }

        if (includeDetails != null) {
            queryParams.put("include_details", includeDetails)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BulkUpsertStatusResponse.class )

    }

    def bulkUpsertCreate ( String adAccountId, BulkUpsertRequest bulkUpsertRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bulk/upsert"

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
        if (bulkUpsertRequest == null) {
            throw new RuntimeException("missing required params bulkUpsertRequest")
        }



        contentType = 'application/json';
        bodyParams = bulkUpsertRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    BulkUpsertResponse.class )

    }

}
