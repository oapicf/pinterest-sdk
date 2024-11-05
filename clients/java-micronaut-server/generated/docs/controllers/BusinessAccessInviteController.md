# BusinessAccessInviteController

All URIs are relative to `"/v5"`

The controller class is defined in **[BusinessAccessInviteController.java](../../src/main/java/org/openapitools/controller/BusinessAccessInviteController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetAccessRequestsCreate**](#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancelInvitesOrRequests**](#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**createAssetInvites**](#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createMembershipOrPartnershipInvites**](#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**getInvites**](#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respondBusinessAccessInvites**](#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request

<a id="assetAccessRequestsCreate"></a>
# **assetAccessRequestsCreate**
```java
Mono<CreateAssetAccessRequestResponse> BusinessAccessInviteController.assetAccessRequestsCreate(businessIdcreateAssetAccessRequestBody)
```

Create a request to access an existing partner&#39;s assets.

Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](../../docs/models/CreateAssetAccessRequestBody.md) |  |

### Return type
[**CreateAssetAccessRequestResponse**](../../docs/models/CreateAssetAccessRequestResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="cancelInvitesOrRequests"></a>
# **cancelInvitesOrRequests**
```java
Mono<DeleteInvitesResultsResponseArray> BusinessAccessInviteController.cancelInvitesOrRequests(businessIdcancelInvitesBody)
```

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Business id |
**cancelInvitesBody** | [**CancelInvitesBody**](../../docs/models/CancelInvitesBody.md) | A list with invite ids |

### Return type
[**DeleteInvitesResultsResponseArray**](../../docs/models/DeleteInvitesResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createAssetInvites"></a>
# **createAssetInvites**
```java
Mono<UpdateInvitesResultsResponseArray> BusinessAccessInviteController.createAssetInvites(businessIdcreateAssetInvitesRequest)
```

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](../../docs/models/CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  |

### Return type
[**UpdateInvitesResultsResponseArray**](../../docs/models/UpdateInvitesResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="createMembershipOrPartnershipInvites"></a>
# **createMembershipOrPartnershipInvites**
```java
Mono<CreateInvitesResultsResponseArray> BusinessAccessInviteController.createMembershipOrPartnershipInvites(businessIdcreateMembershipOrPartnershipInvitesBody)
```

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Business id |
**createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](../../docs/models/CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role |

### Return type
[**CreateInvitesResultsResponseArray**](../../docs/models/CreateInvitesResultsResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getInvites"></a>
# **getInvites**
```java
Mono<GetInvites200Response> BusinessAccessInviteController.getInvites(businessIdisMemberinviteStatusinviteTypebookmarkpageSize)
```

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `String` | Unique identifier of the requesting business. |
**isMember** | `Boolean` | A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional parameter] [default to `true`]
**inviteStatus** | [**List&lt;String&gt;**](../../docs/models/String.md) | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional parameter] [enum: `PENDING`, `EXPIRED`]
**inviteType** | [**InviteType**](../../docs/models/.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | [optional parameter] [enum: `MEMBER_INVITE`, `PARTNER_INVITE`, `PARTNER_REQUEST`]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]

### Return type
[**GetInvites200Response**](../../docs/models/GetInvites200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="respondBusinessAccessInvites"></a>
# **respondBusinessAccessInvites**
```java
Mono<RespondToInvitesResponseArray> BusinessAccessInviteController.respondBusinessAccessInvites(authRespondInvitesBody)
```

Accept or decline an invite/request

Accept or decline invites or requests.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**authRespondInvitesBody** | [**AuthRespondInvitesBody**](../../docs/models/AuthRespondInvitesBody.md) |  |

### Return type
[**RespondToInvitesResponseArray**](../../docs/models/RespondToInvitesResponseArray.md)

### Authorization
* **pinterest_oauth2**, scopes: `biz_access:read`, `biz_access:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

