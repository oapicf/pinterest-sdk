# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetAccessRequestsCreate**](BusinessAccessInviteApi.md#assetaccessrequestscreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner\&#39;s assets. |
| [**cancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelinvitesorrequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**createAssetInvites**](BusinessAccessInviteApi.md#createassetinvitesoperation) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**createMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createmembershiporpartnershipinvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**getInvites**](BusinessAccessInviteApi.md#getinvites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**respondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondbusinessaccessinvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |



## assetAccessRequestsCreate

> CreateAssetAccessRequestResponse assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)

Create a request to access an existing partner\&#39;s assets.

Create a request to access an existing partner\&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example

```ts
import {
  Configuration,
  BusinessAccessInviteApi,
} from '';
import type { AssetAccessRequestsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessInviteApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // CreateAssetAccessRequestBody
    createAssetAccessRequestBody: ...,
  } satisfies AssetAccessRequestsCreateRequest;

  try {
    const data = await api.assetAccessRequestsCreate(body);
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
| **createAssetAccessRequestBody** | [CreateAssetAccessRequestBody](CreateAssetAccessRequestBody.md) |  | |

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

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


## cancelInvitesOrRequests

> DeleteInvitesResultsResponseArray cancelInvitesOrRequests(businessId, cancelInvitesBody)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example

```ts
import {
  Configuration,
  BusinessAccessInviteApi,
} from '';
import type { CancelInvitesOrRequestsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessInviteApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // CancelInvitesBody | A list with invite ids
    cancelInvitesBody: ...,
  } satisfies CancelInvitesOrRequestsRequest;

  try {
    const data = await api.cancelInvitesOrRequests(body);
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
| **cancelInvitesBody** | [CancelInvitesBody](CancelInvitesBody.md) | A list with invite ids | |

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

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


## createAssetInvites

> UpdateInvitesResultsResponseArray createAssetInvites(businessId, createAssetInvitesRequest)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner\&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner\&#39;s assets\&quot; to request access to your   partner\&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example

```ts
import {
  Configuration,
  BusinessAccessInviteApi,
} from '';
import type { CreateAssetInvitesOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessInviteApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 
    createAssetInvitesRequest: ...,
  } satisfies CreateAssetInvitesOperationRequest;

  try {
    const data = await api.createAssetInvites(body);
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
| **createAssetInvitesRequest** | [CreateAssetInvitesRequest](CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | |

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

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


## createMembershipOrPartnershipInvites

> CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners

### Example

```ts
import {
  Configuration,
  BusinessAccessInviteApi,
} from '';
import type { CreateMembershipOrPartnershipInvitesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessInviteApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role
    createMembershipOrPartnershipInvitesBody: ...,
  } satisfies CreateMembershipOrPartnershipInvitesRequest;

  try {
    const data = await api.createMembershipOrPartnershipInvites(body);
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
| **createMembershipOrPartnershipInvitesBody** | [CreateMembershipOrPartnershipInvitesBody](CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role | |

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

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


## getInvites

> GetInvites200Response getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example

```ts
import {
  Configuration,
  BusinessAccessInviteApi,
} from '';
import type { GetInvitesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessInviteApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // boolean | A boolean field to indicate whether the invite is to create a partnership or a membership. (optional)
    isMember: true,
    // Array<'PENDING' | 'EXPIRED'> | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
    inviteStatus: ...,
    // InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
    inviteType: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
  } satisfies GetInvitesRequest;

  try {
    const data = await api.getInvites(body);
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
| **isMember** | `boolean` | A boolean field to indicate whether the invite is to create a partnership or a membership. | [Optional] [Defaults to `true`] |
| **inviteStatus** | `PENDING`, `EXPIRED` | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [Optional] [Enum: PENDING, EXPIRED] |
| **inviteType** | `InviteType` | Invite type to filter invites by. Only invites of the specified type will be returned. | [Optional] [Defaults to `undefined`] [Enum: MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

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


## respondBusinessAccessInvites

> RespondToInvitesResponseArray respondBusinessAccessInvites(authRespondInvitesBody)

Accept or decline an invite/request

Accept or decline invites or requests.

### Example

```ts
import {
  Configuration,
  BusinessAccessInviteApi,
} from '';
import type { RespondBusinessAccessInvitesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessInviteApi(config);

  const body = {
    // AuthRespondInvitesBody
    authRespondInvitesBody: ...,
  } satisfies RespondBusinessAccessInvitesRequest;

  try {
    const data = await api.respondBusinessAccessInvites(body);
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
| **authRespondInvitesBody** | [AuthRespondInvitesBody](AuthRespondInvitesBody.md) |  | |

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

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

