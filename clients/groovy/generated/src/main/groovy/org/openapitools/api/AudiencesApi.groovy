package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Audience
import org.openapitools.model.AudienceCreateCustomRequest
import org.openapitools.model.AudienceCreateRequest
import org.openapitools.model.AudienceUpdateRequest
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.Error

class AudiencesApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def audiencesCreate ( String adAccountId, AudienceCreateRequest audienceCreateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences"

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
        if (audienceCreateRequest == null) {
            throw new RuntimeException("missing required params audienceCreateRequest")
        }



        contentType = 'application/json';
        bodyParams = audienceCreateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Audience.class )

    }

    def audiencesCreateCustom ( String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/custom"

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
        if (audienceCreateCustomRequest == null) {
            throw new RuntimeException("missing required params audienceCreateCustomRequest")
        }



        contentType = 'application/json';
        bodyParams = audienceCreateCustomRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    Audience.class )

    }

    def audiencesGet ( String adAccountId, String audienceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/${audience_id}"

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
        if (audienceId == null) {
            throw new RuntimeException("missing required params audienceId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Audience.class )

    }

    def audiencesList ( String adAccountId, String bookmark, String order, Integer pageSize, String ownershipType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (order != null) {
            queryParams.put("order", order)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (ownershipType != null) {
            queryParams.put("ownership_type", ownershipType)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AudiencesList200Response.class )

    }

    def audiencesUpdate ( String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/${audience_id}"

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
        if (audienceId == null) {
            throw new RuntimeException("missing required params audienceId")
        }



        contentType = 'application/json';
        bodyParams = audienceUpdateRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    Audience.class )

    }

}
