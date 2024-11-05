package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AuthRespondInvitesBody
import org.openapitools.model.CancelInvitesBody
import org.openapitools.model.CreateAssetAccessRequestBody
import org.openapitools.model.CreateAssetAccessRequestResponse
import org.openapitools.model.CreateAssetInvitesRequest
import org.openapitools.model.CreateInvitesResultsResponseArray
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.model.DeleteInvitesResultsResponseArray
import org.openapitools.model.Error
import org.openapitools.model.GetInvites200Response
import org.openapitools.model.InviteType
import org.openapitools.model.RespondToInvitesResponseArray
import org.openapitools.model.UpdateInvitesResultsResponseArray

class BusinessAccessInviteApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def assetAccessRequestsCreate ( String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/requests/assets/access"

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
        if (createAssetAccessRequestBody == null) {
            throw new RuntimeException("missing required params createAssetAccessRequestBody")
        }



        contentType = 'application/json';
        bodyParams = createAssetAccessRequestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateAssetAccessRequestResponse.class )

    }

    def cancelInvitesOrRequests ( String businessId, CancelInvitesBody cancelInvitesBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/invites"

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
        if (cancelInvitesBody == null) {
            throw new RuntimeException("missing required params cancelInvitesBody")
        }



        contentType = 'application/json';
        bodyParams = cancelInvitesBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteInvitesResultsResponseArray.class )

    }

    def createAssetInvites ( String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/invites/assets/access"

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
        if (createAssetInvitesRequest == null) {
            throw new RuntimeException("missing required params createAssetInvitesRequest")
        }



        contentType = 'application/json';
        bodyParams = createAssetInvitesRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    UpdateInvitesResultsResponseArray.class )

    }

    def createMembershipOrPartnershipInvites ( String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/invites"

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
        if (createMembershipOrPartnershipInvitesBody == null) {
            throw new RuntimeException("missing required params createMembershipOrPartnershipInvitesBody")
        }



        contentType = 'application/json';
        bodyParams = createMembershipOrPartnershipInvitesBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateInvitesResultsResponseArray.class )

    }

    def getInvites ( String businessId, Boolean isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/invites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (isMember != null) {
            queryParams.put("is_member", isMember)
        }
        if (inviteStatus != null) {
            queryParams.put("invite_status", inviteStatus)
        }
        if (inviteType != null) {
            queryParams.put("invite_type", inviteType)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetInvites200Response.class )

    }

    def respondBusinessAccessInvites ( AuthRespondInvitesBody authRespondInvitesBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/invites"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (authRespondInvitesBody == null) {
            throw new RuntimeException("missing required params authRespondInvitesBody")
        }



        contentType = 'application/json';
        bodyParams = authRespondInvitesBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    RespondToInvitesResponseArray.class )

    }

}
