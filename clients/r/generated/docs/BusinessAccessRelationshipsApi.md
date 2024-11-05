# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteBusinessMembership**](BusinessAccessRelationshipsApi.md#DeleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**DeleteBusinessPartners**](BusinessAccessRelationshipsApi.md#DeleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**GetBusinessEmployers**](BusinessAccessRelationshipsApi.md#GetBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**GetBusinessMembers**](BusinessAccessRelationshipsApi.md#GetBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**GetBusinessPartners**](BusinessAccessRelationshipsApi.md#GetBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**UpdateBusinessMemberships**](BusinessAccessRelationshipsApi.md#UpdateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **DeleteBusinessMembership**
> DeletedMembersResponse DeleteBusinessMembership(business_id, members_to_delete_body)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```R
library(openapi)

# Terminate business memberships
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Business id
var_members_to_delete_body <- MembersToDeleteBody$new(c(MembersToDeleteBody_members_inner$new("member_id_example", BusinessRoleForMembers$new()))) # MembersToDeleteBody | List of members with role to delete.

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteBusinessMembership(var_business_id, var_members_to_delete_bodydata_file = "result.txt")
result <- api_instance$DeleteBusinessMembership(var_business_id, var_members_to_delete_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Business id | 
 **members_to_delete_body** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

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

# **DeleteBusinessPartners**
> DeletePartnersResponse DeleteBusinessPartners(business_id, delete_partners_request)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```R
library(openapi)

# Terminate business partnerships
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_delete_partners_request <- DeletePartnersRequest$new(c("partner_ids_example"), "partner_type_example") # DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteBusinessPartners(var_business_id, var_delete_partners_requestdata_file = "result.txt")
result <- api_instance$DeleteBusinessPartners(var_business_id, var_delete_partners_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **delete_partners_request** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | A supplied partner id doesn&#39;t exist |  -  |
| **0** | Unexpected error |  -  |

# **GetBusinessEmployers**
> GetBusinessEmployers200Response GetBusinessEmployers(page_size = 25, bookmark = var.bookmark)

List business employers for user

Get all of the viewing user's business employers.

### Example
```R
library(openapi)

# List business employers for user
#
# prepare function argument(s)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBusinessEmployers(page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$GetBusinessEmployers(page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessEmployers200Response**](get_business_employers_200_response.md)

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

# **GetBusinessMembers**
> GetBusinessMembers200Response GetBusinessMembers(business_id, assets_summary = FALSE, business_roles = var.business_roles, member_ids = var.member_ids, start_index = 0, bookmark = var.bookmark, page_size = 25)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```R
library(openapi)

# Get business members
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_assets_summary <- FALSE # character | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (Optional)
var_business_roles <- c(MemberBusinessRole$new()) # array[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (Optional)
var_member_ids <- "00101010101,2222220101" # character | A list of business members ids separated by comma. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBusinessMembers(var_business_id, assets_summary = var_assets_summary, business_roles = var_business_roles, member_ids = var_member_ids, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$GetBusinessMembers(var_business_id, assets_summary = var_assets_summary, business_roles = var_business_roles, member_ids = var_member_ids, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **assets_summary** | **character**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to FALSE]
 **business_roles** | list( [**MemberBusinessRole**](MemberBusinessRole.md) )| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **member_ids** | **character**| A list of business members ids separated by comma. | [optional] 
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](get_business_members_200_response.md)

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

# **GetBusinessPartners**
> GetBusinessPartners200Response GetBusinessPartners(business_id, assets_summary = FALSE, partner_type = var.partner_type, partner_ids = var.partner_ids, start_index = 0, page_size = 25, bookmark = var.bookmark)

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```R
library(openapi)

# Get business partners
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_assets_summary <- FALSE # character | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (Optional)
var_partner_type <- PartnerType$new() # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (Optional)
var_partner_ids <- "00101010101,2222220101" # character | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBusinessPartners(var_business_id, assets_summary = var_assets_summary, partner_type = var_partner_type, partner_ids = var_partner_ids, start_index = var_start_index, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$GetBusinessPartners(var_business_id, assets_summary = var_assets_summary, partner_type = var_partner_type, partner_ids = var_partner_ids, start_index = var_start_index, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **assets_summary** | **character**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to FALSE]
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partner_ids** | **character**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessPartners200Response**](get_business_partners_200_response.md)

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

# **UpdateBusinessMemberships**
> UpdateMemberResultsResponseArray UpdateBusinessMemberships(business_id, update_member_business_role_body)

Update member's business role

Update a member's business role within the business.

### Example
```R
library(openapi)

# Update member's business role
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Business id
var_update_member_business_role_body <- c(UpdateMemberBusinessRoleBody$new(BusinessRoleForMembers$new(), "member_id_example")) # array[UpdateMemberBusinessRoleBody] | List of objects with the member id and the business_role.

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessMemberships(var_business_id, var_update_member_business_role_bodydata_file = "result.txt")
result <- api_instance$UpdateBusinessMemberships(var_business_id, var_update_member_business_role_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Business id | 
 **update_member_business_role_body** | list( [**UpdateMemberBusinessRoleBody**](UpdateMemberBusinessRoleBody.md) )| List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

