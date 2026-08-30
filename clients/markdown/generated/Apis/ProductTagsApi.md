# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productTags/bulkAdd**](ProductTagsApi.md#productTags/bulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
| [**productTags/bulkDelete**](ProductTagsApi.md#productTags/bulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
| [**productTags/list**](ProductTagsApi.md#productTags/list) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |


<a name="productTags/bulkAdd"></a>
# **productTags/bulkAdd**
> ProductTagsResponse productTags/bulkAdd(pin\_id, ProductTagsBulkAddRequest)

Add product tags to pin

    Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pin\_id** | **String**| Unique identifier of the hero pin that will receive product tags. | [default to null] |
| **ProductTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](../Models/ProductTagsBulkAddRequest.md)|  | |

### Return type

[**ProductTagsResponse**](../Models/ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="productTags/bulkDelete"></a>
# **productTags/bulkDelete**
> productTags/bulkDelete(pin\_id, ProductTagsBulkDeleteRequest)

Delete product tags from pin

    Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pin\_id** | **String**| Unique identifier of the hero pin that will receive product tags. | [default to null] |
| **ProductTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](../Models/ProductTagsBulkDeleteRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="productTags/list"></a>
# **productTags/list**
> ProductTagsResponse productTags/list(pin\_id)

Get product tags for pin

    Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pin\_id** | **String**| Unique identifier of the hero pin that will receive product tags. | [default to null] |

### Return type

[**ProductTagsResponse**](../Models/ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

