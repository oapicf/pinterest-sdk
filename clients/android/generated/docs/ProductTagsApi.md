# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productTagsBulkAdd**](ProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**productTagsBulkDelete**](ProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**productTagsList**](ProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin



## productTagsBulkAdd

> ProductTagsResponse productTagsBulkAdd(pinId, productTagsBulkAddRequest)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductTagsApi;

ProductTagsApi apiInstance = new ProductTagsApi();
String pinId = null; // String | Unique identifier of the hero pin that will receive product tags.
ProductTagsBulkAddRequest productTagsBulkAddRequest = new ProductTagsBulkAddRequest(); // ProductTagsBulkAddRequest | 
try {
    ProductTagsResponse result = apiInstance.productTagsBulkAdd(pinId, productTagsBulkAddRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductTagsApi#productTagsBulkAdd");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | [default to null]
 **productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productTagsBulkDelete

> productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductTagsApi;

ProductTagsApi apiInstance = new ProductTagsApi();
String pinId = null; // String | Unique identifier of the hero pin that will receive product tags.
ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest = new ProductTagsBulkDeleteRequest(); // ProductTagsBulkDeleteRequest | 
try {
    apiInstance.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductTagsApi#productTagsBulkDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | [default to null]
 **productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## productTagsList

> ProductTagsResponse productTagsList(pinId)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProductTagsApi;

ProductTagsApi apiInstance = new ProductTagsApi();
String pinId = null; // String | Unique identifier of the hero pin that will receive product tags.
try {
    ProductTagsResponse result = apiInstance.productTagsList(pinId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductTagsApi#productTagsList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | [default to null]

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

