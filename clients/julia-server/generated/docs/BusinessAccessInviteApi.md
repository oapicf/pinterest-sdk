# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_access_requests_create**](BusinessAccessInviteApi.md#asset_access_requests_create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancel_invites_or_requests**](BusinessAccessInviteApi.md#cancel_invites_or_requests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**create_asset_invites**](BusinessAccessInviteApi.md#create_asset_invites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**create_membership_or_partnership_invites**](BusinessAccessInviteApi.md#create_membership_or_partnership_invites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**get_invites**](BusinessAccessInviteApi.md#get_invites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respond_business_access_invites**](BusinessAccessInviteApi.md#respond_business_access_invites) | **PATCH** /businesses/invites | Accept or decline an invite/request


# **asset_access_requests_create**
> `asset_access_requests_create`(req::`HTTP.Request`, `business_id`::`String`, `create_asset_access_request_body`::`CreateAssetAccessRequestBody`;) -> `CreateAssetAccessRequestResponse`

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`create_asset_access_request_body`** | [**`CreateAssetAccessRequestBody`**](CreateAssetAccessRequestBody.md)|  |

### Return type

[**`CreateAssetAccessRequestResponse`**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_invites_or_requests**
> `cancel_invites_or_requests`(req::`HTTP.Request`, `business_id`::`String`, `cancel_invites_request`::`CancelInvitesRequest`;) -> `CancelInvitesResponse`

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`cancel_invites_request`** | [**`CancelInvitesRequest`**](CancelInvitesRequest.md)|  |

### Return type

[**`CancelInvitesResponse`**](CancelInvitesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_asset_invites**
> `create_asset_invites`(req::`HTTP.Request`, `business_id`::`String`, `create_asset_invites_request`::`CreateAssetInvitesRequest`;) -> `UpdateInvitesResultsResponseArray`

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`create_asset_invites_request`** | [**`CreateAssetInvitesRequest`**](CreateAssetInvitesRequest.md)|  |

### Return type

[**`UpdateInvitesResultsResponseArray`**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_membership_or_partnership_invites**
> `create_membership_or_partnership_invites`(req::`HTTP.Request`, `business_id`::`String`, `create_membership_or_partnership_invites_body`::`CreateMembershipOrPartnershipInvitesBody`;) -> `CreateInvitesResultsResponseArray`

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |
**`create_membership_or_partnership_invites_body`** | [**`CreateMembershipOrPartnershipInvitesBody`**](CreateMembershipOrPartnershipInvitesBody.md)|  |

### Return type

[**`CreateInvitesResultsResponseArray`**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_invites**
> `get_invites`(req::`HTTP.Request`, `business_id`::`String`; `is_member`=nothing, `invite_status`=nothing, `invite_type`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `GetInvites200Response`

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`business_id`** | **`String`**| Unique identifier of the requesting business. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`is_member`** | **`Bool`**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [default to true]
 **`invite_status`** | [**`Vector{InviteFilterStatus}`**](InviteFilterStatus.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [default to nothing]
 **`invite_type`** | [**`InviteType`**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`GetInvites200Response`**](GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **respond_business_access_invites**
> `respond_business_access_invites`(req::`HTTP.Request`, `auth_respond_invites_body`::`AuthRespondInvitesBody`;) -> `RespondToInvitesResponseArray`

Accept or decline an invite/request

Accept or decline invites or requests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`auth_respond_invites_body`** | [**`AuthRespondInvitesBody`**](AuthRespondInvitesBody.md)|  |

### Return type

[**`RespondToInvitesResponseArray`**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

