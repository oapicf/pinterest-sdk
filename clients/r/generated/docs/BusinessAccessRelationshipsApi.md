# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BrandAccountsCreate**](BusinessAccessRelationshipsApi.md#BrandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**BrandAccountsUpdate**](BusinessAccessRelationshipsApi.md#BrandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**DeleteBusinessMembership**](BusinessAccessRelationshipsApi.md#DeleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**DeleteBusinessPartners**](BusinessAccessRelationshipsApi.md#DeleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**GetBusinessEmployers**](BusinessAccessRelationshipsApi.md#GetBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**GetBusinessMembers**](BusinessAccessRelationshipsApi.md#GetBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**GetBusinessPartners**](BusinessAccessRelationshipsApi.md#GetBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**SystemUserUpdate**](BusinessAccessRelationshipsApi.md#SystemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**UpdateBusinessMemberships**](BusinessAccessRelationshipsApi.md#UpdateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **BrandAccountsCreate**
> BrandAccount BrandAccountsCreate(business_hierarchy_id, brand_account_create)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example
```R
library(openapi)

# Create a Brand Account
#
# prepare function argument(s)
var_business_hierarchy_id <- "business_hierarchy_id_example" # character | business hierarchy node id
var_brand_account_create <- BrandAccountCreate$new(Country$new(), "name_example", "username_example", "about_example", BrandAccountProfileImage$new("image/jpeg", "data_example"), "website_example") # BrandAccountCreate | 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BrandAccountsCreate(var_business_hierarchy_id, var_brand_account_createdata_file = "result.txt")
result <- api_instance$BrandAccountsCreate(var_business_hierarchy_id, var_brand_account_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_hierarchy_id** | **character**| business hierarchy node id | 
 **brand_account_create** | [**BrandAccountCreate**](BrandAccountCreate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md)

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

# **BrandAccountsUpdate**
> BrandAccount BrandAccountsUpdate(brand_account_id, business_hierarchy_id, brand_account_update)

Update a Brand Account

Update an existing Brand Account

### Example
```R
library(openapi)

# Update a Brand Account
#
# prepare function argument(s)
var_brand_account_id <- "brand_account_id_example" # character | 
var_business_hierarchy_id <- "business_hierarchy_id_example" # character | business hierarchy node id
var_brand_account_update <- BrandAccountUpdate$new("about_example", Country$new(), "name_example", BrandAccountProfileImageUpdate$new("image/jpeg", "data_example"), "username_example", "website_example") # BrandAccountUpdate | 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BrandAccountsUpdate(var_brand_account_id, var_business_hierarchy_id, var_brand_account_updatedata_file = "result.txt")
result <- api_instance$BrandAccountsUpdate(var_brand_account_id, var_business_hierarchy_id, var_brand_account_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand_account_id** | **character**|  | 
 **business_hierarchy_id** | **character**| business hierarchy node id | 
 **brand_account_update** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md)

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
| **409** | The request could not be processed because of a conflict in the current state of the resource. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **DeleteBusinessMembership**
> DeleteBusinessMembership200Response DeleteBusinessMembership(business_id, delete_business_membership_body)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```R
library(openapi)

# Terminate business memberships
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Business id
var_delete_business_membership_body <- DeleteBusinessMembershipBody$new(c(DeleteBusinessMembershipMember$new(BusinessRoleForMembers$new(), "member_id_example"))) # DeleteBusinessMembershipBody | 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteBusinessMembership(var_business_id, var_delete_business_membership_bodydata_file = "result.txt")
result <- api_instance$DeleteBusinessMembership(var_business_id, var_delete_business_membership_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Business id | 
 **delete_business_membership_body** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  | 

### Return type

[**DeleteBusinessMembership200Response**](delete_business_membership_200_response.md)

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

# **DeleteBusinessPartners**
> DeleteBusinessPartners DeleteBusinessPartners(business_id, delete_business_partners_delete)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```R
library(openapi)

# Terminate business partnerships
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_delete_business_partners_delete <- DeleteBusinessPartnersDelete$new(c("partner_ids_example"), NullablePartnerType$new()) # DeleteBusinessPartnersDelete | 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteBusinessPartners(var_business_id, var_delete_business_partners_deletedata_file = "result.txt")
result <- api_instance$DeleteBusinessPartners(var_business_id, var_delete_business_partners_delete)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **delete_business_partners_delete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  | 

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **0** | An unexpected error response. |  -  |

# **GetBusinessEmployers**
> GetBusinessEmployers200Response GetBusinessEmployers(assets_summary = TRUE, bookmark = var.bookmark, page_size = 25)

List business employers for user

Get all of the viewing user's business employers.

### Example
```R
library(openapi)

# List business employers for user
#
# prepare function argument(s)
var_assets_summary <- TRUE # character | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBusinessEmployers(assets_summary = var_assets_summary, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$GetBusinessEmployers(assets_summary = var_assets_summary, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets_summary** | **character**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to TRUE]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **GetBusinessMembers**
> GetBusinessEmployers200Response GetBusinessMembers(business_id, fetch_system_users = FALSE, assets_summary = FALSE, business_roles = var.business_roles, member_ids = var.member_ids, start_index = 0, bookmark = var.bookmark, page_size = 25)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```R
library(openapi)

# Get business members
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_fetch_system_users <- FALSE # character | Fetches system users if True. Fetches regular user employees if False. (Optional)
var_assets_summary <- FALSE # character | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (Optional)
var_business_roles <- c(MemberBusinessRole$new()) # array[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (Optional)
var_member_ids <- "member_ids_example" # character | A list of business members ids separated by comma. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBusinessMembers(var_business_id, fetch_system_users = var_fetch_system_users, assets_summary = var_assets_summary, business_roles = var_business_roles, member_ids = var_member_ids, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$GetBusinessMembers(var_business_id, fetch_system_users = var_fetch_system_users, assets_summary = var_assets_summary, business_roles = var_business_roles, member_ids = var_member_ids, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **fetch_system_users** | **character**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to FALSE]
 **assets_summary** | **character**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to FALSE]
 **business_roles** | list( [**MemberBusinessRole**](MemberBusinessRole.md) )| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **member_ids** | **character**| A list of business members ids separated by comma. | [optional] 
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **GetBusinessPartners**
> GetBusinessEmployers200Response GetBusinessPartners(business_id, assets_summary = FALSE, partner_type = var.partner_type, partner_ids = var.partner_ids, start_index = 0, sort_ascending = var.sort_ascending, bookmark = var.bookmark, page_size = 25)

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```R
library(openapi)

# Get business partners
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_assets_summary <- FALSE # character | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (Optional)
var_partner_type <- PartnerType$new() # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (Optional)
var_partner_ids <- "partner_ids_example" # character | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_sort_ascending <- "sort_ascending_example" # character | Sort ascending. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetBusinessPartners(var_business_id, assets_summary = var_assets_summary, partner_type = var_partner_type, partner_ids = var_partner_ids, start_index = var_start_index, sort_ascending = var_sort_ascending, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$GetBusinessPartners(var_business_id, assets_summary = var_assets_summary, partner_type = var_partner_type, partner_ids = var_partner_ids, start_index = var_start_index, sort_ascending = var_sort_ascending, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **assets_summary** | **character**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to FALSE]
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partner_ids** | **character**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_ascending** | **character**| Sort ascending. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **SystemUserUpdate**
> SystemUserUpdate(business_id, system_user_id, system_user_update_with_required_body)

Update a system user information.

Update a system user information such as name.

### Example
```R
library(openapi)

# Update a system user information.
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_system_user_id <- "system_user_id_example" # character | Unique identifier of a system user.
var_system_user_update_with_required_body <- SystemUserUpdateWithRequiredBody$new("name_example") # SystemUserUpdateWithRequiredBody | 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$SystemUserUpdate(var_business_id, var_system_user_id, var_system_user_update_with_required_body)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **system_user_id** | **character**| Unique identifier of a system user. | 
 **system_user_update_with_required_body** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

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

# **UpdateBusinessMemberships**
> UpdateBusinessMembershipsResponse UpdateBusinessMemberships(business_id, business_membership_member)

Update member's business role

Update a member's business role within the business.

### Example
```R
library(openapi)

# Update member's business role
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Business id
var_business_membership_member <- c(BusinessMembershipMember$new(BusinessRoleForMembers$new(), "member_id_example")) # array[BusinessMembershipMember] | 

api_instance <- BusinessAccessRelationshipsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessMemberships(var_business_id, var_business_membership_memberdata_file = "result.txt")
result <- api_instance$UpdateBusinessMemberships(var_business_id, var_business_membership_member)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Business id | 
 **business_membership_member** | list( [**BusinessMembershipMember**](BusinessMembershipMember.md) )|  | 

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

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

