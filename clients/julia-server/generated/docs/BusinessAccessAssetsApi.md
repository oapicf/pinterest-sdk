# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_group_create**](BusinessAccessAssetsApi.md#asset_group_create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**asset_group_delete**](BusinessAccessAssetsApi.md#asset_group_delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**asset_group_update**](BusinessAccessAssetsApi.md#asset_group_update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**business_asset_members_get**](BusinessAccessAssetsApi.md#business_asset_members_get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**business_asset_partners_get**](BusinessAccessAssetsApi.md#business_asset_partners_get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**business_assets_get**](BusinessAccessAssetsApi.md#business_assets_get) | **GET** /businesses/{business_id}/assets | List business assets
[**business_member_assets_get**](BusinessAccessAssetsApi.md#business_member_assets_get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**business_members_asset_access_delete**](BusinessAccessAssetsApi.md#business_members_asset_access_delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**business_members_asset_access_update**](BusinessAccessAssetsApi.md#business_members_asset_access_update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**business_partner_asset_access_get**](BusinessAccessAssetsApi.md#business_partner_asset_access_get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**delete_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#delete_partner_asset_access_handler_impl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**update_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#update_partner_asset_access_handler_impl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **asset_group_create**
> `asset_group_create`(req::`HTTP.Request`, `business_id`::`String`, `asset_group_input_create`::`AssetGroupInputCreate`;) -> `AssetGroupInput`

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`asset_group_input_create`** | [**`AssetGroupInputCreate`**](AssetGroupInputCreate.md)|  |

### Return type

[**`AssetGroupInput`**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_delete**
> `asset_group_delete`(req::`HTTP.Request`, `business_id`::`String`, `asset_group_deletion_delete`::`AssetGroupDeletionDelete`;) -> `AssetGroupDeletion`

Delete asset groups.

Delete a batch of asset groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`asset_group_deletion_delete`** | [**`AssetGroupDeletionDelete`**](AssetGroupDeletionDelete.md)|  |

### Return type

[**`AssetGroupDeletion`**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_update**
> `asset_group_update`(req::`HTTP.Request`, `business_id`::`String`, `asset_group_modification_read_or_update`::`AssetGroupModificationReadOrUpdate`;) -> `AssetGroupModification`

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`asset_group_modification_read_or_update`** | [**`AssetGroupModificationReadOrUpdate`**](AssetGroupModificationReadOrUpdate.md)|  |

### Return type

[**`AssetGroupModification`**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_members_get**
> `business_asset_members_get`(req::`HTTP.Request`, `business_id`::`String`, `asset_id`::`String`; `start_index`=nothing, `fetch_system_users`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `BusinessAssetMembersGet200Response`

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`asset_id`** | **`String`**| Unique identifier of a business asset. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`fetch_system_users`** | **`Bool`**| Fetches system users if True. Fetches regular user employees if False. | [default to false]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BusinessAssetMembersGet200Response`**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_asset_partners_get**
> `business_asset_partners_get`(req::`HTTP.Request`, `business_id`::`String`, `asset_id`::`String`; `start_index`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `BusinessAssetMembersGet200Response`

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`asset_id`** | **`String`**| Unique identifier of a business asset. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BusinessAssetMembersGet200Response`**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_assets_get**
> `business_assets_get`(req::`HTTP.Request`, `business_id`::`String`; `permissions`=nothing, `child_asset_id`=nothing, `asset_group_id`=nothing, `asset_type`=nothing, `start_index`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `BusinessAssetsGet200Response`

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`permissions`** | [**`Vector{PermissionsWithOwner}`**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [default to nothing]
 **`child_asset_id`** | **`String`**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [default to nothing]
 **`asset_group_id`** | **`String`**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [default to nothing]
 **`asset_type`** | **`String`**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BusinessAssetsGet200Response`**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_member_assets_get**
> `business_member_assets_get`(req::`HTTP.Request`, `business_id`::`String`, `member_id`::`String`; `asset_type`=nothing, `start_index`=nothing, `sort_by`=nothing, `sort_ascending`=nothing, `search_by`=nothing, `search_value`=nothing, `asset_permission_type`=nothing, `ad_account_statuses`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `BusinessMemberAssetsGetResponse`

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`member_id`** | **`String`**| The member id to fetch assets for. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`asset_type`** | **`String`**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`sort_by`** | [**`AssetSortBy`**](.md)| The field to sort member assets by | [default to nothing]
 **`sort_ascending`** | **`Bool`**| Sort assets in ascending order | [default to true]
 **`search_by`** | [**`AssetSearchBy`**](.md)| The field to search member assets by | [default to nothing]
 **`search_value`** | **`String`**| The value to search for | [default to nothing]
 **`asset_permission_type`** | [**`AssetPermissionType`**](.md)| The type of asset permission to filter by | [default to nothing]
 **`ad_account_statuses`** | [**`Vector{NonDraftEntityStatus}`**](NonDraftEntityStatus.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BusinessMemberAssetsGetResponse`**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_delete**
> `business_members_asset_access_delete`(req::`HTTP.Request`, `business_id`::`String`, `business_members_asset_access_delete_body`::`BusinessMembersAssetAccessDeleteBody`;) -> `DeleteMemberAccessResultsResponseArray`

Delete member access to asset

Terminate multiple members' access to an asset.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`business_members_asset_access_delete_body`** | [**`BusinessMembersAssetAccessDeleteBody`**](BusinessMembersAssetAccessDeleteBody.md)|  |

### Return type

[**`DeleteMemberAccessResultsResponseArray`**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_update**
> `business_members_asset_access_update`(req::`HTTP.Request`, `business_id`::`String`, `update_member_asset_access_body`::`UpdateMemberAssetAccessBody`;) -> `UpdateMemberAssetsResultsResponseArray`

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`update_member_asset_access_body`** | [**`UpdateMemberAssetAccessBody`**](UpdateMemberAssetAccessBody.md)|  |

### Return type

[**`UpdateMemberAssetsResultsResponseArray`**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_partner_asset_access_get**
> `business_partner_asset_access_get`(req::`HTTP.Request`, `business_id`::`String`, `partner_id`::`String`; `partner_type`=nothing, `asset_type`=nothing, `start_index`=nothing, `sort_by`=nothing, `sort_ascending`=nothing, `search_by`=nothing, `search_value`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `BusinessPartnerAssetAccessGet200Response`

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`partner_id`** | **`String`**| The partner id to be bound to the Business |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`partner_type`** | **`String`**| Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [default to &quot;INTERNAL&quot;]
 **`asset_type`** | **`String`**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [default to &quot;AD_ACCOUNT&quot;]
 **`start_index`** | **`Int64`**| An index to start fetching the results from. Only the results starting from this index will be returned. | [default to 0]
 **`sort_by`** | [**`AssetSortBy`**](.md)| The field to sort member assets by | [default to nothing]
 **`sort_ascending`** | **`Bool`**| Sort assets in ascending order | [default to true]
 **`search_by`** | [**`AssetSearchBy`**](.md)| The field to search member assets by | [default to nothing]
 **`search_value`** | **`String`**| The value to search for | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`BusinessPartnerAssetAccessGet200Response`**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_partner_asset_access_handler_impl**
> `delete_partner_asset_access_handler_impl`(req::`HTTP.Request`, `business_id`::`String`, `delete_partner_asset_access_body`::`DeletePartnerAssetAccessBody`;) -> `DeletePartnerAssetAccessResultsResponseArray`

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`delete_partner_asset_access_body`** | [**`DeletePartnerAssetAccessBody`**](DeletePartnerAssetAccessBody.md)|  |

### Return type

[**`DeletePartnerAssetAccessResultsResponseArray`**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_partner_asset_access_handler_impl**
> `update_partner_asset_access_handler_impl`(req::`HTTP.Request`, `business_id`::`String`, `update_partner_asset_access_body`::`UpdatePartnerAssetAccessBody`;) -> `UpdatePartnerAssetsResultsResponseArray`

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`update_partner_asset_access_body`** | [**`UpdatePartnerAssetAccessBody`**](UpdatePartnerAssetAccessBody.md)|  |

### Return type

[**`UpdatePartnerAssetsResultsResponseArray`**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

