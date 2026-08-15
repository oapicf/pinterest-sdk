#ifndef TINY_CPP_CLIENT_BusinessAccessAssetsApi_H_
#define TINY_CPP_CLIENT_BusinessAccessAssetsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Business_asset_members_get_200_response.h"
#include "Business_asset_partners_get_200_response.h"
#include "Business_assets_get_200_response.h"
#include "Business_member_assets_get_200_response.h"
#include "Business_members_asset_access_delete_request.h"
#include "Business_partner_asset_access_get_200_response.h"
#include "CreateAssetGroupBody.h"
#include "CreateAssetGroupResponse.h"
#include "DeleteAssetGroupBody.h"
#include "DeleteAssetGroupResponse.h"
#include "DeleteMemberAccessResultsResponseArray.h"
#include "DeletePartnerAssetAccessBody.h"
#include "DeletePartnerAssetsResultsResponseArray.h"
#include "Error.h"
#include "PartnerType.h"
#include "PermissionsWithOwner.h"
#include "UpdateAssetGroupBody.h"
#include "UpdateAssetGroupResponse.h"
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

    virtual ~BusinessAccessAssetsApi() = default;

    /**
    * Create a new asset group..
    *
    * Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param createAssetGroupBody  *Required*
    */
    Response<
                CreateAssetGroupResponse
        >
    assetGroup_create(
            
            std::string businessId
            , 
            
            CreateAssetGroupBody createAssetGroupBody
            
    );
    /**
    * Delete asset groups..
    *
    * Delete a batch of asset groups.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param deleteAssetGroupBody  *Required*
    */
    Response<
                DeleteAssetGroupResponse
        >
    assetGroup_delete(
            
            std::string businessId
            , 
            
            DeleteAssetGroupBody deleteAssetGroupBody
            
    );
    /**
    * Update asset groups..
    *
    * Update a batch of asset groups with the specified parameters.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param updateAssetGroupBody  *Required*
    */
    Response<
                UpdateAssetGroupResponse
        >
    assetGroup_update(
            
            std::string businessId
            , 
            
            UpdateAssetGroupBody updateAssetGroupBody
            
    );
    /**
    * Get members with access to asset.
    *
    * Get all the members the requesting business has granted access to on the given asset.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetId Unique identifier of a business asset. *Required*
    * \param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    */
    Response<
                Business_asset_members_get_200_response
        >
    businessAssetMembers_get(
            
            std::string businessId
            , 
            
            std::string assetId
            , 
            
            bool fetchSystemUsers
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            int startIndex
            
    );
    /**
    * Get partners with access to asset.
    *
    * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param assetId Unique identifier of a business asset. *Required*
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Business_asset_partners_get_200_response
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
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
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
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Business_member_assets_get_200_response
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
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Delete member access to asset.
    *
    * Terminate multiple members' access to an asset.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param businessMembersAssetAccessDeleteRequest List member assset permissions to delete. *Required*
    */
    Response<
                DeleteMemberAccessResultsResponseArray
        >
    businessMembersAssetAccess_delete(
            
            std::string businessId
            , 
            
            Business_members_asset_access_delete_request businessMembersAssetAccessDeleteRequest
            
    );
    /**
    * Assign/Update member asset permissions.
    *
    * Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param updateMemberAssetAccessBody List of member asset permissions to create or update. *Required*
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
    * \param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
    * \param assetType A resource type to filter the assets by. Only assets of the specified type will be returned.
    * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Business_partner_asset_access_get_200_response
        >
    businessPartnerAssetAccess_get(
            
            std::string businessId
            , 
            
            std::string partnerId
            , 
            
            PartnerType partnerType
            , 
            
            std::string assetType
            , 
            
            int startIndex
            , 
            
            int pageSize
            , 
            
            std::string bookmark
            
    );
    /**
    * Delete partner access to asset.
    *
    * Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
    * \param businessId Unique identifier of the requesting business. *Required*
    * \param deletePartnerAssetAccessBody  *Required*
    */
    Response<
                DeletePartnerAssetsResultsResponseArray
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
    * \param updatePartnerAssetAccessBody A list of assets and permissions to assign to your partners. *Required*
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