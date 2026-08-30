package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AdAccountToAdAccountSharedAudience
import org.openapitools.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.AdAccountToBusinessSharedAudience
import org.openapitools.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.BusinessToAdAccountSharedAudience
import org.openapitools.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.BusinessToBusinessSharedAudience
import org.openapitools.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.Order
import org.openapitools.model.PinterestLibError
import org.openapitools.model.SharedAudiencesForBusinessList200Response

class AudienceSharingApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def adAccountsAudiencesSharedAccountsList ( String audienceId, AudienceAccountType accountType, String adAccountId, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/shared/accounts"

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
        if (accountType == null) {
            throw new RuntimeException("missing required params accountType")
        }
        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (audienceId != null) {
            queryParams.put("audience_id", audienceId)
        }
        if (accountType != null) {
            queryParams.put("account_type", accountType)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdAccountsAudiencesSharedAccountsList200Response.class )

    }

    def businessAccountAudiencesSharedAccountsList ( String businessId, String audienceId, AudienceAccountType accountType, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences/shared/accounts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AdAccountsAudiencesSharedAccountsList200Response.class )

    }

    def sharedAudiencesForBusinessList ( String businessId, Order order, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (order != null) {
            queryParams.put("order", order)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SharedAudiencesForBusinessList200Response.class )

    }

    def updateAdAccountToAdAccountSharedAudience ( String adAccountId, AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/ad_accounts/shared"

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
        if (adAccountToAdAccountSharedAudienceUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params adAccountToAdAccountSharedAudienceUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = adAccountToAdAccountSharedAudienceUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AdAccountToAdAccountSharedAudience.class )

    }

    def updateAdAccountToBusinessSharedAudience ( String adAccountId, AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/audiences/businesses/shared"

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
        if (adAccountToBusinessSharedAudienceUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params adAccountToBusinessSharedAudienceUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = adAccountToBusinessSharedAudienceUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AdAccountToBusinessSharedAudience.class )

    }

    def updateBusinessToAdAccountSharedAudience ( String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences/ad_accounts/shared"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (businessToAdAccountSharedAudienceUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params businessToAdAccountSharedAudienceUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = businessToAdAccountSharedAudienceUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    BusinessToAdAccountSharedAudience.class )

    }

    def updateBusinessToBusinessSharedAudience ( String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/audiences/businesses/shared"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }
        // verify required params are set
        if (businessToBusinessSharedAudienceUpdateWithRequiredBody == null) {
            throw new RuntimeException("missing required params businessToBusinessSharedAudienceUpdateWithRequiredBody")
        }



        contentType = 'application/json';
        bodyParams = businessToBusinessSharedAudienceUpdateWithRequiredBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    BusinessToBusinessSharedAudience.class )

    }

}
