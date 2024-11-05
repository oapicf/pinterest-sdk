# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetAccessRequests/create**](BusinessAccessInviteApi.md#assetAccessRequests/create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets. |
| [**cancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**createAssetInvites**](BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**createMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**get/invites**](BusinessAccessInviteApi.md#get/invites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**respondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |


<a name="assetAccessRequests/create"></a>
# **assetAccessRequests/create**
> CreateAssetAccessRequestResponse assetAccessRequests/create(business\_id, CreateAssetAccessRequestBody)

Create a request to access an existing partner&#39;s assets.

    Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **CreateAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](../Models/CreateAssetAccessRequestBody.md)|  | |

### Return type

[**CreateAssetAccessRequestResponse**](../Models/CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="cancelInvitesOrRequests"></a>
# **cancelInvitesOrRequests**
> DeleteInvitesResultsResponseArray cancelInvitesOrRequests(business\_id, CancelInvitesBody)

Cancel invites/requests

    Cancel membership/partnership invites and/or requests.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Business id | [default to null] |
| **CancelInvitesBody** | [**CancelInvitesBody**](../Models/CancelInvitesBody.md)| A list with invite ids | |

### Return type

[**DeleteInvitesResultsResponseArray**](../Models/DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createAssetInvites"></a>
# **createAssetInvites**
> UpdateInvitesResultsResponseArray createAssetInvites(business\_id, CreateAssetInvitesRequest)

Update invite/request with an asset permission

    Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **CreateAssetInvitesRequest** | [**CreateAssetInvitesRequest**](../Models/CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | |

### Return type

[**UpdateInvitesResultsResponseArray**](../Models/UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createMembershipOrPartnershipInvites"></a>
# **createMembershipOrPartnershipInvites**
> CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(business\_id, CreateMembershipOrPartnershipInvitesBody)

Create invites or requests

    Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Business id | [default to null] |
| **CreateMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](../Models/CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | |

### Return type

[**CreateInvitesResultsResponseArray**](../Models/CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="get/invites"></a>
# **get/invites**
> get_invites_200_response get/invites(business\_id, is\_member, invite\_status, invite\_type, bookmark, page\_size)

Get invites/requests

    Get the membership/partnership invites and/or requests for the authorized user.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **business\_id** | **String**| Unique identifier of the requesting business. | [default to null] |
| **is\_member** | **Boolean**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true] |
| **invite\_status** | [**List**](../Models/String.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] [default to null] [enum: PENDING, EXPIRED] |
| **invite\_type** | [**InviteType**](../Models/.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] [default to null] [enum: MEMBER_INVITE, PARTNER_INVITE, PARTNER_REQUEST] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**get_invites_200_response**](../Models/get_invites_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="respondBusinessAccessInvites"></a>
# **respondBusinessAccessInvites**
> RespondToInvitesResponseArray respondBusinessAccessInvites(AuthRespondInvitesBody)

Accept or decline an invite/request

    Accept or decline invites or requests.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **AuthRespondInvitesBody** | [**AuthRespondInvitesBody**](../Models/AuthRespondInvitesBody.md)|  | |

### Return type

[**RespondToInvitesResponseArray**](../Models/RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

