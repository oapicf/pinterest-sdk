package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConversionEventResponse
import org.openapitools.model.ConversionTagCreate
import org.openapitools.model.ConversionTagListResponse
import org.openapitools.model.ConversionTagResponse
import org.openapitools.model.Error
import org.openapitools.model.PageVisitConversionTagsGet200Response

class ConversionTagsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def conversionTagsCreate ( String adAccountId, ConversionTagCreate conversionTagCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_tags"

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
        if (conversionTagCreate == null) {
            throw new RuntimeException("missing required params conversionTagCreate")
        }



        contentType = 'application/json';
        bodyParams = conversionTagCreate


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ConversionTagResponse.class )

    }

    def conversionTagsGet ( String adAccountId, String conversionTagId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_tags/${conversion_tag_id}"

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
        if (conversionTagId == null) {
            throw new RuntimeException("missing required params conversionTagId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ConversionTagResponse.class )

    }

    def conversionTagsList ( String adAccountId, Boolean filterDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_tags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (filterDeleted != null) {
            queryParams.put("filter_deleted", filterDeleted)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ConversionTagListResponse.class )

    }

    def ocpmEligibleConversionTagsGet ( String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_tags/ocpm_eligible"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "map",
                    List.class )

    }

    def pageVisitConversionTagsGet ( String adAccountId, Integer pageSize, String order, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/conversion_tags/page_visit"

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
                    PageVisitConversionTagsGet200Response.class )

    }

}
