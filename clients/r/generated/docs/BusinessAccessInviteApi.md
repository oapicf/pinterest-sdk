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
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_create_asset_access_request_body <- CreateAssetAccessRequestBody$new(c(CreateAssetAccessRequestBody_asset_requests_inner$new("partner_id_example", c(key = c(Permissions$new()))))) # CreateAssetAccessRequestBody | 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **CancelInvitesOrRequests**
> DeleteInvitesResultsResponseArray CancelInvitesOrRequests(business_id, cancel_invites_body)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```R
library(openapi)

# Cancel invites/requests
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Business id
var_cancel_invites_body <- CancelInvitesBody$new(c("invite_ids_example")) # CancelInvitesBody | A list with invite ids

api_instance <- BusinessAccessInviteApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CancelInvitesOrRequests(var_business_id, var_cancel_invites_bodydata_file = "result.txt")
result <- api_instance$CancelInvitesOrRequests(var_business_id, var_cancel_invites_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Business id | 
 **cancel_invites_body** | [**CancelInvitesBody**](CancelInvitesBody.md)| A list with invite ids | 

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

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
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_create_asset_invites_request <- CreateAssetInvitesRequest$new(c(CreateAssetInvitesRequestItem$new("invite_id_example", InviteType$new(), c(key = c(Permissions$new()))))) # CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

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
 **create_asset_invites_request** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

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
var_business_id <- "729090764583391194" # character | Business id
var_create_membership_or_partnership_invites_body <- CreateMembershipOrPartnershipInvitesBody$new("EMPLOYEE", InviteType$new(), c("members_example"), c("partners_example")) # CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

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
 **business_id** | **character**| Business id | 
 **create_membership_or_partnership_invites_body** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

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
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_is_member <- TRUE # character | A boolean field to indicate whether the invite is to create a partnership or a membership. (Optional)
var_invite_status <- c("PENDING") # array[character] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (Optional)
var_invite_type <- InviteType$new() # InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)

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
 **invite_status** | Enum [PENDING, EXPIRED] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
 **invite_type** | [**InviteType**](.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

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
var_auth_respond_invites_body <- AuthRespondInvitesBody$new(c(AuthRespondInvitesBody_invites_inner$new(AuthRespondInvitesBody_invites_inner_action$new("accept_invite_example", c(key = c(Permissions$new()))), "invite_id_example"))) # AuthRespondInvitesBody | 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

