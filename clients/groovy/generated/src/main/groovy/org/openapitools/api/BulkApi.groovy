package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BulkDownload
import org.openapitools.model.BulkDownloadCreate
import org.openapitools.model.BulkJobData
import org.openapitools.model.BulkUpsertRequest
import org.openapitools.model.BulkUpsertResponse
import org.openapitools.model.PinterestLibError

class BulkApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def bulkDownloadCreate ( String adAccountId, BulkDownloadCreate bulkDownloadCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bulk/download"

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
        if (bulkDownloadCreate == null) {
            throw new RuntimeException("missing required params bulkDownloadCreate")
        }



        contentType = 'application/json';
        bodyParams = bulkDownloadCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    BulkDownload.class )

    }

    def bulkRequestGet ( String adAccountId, String bulkRequestId, Boolean includeDetails, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bulk/${bulk_request_id}"

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
        if (bulkRequestId == null) {
            throw new RuntimeException("missing required params bulkRequestId")
        }

        if (includeDetails != null) {
            queryParams.put("include_details", includeDetails)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BulkJobData.class )

    }

    def bulkUpsertCreate ( String adAccountId, BulkUpsertRequest bulkUpsertRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/bulk/upsert"

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
        if (bulkUpsertRequest == null) {
            throw new RuntimeException("missing required params bulkUpsertRequest")
        }



        contentType = 'application/json';
        bodyParams = bulkUpsertRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    BulkUpsertResponse.class )

    }

}
