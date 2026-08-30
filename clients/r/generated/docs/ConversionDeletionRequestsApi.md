# ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionDeletionRequestCreate**](ConversionDeletionRequestsApi.md#ConversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**ConversionDeletionRequestDelete**](ConversionDeletionRequestsApi.md#ConversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**ConversionDeletionRequestGet**](ConversionDeletionRequestsApi.md#ConversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**ConversionDeletionRequestList**](ConversionDeletionRequestsApi.md#ConversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


# **ConversionDeletionRequestCreate**
> ConversionDeletionRequest ConversionDeletionRequestCreate(ad_account_id, conversion_deletion_request_create)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example
```R
library(openapi)

# Create a conversion deletion request
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_conversion_deletion_request_create <- ConversionDeletionRequestCreate$new(ConversionDeletionRequestTargets$new(c("user_emails_example"), c("epiks_example"))) # ConversionDeletionRequestCreate | 

api_instance <- ConversionDeletionRequestsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ConversionDeletionRequestCreate(var_ad_account_id, var_conversion_deletion_request_createdata_file = "result.txt")
result <- api_instance$ConversionDeletionRequestCreate(var_ad_account_id, var_conversion_deletion_request_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **conversion_deletion_request_create** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md)|  | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **ConversionDeletionRequestDelete**
> ConversionDeletionRequest ConversionDeletionRequestDelete(request_id, ad_account_id)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

### Example
```R
library(openapi)

# Delete a conversion deletion request
#
# prepare function argument(s)
var_request_id <- "request_id_example" # character | Unique identifier of the conversion deletion request
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- ConversionDeletionRequestsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ConversionDeletionRequestDelete(var_request_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$ConversionDeletionRequestDelete(var_request_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **character**| Unique identifier of the conversion deletion request | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **ConversionDeletionRequestGet**
> ConversionDeletionRequest ConversionDeletionRequestGet(request_id, ad_account_id)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

### Example
```R
library(openapi)

# Get a single conversion deletion request
#
# prepare function argument(s)
var_request_id <- "request_id_example" # character | Unique identifier of the conversion deletion request
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- ConversionDeletionRequestsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ConversionDeletionRequestGet(var_request_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$ConversionDeletionRequestGet(var_request_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_id** | **character**| Unique identifier of the conversion deletion request | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

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

# **ConversionDeletionRequestList**
> ConversionDeletionRequestList200Response ConversionDeletionRequestList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

### Example
```R
library(openapi)

# List conversion deletion requests
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)

api_instance <- ConversionDeletionRequestsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ConversionDeletionRequestList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_orderdata_file = "result.txt")
result <- api_instance$ConversionDeletionRequestList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order)
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

[**ConversionDeletionRequestList200Response**](conversion_deletion_request_list_200_response.md)

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

