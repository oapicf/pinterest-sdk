package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CustomerListUploadCreateRequest
import org.openapitools.model.CustomerListUploadCreateResponse
import org.openapitools.model.CustomerListUploadResponse
import org.openapitools.model.Error

class CustomerListUploadsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def customerListUploadsCreate ( String adAccountId, String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}/uploads"

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
        if (customerListId == null) {
            throw new RuntimeException("missing required params customerListId")
        }
        // verify required params are set
        if (customerListUploadCreateRequest == null) {
            throw new RuntimeException("missing required params customerListUploadCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = customerListUploadCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CustomerListUploadCreateResponse.class )

    }

    def customerListUploadsGet ( String adAccountId, String customerListId, String customerListUploadId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}/uploads/${customer_list_upload_id}"

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
        if (customerListId == null) {
            throw new RuntimeException("missing required params customerListId")
        }
        // verify required params are set
        if (customerListUploadId == null) {
            throw new RuntimeException("missing required params customerListUploadId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CustomerListUploadResponse.class )

    }

    def customerListUploadsRun ( String adAccountId, String customerListId, String customerListUploadId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}/uploads/${customer_list_upload_id}/run"

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
        if (customerListId == null) {
            throw new RuntimeException("missing required params customerListId")
        }
        // verify required params are set
        if (customerListUploadId == null) {
            throw new RuntimeException("missing required params customerListUploadId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CustomerListUploadResponse.class )

    }

}
