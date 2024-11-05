package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BusinessAssetMembersGet200Response
import org.openapitools.model.BusinessAssetPartnersGet200Response
import org.openapitools.model.BusinessAssetsGet200Response
import org.openapitools.model.BusinessMemberAssetsGet200Response
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.model.CreateAssetGroupBody
import org.openapitools.model.CreateAssetGroupResponse
import org.openapitools.model.DeleteAssetGroupBody
import org.openapitools.model.DeleteAssetGroupResponse
import org.openapitools.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.model.DeletePartnerAssetAccessBody
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.model.Error
import org.openapitools.model.PartnerType
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.UpdateAssetGroupBody
import org.openapitools.model.UpdateAssetGroupResponse
import org.openapitools.model.UpdateMemberAssetAccessBody
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.model.UpdatePartnerAssetAccessBody
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray

class BusinessAccessAssetsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def assetGroupCreate ( String businessId, CreateAssetGroupBody createAssetGroupBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/asset_groups"

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
        if (createAssetGroupBody == null) {
            throw new RuntimeException("missing required params createAssetGroupBody")
        }



        contentType = 'application/json';
        bodyParams = createAssetGroupBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    CreateAssetGroupResponse.class )

    }

    def assetGroupDelete ( String businessId, DeleteAssetGroupBody deleteAssetGroupBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/asset_groups"

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
        if (deleteAssetGroupBody == null) {
            throw new RuntimeException("missing required params deleteAssetGroupBody")
        }



        contentType = 'application/json';
        bodyParams = deleteAssetGroupBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteAssetGroupResponse.class )

    }

    def assetGroupUpdate ( String businessId, UpdateAssetGroupBody updateAssetGroupBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/asset_groups"

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
        if (updateAssetGroupBody == null) {
            throw new RuntimeException("missing required params updateAssetGroupBody")
        }



        contentType = 'application/json';
        bodyParams = updateAssetGroupBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    UpdateAssetGroupResponse.class )

    }

    def businessAssetMembersGet ( String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/assets/${asset_id}/members"

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
        if (assetId == null) {
            throw new RuntimeException("missing required params assetId")
        }

        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BusinessAssetMembersGet200Response.class )

    }

    def businessAssetPartnersGet ( String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/assets/${asset_id}/partners"

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
        if (assetId == null) {
            throw new RuntimeException("missing required params assetId")
        }

        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BusinessAssetPartnersGet200Response.class )

    }

    def businessAssetsGet ( String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/assets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (businessId == null) {
            throw new RuntimeException("missing required params businessId")
        }

        if (permissions != null) {
            queryParams.put("permissions", permissions)
        }
        if (childAssetId != null) {
            queryParams.put("child_asset_id", childAssetId)
        }
        if (assetGroupId != null) {
            queryParams.put("asset_group_id", assetGroupId)
        }
        if (assetType != null) {
            queryParams.put("asset_type", assetType)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BusinessAssetsGet200Response.class )

    }

    def businessMemberAssetsGet ( String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members/${member_id}/assets"

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
        if (memberId == null) {
            throw new RuntimeException("missing required params memberId")
        }

        if (assetType != null) {
            queryParams.put("asset_type", assetType)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BusinessMemberAssetsGet200Response.class )

    }

    def businessMembersAssetAccessDelete ( String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members/assets/access"

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
        if (businessMembersAssetAccessDeleteRequest == null) {
            throw new RuntimeException("missing required params businessMembersAssetAccessDeleteRequest")
        }



        contentType = 'application/json';
        bodyParams = businessMembersAssetAccessDeleteRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeleteMemberAccessResultsResponseArray.class )

    }

    def businessMembersAssetAccessUpdate ( String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members/assets/access"

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
        if (updateMemberAssetAccessBody == null) {
            throw new RuntimeException("missing required params updateMemberAssetAccessBody")
        }



        contentType = 'application/json';
        bodyParams = updateMemberAssetAccessBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    UpdateMemberAssetsResultsResponseArray.class )

    }

    def businessPartnerAssetAccessGet ( String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners/${partner_id}/assets"

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
        if (partnerId == null) {
            throw new RuntimeException("missing required params partnerId")
        }

        if (partnerType != null) {
            queryParams.put("partner_type", partnerType)
        }
        if (assetType != null) {
            queryParams.put("asset_type", assetType)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    BusinessPartnerAssetAccessGet200Response.class )

    }

    def deletePartnerAssetAccessHandlerImpl ( String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners/assets"

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
        if (deletePartnerAssetAccessBody == null) {
            throw new RuntimeException("missing required params deletePartnerAssetAccessBody")
        }



        contentType = 'application/json';
        bodyParams = deletePartnerAssetAccessBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    DeletePartnerAssetsResultsResponseArray.class )

    }

    def updatePartnerAssetAccessHandlerImpl ( String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners/assets"

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
        if (updatePartnerAssetAccessBody == null) {
            throw new RuntimeException("missing required params updatePartnerAssetAccessBody")
        }



        contentType = 'application/json';
        bodyParams = updatePartnerAssetAccessBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    UpdatePartnerAssetsResultsResponseArray.class )

    }

}
