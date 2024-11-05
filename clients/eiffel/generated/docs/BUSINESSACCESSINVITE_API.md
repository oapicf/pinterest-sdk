# BUSINESSACCESSINVITE_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**asset_access_requests_create**](BUSINESSACCESSINVITE_API.md#asset_access_requests_create) | **Post** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancel_invites_or_requests**](BUSINESSACCESSINVITE_API.md#cancel_invites_or_requests) | **Delete** /businesses/{business_id}/invites | Cancel invites/requests
[**create_asset_invites**](BUSINESSACCESSINVITE_API.md#create_asset_invites) | **Post** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**create_membership_or_partnership_invites**](BUSINESSACCESSINVITE_API.md#create_membership_or_partnership_invites) | **Post** /businesses/{business_id}/invites | Create invites or requests
[**invites**](BUSINESSACCESSINVITE_API.md#invites) | **Get** /businesses/{business_id}/invites | Get invites/requests
[**respond_business_access_invites**](BUSINESSACCESSINVITE_API.md#respond_business_access_invites) | **Patch** /businesses/invites | Accept or decline an invite/request


# **asset_access_requests_create**
> asset_access_requests_create (business_id: STRING_32 ; create_asset_access_request_body: CREATE_ASSET_ACCESS_REQUEST_BODY ): detachable CREATE_ASSET_ACCESS_REQUEST_RESPONSE


Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **create_asset_access_request_body** | [**CREATE_ASSET_ACCESS_REQUEST_BODY**](CREATE_ASSET_ACCESS_REQUEST_BODY.md)|  | 

### Return type

[**CREATE_ASSET_ACCESS_REQUEST_RESPONSE**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_invites_or_requests**
> cancel_invites_or_requests (business_id: STRING_32 ; cancel_invites_body: CANCEL_INVITES_BODY ): detachable DELETE_INVITES_RESULTS_RESPONSE_ARRAY


Cancel invites/requests

Cancel membership/partnership invites and/or requests.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Business id | [default to null]
 **cancel_invites_body** | [**CANCEL_INVITES_BODY**](CANCEL_INVITES_BODY.md)| A list with invite ids | 

### Return type

[**DELETE_INVITES_RESULTS_RESPONSE_ARRAY**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_asset_invites**
> create_asset_invites (business_id: STRING_32 ; create_asset_invites_request: CREATE_ASSET_INVITES_REQUEST ): detachable UPDATE_INVITES_RESULTS_RESPONSE_ARRAY


Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **create_asset_invites_request** | [**CREATE_ASSET_INVITES_REQUEST**](CREATE_ASSET_INVITES_REQUEST.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[**UPDATE_INVITES_RESULTS_RESPONSE_ARRAY**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_membership_or_partnership_invites**
> create_membership_or_partnership_invites (business_id: STRING_32 ; create_membership_or_partnership_invites_body: CREATE_MEMBERSHIP_OR_PARTNERSHIP_INVITES_BODY ): detachable CREATE_INVITES_RESULTS_RESPONSE_ARRAY


Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Business id | [default to null]
 **create_membership_or_partnership_invites_body** | [**CREATE_MEMBERSHIP_OR_PARTNERSHIP_INVITES_BODY**](CREATE_MEMBERSHIP_OR_PARTNERSHIP_INVITES_BODY.md)| An object with the properties: invite_type, partners, members, business_role | 

### Return type

[**CREATE_INVITES_RESULTS_RESPONSE_ARRAY**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invites**
> invites (business_id: STRING_32 ; is_member:  detachable BOOLEAN ; invite_status:  detachable LIST [STRING_32] ; invite_type:  detachable INVITE_TYPE ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable GET_INVITES_200_RESPONSE


Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **STRING_32**| Unique identifier of the requesting business. | [default to null]
 **is_member** | **BOOLEAN**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true]
 **invite_status** | [**LIST [STRING_32]**](STRING_32.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] [default to null]
 **invite_type** | [**INVITE_TYPE**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GET_INVITES_200_RESPONSE**](get_invites_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **respond_business_access_invites**
> respond_business_access_invites (auth_respond_invites_body: AUTH_RESPOND_INVITES_BODY ): detachable RESPOND_TO_INVITES_RESPONSE_ARRAY


Accept or decline an invite/request

Accept or decline invites or requests.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_respond_invites_body** | [**AUTH_RESPOND_INVITES_BODY**](AUTH_RESPOND_INVITES_BODY.md)|  | 

### Return type

[**RESPOND_TO_INVITES_RESPONSE_ARRAY**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

