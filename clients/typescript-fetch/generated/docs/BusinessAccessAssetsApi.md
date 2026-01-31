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
| [**businessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#businessmembersassetaccessdeleteoperation) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**businessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**businessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |



## assetGroupCreate

> CreateAssetGroupResponse assetGroupCreate(businessId, createAssetGroupBody)

Create a new asset group.

Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.

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
    businessId: 729090764583391194,
    // CreateAssetGroupBody
    createAssetGroupBody: ...,
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
| **createAssetGroupBody** | [CreateAssetGroupBody](CreateAssetGroupBody.md) |  | |

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## assetGroupDelete

> DeleteAssetGroupResponse assetGroupDelete(businessId, deleteAssetGroupBody)

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
    businessId: 729090764583391194,
    // DeleteAssetGroupBody
    deleteAssetGroupBody: ...,
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
| **deleteAssetGroupBody** | [DeleteAssetGroupBody](DeleteAssetGroupBody.md) |  | |

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## assetGroupUpdate

> UpdateAssetGroupResponse assetGroupUpdate(businessId, updateAssetGroupBody)

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
    businessId: 729090764583391194,
    // UpdateAssetGroupBody
    updateAssetGroupBody: ...,
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
| **updateAssetGroupBody** | [UpdateAssetGroupBody](UpdateAssetGroupBody.md) |  | |

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessAssetMembersGet

> BusinessAssetMembersGet200Response businessAssetMembersGet(businessId, assetId, fetchSystemUsers, bookmark, pageSize, startIndex)

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
    businessId: 729090764583391194,
    // string | Unique identifier of a business asset.
    assetId: 729090764583391194,
    // boolean | Fetches system users if True. Fetches regular user employees if False. (optional)
    fetchSystemUsers: true,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
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
| **fetchSystemUsers** | `boolean` | Fetches system users if True. Fetches regular user employees if False. | [Optional] [Defaults to `false`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |

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
| **200** | Sucess |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessAssetPartnersGet

> BusinessAssetPartnersGet200Response businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

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
    businessId: 729090764583391194,
    // string | Unique identifier of a business asset.
    assetId: 729090764583391194,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
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
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucess |  -  |
| **0** | Unexpected error |  -  |

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
    businessId: 729090764583391194,
    // Array<PermissionsWithOwner> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
    permissions: ...,
    // string | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
    childAssetId: 549764894835,
    // string | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
    assetGroupId: 7078106104032,
    // 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
    assetType: AD_ACCOUNT,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
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
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessMemberAssetsGet

> BusinessMemberAssetsGet200Response businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)

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
    businessId: 729090764583391194,
    // string | The member id to fetch assets for.
    memberId: 729090764583391194,
    // 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
    assetType: AD_ACCOUNT,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
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
| **assetType** | `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`, `CATALOG`, `CONSUMER` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [Optional] [Defaults to `&#39;AD_ACCOUNT&#39;`] [Enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessMembersAssetAccessDelete

> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)

Delete member access to asset

Terminate multiple members\&#39; access to an asset.

### Example

```ts
import {
  Configuration,
  BusinessAccessAssetsApi,
} from '';
import type { BusinessMembersAssetAccessDeleteOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessAssetsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.
    businessMembersAssetAccessDeleteRequest: ...,
  } satisfies BusinessMembersAssetAccessDeleteOperationRequest;

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
| **businessMembersAssetAccessDeleteRequest** | [BusinessMembersAssetAccessDeleteRequest](BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. | |

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
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

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
    businessId: 729090764583391194,
    // UpdateMemberAssetAccessBody | List of member asset permissions to create or update.
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
| **updateMemberAssetAccessBody** | [UpdateMemberAssetAccessBody](UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. | |

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
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## businessPartnerAssetAccessGet

> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)

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
    businessId: 729090764583391194,
    // string | The partner id to be bound to the Business
    partnerId: 729090764583391194,
    // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional)
    partnerType: INTERNAL,
    // 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional)
    assetType: AD_ACCOUNT,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
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
| **partnerType** | `PartnerType` | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | [Optional] [Defaults to `undefined`] [Enum: INTERNAL, EXTERNAL] |
| **assetType** | `AD_ACCOUNT`, `PROFILE`, `ASSET_GROUP`, `CATALOG`, `CONSUMER` | A resource type to filter the assets by. Only assets of the specified type will be returned. | [Optional] [Defaults to `&#39;AD_ACCOUNT&#39;`] [Enum: AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deletePartnerAssetAccessHandlerImpl

> DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

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
    businessId: 729090764583391194,
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

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

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
    businessId: 729090764583391194,
    // UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.
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
| **updatePartnerAssetAccessBody** | [UpdatePartnerAssetAccessBody](UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. | |

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

