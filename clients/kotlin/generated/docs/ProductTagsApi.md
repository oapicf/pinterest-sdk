# ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**productTagsBulkAdd**](ProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
| [**productTagsBulkDelete**](ProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
| [**productTagsList**](ProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |


<a id="productTagsBulkAdd"></a>
# **productTagsBulkAdd**
> ProductTagsResponse productTagsBulkAdd(pinId, productTagsBulkAddRequest)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductTagsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of the hero pin that will receive product tags.
val productTagsBulkAddRequest : ProductTagsBulkAddRequest =  // ProductTagsBulkAddRequest | 
try {
    val result : ProductTagsResponse = apiInstance.productTagsBulkAdd(pinId, productTagsBulkAddRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductTagsApi#productTagsBulkAdd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductTagsApi#productTagsBulkAdd")
    e.printStackTrace()
}
```

### Parameters
| **pinId** | **kotlin.String**| Unique identifier of the hero pin that will receive product tags. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  | |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="productTagsBulkDelete"></a>
# **productTagsBulkDelete**
> productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductTagsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of the hero pin that will receive product tags.
val productTagsBulkDeleteRequest : ProductTagsBulkDeleteRequest =  // ProductTagsBulkDeleteRequest | 
try {
    apiInstance.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)
} catch (e: ClientException) {
    println("4xx response calling ProductTagsApi#productTagsBulkDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductTagsApi#productTagsBulkDelete")
    e.printStackTrace()
}
```

### Parameters
| **pinId** | **kotlin.String**| Unique identifier of the hero pin that will receive product tags. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="productTagsList"></a>
# **productTagsList**
> ProductTagsResponse productTagsList(pinId)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductTagsApi()
val pinId : kotlin.String = pinId_example // kotlin.String | Unique identifier of the hero pin that will receive product tags.
try {
    val result : ProductTagsResponse = apiInstance.productTagsList(pinId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductTagsApi#productTagsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductTagsApi#productTagsList")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pinId** | **kotlin.String**| Unique identifier of the hero pin that will receive product tags. | |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

