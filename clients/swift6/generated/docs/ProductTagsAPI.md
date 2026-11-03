# ProductTagsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productTagsBulkAdd**](ProductTagsAPI.md#producttagsbulkadd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**productTagsBulkDelete**](ProductTagsAPI.md#producttagsbulkdelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**productTagsList**](ProductTagsAPI.md#producttagslist) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


# **productTagsBulkAdd**
```swift
    open class func productTagsBulkAdd(pinId: String, productTagsBulkAddRequest: ProductTagsBulkAddRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ProductTagsResponse
```

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of the hero pin that will receive product tags.
let productTagsBulkAddRequest = ProductTagsBulkAddRequest(productTags: [ProductTagItem(pinId: "pinId_example")]) // ProductTagsBulkAddRequest | 

// Add product tags to pin
do {
    let response = try await ProductTagsAPI.productTagsBulkAdd(pinId: pinId, productTagsBulkAddRequest: productTagsBulkAddRequest)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String** | Unique identifier of the hero pin that will receive product tags. | 
 **productTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md) |  | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productTagsBulkDelete**
```swift
    open class func productTagsBulkDelete(pinId: String, productTagsBulkDeleteRequest: ProductTagsBulkDeleteRequest, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse)
```

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of the hero pin that will receive product tags.
let productTagsBulkDeleteRequest = ProductTagsBulkDeleteRequest(productTags: [ProductTagItem(pinId: "pinId_example")]) // ProductTagsBulkDeleteRequest | 

// Delete product tags from pin
do {
    try await ProductTagsAPI.productTagsBulkDelete(pinId: pinId, productTagsBulkDeleteRequest: productTagsBulkDeleteRequest)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String** | Unique identifier of the hero pin that will receive product tags. | 
 **productTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md) |  | 

### Return type

Void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **productTagsList**
```swift
    open class func productTagsList(pinId: String, apiConfiguration: OpenAPIClientAPIConfiguration = OpenAPIClientAPIConfiguration.shared) async throws(ErrorResponse) -> ProductTagsResponse
```

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let pinId = "pinId_example" // String | Unique identifier of the hero pin that will receive product tags.

// Get product tags for pin
do {
    let response = try await ProductTagsAPI.productTagsList(pinId: pinId)
    dump(response)
} catch {
    print(error)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String** | Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

