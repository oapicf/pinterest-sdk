#ifndef TINY_CPP_CLIENT_BusinessAccessAssetsApi_H_
#define TINY_CPP_CLIENT_BusinessAccessAssetsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AssetGroupDeletion.h"
#include "AssetGroupDeletionDelete.h"
#include "AssetGroupInput.h"
#include "AssetGroupInputCreate.h"
#include "AssetGroupModification.h"
#include "AssetGroupModificationReadOrUpdate.h"
#include "AssetPermissionType.h"
#include "AssetSearchBy.h"
#include "AssetSortBy.h"
#include "BusinessMemberAssetsGetResponse.h"
#include "BusinessMembersAssetAccessDeleteBody.h"
#include "Business_asset_members_get_200_response.h"
#include "Business_assets_get_200_response.h"
#include "Business_partner_asset_access_get_200_response.h"
#include "DeleteMemberAccessResultsResponseArray.h"
#include "DeletePartnerAssetAccessBody.h"
#include "DeletePartnerAssetAccessResultsResponseArray.h"
#include "NonDraftEntityStatus.h"
#include "PermissionsWithOwner.h"
#include "Pinterest.Lib.Error.h"
#include "UpdateMemberAssetAccessBody.h"
#include "UpdateMemberAssetsResultsResponseArray.h"
#include "UpdatePartnerAssetAccessBody.h"
#include "UpdatePartnerAssetsResultsResponseArray.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BusinessAccessAssetsApi : public Service {
public:
    BusinessAccessAssetsApi() = default;

    virtual ~BusinessAccessAssetsApi();

    /**
    * Create a new asset group..
    *
    * Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetGroupInputCreate  *Required*
    */
    Response<
                AssetGroupInput
        >
    assetGroup_create(
            
            std::string businessId
            , 
            
            AssetGroupInputCreate assetGroupInputCreate
            
    );
    /**
    * Delete asset groups..
    *
    * Delete a batch of asset groups.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetGroupDeletionDelete  *Required*
    */
    Response<
                AssetGroupDeletion
        >
    assetGroup_delete(
            
            std::string businessId
            , 
            
            AssetGroupDeletionDelete assetGroupDeletionDelete
            
    );
    /**
    * Update asset groups..
    *
    * Update a batch of asset groups with the specified parameters.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetGroupModificationReadOrUpdate  *Required*
    */
    Response<
                AssetGroupModification
        >
    assetGroup_update(
            
            std::string businessId
            , 
            
            AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate
            
    );
    /**
    * Get members with access to asset.
    *
    * Get all the members the requesting business has granted access to on the given asset.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetId Unique identifier of a business asset. *Required*
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Business_asset_members_get_200_response
        >
    businessAssetMembers_get(
            
            std::string businessId
            , 
            
            std::string assetId
            , 
            
            int startIndex
            , 
            
            bool fetchSystemUsers
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get partners with access to asset.
    *
    * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetId Unique identifier of a business asset. *Required*
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Business_asset_members_get_200_response
        >
    businessAssetPartners_get(
            
            std::string businessId
            , 
            
            std::string assetId
            , 
            
            int startIndex
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * List business assets.
    *
    * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
    * \param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
    * \param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group.
    * \param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Business_assets_get_200_response
        >
    businessAssets_get(
            
            std::string businessId
            , 
            std::list<PermissionsWithOwner> permissions
            
            , 
            
            std::string childAssetId
            , 
            
            std::string assetGroupId
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Get assets assigned to a member.
    *
    * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param memberId The member id to fetch assets for. *Required*
    * \param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param sortBy The field to sort member assets by
    * \param sortAscending Sort assets in ascending order
    * \param searchBy The field to search member assets by
    * \param searchValue The value to search for
    * \param assetPermissionType The type of asset permission to filter by
    * \param adAccountStatuses A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                BusinessMemberAssetsGetResponse
        >
    businessMemberAssets_get(
            
            std::string businessId
            , 
            
            std::string memberId
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            AssetSortBy sortBy
            , 
            
            bool sortAscending
            , 
            
            AssetSearchBy searchBy
            , 
            
            std::string searchValue
            , 
            
            AssetPermissionType assetPermissionType
            , 
            std::list<NonDraftEntityStatus> adAccountStatuses
            
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Delete member access to asset.
    *
    * Terminate multiple members' access to an asset.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param businessMembersAssetAccessDeleteBody  *Required*
    */
    Response<
                DeleteMemberAccessResultsResponseArray
        >
    businessMembersAssetAccess_delete(
            
            std::string businessId
            , 
            
            BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody
            
    );
    /**
    * Assign/Update member asset permissions.
    *
    * Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param updateMemberAssetAccessBody  *Required*
    */
    Response<
                UpdateMemberAssetsResultsResponseArray
        >
    businessMembersAssetAccess_update(
            
            std::string businessId
            , 
            
            UpdateMemberAssetAccessBody updateMemberAssetAccessBody
            
    );
    /**
    * Get assets assigned to a partner or assets assigned by a partner.
    *
    * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param partnerId The partner id to be bound to the Business *Required*
    * \param partnerType Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
    * \param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param sortBy The field to sort member assets by
    * \param sortAscending Sort assets in ascending order
    * \param searchBy The field to search member assets by
    * \param searchValue The value to search for
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Business_partner_asset_access_get_200_response
        >
    businessPartnerAssetAccess_get(
            
            std::string businessId
            , 
            
            std::string partnerId
            , 
            
            std::string partnerType
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            AssetSortBy sortBy
            , 
            
            bool sortAscending
            , 
            
            AssetSearchBy searchBy
            , 
            
            std::string searchValue
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Delete partner access to asset.
    *
    * Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param deletePartnerAssetAccessBody  *Required*
    */
    Response<
                DeletePartnerAssetAccessResultsResponseArray
        >
    deletePartnerAssetAccessHandlerImpl(
            
            std::string businessId
            , 
            
            DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
            
    );
    /**
    * Assign/Update partner asset permissions.
    *
    * Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param updatePartnerAssetAccessBody  *Required*
    */
    Response<
                UpdatePartnerAssetsResultsResponseArray
        >
    updatePartnerAssetAccessHandlerImpl(
            
            std::string businessId
            , 
            
            UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BusinessAccessAssetsApi_H_ */