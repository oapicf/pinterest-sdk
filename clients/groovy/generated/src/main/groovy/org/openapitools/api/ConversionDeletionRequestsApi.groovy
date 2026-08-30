package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionDeletionRequest
import org.openapitools.model.ConversionDeletionRequestCreate
import org.openapitools.model.ConversionDeletionRequestList200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder

class ConversionDeletionRequestsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def conversionDeletionRequestCreate ( String adAccountId, ConversionDeletionRequestCreate conversionDeletionRequestCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_deletion_requests"

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
        if (conversionDeletionRequestCreate == null) {
            throw new RuntimeException("missing required params conversionDeletionRequestCreate")
        }



        contentType = 'application/json';
        bodyParams = conversionDeletionRequestCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ConversionDeletionRequest.class )

    }

    def conversionDeletionRequestDelete ( String requestId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_deletion_requests/${request_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (requestId == null) {
            throw new RuntimeException("missing required params requestId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    ConversionDeletionRequest.class )

    }

    def conversionDeletionRequestGet ( String requestId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_deletion_requests/${request_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (requestId == null) {
            throw new RuntimeException("missing required params requestId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ConversionDeletionRequest.class )

    }

    def conversionDeletionRequestList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_deletion_requests"

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

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ConversionDeletionRequestList200Response.class )

    }

}
