package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CustomerList
import org.openapitools.model.CustomerListCreate
import org.openapitools.model.CustomerListUpdateWithRequiredBody
import org.openapitools.model.CustomerListsList200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder

class CustomerListsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def customerListsCreate ( String adAccountId, CustomerListCreate customerListCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists"

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
        if (customerListCreate == null) {
            throw new RuntimeException("missing required params customerListCreate")
        }



        contentType = 'application/json';
        bodyParams = customerListCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CustomerList.class )

    }

    def customerListsGet ( String adAccountId, String customerListId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}"

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
        if (customerListId == null) {
            throw new RuntimeException("missing required params customerListId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CustomerList.class )

    }

    def customerListsList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean excludeNca, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists"

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
        if (excludeNca != null) {
            queryParams.put("exclude_nca", excludeNca)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CustomerListsList200Response.class )

    }

    def customerListsUpdate ( String adAccountId, String customerListId, CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_lists/${customer_list_id}"

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
        if (customerListId == null) {
            throw new RuntimeException("missing required params customerListId")
        }
        // verify required params are set
        if (customerListUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params customerListUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = customerListUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    CustomerList.class )

    }

}
