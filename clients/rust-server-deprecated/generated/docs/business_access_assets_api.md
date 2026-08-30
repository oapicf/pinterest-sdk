# business_access_assets_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**asset_group/create**](business_access_assets_api.md#asset_group/create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
**asset_group/delete**](business_access_assets_api.md#asset_group/delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
**asset_group/update**](business_access_assets_api.md#asset_group/update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
**business_assets/get**](business_access_assets_api.md#business_assets/get) | **GET** /businesses/{business_id}/assets | List business assets
**business_members_asset_access/delete**](business_access_assets_api.md#business_members_asset_access/delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
**business_members_asset_access/update**](business_access_assets_api.md#business_members_asset_access/update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
**delete_partner_asset_access_handler_impl**](business_access_assets_api.md#delete_partner_asset_access_handler_impl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
**update_partner_asset_access_handler_impl**](business_access_assets_api.md#update_partner_asset_access_handler_impl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions
**business_asset_members/get**](business_access_assets_api.md#business_asset_members/get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
**business_asset_partners/get**](business_access_assets_api.md#business_asset_partners/get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
**business_member_assets/get**](business_access_assets_api.md#business_member_assets/get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
**business_partner_asset_access/get**](business_access_assets_api.md#business_partner_asset_access/get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner


# **asset_group/create**
> models::AssetGroupInput asset_group/create(ctx, business_id, asset_group_input_create)
Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **asset_group_input_create** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md)|  | 

### Return type

[**models::AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group/delete**
> models::AssetGroupDeletion asset_group/delete(ctx, business_id, asset_group_deletion_delete)
Delete asset groups.

Delete a batch of asset groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **asset_group_deletion_delete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md)|  | 

### Return type

[**models::AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group/update**
> models::AssetGroupModification asset_group/update(ctx, business_id, asset_group_modification_read_or_update)
Update asset groups.

Update a batch of asset groups with the specified parameters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **asset_group_modification_read_or_update** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md)|  | 

### Return type

[**models::AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_assets/get**
> models::BusinessAssetsGet200Response business_assets/get(ctx, business_id, optional)
List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **permissions** | [**models::PermissionsWithOwner**](models::PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | 
 **child_asset_id** | **String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | 
 **asset_group_id** | **String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | 
 **asset_type** | [****](.md)| A resource type to filter the assets by. Only assets of the specified type will be returned. | 
 **start_index** | **i32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::BusinessAssetsGet200Response**](business_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access/delete**
> models::DeleteMemberAccessResultsResponseArray business_members_asset_access/delete(ctx, business_id, business_members_asset_access_delete_body)
Delete member access to asset

Terminate multiple members' access to an asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **business_members_asset_access_delete_body** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md)|  | 

### Return type

[**models::DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access/update**
> models::UpdateMemberAssetsResultsResponseArray business_members_asset_access/update(ctx, business_id, update_member_asset_access_body)
Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)|  | 

### Return type

[**models::UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_partner_asset_access_handler_impl**
> models::DeletePartnerAssetAccessResultsResponseArray delete_partner_asset_access_handler_impl(ctx, business_id, delete_partner_asset_access_body)
Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **delete_partner_asset_access_body** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  | 

### Return type

[**models::DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_partner_asset_access_handler_impl**
> models::UpdatePartnerAssetsResultsResponseArray update_partner_asset_access_handler_impl(ctx, business_id, update_partner_asset_access_body)
Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)|  | 

### Return type

[**models::UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_members/get**
> models::BusinessAssetMembersGet200Response business_asset_members/get(ctx, business_id, asset_id, optional)
Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **asset_id** | **String**| Unique identifier of a business asset. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **asset_id** | **String**| Unique identifier of a business asset. | 
 **start_index** | **i32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **fetch_system_users** | **bool**| Fetches system users if True. Fetches regular user employees if False. | [default to false]
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_partners/get**
> models::BusinessAssetMembersGet200Response business_asset_partners/get(ctx, business_id, asset_id, optional)
Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **asset_id** | **String**| Unique identifier of a business asset. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **asset_id** | **String**| Unique identifier of a business asset. | 
 **start_index** | **i32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_member_assets/get**
> models::BusinessMemberAssetsGetResponse business_member_assets/get(ctx, business_id, member_id, optional)
Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **member_id** | **String**| The member id to fetch assets for. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **member_id** | **String**| The member id to fetch assets for. | 
 **asset_type** | [****](.md)| A resource type to filter the assets by. Only assets of the specified type will be returned. | 
 **start_index** | **i32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **sort_by** | [****](.md)| The field to sort member assets by | 
 **sort_ascending** | **bool**| Sort assets in ascending order | [default to true]
 **search_by** | [****](.md)| The field to search member assets by | 
 **search_value** | **String**| The value to search for | 
 **asset_permission_type** | [****](.md)| The type of asset permission to filter by | 
 **ad_account_statuses** | [**models::NonDraftEntityStatus**](models::NonDraftEntityStatus.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_partner_asset_access/get**
> models::BusinessPartnerAssetAccessGet200Response business_partner_asset_access/get(ctx, business_id, partner_id, optional)
Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **partner_id** | **String**| The partner id to be bound to the Business | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **partner_id** | **String**| The partner id to be bound to the Business | 
 **partner_type** | [****](.md)| Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. | 
 **asset_type** | [****](.md)| A resource type to filter the assets by. Only assets of the specified type will be returned. | 
 **start_index** | **i32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **sort_by** | [****](.md)| The field to sort member assets by | 
 **sort_ascending** | **bool**| Sort assets in ascending order | [default to true]
 **search_by** | [****](.md)| The field to search member assets by | 
 **search_value** | **String**| The value to search for | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::BusinessPartnerAssetAccessGet200Response**](business_partner_asset_access_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

