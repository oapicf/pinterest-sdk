# PinterestSdk.ProductTagsApi

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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ProductTagsApi();
let pinId = "pinId_example"; // String | Unique identifier of the hero pin that will receive product tags.
let productTagsBulkAddRequest = new PinterestSdk.ProductTagsBulkAddRequest(); // ProductTagsBulkAddRequest | 
apiInstance.productTagsBulkAdd(pinId, productTagsBulkAddRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ProductTagsApi();
let pinId = "pinId_example"; // String | Unique identifier of the hero pin that will receive product tags.
let productTagsBulkDeleteRequest = new PinterestSdk.ProductTagsBulkDeleteRequest(); // ProductTagsBulkDeleteRequest | 
apiInstance.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | 
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

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.ProductTagsApi();
let pinId = "pinId_example"; // String | Unique identifier of the hero pin that will receive product tags.
apiInstance.productTagsList(pinId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **String**| Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

