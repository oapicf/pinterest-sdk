# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**assetGroupCreate**](#assetgroupcreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.|
|[**assetGroupDelete**](#assetgroupdelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.|
|[**assetGroupUpdate**](#assetgroupupdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.|
|[**businessAssetMembersGet**](#businessassetmembersget) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset|
|[**businessAssetPartnersGet**](#businessassetpartnersget) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset|
|[**businessAssetsGet**](#businessassetsget) | **GET** /businesses/{business_id}/assets | List business assets|
|[**businessMemberAssetsGet**](#businessmemberassetsget) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member|
|[**businessMembersAssetAccessDelete**](#businessmembersassetaccessdelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset|
|[**businessMembersAssetAccessUpdate**](#businessmembersassetaccessupdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions|
|[**businessPartnerAssetAccessGet**](#businesspartnerassetaccessget) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner|
|[**deletePartnerAssetAccessHandlerImpl**](#deletepartnerassetaccesshandlerimpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset|
|[**updatePartnerAssetAccessHandlerImpl**](#updatepartnerassetaccesshandlerimpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions|

# **assetGroupCreate**
> AssetGroupInput assetGroupCreate(assetGroupInputCreate)

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    AssetGroupInputCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let assetGroupInputCreate: AssetGroupInputCreate; //

const { status, data } = await apiInstance.assetGroupCreate(
    businessId,
    assetGroupInputCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **assetGroupInputCreate** | **AssetGroupInputCreate**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**AssetGroupInput**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupDelete**
> AssetGroupDeletion assetGroupDelete(assetGroupDeletionDelete)

Delete a batch of asset groups.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    AssetGroupDeletionDelete
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let assetGroupDeletionDelete: AssetGroupDeletionDelete; //

const { status, data } = await apiInstance.assetGroupDelete(
    businessId,
    assetGroupDeletionDelete
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **assetGroupDeletionDelete** | **AssetGroupDeletionDelete**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**AssetGroupDeletion**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupUpdate**
> AssetGroupModification assetGroupUpdate(assetGroupModificationReadOrUpdate)

Update a batch of asset groups with the specified parameters.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    AssetGroupModificationReadOrUpdate
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate; //

const { status, data } = await apiInstance.assetGroupUpdate(
    businessId,
    assetGroupModificationReadOrUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **assetGroupModificationReadOrUpdate** | **AssetGroupModificationReadOrUpdate**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**AssetGroupModification**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetMembersGet**
> BusinessAssetMembersGet200Response businessAssetMembersGet()

Get all the members the requesting business has granted access to on the given asset.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let assetId: string; //Unique identifier of a business asset. (default to undefined)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let fetchSystemUsers: boolean; //Fetches system users if True. Fetches regular user employees if False. (optional) (default to false)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessAssetMembersGet(
    businessId,
    assetId,
    startIndex,
    fetchSystemUsers,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **assetId** | [**string**] | Unique identifier of a business asset. | defaults to undefined|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **fetchSystemUsers** | [**boolean**] | Fetches system users if True. Fetches regular user employees if False. | (optional) defaults to false|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**BusinessAssetMembersGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetPartnersGet**
> BusinessAssetMembersGet200Response businessAssetPartnersGet()

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let assetId: string; //Unique identifier of a business asset. (default to undefined)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessAssetPartnersGet(
    businessId,
    assetId,
    startIndex,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **assetId** | [**string**] | Unique identifier of a business asset. | defaults to undefined|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**BusinessAssetMembersGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetsGet**
> BusinessAssetsGet200Response businessAssetsGet()

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let permissions: Array<PermissionsWithOwner>; //A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional) (default to undefined)
let childAssetId: string; //A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional) (default to undefined)
let assetGroupId: string; //An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional) (default to undefined)
let assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER'; //A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessAssetsGet(
    businessId,
    permissions,
    childAssetId,
    assetGroupId,
    assetType,
    startIndex,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **permissions** | **Array&lt;PermissionsWithOwner&gt;** | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | (optional) defaults to undefined|
| **childAssetId** | [**string**] | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | (optional) defaults to undefined|
| **assetGroupId** | [**string**] | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | (optional) defaults to undefined|
| **assetType** | [**&#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39; | &#39;CATALOG&#39; | &#39;CONSUMER&#39;**]**Array<&#39;AD_ACCOUNT&#39; &#124; &#39;PROFILE&#39; &#124; &#39;ASSET_GROUP&#39; &#124; &#39;CATALOG&#39; &#124; &#39;CONSUMER&#39;>** | A resource type to filter the assets by. Only assets of the specified type will be returned. | (optional) defaults to 'AD_ACCOUNT'|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**BusinessAssetsGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMemberAssetsGet**
> BusinessMemberAssetsGetResponse businessMemberAssetsGet()

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let memberId: string; //The member id to fetch assets for. (default to undefined)
let assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_TAG'; //A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let sortBy: AssetSortBy; //The field to sort member assets by (optional) (default to undefined)
let sortAscending: boolean; //Sort assets in ascending order (optional) (default to true)
let searchBy: AssetSearchBy; //The field to search member assets by (optional) (default to undefined)
let searchValue: string; //The value to search for (optional) (default to undefined)
let assetPermissionType: AssetPermissionType; //The type of asset permission to filter by (optional) (default to undefined)
let adAccountStatuses: Array<NonDraftEntityStatus>; //A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessMemberAssetsGet(
    businessId,
    memberId,
    assetType,
    startIndex,
    sortBy,
    sortAscending,
    searchBy,
    searchValue,
    assetPermissionType,
    adAccountStatuses,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **memberId** | [**string**] | The member id to fetch assets for. | defaults to undefined|
| **assetType** | [**&#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39; | &#39;CATALOG&#39; | &#39;CONSUMER&#39; | &#39;CONVERSION_TAG&#39;**]**Array<&#39;AD_ACCOUNT&#39; &#124; &#39;PROFILE&#39; &#124; &#39;ASSET_GROUP&#39; &#124; &#39;CATALOG&#39; &#124; &#39;CONSUMER&#39; &#124; &#39;CONVERSION_TAG&#39;>** | A resource type to filter the assets by. Only assets of the specified type will be returned. | (optional) defaults to 'AD_ACCOUNT'|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **sortBy** | **AssetSortBy** | The field to sort member assets by | (optional) defaults to undefined|
| **sortAscending** | [**boolean**] | Sort assets in ascending order | (optional) defaults to true|
| **searchBy** | **AssetSearchBy** | The field to search member assets by | (optional) defaults to undefined|
| **searchValue** | [**string**] | The value to search for | (optional) defaults to undefined|
| **assetPermissionType** | **AssetPermissionType** | The type of asset permission to filter by | (optional) defaults to undefined|
| **adAccountStatuses** | **Array&lt;NonDraftEntityStatus&gt;** | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**BusinessMemberAssetsGetResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessMembersAssetAccessDeleteBody)

Terminate multiple members\' access to an asset.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    BusinessMembersAssetAccessDeleteBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody; //

const { status, data } = await apiInstance.businessMembersAssetAccessDelete(
    businessId,
    businessMembersAssetAccessDeleteBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessMembersAssetAccessDeleteBody** | **BusinessMembersAssetAccessDeleteBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**DeleteMemberAccessResultsResponseArray**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(updateMemberAssetAccessBody)

Grant multiple members access to assets and/or update multiple member\'s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    UpdateMemberAssetAccessBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let updateMemberAssetAccessBody: UpdateMemberAssetAccessBody; //

const { status, data } = await apiInstance.businessMembersAssetAccessUpdate(
    businessId,
    updateMemberAssetAccessBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updateMemberAssetAccessBody** | **UpdateMemberAssetAccessBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**UpdateMemberAssetsResultsResponseArray**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet()

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner\'s business assets that the partner has granted you access to.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let partnerId: string; //The partner id to be bound to the Business (default to undefined)
let partnerType: 'INTERNAL' | 'EXTERNAL'; //Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional) (default to 'INTERNAL')
let assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP' | 'PINNER_LIST' | 'CONVERSION_TAG' | 'CATALOG' | 'CONSUMER' | 'CONVERSION_SEGMENT'; //A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let sortBy: AssetSortBy; //The field to sort member assets by (optional) (default to undefined)
let sortAscending: boolean; //Sort assets in ascending order (optional) (default to true)
let searchBy: AssetSearchBy; //The field to search member assets by (optional) (default to undefined)
let searchValue: string; //The value to search for (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessPartnerAssetAccessGet(
    businessId,
    partnerId,
    partnerType,
    assetType,
    startIndex,
    sortBy,
    sortAscending,
    searchBy,
    searchValue,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **partnerId** | [**string**] | The partner id to be bound to the Business | defaults to undefined|
| **partnerType** | [**&#39;INTERNAL&#39; | &#39;EXTERNAL&#39;**]**Array<&#39;INTERNAL&#39; &#124; &#39;EXTERNAL&#39;>** | Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | (optional) defaults to 'INTERNAL'|
| **assetType** | [**&#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39; | &#39;PINNER_LIST&#39; | &#39;CONVERSION_TAG&#39; | &#39;CATALOG&#39; | &#39;CONSUMER&#39; | &#39;CONVERSION_SEGMENT&#39;**]**Array<&#39;AD_ACCOUNT&#39; &#124; &#39;PROFILE&#39; &#124; &#39;ASSET_GROUP&#39; &#124; &#39;PINNER_LIST&#39; &#124; &#39;CONVERSION_TAG&#39; &#124; &#39;CATALOG&#39; &#124; &#39;CONSUMER&#39; &#124; &#39;CONVERSION_SEGMENT&#39;>** | A resource type to filter the assets by. Only assets of the specified type will be returned. | (optional) defaults to 'AD_ACCOUNT'|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **sortBy** | **AssetSortBy** | The field to sort member assets by | (optional) defaults to undefined|
| **sortAscending** | [**boolean**] | Sort assets in ascending order | (optional) defaults to true|
| **searchBy** | **AssetSearchBy** | The field to search member assets by | (optional) defaults to undefined|
| **searchValue** | [**string**] | The value to search for | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**BusinessPartnerAssetAccessGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(deletePartnerAssetAccessBody)

Terminate multiple partners\' access to an asset. If - partner_type=INTERNAL: You will terminate a partner\'s asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner\'s business assets.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    DeletePartnerAssetAccessBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody; //

const { status, data } = await apiInstance.deletePartnerAssetAccessHandlerImpl(
    businessId,
    deletePartnerAssetAccessBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **deletePartnerAssetAccessBody** | **DeletePartnerAssetAccessBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**DeletePartnerAssetAccessResultsResponseArray**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(updatePartnerAssetAccessBody)

Grant multiple partners access to assets and/or update multiple partner\'s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    UpdatePartnerAssetAccessBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody; //

const { status, data } = await apiInstance.updatePartnerAssetAccessHandlerImpl(
    businessId,
    updatePartnerAssetAccessBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updatePartnerAssetAccessBody** | **UpdatePartnerAssetAccessBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**UpdatePartnerAssetsResultsResponseArray**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

