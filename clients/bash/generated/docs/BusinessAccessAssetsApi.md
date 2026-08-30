# BusinessAccessAssetsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetGroupCreate**](BusinessAccessAssetsApi.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**assetGroupDelete**](BusinessAccessAssetsApi.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**assetGroupUpdate**](BusinessAccessAssetsApi.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**businessAssetMembersGet**](BusinessAccessAssetsApi.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**businessAssetPartnersGet**](BusinessAccessAssetsApi.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**businessAssetsGet**](BusinessAccessAssetsApi.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**businessMemberAssetsGet**](BusinessAccessAssetsApi.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**businessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**businessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**businessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions



## assetGroupCreate

Create a new asset group.

Create a new asset group with the specified parameters.
- An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example

```bash
 assetGroupCreate business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetGroupInputCreate** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md) |  |

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetGroupDelete

Delete asset groups.

Delete a batch of asset groups.

### Example

```bash
 assetGroupDelete business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md) |  |

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## assetGroupUpdate

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example

```bash
 assetGroupUpdate business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md) |  |

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessAssetMembersGet

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

```bash
 businessAssetMembersGet business_id=value asset_id=value  start_index=value  fetch_system_users=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetId** | **string** | Unique identifier of a business asset. | [default to null]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **fetchSystemUsers** | **boolean** | Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessAssetPartnersGet

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset.
Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with
you cannot be shared with a different partner.

### Example

```bash
 businessAssetPartnersGet business_id=value asset_id=value  start_index=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **assetId** | **string** | Unique identifier of a business asset. | [default to null]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessAssetsGet

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```bash
 businessAssetsGet business_id=value  Specify as:  permissions=value1 permissions=value2 permissions=...  child_asset_id=value  asset_group_id=value  asset_type=value  start_index=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **permissions** | [**array[PermissionsWithOwner]**](PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] [default to null]
 **childAssetId** | **string** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] [default to null]
 **assetGroupId** | **string** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] [default to null]
 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessMemberAssetsGet

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to:
- get all assets, regardless of asset type or
- get assets of one asset type by using the asset_type query.
The return response will include the permissions the member has to that asset and the asset type.

### Example

```bash
 businessMemberAssetsGet business_id=value member_id=value  asset_type=value  start_index=value  sort_by=value  sort_ascending=value  search_by=value  search_value=value  asset_permission_type=value  Specify as:  ad_account_statuses=value1 ad_account_statuses=value2 ad_account_statuses=...  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **memberId** | **string** | The member id to fetch assets for. | [default to null]
 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortBy** | [**AssetSortBy**](.md) | The field to sort member assets by | [optional] [default to null]
 **sortAscending** | **boolean** | Sort assets in ascending order | [optional] [default to true]
 **searchBy** | [**AssetSearchBy**](.md) | The field to search member assets by | [optional] [default to null]
 **searchValue** | **string** | The value to search for | [optional] [default to null]
 **assetPermissionType** | [**AssetPermissionType**](.md) | The type of asset permission to filter by | [optional] [default to null]
 **adAccountStatuses** | [**array[NonDraftEntityStatus]**](NonDraftEntityStatus.md) | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessMembersAssetAccessDelete

Delete member access to asset

Terminate multiple members' access to an asset.

### Example

```bash
 businessMembersAssetAccessDelete business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **businessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md) |  |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessMembersAssetAccessUpdate

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset.
Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```bash
 businessMembersAssetAccessUpdate business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) |  |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## businessPartnerAssetAccessGet

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have
granted your partner access to. If you specify:
- partner_type=INTERNAL, you will retrieve your business assets that the partner has access to.
- partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example

```bash
 businessPartnerAssetAccessGet business_id=value partner_id=value  partner_type=value  asset_type=value  start_index=value  sort_by=value  sort_ascending=value  search_by=value  search_value=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **partnerId** | **string** | The partner id to be bound to the Business | [default to null]
 **partnerType** | **string** | Specifies whether to fetch internal or external (shared) partners.

If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.

If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. | [optional] [default to INTERNAL]
 **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT]
 **startIndex** | **integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortBy** | [**AssetSortBy**](.md) | The field to sort member assets by | [optional] [default to null]
 **sortAscending** | **boolean** | Sort assets in ascending order | [optional] [default to true]
 **searchBy** | [**AssetSearchBy**](.md) | The field to search member assets by | [optional] [default to null]
 **searchValue** | **string** | The value to search for | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deletePartnerAssetAccessHandlerImpl

Delete partner access to asset

Terminate multiple partners' access to an asset. If
- partner_type=INTERNAL: You will terminate a partner's asset access to your business assets.
- partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example

```bash
 deletePartnerAssetAccessHandlerImpl business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  |

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updatePartnerAssetAccessHandlerImpl

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset.
If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them.
To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview

Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be
applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of
the type PROFILE.

### Example

```bash
 updatePartnerAssetAccessHandlerImpl business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) |  |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

