# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductTagsBulkAdd**](ProductTagsApi.md#ProductTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**ProductTagsBulkDelete**](ProductTagsApi.md#ProductTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**ProductTagsList**](ProductTagsApi.md#ProductTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


# **ProductTagsBulkAdd**
> ProductTagsResponse ProductTagsBulkAdd(pin_id, product_tags_bulk_add_request)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example
```R
library(openapi)

# Add product tags to pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | Unique identifier of the hero pin that will receive product tags.
var_product_tags_bulk_add_request <- ProductTagsBulkAddRequest$new(c(ProductTagItem$new("pin_id_example"))) # ProductTagsBulkAddRequest | 

api_instance <- ProductTagsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductTagsBulkAdd(var_pin_id, var_product_tags_bulk_add_requestdata_file = "result.txt")
result <- api_instance$ProductTagsBulkAdd(var_pin_id, var_product_tags_bulk_add_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**| Unique identifier of the hero pin that will receive product tags. | 
 **product_tags_bulk_add_request** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request contains ineligible product tags. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **ProductTagsBulkDelete**
> ProductTagsBulkDelete(pin_id, product_tags_bulk_delete_request)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example
```R
library(openapi)

# Delete product tags from pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | Unique identifier of the hero pin that will receive product tags.
var_product_tags_bulk_delete_request <- ProductTagsBulkDeleteRequest$new(c(ProductTagItem$new("pin_id_example"))) # ProductTagsBulkDeleteRequest | 

api_instance <- ProductTagsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$ProductTagsBulkDelete(var_pin_id, var_product_tags_bulk_delete_request)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**| Unique identifier of the hero pin that will receive product tags. | 
 **product_tags_bulk_delete_request** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  | 

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
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **ProductTagsList**
> ProductTagsResponse ProductTagsList(pin_id)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example
```R
library(openapi)

# Get product tags for pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | Unique identifier of the hero pin that will receive product tags.

api_instance <- ProductTagsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductTagsList(var_pin_iddata_file = "result.txt")
result <- api_instance$ProductTagsList(var_pin_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**| Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

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

