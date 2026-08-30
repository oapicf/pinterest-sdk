# business_access_invite_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**respond_business_access_invites**](business_access_invite_api.md#respond_business_access_invites) | **PATCH** /businesses/invites | Accept or decline an invite/request
**asset_access_requests/create**](business_access_invite_api.md#asset_access_requests/create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner's assets.
**cancel_invites_or_requests**](business_access_invite_api.md#cancel_invites_or_requests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
**create_asset_invites**](business_access_invite_api.md#create_asset_invites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
**create_membership_or_partnership_invites**](business_access_invite_api.md#create_membership_or_partnership_invites) | **POST** /businesses/{business_id}/invites | Create invites or requests
**get/invites**](business_access_invite_api.md#get/invites) | **GET** /businesses/{business_id}/invites | Get invites/requests


# **respond_business_access_invites**
> models::RespondToInvitesResponseArray respond_business_access_invites(ctx, auth_respond_invites_body)
Accept or decline an invite/request

Accept or decline invites or requests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **auth_respond_invites_body** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  | 

### Return type

[**models::RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_access_requests/create**
> models::CreateAssetAccessRequestResponse asset_access_requests/create(ctx, business_id, create_asset_access_request_body)
Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **create_asset_access_request_body** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  | 

### Return type

[**models::CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_invites_or_requests**
> models::CancelInvitesResponse cancel_invites_or_requests(ctx, business_id, cancel_invites_request)
Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **cancel_invites_request** | [**CancelInvitesRequest**](CancelInvitesRequest.md)|  | 

### Return type

[**models::CancelInvitesResponse**](CancelInvitesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_asset_invites**
> models::UpdateInvitesResultsResponseArray create_asset_invites(ctx, business_id, create_asset_invites_request)
Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **create_asset_invites_request** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)|  | 

### Return type

[**models::UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_membership_or_partnership_invites**
> models::CreateInvitesResultsResponseArray create_membership_or_partnership_invites(ctx, business_id, create_membership_or_partnership_invites_body)
Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
  **create_membership_or_partnership_invites_body** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)|  | 

### Return type

[**models::CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get/invites**
> models::GetInvites200Response get/invites(ctx, business_id, optional)
Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **business_id** | **String**| Unique identifier of the requesting business. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **String**| Unique identifier of the requesting business. | 
 **is_member** | **bool**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [default to true]
 **invite_status** | [**models::InviteFilterStatus**](models::InviteFilterStatus.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | 
 **invite_type** | [****](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::GetInvites200Response**](get_invites_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

