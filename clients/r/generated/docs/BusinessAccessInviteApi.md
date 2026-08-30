# BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetAccessRequestsCreate**](BusinessAccessInviteApi.md#AssetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**CancelInvitesOrRequests**](BusinessAccessInviteApi.md#CancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**CreateAssetInvites**](BusinessAccessInviteApi.md#CreateAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**CreateMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#CreateMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**GetInvites**](BusinessAccessInviteApi.md#GetInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**RespondBusinessAccessInvites**](BusinessAccessInviteApi.md#RespondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request


# **AssetAccessRequestsCreate**
> CreateAssetAccessRequestResponse AssetAccessRequestsCreate(business_id, create_asset_access_request_body)

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```R
library(openapi)

# Create a request to access an existing partner's assets.
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_create_asset_access_request_body <- CreateAssetAccessRequestBody$new(c(CreateAssetAccessRequestItem$new(c(key = c(Permissions$new())), "partner_id_example"))) # CreateAssetAccessRequestBody | 

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetAccessRequestsCreate(var_business_id, var_create_asset_access_request_bodydata_file = "result.txt")
result <- api_instance$AssetAccessRequestsCreate(var_business_id, var_create_asset_access_request_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **create_asset_access_request_body** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  | 

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CancelInvitesOrRequests**
> CancelInvitesResponse CancelInvitesOrRequests(business_id, cancel_invites_request)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```R
library(openapi)

# Cancel invites/requests
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_cancel_invites_request <- CancelInvitesRequest$new(c("invite_ids_example")) # CancelInvitesRequest | 

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelInvitesOrRequests(var_business_id, var_cancel_invites_requestdata_file = "result.txt")
result <- api_instance$CancelInvitesOrRequests(var_business_id, var_cancel_invites_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **cancel_invites_request** | [**CancelInvitesRequest**](CancelInvitesRequest.md)|  | 

### Return type

[**CancelInvitesResponse**](CancelInvitesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

# **CreateAssetInvites**
> UpdateInvitesResultsResponseArray CreateAssetInvites(business_id, create_asset_invites_request)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```R
library(openapi)

# Update invite/request with an asset permission
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_create_asset_invites_request <- CreateAssetInvitesRequest$new(c(CreateAssetInvitesRequestItem$new(c(key = c(Permissions$new())), "invite_id_example", InviteType$new()))) # CreateAssetInvitesRequest | 

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateAssetInvites(var_business_id, var_create_asset_invites_requestdata_file = "result.txt")
result <- api_instance$CreateAssetInvites(var_business_id, var_create_asset_invites_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **create_asset_invites_request** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)|  | 

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **CreateMembershipOrPartnershipInvites**
> CreateInvitesResultsResponseArray CreateMembershipOrPartnershipInvites(business_id, create_membership_or_partnership_invites_body)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example
```R
library(openapi)

# Create invites or requests
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_create_membership_or_partnership_invites_body <- CreateMembershipOrPartnershipInvitesBody$new(BusinessRoleForInvite$new(), InviteType$new(), c("members_example"), c("partners_example")) # CreateMembershipOrPartnershipInvitesBody | 

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateMembershipOrPartnershipInvites(var_business_id, var_create_membership_or_partnership_invites_bodydata_file = "result.txt")
result <- api_instance$CreateMembershipOrPartnershipInvites(var_business_id, var_create_membership_or_partnership_invites_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **create_membership_or_partnership_invites_body** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)|  | 

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **GetInvites**
> GetInvites200Response GetInvites(business_id, is_member = TRUE, invite_status = var.invite_status, invite_type = var.invite_type, bookmark = var.bookmark, page_size = 25)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```R
library(openapi)

# Get invites/requests
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_is_member <- TRUE # character | A boolean field to indicate whether the invite is to create a partnership or a membership. (Optional)
var_invite_status <- c(InviteFilterStatus$new()) # array[InviteFilterStatus] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (Optional)
var_invite_type <- InviteType$new() # InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetInvites(var_business_id, is_member = var_is_member, invite_status = var_invite_status, invite_type = var_invite_type, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$GetInvites(var_business_id, is_member = var_is_member, invite_status = var_invite_status, invite_type = var_invite_type, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **is_member** | **character**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to TRUE]
 **invite_status** | list( [**InviteFilterStatus**](InviteFilterStatus.md) )| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
 **invite_type** | [**InviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetInvites200Response**](get_invites_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **RespondBusinessAccessInvites**
> RespondToInvitesResponseArray RespondBusinessAccessInvites(auth_respond_invites_body)

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```R
library(openapi)

# Accept or decline an invite/request
#
# prepare function argument(s)
var_auth_respond_invites_body <- AuthRespondInvitesBody$new(c(AuthRespondInvitesBodyItem$new(AuthRespondInviteAction$new("accept_invite_example", c(key = c(Permissions$new()))), "invite_id_example"))) # AuthRespondInvitesBody | 

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RespondBusinessAccessInvites(var_auth_respond_invites_bodydata_file = "result.txt")
result <- api_instance$RespondBusinessAccessInvites(var_auth_respond_invites_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_respond_invites_body** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  | 

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

