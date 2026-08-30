#ifndef _BusinessAccessAssetsManager_H_
#define _BusinessAccessAssetsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup BusinessAccessAssets BusinessAccessAssets
 * \ingroup Operations
 *  @{
 */
class BusinessAccessAssetsManager {
public:
	BusinessAccessAssetsManager();
	virtual ~BusinessAccessAssetsManager();

/*! \brief Create a new asset group.. *Synchronous*
 *
 * Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetGroupInputCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetGroupCreateSync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupInputCreate> assetGroupInputCreate, 
	void(* handler)(AssetGroupInput, Error, void* )
	, void* userData);

/*! \brief Create a new asset group.. *Asynchronous*
 *
 * Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetGroupInputCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetGroupCreateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupInputCreate> assetGroupInputCreate, 
	void(* handler)(AssetGroupInput, Error, void* )
	, void* userData);


/*! \brief Delete asset groups.. *Synchronous*
 *
 * Delete a batch of asset groups.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetGroupDeletionDelete  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetGroupDeleteSync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupDeletionDelete> assetGroupDeletionDelete, 
	void(* handler)(AssetGroupDeletion, Error, void* )
	, void* userData);

/*! \brief Delete asset groups.. *Asynchronous*
 *
 * Delete a batch of asset groups.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetGroupDeletionDelete  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetGroupDeleteAsync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupDeletionDelete> assetGroupDeletionDelete, 
	void(* handler)(AssetGroupDeletion, Error, void* )
	, void* userData);


/*! \brief Update asset groups.. *Synchronous*
 *
 * Update a batch of asset groups with the specified parameters.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetGroupModificationReadOrUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetGroupUpdateSync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupModificationReadOrUpdate> assetGroupModificationReadOrUpdate, 
	void(* handler)(AssetGroupModification, Error, void* )
	, void* userData);

/*! \brief Update asset groups.. *Asynchronous*
 *
 * Update a batch of asset groups with the specified parameters.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetGroupModificationReadOrUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool assetGroupUpdateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<AssetGroupModificationReadOrUpdate> assetGroupModificationReadOrUpdate, 
	void(* handler)(AssetGroupModification, Error, void* )
	, void* userData);


/*! \brief Get members with access to asset. *Synchronous*
 *
 * Get all the members the requesting business has granted access to on the given asset.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetId Unique identifier of a business asset. *Required*
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAssetMembersGetSync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, bool fetchSystemUsers, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get members with access to asset. *Asynchronous*
 *
 * Get all the members the requesting business has granted access to on the given asset.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetId Unique identifier of a business asset. *Required*
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAssetMembersGetAsync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, bool fetchSystemUsers, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get partners with access to asset. *Synchronous*
 *
 * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetId Unique identifier of a business asset. *Required*
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAssetPartnersGetSync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get partners with access to asset. *Asynchronous*
 *
 * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param assetId Unique identifier of a business asset. *Required*
 * \param startIndex An index to start fetching the results from. Only the results starting from this index will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAssetPartnersGetAsync(char * accessToken,
	std::string businessId, std::string assetId, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_asset_members_get_200_response, Error, void* )
	, void* userData);


/*! \brief List business assets. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAssetsGetSync(char * accessToken,
	std::string businessId, std::list<PermissionsWithOwner> permissions, std::string childAssetId, std::string assetGroupId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_assets_get_200_response, Error, void* )
	, void* userData);

/*! \brief List business assets. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessAssetsGetAsync(char * accessToken,
	std::string businessId, std::list<PermissionsWithOwner> permissions, std::string childAssetId, std::string assetGroupId, std::string assetType, int startIndex, std::string bookmark, int pageSize, 
	void(* handler)(Business_assets_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get assets assigned to a member. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessMemberAssetsGetSync(char * accessToken,
	std::string businessId, std::string memberId, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, AssetPermissionType assetPermissionType, std::list<NonDraftEntityStatus> adAccountStatuses, std::string bookmark, int pageSize, 
	void(* handler)(BusinessMemberAssetsGetResponse, Error, void* )
	, void* userData);

/*! \brief Get assets assigned to a member. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessMemberAssetsGetAsync(char * accessToken,
	std::string businessId, std::string memberId, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, AssetPermissionType assetPermissionType, std::list<NonDraftEntityStatus> adAccountStatuses, std::string bookmark, int pageSize, 
	void(* handler)(BusinessMemberAssetsGetResponse, Error, void* )
	, void* userData);


/*! \brief Delete member access to asset. *Synchronous*
 *
 * Terminate multiple members' access to an asset.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param businessMembersAssetAccessDeleteBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessMembersAssetAccessDeleteSync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessMembersAssetAccessDeleteBody> businessMembersAssetAccessDeleteBody, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Delete member access to asset. *Asynchronous*
 *
 * Terminate multiple members' access to an asset.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param businessMembersAssetAccessDeleteBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessMembersAssetAccessDeleteAsync(char * accessToken,
	std::string businessId, std::shared_ptr<BusinessMembersAssetAccessDeleteBody> businessMembersAssetAccessDeleteBody, 
	void(* handler)(DeleteMemberAccessResultsResponseArray, Error, void* )
	, void* userData);


/*! \brief Assign/Update member asset permissions. *Synchronous*
 *
 * Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param updateMemberAssetAccessBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessMembersAssetAccessUpdateSync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateMemberAssetAccessBody> updateMemberAssetAccessBody, 
	void(* handler)(UpdateMemberAssetsResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Assign/Update member asset permissions. *Asynchronous*
 *
 * Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param updateMemberAssetAccessBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessMembersAssetAccessUpdateAsync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdateMemberAssetAccessBody> updateMemberAssetAccessBody, 
	void(* handler)(UpdateMemberAssetsResultsResponseArray, Error, void* )
	, void* userData);


/*! \brief Get assets assigned to a partner or assets assigned by a partner. *Synchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessPartnerAssetAccessGetSync(char * accessToken,
	std::string businessId, std::string partnerId, std::string partnerType, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, std::string bookmark, int pageSize, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get assets assigned to a partner or assets assigned by a partner. *Asynchronous*
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
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool businessPartnerAssetAccessGetAsync(char * accessToken,
	std::string businessId, std::string partnerId, std::string partnerType, std::string assetType, int startIndex, AssetSortBy sortBy, bool sortAscending, AssetSearchBy searchBy, std::string searchValue, std::string bookmark, int pageSize, 
	void(* handler)(Business_partner_asset_access_get_200_response, Error, void* )
	, void* userData);


/*! \brief Delete partner access to asset. *Synchronous*
 *
 * Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param deletePartnerAssetAccessBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deletePartnerAssetAccessHandlerImplSync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnerAssetAccessBody> deletePartnerAssetAccessBody, 
	void(* handler)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Delete partner access to asset. *Asynchronous*
 *
 * Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param deletePartnerAssetAccessBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deletePartnerAssetAccessHandlerImplAsync(char * accessToken,
	std::string businessId, std::shared_ptr<DeletePartnerAssetAccessBody> deletePartnerAssetAccessBody, 
	void(* handler)(DeletePartnerAssetAccessResultsResponseArray, Error, void* )
	, void* userData);


/*! \brief Assign/Update partner asset permissions. *Synchronous*
 *
 * Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param updatePartnerAssetAccessBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updatePartnerAssetAccessHandlerImplSync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdatePartnerAssetAccessBody> updatePartnerAssetAccessBody, 
	void(* handler)(UpdatePartnerAssetsResultsResponseArray, Error, void* )
	, void* userData);

/*! \brief Assign/Update partner asset permissions. *Asynchronous*
 *
 * Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
 * \param businessId Unique identifier of the requesting business. *Required*
 * \param updatePartnerAssetAccessBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updatePartnerAssetAccessHandlerImplAsync(char * accessToken,
	std::string businessId, std::shared_ptr<UpdatePartnerAssetAccessBody> updatePartnerAssetAccessBody, 
	void(* handler)(UpdatePartnerAssetsResultsResponseArray, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* BusinessAccessAssetsManager_H_ */
