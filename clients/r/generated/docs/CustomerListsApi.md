# CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerListsCreate**](CustomerListsApi.md#CustomerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**CustomerListsGet**](CustomerListsApi.md#CustomerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**CustomerListsList**](CustomerListsApi.md#CustomerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**CustomerListsUpdate**](CustomerListsApi.md#CustomerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


# **CustomerListsCreate**
> CustomerList CustomerListsCreate(ad_account_id, customer_list_create)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example
```R
library(openapi)

# Create customer lists
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_customer_list_create <- CustomerListCreate$new("name_example", "is_nca_example", UserListType$new(), "records_example", c(CustomerListRecordRow$new("email_example", "external_id_example", "hashed_phone_number_example", "hashed_pinner_id_example", "ip_address_example", "liveramp_envelope_example", "maid_example", "user_agent_example"))) # CustomerListCreate | 

api_instance <- CustomerListsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListsCreate(var_ad_account_id, var_customer_list_createdata_file = "result.txt")
result <- api_instance$CustomerListsCreate(var_ad_account_id, var_customer_list_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **customer_list_create** | [**CustomerListCreate**](CustomerListCreate.md)|  | 

### Return type

[**CustomerList**](CustomerList.md)

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

# **CustomerListsGet**
> CustomerList CustomerListsGet(ad_account_id, customer_list_id)

Get customer list

Gets a specific customer list given the customer list ID.

### Example
```R
library(openapi)

# Get customer list
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_customer_list_id <- "customer_list_id_example" # character | Customer list ID.

api_instance <- CustomerListsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListsGet(var_ad_account_id, var_customer_list_iddata_file = "result.txt")
result <- api_instance$CustomerListsGet(var_ad_account_id, var_customer_list_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **customer_list_id** | **character**| Customer list ID. | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **CustomerListsList**
> CustomerListsList200Response CustomerListsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, exclude_nca = FALSE)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```R
library(openapi)

# Get customer lists
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_exclude_nca <- FALSE # character | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). (Optional)

api_instance <- CustomerListsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, exclude_nca = var_exclude_ncadata_file = "result.txt")
result <- api_instance$CustomerListsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, exclude_nca = var_exclude_nca)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **exclude_nca** | **character**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to FALSE]

### Return type

[**CustomerListsList200Response**](customer_lists_list_200_response.md)

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

# **CustomerListsUpdate**
> CustomerList CustomerListsUpdate(ad_account_id, customer_list_id, customer_list_update_with_required_body)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```R
library(openapi)

# Update customer list
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_customer_list_id <- "customer_list_id_example" # character | Customer list ID.
var_customer_list_update_with_required_body <- CustomerListUpdateWithRequiredBody$new(UserListOperationType$new(), "records_example", c(CustomerListRecordRow$new("email_example", "external_id_example", "hashed_phone_number_example", "hashed_pinner_id_example", "ip_address_example", "liveramp_envelope_example", "maid_example", "user_agent_example"))) # CustomerListUpdateWithRequiredBody | 

api_instance <- CustomerListsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerListsUpdate(var_ad_account_id, var_customer_list_id, var_customer_list_update_with_required_bodydata_file = "result.txt")
result <- api_instance$CustomerListsUpdate(var_ad_account_id, var_customer_list_id, var_customer_list_update_with_required_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **customer_list_id** | **character**| Customer list ID. | 
 **customer_list_update_with_required_body** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md)|  | 

### Return type

[**CustomerList**](CustomerList.md)

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

