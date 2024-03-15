package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CustomerList
import org.openapitools.model.CustomerListRequest
import org.openapitools.model.CustomerListUpdateRequest
import org.openapitools.model.CustomerListsList200Response
import org.openapitools.model.Error

class CustomerListsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def customerListsCreate ( String adAccountId, CustomerListRequest customerListRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists"

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
        if (customerListRequest == null) {
            throw new RuntimeException("missing required params customerListRequest")
        }



        contentType = 'application/json';
        bodyParams = customerListRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CustomerList.class )

    }

    def customerListsGet ( String adAccountId, String customerListId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}"

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





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CustomerList.class )

    }

    def customerListsList ( String adAccountId, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CustomerListsList200Response.class )

    }

    def customerListsUpdate ( String adAccountId, String customerListId, CustomerListUpdateRequest customerListUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}"

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
        if (customerListUpdateRequest == null) {
            throw new RuntimeException("missing required params customerListUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = customerListUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    CustomerList.class )

    }

}
