# Org.OpenAPITools.Api.BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AssetGroupCreate**](BusinessAccessAssetsApi.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**AssetGroupDelete**](BusinessAccessAssetsApi.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**AssetGroupUpdate**](BusinessAccessAssetsApi.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**BusinessAssetMembersGet**](BusinessAccessAssetsApi.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**BusinessAssetPartnersGet**](BusinessAccessAssetsApi.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**BusinessAssetsGet**](BusinessAccessAssetsApi.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets |
| [**BusinessMemberAssetsGet**](BusinessAccessAssetsApi.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**BusinessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**BusinessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**BusinessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**DeletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**UpdatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |

<a id="assetgroupcreate"></a>
# **AssetGroupCreate**
> AssetGroupInput AssetGroupCreate (string businessId, AssetGroupInputCreate assetGroupInputCreate)

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetGroupInputCreate** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md) |  |  |

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="assetgroupdelete"></a>
# **AssetGroupDelete**
> AssetGroupDeletion AssetGroupDelete (string businessId, AssetGroupDeletionDelete assetGroupDeletionDelete)

Delete asset groups.

Delete a batch of asset groups.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md) |  |  |

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="assetgroupupdate"></a>
# **AssetGroupUpdate**
> AssetGroupModification AssetGroupUpdate (string businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate)

Update asset groups.

Update a batch of asset groups with the specified parameters.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md) |  |  |

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businessassetmembersget"></a>
# **BusinessAssetMembersGet**
> BusinessAssetMembersGet200Response BusinessAssetMembersGet (string businessId, string assetId, int startIndex = null, bool fetchSystemUsers = null, string bookmark = null, int pageSize = null)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetId** | **string** | Unique identifier of a business asset. |  |
| **startIndex** | **int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **fetchSystemUsers** | **bool** | Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false] |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businessassetpartnersget"></a>
# **BusinessAssetPartnersGet**
> BusinessAssetMembersGet200Response BusinessAssetPartnersGet (string businessId, string assetId, int startIndex = null, string bookmark = null, int pageSize = null)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **assetId** | **string** | Unique identifier of a business asset. |  |
| **startIndex** | **int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businessassetsget"></a>
# **BusinessAssetsGet**
> BusinessAssetsGet200Response BusinessAssetsGet (string businessId, List<PermissionsWithOwner> permissions = null, string childAssetId = null, string assetGroupId = null, string assetType = null, int startIndex = null, string bookmark = null, int pageSize = null)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **permissions** | [**List&lt;PermissionsWithOwner&gt;**](PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional]  |
| **childAssetId** | **string** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional]  |
| **assetGroupId** | **string** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional]  |
| **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] |
| **startIndex** | **int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businessmemberassetsget"></a>
# **BusinessMemberAssetsGet**
> BusinessMemberAssetsGetResponse BusinessMemberAssetsGet (string businessId, string memberId, string assetType = null, int startIndex = null, AssetSortBy sortBy = null, bool sortAscending = null, AssetSearchBy searchBy = null, string searchValue = null, AssetPermissionType assetPermissionType = null, List<NonDraftEntityStatus> adAccountStatuses = null, string bookmark = null, int pageSize = null)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **memberId** | **string** | The member id to fetch assets for. |  |
| **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] |
| **startIndex** | **int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sortBy** | **AssetSortBy** | The field to sort member assets by | [optional]  |
| **sortAscending** | **bool** | Sort assets in ascending order | [optional] [default to true] |
| **searchBy** | **AssetSearchBy** | The field to search member assets by | [optional]  |
| **searchValue** | **string** | The value to search for | [optional]  |
| **assetPermissionType** | **AssetPermissionType** | The type of asset permission to filter by | [optional]  |
| **adAccountStatuses** | [**List&lt;NonDraftEntityStatus&gt;**](NonDraftEntityStatus.md) | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businessmembersassetaccessdelete"></a>
# **BusinessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete (string businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody)

Delete member access to asset

Terminate multiple members' access to an asset.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **businessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md) |  |  |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businessmembersassetaccessupdate"></a>
# **BusinessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray BusinessMembersAssetAccessUpdate (string businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **updateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) |  |  |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="businesspartnerassetaccessget"></a>
# **BusinessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet (string businessId, string partnerId, string partnerType = null, string assetType = null, int startIndex = null, AssetSortBy sortBy = null, bool sortAscending = null, AssetSearchBy searchBy = null, string searchValue = null, string bookmark = null, int pageSize = null)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **partnerId** | **string** | The partner id to be bound to the Business |  |
| **partnerType** | **string** | Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to INTERNAL] |
| **assetType** | **string** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to AD_ACCOUNT] |
| **startIndex** | **int** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sortBy** | **AssetSortBy** | The field to sort member assets by | [optional]  |
| **sortAscending** | **bool** | Sort assets in ascending order | [optional] [default to true] |
| **searchBy** | **AssetSearchBy** | The field to search member assets by | [optional]  |
| **searchValue** | **string** | The value to search for | [optional]  |
| **bookmark** | **string** | Cursor used to fetch the next page of items | [optional]  |
| **pageSize** | **int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="deletepartnerassetaccesshandlerimpl"></a>
# **DeletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetAccessResultsResponseArray DeletePartnerAssetAccessHandlerImpl (string businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **deletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  |  |

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="updatepartnerassetaccesshandlerimpl"></a>
# **UpdatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray UpdatePartnerAssetAccessHandlerImpl (string businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **businessId** | **string** | Unique identifier of the requesting business. |  |
| **updatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) |  |  |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

