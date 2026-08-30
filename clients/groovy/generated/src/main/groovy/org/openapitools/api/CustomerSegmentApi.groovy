package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CustomerSegment
import org.openapitools.model.CustomerSegmentCreate
import org.openapitools.model.CustomerSegmentList200Response
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder

class CustomerSegmentApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def customerSegmentCreate ( String adAccountId, CustomerSegmentCreate customerSegmentCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_segments"

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
        if (customerSegmentCreate == null) {
            throw new RuntimeException("missing required params customerSegmentCreate")
        }



        contentType = 'application/json';
        bodyParams = customerSegmentCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CustomerSegment.class )

    }

    def customerSegmentList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, Boolean includeSizing, String searchQuery, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_segments"

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
        if (includeSizing != null) {
            queryParams.put("include_sizing", includeSizing)
        }
        if (searchQuery != null) {
            queryParams.put("search_query", searchQuery)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CustomerSegmentList200Response.class )

    }

    def customerSegmentUpdate ( String adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/customer_segments"

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
        if (customerSegmentUpdateRequestUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params customerSegmentUpdateRequestUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = customerSegmentUpdateRequestUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    null )

    }

}
