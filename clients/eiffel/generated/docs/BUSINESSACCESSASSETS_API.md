# BUSINESSACCESSASSETS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**asset_group_create**](BUSINESSACCESSASSETS_API.md#asset_group_create) | **Post** /businesses/{business_id}/asset_groups | Create a new asset group.
[**asset_group_delete**](BUSINESSACCESSASSETS_API.md#asset_group_delete) | **Delete** /businesses/{business_id}/asset_groups | Delete asset groups.
[**asset_group_update**](BUSINESSACCESSASSETS_API.md#asset_group_update) | **Patch** /businesses/{business_id}/asset_groups | Update asset groups.
[**business_asset_members_get**](BUSINESSACCESSASSETS_API.md#business_asset_members_get) | **Get** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**business_asset_partners_get**](BUSINESSACCESSASSETS_API.md#business_asset_partners_get) | **Get** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**business_assets_get**](BUSINESSACCESSASSETS_API.md#business_assets_get) | **Get** /businesses/{business_id}/assets | List business assets
[**business_member_assets_get**](BUSINESSACCESSASSETS_API.md#business_member_assets_get) | **Get** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**business_members_asset_access_delete**](BUSINESSACCESSASSETS_API.md#business_members_asset_access_delete) | **Delete** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**business_members_asset_access_update**](BUSINESSACCESSASSETS_API.md#business_members_asset_access_update) | **Patch** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**business_partner_asset_access_get**](BUSINESSACCESSASSETS_API.md#business_partner_asset_access_get) | **Get** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**delete_partner_asset_access_handler_impl**](BUSINESSACCESSASSETS_API.md#delete_partner_asset_access_handler_impl) | **Delete** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**update_partner_asset_access_handler_impl**](BUSINESSACCESSASSETS_API.md#update_partner_asset_access_handler_impl) | **Patch** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **asset_group_create**
> asset_group_create (business_id: STRING_32 ; asset_group_input_create: ASSET_GROUP_INPUT_CREATE ): detachable ASSET_GROUP_INPUT


Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **asset_group_input_create** | [**ASSET_GROUP_INPUT_CREATE**](ASSET_GROUP_INPUT_CREATE.md)|  | 

### Return type

[**ASSET_GROUP_INPUT**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_delete**
> asset_group_delete (business_id: STRING_32 ; asset_group_deletion_delete: ASSET_GROUP_DELETION_DELETE ): detachable ASSET_GROUP_DELETION


Delete asset groups.

Delete a batch of asset groups.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **asset_group_deletion_delete** | [**ASSET_GROUP_DELETION_DELETE**](ASSET_GROUP_DELETION_DELETE.md)|  | 

### Return type

[**ASSET_GROUP_DELETION**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_update**
> asset_group_update (business_id: STRING_32 ; asset_group_modification_read_or_update: ASSET_GROUP_MODIFICATION_READ_OR_UPDATE ): detachable ASSET_GROUP_MODIFICATION


Update asset groups.

Update a batch of asset groups with the specified parameters.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **asset_group_modification_read_or_update** | [**ASSET_GROUP_MODIFICATION_READ_OR_UPDATE**](ASSET_GROUP_MODIFICATION_READ_OR_UPDATE.md)|  | 

### Return type

[**ASSET_GROUP_MODIFICATION**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_members_get**
> business_asset_members_get (business_id: STRING_32 ; asset_id: STRING_32 ; start_index:  detachable INTEGER_32 ; fetch_system_users:  detachable BOOLEAN ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BUSINESS_ASSET_MEMBERS_GET_200_RESPONSE


Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **asset_id** | **STRING_32**| Unique identifier of a business asset. | [default to null]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **fetch_system_users** | **BOOLEAN**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BUSINESS_ASSET_MEMBERS_GET_200_RESPONSE**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_partners_get**
> business_asset_partners_get (business_id: STRING_32 ; asset_id: STRING_32 ; start_index:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BUSINESS_ASSET_MEMBERS_GET_200_RESPONSE


Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **asset_id** | **STRING_32**| Unique identifier of a business asset. | [default to null]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BUSINESS_ASSET_MEMBERS_GET_200_RESPONSE**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_assets_get**
> business_assets_get (business_id: STRING_32 ; permissions:  detachable LIST [PERMISSIONS_WITH_OWNER] ; child_asset_id:  detachable STRING_32 ; asset_group_id:  detachable STRING_32 ; asset_type:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BUSINESS_ASSETS_GET_200_RESPONSE


List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **permissions** | [**LIST [PERMISSIONS_WITH_OWNER]**](PERMISSIONS_WITH_OWNER.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] [default to null]
 **child_asset_id** | **STRING_32**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] [default to null]
 **asset_group_id** | **STRING_32**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] [default to null]
 **asset_type** | **STRING_32**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BUSINESS_ASSETS_GET_200_RESPONSE**](business_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_member_assets_get**
> business_member_assets_get (business_id: STRING_32 ; member_id: STRING_32 ; asset_type:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; sort_by:  detachable ASSET_SORT_BY ; sort_ascending:  detachable BOOLEAN ; search_by:  detachable ASSET_SEARCH_BY ; search_value:  detachable STRING_32 ; asset_permission_type:  detachable ASSET_PERMISSION_TYPE ; ad_account_statuses:  detachable LIST [NON_DRAFT_ENTITY_STATUS] ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BUSINESS_MEMBER_ASSETS_GET_RESPONSE


Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **member_id** | **STRING_32**| The member id to fetch assets for. | [default to null]
 **asset_type** | **STRING_32**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_by** | [**ASSET_SORT_BY**](.md)| The field to sort member assets by | [optional] [default to null]
 **sort_ascending** | **BOOLEAN**| Sort assets in ascending order | [optional] [default to true]
 **search_by** | [**ASSET_SEARCH_BY**](.md)| The field to search member assets by | [optional] [default to null]
 **search_value** | **STRING_32**| The value to search for | [optional] [default to null]
 **asset_permission_type** | [**ASSET_PERMISSION_TYPE**](.md)| The type of asset permission to filter by | [optional] [default to null]
 **ad_account_statuses** | [**LIST [NON_DRAFT_ENTITY_STATUS]**](NON_DRAFT_ENTITY_STATUS.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BUSINESS_MEMBER_ASSETS_GET_RESPONSE**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_delete**
> business_members_asset_access_delete (business_id: STRING_32 ; business_members_asset_access_delete_body: BUSINESS_MEMBERS_ASSET_ACCESS_DELETE_BODY ): detachable DELETE_MEMBER_ACCESS_RESULTS_RESPONSE_ARRAY


Delete member access to asset

Terminate multiple members' access to an asset.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **business_members_asset_access_delete_body** | [**BUSINESS_MEMBERS_ASSET_ACCESS_DELETE_BODY**](BUSINESS_MEMBERS_ASSET_ACCESS_DELETE_BODY.md)|  | 

### Return type

[**DELETE_MEMBER_ACCESS_RESULTS_RESPONSE_ARRAY**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_update**
> business_members_asset_access_update (business_id: STRING_32 ; update_member_asset_access_body: UPDATE_MEMBER_ASSET_ACCESS_BODY ): detachable UPDATE_MEMBER_ASSETS_RESULTS_RESPONSE_ARRAY


Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **update_member_asset_access_body** | [**UPDATE_MEMBER_ASSET_ACCESS_BODY**](UPDATE_MEMBER_ASSET_ACCESS_BODY.md)|  | 

### Return type

[**UPDATE_MEMBER_ASSETS_RESULTS_RESPONSE_ARRAY**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_partner_asset_access_get**
> business_partner_asset_access_get (business_id: STRING_32 ; partner_id: STRING_32 ; partner_type:  detachable STRING_32 ; asset_type:  detachable STRING_32 ; start_index:  detachable INTEGER_32 ; sort_by:  detachable ASSET_SORT_BY ; sort_ascending:  detachable BOOLEAN ; search_by:  detachable ASSET_SEARCH_BY ; search_value:  detachable STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable BUSINESS_PARTNER_ASSET_ACCESS_GET_200_RESPONSE


Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **partner_id** | **STRING_32**| The partner id to be bound to the Business | [default to null]
 **partner_type** | **STRING_32**| Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to INTERNAL]
 **asset_type** | **STRING_32**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT]
 **start_index** | **INTEGER_32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_by** | [**ASSET_SORT_BY**](.md)| The field to sort member assets by | [optional] [default to null]
 **sort_ascending** | **BOOLEAN**| Sort assets in ascending order | [optional] [default to true]
 **search_by** | [**ASSET_SEARCH_BY**](.md)| The field to search member assets by | [optional] [default to null]
 **search_value** | **STRING_32**| The value to search for | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BUSINESS_PARTNER_ASSET_ACCESS_GET_200_RESPONSE**](business_partner_asset_access_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_partner_asset_access_handler_impl**
> delete_partner_asset_access_handler_impl (business_id: STRING_32 ; delete_partner_asset_access_body: DELETE_PARTNER_ASSET_ACCESS_BODY ): detachable DELETE_PARTNER_ASSET_ACCESS_RESULTS_RESPONSE_ARRAY


Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **delete_partner_asset_access_body** | [**DELETE_PARTNER_ASSET_ACCESS_BODY**](DELETE_PARTNER_ASSET_ACCESS_BODY.md)|  | 

### Return type

[**DELETE_PARTNER_ASSET_ACCESS_RESULTS_RESPONSE_ARRAY**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_partner_asset_access_handler_impl**
> update_partner_asset_access_handler_impl (business_id: STRING_32 ; update_partner_asset_access_body: UPDATE_PARTNER_ASSET_ACCESS_BODY ): detachable UPDATE_PARTNER_ASSETS_RESULTS_RESPONSE_ARRAY


Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **update_partner_asset_access_body** | [**UPDATE_PARTNER_ASSET_ACCESS_BODY**](UPDATE_PARTNER_ASSET_ACCESS_BODY.md)|  | 

### Return type

[**UPDATE_PARTNER_ASSETS_RESULTS_RESPONSE_ARRAY**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

