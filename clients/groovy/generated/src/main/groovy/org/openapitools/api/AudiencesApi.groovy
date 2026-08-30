package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountsAudience
import org.openapitools.model.AdAccountsAudienceCreate
import org.openapitools.model.AdAccountsAudienceUpdate
import org.openapitools.model.AudienceOwnershipType
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.PinterestLibError
import org.openapitools.model.PinterestLibPaginationOrder

class AudiencesApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def audiencesCreate ( String adAccountId, AdAccountsAudienceCreate adAccountsAudienceCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences"

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
        if (adAccountsAudienceCreate == null) {
            throw new RuntimeException("missing required params adAccountsAudienceCreate")
        }



        contentType = 'application/json';
        bodyParams = adAccountsAudienceCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AdAccountsAudience.class )

    }

    def audiencesGet ( String audienceId, String adAccountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/${audience_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (audienceId == null) {
            throw new RuntimeException("missing required params audienceId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdAccountsAudience.class )

    }

    def audiencesList ( String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, AudienceOwnershipType ownershipType, Boolean excludeNca, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences"

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
        if (ownershipType != null) {
            queryParams.put("ownership_type", ownershipType)
        }
        if (excludeNca != null) {
            queryParams.put("exclude_nca", excludeNca)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AudiencesList200Response.class )

    }

    def audiencesUpdate ( String audienceId, String adAccountId, AdAccountsAudienceUpdate adAccountsAudienceUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/${audience_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (audienceId == null) {
            throw new RuntimeException("missing required params audienceId")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (adAccountsAudienceUpdate == null) {
            throw new RuntimeException("missing required params adAccountsAudienceUpdate")
        }



        contentType = 'application/json';
        bodyParams = adAccountsAudienceUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AdAccountsAudience.class )

    }

}
