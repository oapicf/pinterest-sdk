package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.BusinessSharedAudience
import org.openapitools.model.BusinessSharedAudienceResponse
import org.openapitools.model.Error
import org.openapitools.model.SharedAudience
import org.openapitools.model.SharedAudienceResponse

class AudienceSharingApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adAccountsAudiencesSharedAccountsList ( String adAccountId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/shared/accounts"

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
        // verify required params are set
        if (accountType == null) {
            throw new RuntimeException("missing required params accountType")
        }

        if (audienceId != null) {
            queryParams.put("audience_id", audienceId)
        }
        if (accountType != null) {
            queryParams.put("account_type", accountType)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdAccountsAudiencesSharedAccountsList200Response.class )

    }

    def businessAccountAudiencesSharedAccountsList ( String businessId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences/shared/accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (audienceId == null) {
            throw new RuntimeException("missing required params audienceId")
        }
        // verify required params are set
        if (accountType == null) {
            throw new RuntimeException("missing required params accountType")
        }

        if (audienceId != null) {
            queryParams.put("audience_id", audienceId)
        }
        if (accountType != null) {
            queryParams.put("account_type", accountType)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AdAccountsAudiencesSharedAccountsList200Response.class )

    }

    def sharedAudiencesForBusinessList ( String businessId, String bookmark, String order, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    AudiencesList200Response.class )

    }

    def updateAdAccountToAdAccountSharedAudience ( String adAccountId, SharedAudience sharedAudience, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/ad_accounts/shared"

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
        if (sharedAudience == null) {
            throw new RuntimeException("missing required params sharedAudience")
        }



        contentType = 'application/json';
        bodyParams = sharedAudience


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    SharedAudienceResponse.class )

    }

    def updateAdAccountToBusinessSharedAudience ( String adAccountId, BusinessSharedAudience businessSharedAudience, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/businesses/shared"

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
        if (businessSharedAudience == null) {
            throw new RuntimeException("missing required params businessSharedAudience")
        }



        contentType = 'application/json';
        bodyParams = businessSharedAudience


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    BusinessSharedAudienceResponse.class )

    }

    def updateBusinessToAdAccountSharedAudience ( String businessId, SharedAudience sharedAudience, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences/ad_accounts/shared"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (sharedAudience == null) {
            throw new RuntimeException("missing required params sharedAudience")
        }



        contentType = 'application/json';
        bodyParams = sharedAudience


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    SharedAudienceResponse.class )

    }

    def updateBusinessToBusinessSharedAudience ( String businessId, BusinessSharedAudience businessSharedAudience, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences/businesses/shared"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (businessSharedAudience == null) {
            throw new RuntimeException("missing required params businessSharedAudience")
        }



        contentType = 'application/json';
        bodyParams = businessSharedAudience


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    BusinessSharedAudienceResponse.class )

    }

}
