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

> models::CreateAssetGroupResponse asset_group_slash_create(business_id, create_asset_group_body)
Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**create_asset_group_body** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md) |  | [required] |

### Return type

[**models::CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## asset_group_slash_delete

> models::DeleteAssetGroupResponse asset_group_slash_delete(business_id, delete_asset_group_body)
Delete asset groups.

Delete a batch of asset groups.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**delete_asset_group_body** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md) |  | [required] |

### Return type

[**models::DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## asset_group_slash_update

> models::UpdateAssetGroupResponse asset_group_slash_update(business_id, update_asset_group_body)
Update asset groups.

Update a batch of asset groups with the specified parameters.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**update_asset_group_body** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md) |  | [required] |

### Return type

[**models::UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_asset_members_slash_get

> models::BusinessAssetMembersGet200Response business_asset_members_slash_get(business_id, asset_id, bookmark, page_size, start_index)
Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_id** | **String** | Unique identifier of a business asset. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]

### Return type

[**models::BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_asset_partners_slash_get

> models::BusinessAssetPartnersGet200Response business_asset_partners_slash_get(business_id, asset_id, start_index, bookmark, page_size)
Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**asset_id** | **String** | Unique identifier of a business asset. | [required] |
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::BusinessAssetPartnersGet200Response**](business_asset_partners_get_200_response.md)

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
**permissions** | Option<[**Vec<models::PermissionsWithOwner>**](models::PermissionsWithOwner.md)> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. |  |
**child_asset_id** | Option<**String**> | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. |  |
**asset_group_id** | Option<**String**> | An asset group unique identifier. Used to fetch assets contained within the specified asset group. |  |
**asset_type** | Option<**String**> | A resource type to filter the assets by. Only assets of the specified type will be returned. |  |[default to AD_ACCOUNT]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::BusinessAssetsGet200Response**](business_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_member_assets_slash_get

> models::BusinessMemberAssetsGet200Response business_member_assets_slash_get(business_id, member_id, asset_type, start_index, bookmark, page_size)
Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**member_id** | **String** | The member id to fetch assets for. | [required] |
**asset_type** | Option<**String**> | A resource type to filter the assets by. Only assets of the specified type will be returned. |  |[default to AD_ACCOUNT]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]

### Return type

[**models::BusinessMemberAssetsGet200Response**](business_member_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_members_asset_access_slash_delete

> models::DeleteMemberAccessResultsResponseArray business_members_asset_access_slash_delete(business_id, business_members_asset_access_delete_request)
Delete member access to asset

Terminate multiple members' access to an asset.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**business_members_asset_access_delete_request** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. | [required] |

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
**update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. | [required] |

### Return type

[**models::UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## business_partner_asset_access_slash_get

> models::BusinessPartnerAssetAccessGet200Response business_partner_asset_access_slash_get(business_id, partner_id, partner_type, asset_type, start_index, page_size, bookmark)
Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**partner_id** | **String** | The partner id to be bound to the Business | [required] |
**partner_type** | Option<[**models::PartnerType**](.md)> | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. |  |
**asset_type** | Option<**String**> | A resource type to filter the assets by. Only assets of the specified type will be returned. |  |[default to AD_ACCOUNT]
**start_index** | Option<**i32**> | An index to start fetching the results from. Only the results starting from this index will be returned. |  |[default to 0]
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::BusinessPartnerAssetAccessGet200Response**](business_partner_asset_access_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_partner_asset_access_handler_impl

> models::DeletePartnerAssetsResultsResponseArray delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)
Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**business_id** | **String** | Unique identifier of the requesting business. | [required] |
**delete_partner_asset_access_body** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  | [required] |

### Return type

[**models::DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

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
**update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. | [required] |

### Return type

[**models::UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

