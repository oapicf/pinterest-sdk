# CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CustomerSegmentCreate**](CustomerSegmentApi.md#CustomerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**CustomerSegmentList**](CustomerSegmentApi.md#CustomerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**CustomerSegmentUpdate**](CustomerSegmentApi.md#CustomerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **CustomerSegmentCreate**
> CustomerSegment CustomerSegmentCreate(ad_account_id, customer_segment_create)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example
```R
library(openapi)

# Create customer segments
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_customer_segment_create <- CustomerSegmentCreate$new(c("audience_ids_example"), "name_example") # CustomerSegmentCreate | 

api_instance <- CustomerSegmentApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerSegmentCreate(var_ad_account_id, var_customer_segment_createdata_file = "result.txt")
result <- api_instance$CustomerSegmentCreate(var_ad_account_id, var_customer_segment_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **customer_segment_create** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | 

### Return type

[**CustomerSegment**](CustomerSegment.md)

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

# **CustomerSegmentList**
> CustomerSegmentList200Response CustomerSegmentList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, include_sizing = FALSE, search_query = var.search_query)

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example
```R
library(openapi)

# List customer segments
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_include_sizing <- FALSE # character | Include audience sizing in result or not (Optional)
var_search_query <- "search_query_example" # character | Search query. Can contain pin description keywords or comma-separated pin IDs. (Optional)

api_instance <- CustomerSegmentApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CustomerSegmentList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, include_sizing = var_include_sizing, search_query = var_search_querydata_file = "result.txt")
result <- api_instance$CustomerSegmentList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, include_sizing = var_include_sizing, search_query = var_search_query)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **include_sizing** | **character**| Include audience sizing in result or not | [optional] [default to FALSE]
 **search_query** | **character**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**CustomerSegmentList200Response**](customer_segment_list_200_response.md)

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

# **CustomerSegmentUpdate**
> CustomerSegmentUpdate(ad_account_id, customer_segment_update_request_update_with_required_body)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example
```R
library(openapi)

# Update customer segments
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_customer_segment_update_request_update_with_required_body <- CustomerSegmentUpdateRequestUpdateWithRequiredBody$new("id_example", AudienceUpdateOperationType$new(), c("audience_ids_example")) # CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

api_instance <- CustomerSegmentApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$CustomerSegmentUpdate(var_ad_account_id, var_customer_segment_update_request_update_with_required_body)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **customer_segment_update_request_update_with_required_body** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

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

