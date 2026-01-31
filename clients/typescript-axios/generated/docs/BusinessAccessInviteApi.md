# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**assetAccessRequestsCreate**](#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner\&#39;s assets.|
|[**cancelInvitesOrRequests**](#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests|
|[**createAssetInvites**](#createassetinvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission|
|[**createMembershipOrPartnershipInvites**](#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests|
|[**getInvites**](#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests|
|[**respondBusinessAccessInvites**](#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request|

# **assetAccessRequestsCreate**
> CreateAssetAccessRequestResponse assetAccessRequestsCreate(createAssetAccessRequestBody)

Create a request to access an existing partner\'s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example

```typescript
import {
    BusinessAccessInviteApi,
    Configuration,
    CreateAssetAccessRequestBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessInviteApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let createAssetAccessRequestBody: CreateAssetAccessRequestBody; //

const { status, data } = await apiInstance.assetAccessRequestsCreate(
    businessId,
    createAssetAccessRequestBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createAssetAccessRequestBody** | **CreateAssetAccessRequestBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**CreateAssetAccessRequestResponse**

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

# **cancelInvitesOrRequests**
> DeleteInvitesResultsResponseArray cancelInvitesOrRequests(cancelInvitesBody)

Cancel membership/partnership invites and/or requests.

### Example

```typescript
import {
    BusinessAccessInviteApi,
    Configuration,
    CancelInvitesBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessInviteApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let cancelInvitesBody: CancelInvitesBody; //A list with invite ids

const { status, data } = await apiInstance.cancelInvitesOrRequests(
    businessId,
    cancelInvitesBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **cancelInvitesBody** | **CancelInvitesBody**| A list with invite ids | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**DeleteInvitesResultsResponseArray**

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

# **createAssetInvites**
> UpdateInvitesResultsResponseArray createAssetInvites(createAssetInvitesRequest)

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner\'s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner\'s assets\" to request access to your   partner\'s assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example

```typescript
import {
    BusinessAccessInviteApi,
    Configuration,
    CreateAssetInvitesRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessInviteApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let createAssetInvitesRequest: CreateAssetInvitesRequest; //A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

const { status, data } = await apiInstance.createAssetInvites(
    businessId,
    createAssetInvitesRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createAssetInvitesRequest** | **CreateAssetInvitesRequest**| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**UpdateInvitesResultsResponseArray**

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

# **createMembershipOrPartnershipInvites**
> CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(createMembershipOrPartnershipInvitesBody)

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example

```typescript
import {
    BusinessAccessInviteApi,
    Configuration,
    CreateMembershipOrPartnershipInvitesBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessInviteApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody; //An object with the properties: invite_type, partners, members, business_role

const { status, data } = await apiInstance.createMembershipOrPartnershipInvites(
    businessId,
    createMembershipOrPartnershipInvitesBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **createMembershipOrPartnershipInvitesBody** | **CreateMembershipOrPartnershipInvitesBody**| An object with the properties: invite_type, partners, members, business_role | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**CreateInvitesResultsResponseArray**

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

# **getInvites**
> GetInvites200Response getInvites()

Get the membership/partnership invites and/or requests for the authorized user.

### Example

```typescript
import {
    BusinessAccessInviteApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessInviteApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let isMember: boolean; //A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to true)
let inviteStatus: Array<'PENDING' | 'EXPIRED'>; //A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional) (default to undefined)
let inviteType: InviteType; //Invite type to filter invites by. Only invites of the specified type will be returned. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.getInvites(
    businessId,
    isMember,
    inviteStatus,
    inviteType,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **isMember** | [**boolean**] | A boolean field to indicate whether the invite is to create a partnership or a membership. | (optional) defaults to true|
| **inviteStatus** | **Array<&#39;PENDING&#39; &#124; &#39;EXPIRED&#39;>** | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | (optional) defaults to undefined|
| **inviteType** | **InviteType** | Invite type to filter invites by. Only invites of the specified type will be returned. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**GetInvites200Response**

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

# **respondBusinessAccessInvites**
> RespondToInvitesResponseArray respondBusinessAccessInvites(authRespondInvitesBody)

Accept or decline invites or requests.

### Example

```typescript
import {
    BusinessAccessInviteApi,
    Configuration,
    AuthRespondInvitesBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessInviteApi(configuration);

let authRespondInvitesBody: AuthRespondInvitesBody; //

const { status, data } = await apiInstance.respondBusinessAccessInvites(
    authRespondInvitesBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **authRespondInvitesBody** | **AuthRespondInvitesBody**|  | |


### Return type

**RespondToInvitesResponseArray**

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

