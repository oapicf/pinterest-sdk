# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetGroup/create**](BusinessAccessAssetsApi.md#assetGroup/create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**assetGroup/delete**](BusinessAccessAssetsApi.md#assetGroup/delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**assetGroup/update**](BusinessAccessAssetsApi.md#assetGroup/update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**businessAssetMembers/get**](BusinessAccessAssetsApi.md#businessAssetMembers/get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**businessAssetPartners/get**](BusinessAccessAssetsApi.md#businessAssetPartners/get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**businessAssets/get**](BusinessAccessAssetsApi.md#businessAssets/get) | **GET** /businesses/{business_id}/assets | List business assets |
| [**businessMemberAssets/get**](BusinessAccessAssetsApi.md#businessMemberAssets/get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**businessMembersAssetAccess/delete**](BusinessAccessAssetsApi.md#businessMembersAssetAccess/delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**businessMembersAssetAccess/update**](BusinessAccessAssetsApi.md#businessMembersAssetAccess/update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**businessPartnerAssetAccess/get**](BusinessAccessAssetsApi.md#businessPartnerAssetAccess/get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |


<a name="assetGroup/create"></a>
# **assetGroup/create**
> AssetGroupInput assetGroup/create(business\_id, AssetGroupInputCreate)

Create a new asset group.

    Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **AssetGroupInputCreate** | [**AssetGroupInputCreate**](../Models/AssetGroupInputCreate.md)|  | |

### Return type

[**AssetGroupInput**](../Models/AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="assetGroup/delete"></a>
# **assetGroup/delete**
> AssetGroupDeletion assetGroup/delete(business\_id, AssetGroupDeletionDelete)

Delete asset groups.

    Delete a batch of asset groups.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **AssetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](../Models/AssetGroupDeletionDelete.md)|  | |

### Return type

[**AssetGroupDeletion**](../Models/AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="assetGroup/update"></a>
# **assetGroup/update**
> AssetGroupModification assetGroup/update(business\_id, AssetGroupModificationReadOrUpdate)

Update asset groups.

    Update a batch of asset groups with the specified parameters.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **AssetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](../Models/AssetGroupModificationReadOrUpdate.md)|  | |

### Return type

[**AssetGroupModification**](../Models/AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="businessAssetMembers/get"></a>
# **businessAssetMembers/get**
> business_asset_members_get_200_response businessAssetMembers/get(business\_id, asset\_id, start\_index, fetch\_system\_users, bookmark, page\_size)

Get members with access to asset

    Get all the members the requesting business has granted access to on the given asset.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **asset\_id** | **String**| Unique identifier of a business asset. | [default to null] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **fetch\_system\_users** | **Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**business_asset_members_get_200_response**](../Models/business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="businessAssetPartners/get"></a>
# **businessAssetPartners/get**
> business_asset_members_get_200_response businessAssetPartners/get(business\_id, asset\_id, start\_index, bookmark, page\_size)

Get partners with access to asset

    Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **asset\_id** | **String**| Unique identifier of a business asset. | [default to null] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**business_asset_members_get_200_response**](../Models/business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="businessAssets/get"></a>
# **businessAssets/get**
> business_assets_get_200_response businessAssets/get(business\_id, permissions, child\_asset\_id, asset\_group\_id, asset\_type, start\_index, bookmark, page\_size)

List business assets

    Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **permissions** | [**List**](../Models/PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] [default to null] |
| **child\_asset\_id** | **String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] [default to null] |
| **asset\_group\_id** | **String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] [default to null] |
| **asset\_type** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**business_assets_get_200_response**](../Models/business_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="businessMemberAssets/get"></a>
# **businessMemberAssets/get**
> BusinessMemberAssetsGetResponse businessMemberAssets/get(business\_id, member\_id, asset\_type, start\_index, sort\_by, sort\_ascending, search\_by, search\_value, asset\_permission\_type, ad\_account\_statuses, bookmark, page\_size)

Get assets assigned to a member

    Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **member\_id** | **String**| The member id to fetch assets for. | [default to null] |
| **asset\_type** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sort\_by** | [**AssetSortBy**](../Models/.md)| The field to sort member assets by | [optional] [default to null] [enum: NAME, ID, PERMISSIONS] |
| **sort\_ascending** | **Boolean**| Sort assets in ascending order | [optional] [default to true] |
| **search\_by** | [**AssetSearchBy**](../Models/.md)| The field to search member assets by | [optional] [default to null] [enum: NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER] |
| **search\_value** | **String**| The value to search for | [optional] [default to null] |
| **asset\_permission\_type** | [**AssetPermissionType**](../Models/.md)| The type of asset permission to filter by | [optional] [default to null] [enum: AGGREGATED_PERMISSION, DIRECT_PERMISSION] |
| **ad\_account\_statuses** | [**List**](../Models/NonDraftEntityStatus.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessMemberAssetsGetResponse**](../Models/BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="businessMembersAssetAccess/delete"></a>
# **businessMembersAssetAccess/delete**
> DeleteMemberAccessResultsResponseArray businessMembersAssetAccess/delete(business\_id, BusinessMembersAssetAccessDeleteBody)

Delete member access to asset

    Terminate multiple members&#39; access to an asset.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **BusinessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](../Models/BusinessMembersAssetAccessDeleteBody.md)|  | |

### Return type

[**DeleteMemberAccessResultsResponseArray**](../Models/DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="businessMembersAssetAccess/update"></a>
# **businessMembersAssetAccess/update**
> UpdateMemberAssetsResultsResponseArray businessMembersAssetAccess/update(business\_id, UpdateMemberAssetAccessBody)

Assign/Update member asset permissions

    Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **UpdateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](../Models/UpdateMemberAssetAccessBody.md)|  | |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](../Models/UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="businessPartnerAssetAccess/get"></a>
# **businessPartnerAssetAccess/get**
> business_partner_asset_access_get_200_response businessPartnerAssetAccess/get(business\_id, partner\_id, partner\_type, asset\_type, start\_index, sort\_by, sort\_ascending, search\_by, search\_value, bookmark, page\_size)

Get assets assigned to a partner or assets assigned by a partner

    Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **partner\_id** | **String**| The partner id to be bound to the Business | [default to null] |
| **partner\_type** | **String**| Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to INTERNAL] [enum: INTERNAL, EXTERNAL] |
| **asset\_type** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] [enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT] |
| **start\_index** | **Integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sort\_by** | [**AssetSortBy**](../Models/.md)| The field to sort member assets by | [optional] [default to null] [enum: NAME, ID, PERMISSIONS] |
| **sort\_ascending** | **Boolean**| Sort assets in ascending order | [optional] [default to true] |
| **search\_by** | [**AssetSearchBy**](../Models/.md)| The field to search member assets by | [optional] [default to null] [enum: NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER] |
| **search\_value** | **String**| The value to search for | [optional] [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**business_partner_asset_access_get_200_response**](../Models/business_partner_asset_access_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deletePartnerAssetAccessHandlerImpl"></a>
# **deletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(business\_id, DeletePartnerAssetAccessBody)

Delete partner access to asset

    Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **DeletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](../Models/DeletePartnerAssetAccessBody.md)|  | |

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](../Models/DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updatePartnerAssetAccessHandlerImpl"></a>
# **updatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(business\_id, UpdatePartnerAssetAccessBody)

Assign/Update partner asset permissions

    Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **UpdatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](../Models/UpdatePartnerAssetAccessBody.md)|  | |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](../Models/UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

