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
> CreateAssetGroupResponse assetGroupCreate(createAssetGroupBody)

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    CreateAssetGroupBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let createAssetGroupBody: CreateAssetGroupBody; //

const { status, data } = await apiInstance.assetGroupCreate(
    businessId,
    createAssetGroupBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createAssetGroupBody** | **CreateAssetGroupBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**CreateAssetGroupResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupDelete**
> DeleteAssetGroupResponse assetGroupDelete(deleteAssetGroupBody)

Delete a batch of asset groups.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    DeleteAssetGroupBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let deleteAssetGroupBody: DeleteAssetGroupBody; //

const { status, data } = await apiInstance.assetGroupDelete(
    businessId,
    deleteAssetGroupBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **deleteAssetGroupBody** | **DeleteAssetGroupBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**DeleteAssetGroupResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **assetGroupUpdate**
> UpdateAssetGroupResponse assetGroupUpdate(updateAssetGroupBody)

Update a batch of asset groups with the specified parameters.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    UpdateAssetGroupBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let updateAssetGroupBody: UpdateAssetGroupBody; //

const { status, data } = await apiInstance.assetGroupUpdate(
    businessId,
    updateAssetGroupBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updateAssetGroupBody** | **UpdateAssetGroupBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**UpdateAssetGroupResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**0** | Unexpected error |  -  |

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
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)

const { status, data } = await apiInstance.businessAssetMembersGet(
    businessId,
    assetId,
    bookmark,
    pageSize,
    startIndex
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **assetId** | [**string**] | Unique identifier of a business asset. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|


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
|**200** | Sucess |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAssetPartnersGet**
> BusinessAssetPartnersGet200Response businessAssetPartnersGet()

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
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

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
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**BusinessAssetPartnersGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Sucess |  -  |
|**0** | Unexpected error |  -  |

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
let assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP'; //A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

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
| **assetType** | [**&#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39;**]**Array<&#39;AD_ACCOUNT&#39; &#124; &#39;PROFILE&#39; &#124; &#39;ASSET_GROUP&#39;>** | A resource type to filter the assets by. Only assets of the specified type will be returned. | (optional) defaults to 'AD_ACCOUNT'|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMemberAssetsGet**
> BusinessMemberAssetsGet200Response businessMemberAssetsGet()

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
let assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP'; //A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessMemberAssetsGet(
    businessId,
    memberId,
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
| **memberId** | [**string**] | The member id to fetch assets for. | defaults to undefined|
| **assetType** | [**&#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39;**]**Array<&#39;AD_ACCOUNT&#39; &#124; &#39;PROFILE&#39; &#124; &#39;ASSET_GROUP&#39;>** | A resource type to filter the assets by. Only assets of the specified type will be returned. | (optional) defaults to 'AD_ACCOUNT'|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**BusinessMemberAssetsGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(businessMembersAssetAccessDeleteRequest)

Terminate multiple members\' access to an asset.

### Example

```typescript
import {
    BusinessAccessAssetsApi,
    Configuration,
    BusinessMembersAssetAccessDeleteRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessAssetsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest; //List member assset permissions to delete.

const { status, data } = await apiInstance.businessMembersAssetAccessDelete(
    businessId,
    businessMembersAssetAccessDeleteRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessMembersAssetAccessDeleteRequest** | **BusinessMembersAssetAccessDeleteRequest**| List member assset permissions to delete. | |
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
|**200** | response |  -  |
|**0** | Unexpected error |  -  |

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
let updateMemberAssetAccessBody: UpdateMemberAssetAccessBody; //List of member asset permissions to create or update.

const { status, data } = await apiInstance.businessMembersAssetAccessUpdate(
    businessId,
    updateMemberAssetAccessBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updateMemberAssetAccessBody** | **UpdateMemberAssetAccessBody**| List of member asset permissions to create or update. | |
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
|**200** | response |  -  |
|**0** | Unexpected error |  -  |

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
let partnerType: PartnerType; //Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional) (default to undefined)
let assetType: 'AD_ACCOUNT' | 'PROFILE' | 'ASSET_GROUP'; //A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.businessPartnerAssetAccessGet(
    businessId,
    partnerId,
    partnerType,
    assetType,
    startIndex,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **partnerId** | [**string**] | The partner id to be bound to the Business | defaults to undefined|
| **partnerType** | **PartnerType** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | (optional) defaults to undefined|
| **assetType** | [**&#39;AD_ACCOUNT&#39; | &#39;PROFILE&#39; | &#39;ASSET_GROUP&#39;**]**Array<&#39;AD_ACCOUNT&#39; &#124; &#39;PROFILE&#39; &#124; &#39;ASSET_GROUP&#39;>** | A resource type to filter the assets by. Only assets of the specified type will be returned. | (optional) defaults to 'AD_ACCOUNT'|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl(deletePartnerAssetAccessBody)

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

**DeletePartnerAssetsResultsResponseArray**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

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
let updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody; //A list of assets and permissions to assign to your partners.

const { status, data } = await apiInstance.updatePartnerAssetAccessHandlerImpl(
    businessId,
    updatePartnerAssetAccessBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updatePartnerAssetAccessBody** | **UpdatePartnerAssetAccessBody**| A list of assets and permissions to assign to your partners. | |
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
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

