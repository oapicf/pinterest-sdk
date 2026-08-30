# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productTagsBulkAdd**](ProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
| [**productTagsBulkDelete**](ProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
| [**productTagsList**](ProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |



## productTagsBulkAdd

> ProductTagsResponse productTagsBulkAdd(pinId, productTagsBulkAddRequest)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | |
| **productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  | |

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
| **200** | An unexpected error response. |  -  |


## productTagsBulkDelete

> void productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | |
| **productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  | |

### Return type

[**void**](Void.md)

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
| **200** | An unexpected error response. |  -  |


## productTagsList

> ProductTagsResponse productTagsList(pinId)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | |

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
| **200** | An unexpected error response. |  -  |

