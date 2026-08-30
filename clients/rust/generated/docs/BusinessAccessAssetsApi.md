# \BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_group_slash_create**](BusinessAccessAssetsApi.md#asset_group_slash_create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**asset_group_slash_delete**](BusinessAccessAssetsApi.md#asset_group_slash_delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**asset_group_slash_update**](BusinessAccessAssetsApi.md#asset_group_slash_update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**business_asset_members_slash_get**](BusinessAccessAssetsApi.md#business_asset_members_slash_get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**business_asset_partners_slash_get**](BusinessAccessAssetsApi.md#business_asset_partners_slash_get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**business_assets_slash_get**](BusinessAccessAssetsApi.md#business_assets_slash_get) | **GET** /businesses/{business_id}/assets | List business assets
[**business_member_assets_slash_get**](BusinessAccessAssetsApi.md#business_member_assets_slash_get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**business_members_asset_access_slash_delete**](BusinessAccessAssetsApi.md#business_members_asset_access_slash_delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**business_members_asset_access_slash_update**](BusinessAccessAssetsApi.md#business_members_asset_access_slash_update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**business_partner_asset_access_slash_get**](BusinessAccessAssetsApi.md#business_partner_asset_access_slash_get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**delete_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#delete_partner_asset_access_handler_impl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**update_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#update_partner_asset_access_handler_impl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions



## asset_group_slash_create

> models::AssetGroupInput asset_group_slash_create(business_id, asset_group_input_create)
Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_group_input_create** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md) |  | [required] |

### Return type

[**models::AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## asset_group_slash_delete

> models::AssetGroupDeletion asset_group_slash_delete(business_id, asset_group_deletion_delete)
Delete asset groups.

Delete a batch of asset groups.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_group_deletion_delete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md) |  | [required] |

### Return type

[**models::AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## asset_group_slash_update

> models::AssetGroupModification asset_group_slash_update(business_id, asset_group_modification_read_or_update)
Update asset groups.

Update a batch of asset groups with the specified parameters.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_group_modification_read_or_update** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md) |  | [required] |

### Return type

[**models::AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_asset_members_slash_get

> models::BusinessAssetMembersGet200Response business_asset_members_slash_get(business_id, asset_id, start_index, fetch_system_users, bookmark, page_size)
Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_id** | **String** | Unique identifier of a business asset. | [required] |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**fetch_system_users** | Option<**bool**> | Fetches system users if True. Fetches regular user employees if False. |  |[default to false]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_asset_partners_slash_get

> models::BusinessAssetMembersGet200Response business_asset_partners_slash_get(business_id, asset_id, start_index, bookmark, page_size)
Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_id** | **String** | Unique identifier of a business asset. | [required] |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_assets_slash_get

> models::BusinessAssetsGet200Response business_assets_slash_get(business_id, permissions, child_asset_id, asset_group_id, asset_type, start_index, bookmark, page_size)
List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**permissions** | Option<[**Vec<models::PermissionsWithOwner>**](Models__PermissionsWithOwner.md)> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. |  |
**child_asset_id** | Option<**String**> | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. |  |
**asset_group_id** | Option<**String**> | An asset group unique identifier. Used to fetch assets contained within the specified asset group. |  |
**asset_type** | Option<**String**> | A resource type to filter the assets by. Only assets of the specified type will be returned. |  |[default to AD_ACCOUNT]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::BusinessAssetsGet200Response**](business_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_member_assets_slash_get

> models::BusinessMemberAssetsGetResponse business_member_assets_slash_get(business_id, member_id, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, asset_permission_type, ad_account_statuses, bookmark, page_size)
Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**member_id** | **String** | The member id to fetch assets for. | [required] |
**asset_type** | Option<**String**> | A resource type to filter the assets by. Only assets of the specified type will be returned. |  |[default to AD_ACCOUNT]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**sort_by** | Option<[**AssetSortBy**](AssetSortBy.md)> | The field to sort member assets by |  |
**sort_ascending** | Option<**bool**> | Sort assets in ascending order |  |[default to true]
**search_by** | Option<[**AssetSearchBy**](AssetSearchBy.md)> | The field to search member assets by |  |
**search_value** | Option<**String**> | The value to search for |  |
**asset_permission_type** | Option<[**AssetPermissionType**](AssetPermissionType.md)> | The type of asset permission to filter by |  |
**ad_account_statuses** | Option<[**Vec<models::NonDraftEntityStatus>**](Models__NonDraftEntityStatus.md)> | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_members_asset_access_slash_delete

> models::DeleteMemberAccessResultsResponseArray business_members_asset_access_slash_delete(business_id, business_members_asset_access_delete_body)
Delete member access to asset

Terminate multiple members' access to an asset.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**business_members_asset_access_delete_body** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md) |  | [required] |

### Return type

[**models::DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_members_asset_access_slash_update

> models::UpdateMemberAssetsResultsResponseArray business_members_asset_access_slash_update(business_id, update_member_asset_access_body)
Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) |  | [required] |

### Return type

[**models::UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_partner_asset_access_slash_get

> models::BusinessPartnerAssetAccessGet200Response business_partner_asset_access_slash_get(business_id, partner_id, partner_type, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, bookmark, page_size)
Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**partner_id** | **String** | The partner id to be bound to the Business | [required] |
**partner_type** | Option<**String**> | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. |  |[default to INTERNAL]
**asset_type** | Option<**String**> | A resource type to filter the assets by. Only assets of the specified type will be returned. |  |[default to AD_ACCOUNT]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**sort_by** | Option<[**AssetSortBy**](AssetSortBy.md)> | The field to sort member assets by |  |
**sort_ascending** | Option<**bool**> | Sort assets in ascending order |  |[default to true]
**search_by** | Option<[**AssetSearchBy**](AssetSearchBy.md)> | The field to search member assets by |  |
**search_value** | Option<**String**> | The value to search for |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::BusinessPartnerAssetAccessGet200Response**](business_partner_asset_access_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_partner_asset_access_handler_impl

> models::DeletePartnerAssetAccessResultsResponseArray delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)
Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**delete_partner_asset_access_body** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  | [required] |

### Return type

[**models::DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## update_partner_asset_access_handler_impl

> models::UpdatePartnerAssetsResultsResponseArray update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body)
Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) |  | [required] |

### Return type

[**models::UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

