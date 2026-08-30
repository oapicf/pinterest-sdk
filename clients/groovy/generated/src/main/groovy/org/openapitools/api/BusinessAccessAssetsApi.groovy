package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AssetGroupDeletion
import org.openapitools.model.AssetGroupDeletionDelete
import org.openapitools.model.AssetGroupInput
import org.openapitools.model.AssetGroupInputCreate
import org.openapitools.model.AssetGroupModification
import org.openapitools.model.AssetGroupModificationReadOrUpdate
import org.openapitools.model.AssetPermissionType
import org.openapitools.model.AssetSearchBy
import org.openapitools.model.AssetSortBy
import org.openapitools.model.BusinessAssetMembersGet200Response
import org.openapitools.model.BusinessAssetsGet200Response
import org.openapitools.model.BusinessMemberAssetsGetResponse
import org.openapitools.model.BusinessMembersAssetAccessDeleteBody
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.model.DeletePartnerAssetAccessBody
import org.openapitools.model.DeletePartnerAssetAccessResultsResponseArray
import org.openapitools.model.NonDraftEntityStatus
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.PinterestLibError
import org.openapitools.model.UpdateMemberAssetAccessBody
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.model.UpdatePartnerAssetAccessBody
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray

class BusinessAccessAssetsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def assetGroupCreate ( String businessId, AssetGroupInputCreate assetGroupInputCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/asset_groups"

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
        if (assetGroupInputCreate == null) {
            throw new RuntimeException("missing required params assetGroupInputCreate")
        }



        contentType = 'application/json';
        bodyParams = assetGroupInputCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AssetGroupInput.class )

    }

    def assetGroupDelete ( String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/asset_groups"

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
        if (assetGroupDeletionDelete == null) {
            throw new RuntimeException("missing required params assetGroupDeletionDelete")
        }



        contentType = 'application/json';
        bodyParams = assetGroupDeletionDelete


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    AssetGroupDeletion.class )

    }

    def assetGroupUpdate ( String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/asset_groups"

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
        if (assetGroupModificationReadOrUpdate == null) {
            throw new RuntimeException("missing required params assetGroupModificationReadOrUpdate")
        }



        contentType = 'application/json';
        bodyParams = assetGroupModificationReadOrUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    AssetGroupModification.class )

    }

    def businessAssetMembersGet ( String businessId, String assetId, Integer startIndex, Boolean fetchSystemUsers, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/assets/${asset_id}/members"

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
        if (assetId == null) {
            throw new RuntimeException("missing required params assetId")
        }

        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (fetchSystemUsers != null) {
            queryParams.put("fetch_system_users", fetchSystemUsers)
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
                    BusinessAssetMembersGet200Response.class )

    }

    def businessAssetPartnersGet ( String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/assets/${asset_id}/partners"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BusinessAssetMembersGet200Response.class )

    }

    def businessAssetsGet ( String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/assets"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BusinessAssetsGet200Response.class )

    }

    def businessMemberAssetsGet ( String businessId, String memberId, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members/${member_id}/assets"

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
        if (memberId == null) {
            throw new RuntimeException("missing required params memberId")
        }

        if (assetType != null) {
            queryParams.put("asset_type", assetType)
        }
        if (startIndex != null) {
            queryParams.put("start_index", startIndex)
        }
        if (sortBy != null) {
            queryParams.put("sort_by", sortBy)
        }
        if (sortAscending != null) {
            queryParams.put("sort_ascending", sortAscending)
        }
        if (searchBy != null) {
            queryParams.put("search_by", searchBy)
        }
        if (searchValue != null) {
            queryParams.put("search_value", searchValue)
        }
        if (assetPermissionType != null) {
            queryParams.put("asset_permission_type", assetPermissionType)
        }
        if (adAccountStatuses != null) {
            queryParams.put("ad_account_statuses", adAccountStatuses)
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
                    BusinessMemberAssetsGetResponse.class )

    }

    def businessMembersAssetAccessDelete ( String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members/assets/access"

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
        if (businessMembersAssetAccessDeleteBody == null) {
            throw new RuntimeException("missing required params businessMembersAssetAccessDeleteBody")
        }



        contentType = 'application/json';
        bodyParams = businessMembersAssetAccessDeleteBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    DeleteMemberAccessResultsResponseArray.class )

    }

    def businessMembersAssetAccessUpdate ( String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/members/assets/access"

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
        if (updateMemberAssetAccessBody == null) {
            throw new RuntimeException("missing required params updateMemberAssetAccessBody")
        }



        contentType = 'application/json';
        bodyParams = updateMemberAssetAccessBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    UpdateMemberAssetsResultsResponseArray.class )

    }

    def businessPartnerAssetAccessGet ( String businessId, String partnerId, String partnerType, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners/${partner_id}/assets"

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
        if (sortBy != null) {
            queryParams.put("sort_by", sortBy)
        }
        if (sortAscending != null) {
            queryParams.put("sort_ascending", sortAscending)
        }
        if (searchBy != null) {
            queryParams.put("search_by", searchBy)
        }
        if (searchValue != null) {
            queryParams.put("search_value", searchValue)
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
                    BusinessPartnerAssetAccessGet200Response.class )

    }

    def deletePartnerAssetAccessHandlerImpl ( String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners/assets"

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
        if (deletePartnerAssetAccessBody == null) {
            throw new RuntimeException("missing required params deletePartnerAssetAccessBody")
        }



        contentType = 'application/json';
        bodyParams = deletePartnerAssetAccessBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    DeletePartnerAssetAccessResultsResponseArray.class )

    }

    def updatePartnerAssetAccessHandlerImpl ( String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/businesses/${business_id}/partners/assets"

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
        if (updatePartnerAssetAccessBody == null) {
            throw new RuntimeException("missing required params updatePartnerAssetAccessBody")
        }



        contentType = 'application/json';
        bodyParams = updatePartnerAssetAccessBody


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    UpdatePartnerAssetsResultsResponseArray.class )

    }

}
