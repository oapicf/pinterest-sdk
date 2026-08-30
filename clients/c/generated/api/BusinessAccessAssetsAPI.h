#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/asset_group_deletion.h"
#include "../model/asset_group_deletion_delete.h"
#include "../model/asset_group_input.h"
#include "../model/asset_group_input_create.h"
#include "../model/asset_group_modification.h"
#include "../model/asset_group_modification_read_or_update.h"
#include "../model/asset_permission_type.h"
#include "../model/asset_search_by.h"
#include "../model/asset_sort_by.h"
#include "../model/business_asset_members_get_200_response.h"
#include "../model/business_assets_get_200_response.h"
#include "../model/business_member_assets_get_response.h"
#include "../model/business_members_asset_access_delete_body.h"
#include "../model/business_partner_asset_access_get_200_response.h"
#include "../model/delete_member_access_results_response_array.h"
#include "../model/delete_partner_asset_access_body.h"
#include "../model/delete_partner_asset_access_results_response_array.h"
#include "../model/non_draft_entity_status.h"
#include "../model/permissions_with_owner.h"
#include "../model/pinterest_lib_error.h"
#include "../model/update_member_asset_access_body.h"
#include "../model/update_member_assets_results_response_array.h"
#include "../model/update_partner_asset_access_body.h"
#include "../model/update_partner_assets_results_response_array.h"

// Enum PERMISSIONS for BusinessAccessAssetsAPI_businessAssetsGet
typedef enum  { pinterest_rest_api_businessAssetsGet_PERMISSIONS_NULL = 0, pinterest_rest_api_businessAssetsGet_PERMISSIONS_ADMIN, pinterest_rest_api_businessAssetsGet_PERMISSIONS_ANALYST, pinterest_rest_api_businessAssetsGet_PERMISSIONS_FINANCE_MANAGER, pinterest_rest_api_businessAssetsGet_PERMISSIONS_FINANCE_EDIT, pinterest_rest_api_businessAssetsGet_PERMISSIONS_FINANCE_VIEW, pinterest_rest_api_businessAssetsGet_PERMISSIONS_AUDIENCE_MANAGER, pinterest_rest_api_businessAssetsGet_PERMISSIONS_CAMPAIGN_MANAGER, pinterest_rest_api_businessAssetsGet_PERMISSIONS_CATALOGS_MANAGER, pinterest_rest_api_businessAssetsGet_PERMISSIONS_CATALOGS_VIEWER, pinterest_rest_api_businessAssetsGet_PERMISSIONS_PROFILE_PUBLISHER, pinterest_rest_api_businessAssetsGet_PERMISSIONS_OWNER } pinterest_rest_api_businessAssetsGet_permissions_e;

// Enum ASSETTYPE for BusinessAccessAssetsAPI_businessAssetsGet
typedef enum  { pinterest_rest_api_businessAssetsGet_ASSETTYPE_NULL = 0, pinterest_rest_api_businessAssetsGet_ASSETTYPE_AD_ACCOUNT, pinterest_rest_api_businessAssetsGet_ASSETTYPE_PROFILE, pinterest_rest_api_businessAssetsGet_ASSETTYPE_ASSET_GROUP, pinterest_rest_api_businessAssetsGet_ASSETTYPE_CATALOG, pinterest_rest_api_businessAssetsGet_ASSETTYPE_CONSUMER } pinterest_rest_api_businessAssetsGet_asset_type_e;

// Enum ASSETTYPE for BusinessAccessAssetsAPI_businessMemberAssetsGet
typedef enum  { pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_NULL = 0, pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_AD_ACCOUNT, pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_PROFILE, pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_ASSET_GROUP, pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_CATALOG, pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_CONSUMER, pinterest_rest_api_businessMemberAssetsGet_ASSETTYPE_CONVERSION_TAG } pinterest_rest_api_businessMemberAssetsGet_asset_type_e;

// Enum  for BusinessAccessAssetsAPI_businessMemberAssetsGet
typedef enum  { pinterest_rest_api_businessMemberAssetsGet__NULL = 0, pinterest_rest_api_businessMemberAssetsGet__NAME, pinterest_rest_api_businessMemberAssetsGet__ID, pinterest_rest_api_businessMemberAssetsGet__PERMISSIONS } pinterest_rest_api_businessMemberAssetsGet_sort_by_e;

// Enum  for BusinessAccessAssetsAPI_businessMemberAssetsGet
typedef enum  { pinterest_rest_api_businessMemberAssetsGet__NULL = 0, pinterest_rest_api_businessMemberAssetsGet__NAME, pinterest_rest_api_businessMemberAssetsGet__ID, pinterest_rest_api_businessMemberAssetsGet__NAME_OR_ID, pinterest_rest_api_businessMemberAssetsGet__OWNER_NAME, pinterest_rest_api_businessMemberAssetsGet__NAME_OR_OWNER } pinterest_rest_api_businessMemberAssetsGet_search_by_e;

// Enum  for BusinessAccessAssetsAPI_businessMemberAssetsGet
typedef enum  { pinterest_rest_api_businessMemberAssetsGet__NULL = 0, pinterest_rest_api_businessMemberAssetsGet__AGGREGATED_PERMISSION, pinterest_rest_api_businessMemberAssetsGet__DIRECT_PERMISSION } pinterest_rest_api_businessMemberAssetsGet_asset_permission_type_e;

// Enum ADACCOUNTSTATUSES for BusinessAccessAssetsAPI_businessMemberAssetsGet
typedef enum  { pinterest_rest_api_businessMemberAssetsGet_ADACCOUNTSTATUSES_NULL = 0, pinterest_rest_api_businessMemberAssetsGet_ADACCOUNTSTATUSES_ACTIVE, pinterest_rest_api_businessMemberAssetsGet_ADACCOUNTSTATUSES_PAUSED, pinterest_rest_api_businessMemberAssetsGet_ADACCOUNTSTATUSES_ARCHIVED } pinterest_rest_api_businessMemberAssetsGet_ad_account_statuses_e;

// Enum PARTNERTYPE for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet
typedef enum  { pinterest_rest_api_businessPartnerAssetAccessGet_PARTNERTYPE_NULL = 0, pinterest_rest_api_businessPartnerAssetAccessGet_PARTNERTYPE_INTERNAL, pinterest_rest_api_businessPartnerAssetAccessGet_PARTNERTYPE_EXTERNAL } pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e;

// Enum ASSETTYPE for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet
typedef enum  { pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_NULL = 0, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_AD_ACCOUNT, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_PROFILE, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_ASSET_GROUP, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_PINNER_LIST, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_CONVERSION_TAG, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_CATALOG, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_CONSUMER, pinterest_rest_api_businessPartnerAssetAccessGet_ASSETTYPE_CONVERSION_SEGMENT } pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e;

// Enum  for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet
typedef enum  { pinterest_rest_api_businessPartnerAssetAccessGet__NULL = 0, pinterest_rest_api_businessPartnerAssetAccessGet__NAME, pinterest_rest_api_businessPartnerAssetAccessGet__ID, pinterest_rest_api_businessPartnerAssetAccessGet__PERMISSIONS } pinterest_rest_api_businessPartnerAssetAccessGet_sort_by_e;

// Enum  for BusinessAccessAssetsAPI_businessPartnerAssetAccessGet
typedef enum  { pinterest_rest_api_businessPartnerAssetAccessGet__NULL = 0, pinterest_rest_api_businessPartnerAssetAccessGet__NAME, pinterest_rest_api_businessPartnerAssetAccessGet__ID, pinterest_rest_api_businessPartnerAssetAccessGet__NAME_OR_ID, pinterest_rest_api_businessPartnerAssetAccessGet__OWNER_NAME, pinterest_rest_api_businessPartnerAssetAccessGet__NAME_OR_OWNER } pinterest_rest_api_businessPartnerAssetAccessGet_search_by_e;


// Create a new asset group.
//
// Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
//
asset_group_input_t*
BusinessAccessAssetsAPI_assetGroupCreate(apiClient_t *apiClient, char *business_id, asset_group_input_create_t *asset_group_input_create);


// Delete asset groups.
//
// Delete a batch of asset groups.
//
asset_group_deletion_t*
BusinessAccessAssetsAPI_assetGroupDelete(apiClient_t *apiClient, char *business_id, asset_group_deletion_delete_t *asset_group_deletion_delete);


// Update asset groups.
//
// Update a batch of asset groups with the specified parameters.
//
asset_group_modification_t*
BusinessAccessAssetsAPI_assetGroupUpdate(apiClient_t *apiClient, char *business_id, asset_group_modification_read_or_update_t *asset_group_modification_read_or_update);


// Get members with access to asset
//
// Get all the members the requesting business has granted access to on the given asset.
//
business_asset_members_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetMembersGet(apiClient_t *apiClient, char *business_id, char *asset_id, int *start_index, int *fetch_system_users, char *bookmark, int *page_size);


// Get partners with access to asset
//
// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
//
business_asset_members_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetPartnersGet(apiClient_t *apiClient, char *business_id, char *asset_id, int *start_index, char *bookmark, int *page_size);


// List business assets
//
// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
//
business_assets_get_200_response_t*
BusinessAccessAssetsAPI_businessAssetsGet(apiClient_t *apiClient, char *business_id, list_t *permissions, char *child_asset_id, char *asset_group_id, pinterest_rest_api_businessAssetsGet_asset_type_e asset_type, int *start_index, char *bookmark, int *page_size);


// Get assets assigned to a member
//
// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
//
business_member_assets_get_response_t*
BusinessAccessAssetsAPI_businessMemberAssetsGet(apiClient_t *apiClient, char *business_id, char *member_id, pinterest_rest_api_businessMemberAssetsGet_asset_type_e asset_type, int *start_index, asset_sort_by_e sort_by, int *sort_ascending, asset_search_by_e search_by, char *search_value, asset_permission_type_e asset_permission_type, list_t *ad_account_statuses, char *bookmark, int *page_size);


// Delete member access to asset
//
// Terminate multiple members' access to an asset.
//
delete_member_access_results_response_array_t*
BusinessAccessAssetsAPI_businessMembersAssetAccessDelete(apiClient_t *apiClient, char *business_id, business_members_asset_access_delete_body_t *business_members_asset_access_delete_body);


// Assign/Update member asset permissions
//
// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
//
update_member_assets_results_response_array_t*
BusinessAccessAssetsAPI_businessMembersAssetAccessUpdate(apiClient_t *apiClient, char *business_id, update_member_asset_access_body_t *update_member_asset_access_body);


// Get assets assigned to a partner or assets assigned by a partner
//
// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
//
business_partner_asset_access_get_200_response_t*
BusinessAccessAssetsAPI_businessPartnerAssetAccessGet(apiClient_t *apiClient, char *business_id, char *partner_id, pinterest_rest_api_businessPartnerAssetAccessGet_partner_type_e partner_type, pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e asset_type, int *start_index, asset_sort_by_e sort_by, int *sort_ascending, asset_search_by_e search_by, char *search_value, char *bookmark, int *page_size);


// Delete partner access to asset
//
// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
//
delete_partner_asset_access_results_response_array_t*
BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, delete_partner_asset_access_body_t *delete_partner_asset_access_body);


// Assign/Update partner asset permissions
//
// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
//
update_partner_assets_results_response_array_t*
BusinessAccessAssetsAPI_updatePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, update_partner_asset_access_body_t *update_partner_asset_access_body);


