# BusinessAccessInviteAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BusinessAccessInviteAPI_assetAccessRequestsCreate**](BusinessAccessInviteAPI.md#BusinessAccessInviteAPI_assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**BusinessAccessInviteAPI_cancelInvitesOrRequests**](BusinessAccessInviteAPI.md#BusinessAccessInviteAPI_cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**BusinessAccessInviteAPI_createAssetInvites**](BusinessAccessInviteAPI.md#BusinessAccessInviteAPI_createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**BusinessAccessInviteAPI_createMembershipOrPartnershipInvites**](BusinessAccessInviteAPI.md#BusinessAccessInviteAPI_createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**BusinessAccessInviteAPI_getInvites**](BusinessAccessInviteAPI.md#BusinessAccessInviteAPI_getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**BusinessAccessInviteAPI_respondBusinessAccessInvites**](BusinessAccessInviteAPI.md#BusinessAccessInviteAPI_respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request


# **BusinessAccessInviteAPI_assetAccessRequestsCreate**
```c
// Create a request to access an existing partner's assets.
//
// Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
//
create_asset_access_request_response_t* BusinessAccessInviteAPI_assetAccessRequestsCreate(apiClient_t *apiClient, char *business_id, create_asset_access_request_body_t *create_asset_access_request_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**create_asset_access_request_body** | **[create_asset_access_request_body_t](create_asset_access_request_body.md) \*** |  | 

### Return type

[create_asset_access_request_response_t](create_asset_access_request_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessInviteAPI_cancelInvitesOrRequests**
```c
// Cancel invites/requests
//
// Cancel membership/partnership invites and/or requests.
//
delete_invites_results_response_array_t* BusinessAccessInviteAPI_cancelInvitesOrRequests(apiClient_t *apiClient, char *business_id, cancel_invites_body_t *cancel_invites_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Business id | 
**cancel_invites_body** | **[cancel_invites_body_t](cancel_invites_body.md) \*** | A list with invite ids | 

### Return type

[delete_invites_results_response_array_t](delete_invites_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessInviteAPI_createAssetInvites**
```c
// Update invite/request with an asset permission
//
// Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
//
update_invites_results_response_array_t* BusinessAccessInviteAPI_createAssetInvites(apiClient_t *apiClient, char *business_id, create_asset_invites_request_t *create_asset_invites_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**create_asset_invites_request** | **[create_asset_invites_request_t](create_asset_invites_request.md) \*** | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[update_invites_results_response_array_t](update_invites_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessInviteAPI_createMembershipOrPartnershipInvites**
```c
// Create invites or requests
//
// Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners
//
create_invites_results_response_array_t* BusinessAccessInviteAPI_createMembershipOrPartnershipInvites(apiClient_t *apiClient, char *business_id, create_membership_or_partnership_invites_body_t *create_membership_or_partnership_invites_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Business id | 
**create_membership_or_partnership_invites_body** | **[create_membership_or_partnership_invites_body_t](create_membership_or_partnership_invites_body.md) \*** | An object with the properties: invite_type, partners, members, business_role | 

### Return type

[create_invites_results_response_array_t](create_invites_results_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessInviteAPI_getInvites**
```c
// Get invites/requests
//
// Get the membership/partnership invites and/or requests for the authorized user.
//
get_invites_200_response_t* BusinessAccessInviteAPI_getInvites(apiClient_t *apiClient, char *business_id, int *is_member, list_t *invite_status, invite_type_e invite_type, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**business_id** | **char \*** | Unique identifier of the requesting business. | 
**is_member** | **int \*** | A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true]
**invite_status** | **[list_t](char.md) \*** | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
**invite_type** | **invite_type_e** | Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[get_invites_200_response_t](get_invites_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **BusinessAccessInviteAPI_respondBusinessAccessInvites**
```c
// Accept or decline an invite/request
//
// Accept or decline invites or requests.
//
respond_to_invites_response_array_t* BusinessAccessInviteAPI_respondBusinessAccessInvites(apiClient_t *apiClient, auth_respond_invites_body_t *auth_respond_invites_body);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**auth_respond_invites_body** | **[auth_respond_invites_body_t](auth_respond_invites_body.md) \*** |  | 

### Return type

[respond_to_invites_response_array_t](respond_to_invites_response_array.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

