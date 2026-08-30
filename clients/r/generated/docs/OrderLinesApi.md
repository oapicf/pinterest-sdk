# OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderLinesGet**](OrderLinesApi.md#OrderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**OrderLinesList**](OrderLinesApi.md#OrderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines.


# **OrderLinesGet**
> OrderLine OrderLinesGet(order_line_id, ad_account_id)

Get order line

Get a specific existing order line associated with an ad account.

### Example
```R
library(openapi)

# Get order line
#
# prepare function argument(s)
var_order_line_id <- "order_line_id_example" # character | Order line ID.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- OrderLinesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$OrderLinesGet(var_order_line_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$OrderLinesGet(var_order_line_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_line_id** | **character**| Order line ID. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**OrderLine**](OrderLine.md)

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

# **OrderLinesList**
> OrderLinesList200Response OrderLinesList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order)

Get order lines.

List existing order lines associated with an ad account.

### Example
```R
library(openapi)

# Get order lines.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)

api_instance <- OrderLinesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$OrderLinesList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_orderdata_file = "result.txt")
result <- api_instance$OrderLinesList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**OrderLinesList200Response**](order_lines_list_200_response.md)

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

