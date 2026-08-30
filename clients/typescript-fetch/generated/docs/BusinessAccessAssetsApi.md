# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetGroupCreate**](BusinessAccessAssetsApi.md#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**assetGroupDelete**](BusinessAccessAssetsApi.md#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**assetGroupUpdate**](BusinessAccessAssetsApi.md#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**businessAssetMembersGet**](BusinessAccessAssetsApi.md#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**businessAssetPartnersGet**](BusinessAccessAssetsApi.md#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**businessAssetsGet**](BusinessAccessAssetsApi.md#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets |
| [**businessMemberAssetsGet**](BusinessAccessAssetsApi.md#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**businessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**businessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**businessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |



## assetGroupCreate

> AssetGroupInput assetGroupCreate(businessId, assetGroupInputCreate)

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { AssetGroupCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // AssetGroupInputCreate
    assetGroupInputCreate: ...,
  } satisfies AssetGroupCreateRequest;

  try {
    const data = await api.assetGroupCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **assetGroupInputCreate** | [AssetGroupInputCreate](AssetGroupInputCreate.md) |  | |

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## assetGroupDelete

> AssetGroupDeletion assetGroupDelete(businessId, assetGroupDeletionDelete)

Delete asset groups.

Delete a batch of asset groups.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { AssetGroupDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // AssetGroupDeletionDelete
    assetGroupDeletionDelete: ...,
  } satisfies AssetGroupDeleteRequest;

  try {
    const data = await api.assetGroupDelete(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **assetGroupDeletionDelete** | [AssetGroupDeletionDelete](AssetGroupDeletionDelete.md) |  | |

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## assetGroupUpdate

> AssetGroupModification assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { AssetGroupUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // AssetGroupModificationReadOrUpdate
    assetGroupModificationReadOrUpdate: ...,
  } satisfies AssetGroupUpdateRequest;

  try {
    const data = await api.assetGroupUpdate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **assetGroupModificationReadOrUpdate** | [AssetGroupModificationReadOrUpdate](AssetGroupModificationReadOrUpdate.md) |  | |

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessAssetMembersGet

> BusinessAssetMembersGet200Response businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessAssetMembersGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // string | Unique identifier of a business asset.
    assetId: assetId_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // boolean | Fetches system users if True. Fetches regular user employees if False. (optional)
    fetchSystemUsers: true,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BusinessAssetMembersGetRequest;

  try {
    const data = await api.businessAssetMembersGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **assetId** | `string` | Unique identifier of a business asset. | [Defaults to `undefined`] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **fetchSystemUsers** | `boolean` | Fetches system users if True. Fetches regular user employees if False. | [Optional] [Defaults to `false`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessAssetPartnersGet

> BusinessAssetMembersGet200Response businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessAssetPartnersGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // string | Unique identifier of a business asset.
    assetId: assetId_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BusinessAssetPartnersGetRequest;

  try {
    const data = await api.businessAssetPartnersGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **assetId** | `string` | Unique identifier of a business asset. | [Defaults to `undefined`] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessAssetsGet

> BusinessAssetsGet200Response businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessAssetsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // Array<PermissionsWithOwner> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
    permissions: ...,
    // string | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
    childAssetId: childAssetId_example,
    // string | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
    assetGroupId: assetGroupId_example,
    // 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
    assetType: assetType_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BusinessAssetsGetRequest;

  try {
    const data = await api.businessAssetsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **permissions** | `Array<PermissionsWithOwner>` | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [Optional] |
| **childAssetId** | `string` | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [Optional] [Defaults to `undefined`] |
| **assetGroupId** | `string` | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [Optional] [Defaults to `undefined`] |
| **assetType** | `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`, `CATALOG`, `CONSUMER` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [Optional] [Defaults to `&#39;AD_ACCOUNT&#39;`] [Enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessMemberAssetsGet

> BusinessMemberAssetsGetResponse businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessMemberAssetsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // string | The member id to fetch assets for.
    memberId: memberId_example,
    // 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_TAG' | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
    assetType: assetType_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // AssetSortBy | The field to sort member assets by (optional)
    sortBy: ...,
    // boolean | Sort assets in ascending order (optional)
    sortAscending: true,
    // AssetSearchBy | The field to search member assets by (optional)
    searchBy: ...,
    // string | The value to search for (optional)
    searchValue: searchValue_example,
    // AssetPermissionType | The type of asset permission to filter by (optional)
    assetPermissionType: ...,
    // Array<NonDraftEntityStatus> | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
    adAccountStatuses: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BusinessMemberAssetsGetRequest;

  try {
    const data = await api.businessMemberAssetsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **memberId** | `string` | The member id to fetch assets for. | [Defaults to `undefined`] |
| **assetType** | `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`, `CATALOG`, `CONSUMER`, `CONVERSION_TAG` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [Optional] [Defaults to `&#39;AD_ACCOUNT&#39;`] [Enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **sortBy** | `AssetSortBy` | The field to sort member assets by | [Optional] [Defaults to `undefined`] [Enum: NAME, ID, PERMISSIONS] |
| **sortAscending** | `boolean` | Sort assets in ascending order | [Optional] [Defaults to `true`] |
| **searchBy** | `AssetSearchBy` | The field to search member assets by | [Optional] [Defaults to `undefined`] [Enum: NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER] |
| **searchValue** | `string` | The value to search for | [Optional] [Defaults to `undefined`] |
| **assetPermissionType** | `AssetPermissionType` | The type of asset permission to filter by | [Optional] [Defaults to `undefined`] [Enum: AGGREGATED_PERMISSION, DIRECT_PERMISSION] |
| **adAccountStatuses** | `Array<NonDraftEntityStatus>` | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [Optional] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessMembersAssetAccessDelete

> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody)

Delete member access to asset

Terminate multiple members\&#39; access to an asset.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessMembersAssetAccessDeleteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // BusinessMembersAssetAccessDeleteBody
    businessMembersAssetAccessDeleteBody: ...,
  } satisfies BusinessMembersAssetAccessDeleteRequest;

  try {
    const data = await api.businessMembersAssetAccessDelete(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **businessMembersAssetAccessDeleteBody** | [BusinessMembersAssetAccessDeleteBody](BusinessMembersAssetAccessDeleteBody.md) |  | |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessMembersAssetAccessUpdate

> UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member\&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessMembersAssetAccessUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // UpdateMemberAssetAccessBody
    updateMemberAssetAccessBody: ...,
  } satisfies BusinessMembersAssetAccessUpdateRequest;

  try {
    const data = await api.businessMembersAssetAccessUpdate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **updateMemberAssetAccessBody** | [UpdateMemberAssetAccessBody](UpdateMemberAssetAccessBody.md) |  | |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessPartnerAssetAccessGet

> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner\&#39;s business assets that the partner has granted you access to.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessPartnerAssetAccessGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // string | The partner id to be bound to the Business
    partnerId: partnerId_example,
    // 'INTERNAL' | 'EXTERNAL' | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional)
    partnerType: partnerType_example,
    // 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'PINNER_LIST' | 'CONVERSION_TAG' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_SEGMENT' | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
    assetType: assetType_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // AssetSortBy | The field to sort member assets by (optional)
    sortBy: ...,
    // boolean | Sort assets in ascending order (optional)
    sortAscending: true,
    // AssetSearchBy | The field to search member assets by (optional)
    searchBy: ...,
    // string | The value to search for (optional)
    searchValue: searchValue_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BusinessPartnerAssetAccessGetRequest;

  try {
    const data = await api.businessPartnerAssetAccessGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **partnerId** | `string` | The partner id to be bound to the Business | [Defaults to `undefined`] |
| **partnerType** | `INTERNAL`, `EXTERNAL` | Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | [Optional] [Defaults to `&#39;INTERNAL&#39;`] [Enum: INTERNAL, EXTERNAL] |
| **assetType** | `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`, `PINNER_LIST`, `CONVERSION_TAG`, `CATALOG`, `CONSUMER`, `CONVERSION_SEGMENT` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [Optional] [Defaults to `&#39;AD_ACCOUNT&#39;`] [Enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **sortBy** | `AssetSortBy` | The field to sort member assets by | [Optional] [Defaults to `undefined`] [Enum: NAME, ID, PERMISSIONS] |
| **sortAscending** | `boolean` | Sort assets in ascending order | [Optional] [Defaults to `true`] |
| **searchBy** | `AssetSearchBy` | The field to search member assets by | [Optional] [Defaults to `undefined`] [Enum: NAME, ID, NAME_OR_ID, OWNER_NAME, NAME_OR_OWNER] |
| **searchValue** | `string` | The value to search for | [Optional] [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deletePartnerAssetAccessHandlerImpl

> DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners\&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner\&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner\&#39;s business assets.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { DeletePartnerAssetAccessHandlerImplRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // DeletePartnerAssetAccessBody
    deletePartnerAssetAccessBody: ...,
  } satisfies DeletePartnerAssetAccessHandlerImplRequest;

  try {
    const data = await api.deletePartnerAssetAccessHandlerImpl(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **deletePartnerAssetAccessBody** | [DeletePartnerAssetAccessBody](DeletePartnerAssetAccessBody.md) |  | |

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## updatePartnerAssetAccessHandlerImpl

> UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner\&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { UpdatePartnerAssetAccessHandlerImplRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // UpdatePartnerAssetAccessBody
    updatePartnerAssetAccessBody: ...,
  } satisfies UpdatePartnerAssetAccessHandlerImplRequest;

  try {
    const data = await api.updatePartnerAssetAccessHandlerImpl(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **updatePartnerAssetAccessBody** | [UpdatePartnerAssetAccessBody](UpdatePartnerAssetAccessBody.md) |  | |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

