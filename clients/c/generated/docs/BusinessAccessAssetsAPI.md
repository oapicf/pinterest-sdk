# BusinessAccessAssetsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BusinessAccessAssetsAPI_assetGroupCreate**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**BusinessAccessAssetsAPI_assetGroupDelete**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**BusinessAccessAssetsAPI_assetGroupUpdate**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**BusinessAccessAssetsAPI_businessAssetMembersGet**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**BusinessAccessAssetsAPI_businessAssetPartnersGet**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**BusinessAccessAssetsAPI_businessAssetsGet**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**BusinessAccessAssetsAPI_businessMemberAssetsGet**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**BusinessAccessAssetsAPI_businessMembersAssetAccessDelete**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**BusinessAccessAssetsAPI_businessMembersAssetAccessUpdate**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**BusinessAccessAssetsAPI_businessPartnerAssetAccessGet**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**BusinessAccessAssetsAPI_updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsAPI.md#BusinessAccessAssetsAPI_updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **BusinessAccessAssetsAPI_assetGroupCreate**
```c
// Create a new asset group.
//
// Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.
//
create_asset_group_response_t* BusinessAccessAssetsAPI_assetGroupCreate(apiClient_t *apiClient, char *business_id, create_asset_group_body_t *create_asset_group_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**create_asset_group_body** | **[create_asset_group_body_t](create_asset_group_body.md) \*** |  | 

### Return type

[create_asset_group_response_t](create_asset_group_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_assetGroupDelete**
```c
// Delete asset groups.
//
// Delete a batch of asset groups.
//
delete_asset_group_response_t* BusinessAccessAssetsAPI_assetGroupDelete(apiClient_t *apiClient, char *business_id, delete_asset_group_body_t *delete_asset_group_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**delete_asset_group_body** | **[delete_asset_group_body_t](delete_asset_group_body.md) \*** |  | 

### Return type

[delete_asset_group_response_t](delete_asset_group_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_assetGroupUpdate**
```c
// Update asset groups.
//
// Update a batch of asset groups with the specified parameters.
//
update_asset_group_response_t* BusinessAccessAssetsAPI_assetGroupUpdate(apiClient_t *apiClient, char *business_id, update_asset_group_body_t *update_asset_group_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**update_asset_group_body** | **[update_asset_group_body_t](update_asset_group_body.md) \*** |  | 

### Return type

[update_asset_group_response_t](update_asset_group_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessAssetMembersGet**
```c
// Get members with access to asset
//
// Get all the members the requesting business has granted access to on the given asset.
//
business_asset_members_get_200_response_t* BusinessAccessAssetsAPI_businessAssetMembersGet(apiClient_t *apiClient, char *business_id, char *asset_id, char *bookmark, int *page_size, int *start_index);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**asset_id** | **char \*** | Unique identifier of a business asset. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

### Return type

[business_asset_members_get_200_response_t](business_asset_members_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessAssetPartnersGet**
```c
// Get partners with access to asset
//
// Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
//
business_asset_partners_get_200_response_t* BusinessAccessAssetsAPI_businessAssetPartnersGet(apiClient_t *apiClient, char *business_id, char *asset_id, int *start_index, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**asset_id** | **char \*** | Unique identifier of a business asset. | 
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[business_asset_partners_get_200_response_t](business_asset_partners_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessAssetsGet**
```c
// List business assets
//
// Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
//
business_assets_get_200_response_t* BusinessAccessAssetsAPI_businessAssetsGet(apiClient_t *apiClient, char *business_id, list_t *permissions, char *child_asset_id, char *asset_group_id, pinterest_rest_api_businessAssetsGet_asset_type_e asset_type, int *start_index, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**permissions** | **[list_t](permissions_with_owner.md) \*** | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
**child_asset_id** | **char \*** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
**asset_group_id** | **char \*** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
**asset_type** | **pinterest_rest_api_businessAssetsGet_asset_type_e** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[business_assets_get_200_response_t](business_assets_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessMemberAssetsGet**
```c
// Get assets assigned to a member
//
// Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
//
business_member_assets_get_200_response_t* BusinessAccessAssetsAPI_businessMemberAssetsGet(apiClient_t *apiClient, char *business_id, char *member_id, pinterest_rest_api_businessMemberAssetsGet_asset_type_e asset_type, int *start_index, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**member_id** | **char \*** | The member id to fetch assets for. | 
**asset_type** | **pinterest_rest_api_businessMemberAssetsGet_asset_type_e** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[business_member_assets_get_200_response_t](business_member_assets_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessMembersAssetAccessDelete**
```c
// Delete member access to asset
//
// Terminate multiple members' access to an asset.
//
delete_member_access_results_response_array_t* BusinessAccessAssetsAPI_businessMembersAssetAccessDelete(apiClient_t *apiClient, char *business_id, business_members_asset_access_delete_request_t *business_members_asset_access_delete_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**business_members_asset_access_delete_request** | **[business_members_asset_access_delete_request_t](business_members_asset_access_delete_request.md) \*** | List member assset permissions to delete. | 

### Return type

[delete_member_access_results_response_array_t](delete_member_access_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessMembersAssetAccessUpdate**
```c
// Assign/Update member asset permissions
//
// Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
//
update_member_assets_results_response_array_t* BusinessAccessAssetsAPI_businessMembersAssetAccessUpdate(apiClient_t *apiClient, char *business_id, update_member_asset_access_body_t *update_member_asset_access_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**update_member_asset_access_body** | **[update_member_asset_access_body_t](update_member_asset_access_body.md) \*** | List of member asset permissions to create or update. | 

### Return type

[update_member_assets_results_response_array_t](update_member_assets_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_businessPartnerAssetAccessGet**
```c
// Get assets assigned to a partner or assets assigned by a partner
//
// Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.
//
business_partner_asset_access_get_200_response_t* BusinessAccessAssetsAPI_businessPartnerAssetAccessGet(apiClient_t *apiClient, char *business_id, char *partner_id, partner_type_t *partner_type, pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e asset_type, int *start_index, int *page_size, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**partner_id** | **char \*** | The partner id to be bound to the Business | 
**partner_type** | **[partner_type_t](.md) \*** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
**asset_type** | **pinterest_rest_api_businessPartnerAssetAccessGet_asset_type_e** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
**start_index** | **int \*** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[business_partner_asset_access_get_200_response_t](business_partner_asset_access_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl**
```c
// Delete partner access to asset
//
// Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.
//
delete_partner_assets_results_response_array_t* BusinessAccessAssetsAPI_deletePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, delete_partner_asset_access_body_t *delete_partner_asset_access_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**delete_partner_asset_access_body** | **[delete_partner_asset_access_body_t](delete_partner_asset_access_body.md) \*** |  | 

### Return type

[delete_partner_assets_results_response_array_t](delete_partner_assets_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessAssetsAPI_updatePartnerAssetAccessHandlerImpl**
```c
// Assign/Update partner asset permissions
//
// Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
//
update_partner_assets_results_response_array_t* BusinessAccessAssetsAPI_updatePartnerAssetAccessHandlerImpl(apiClient_t *apiClient, char *business_id, update_partner_asset_access_body_t *update_partner_asset_access_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**update_partner_asset_access_body** | **[update_partner_asset_access_body_t](update_partner_asset_access_body.md) \*** | A list of assets and permissions to assign to your partners. | 

### Return type

[update_partner_assets_results_response_array_t](update_partner_assets_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

