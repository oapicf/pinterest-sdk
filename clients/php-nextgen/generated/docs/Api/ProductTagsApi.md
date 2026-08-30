# OpenAPI\Client\ProductTagsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**productTagsBulkAdd()**](ProductTagsApi.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
| [**productTagsBulkDelete()**](ProductTagsApi.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
| [**productTagsList()**](ProductTagsApi.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |


## `productTagsBulkAdd()`

```php
productTagsBulkAdd($pin_id, $product_tags_bulk_add_request): \OpenAPI\Client\Model\ProductTagsResponse
```

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin_id = 'pin_id_example'; // string | Unique identifier of the hero pin that will receive product tags.
$product_tags_bulk_add_request = new \OpenAPI\Client\Model\ProductTagsBulkAddRequest(); // \OpenAPI\Client\Model\ProductTagsBulkAddRequest

try {
    $result = $apiInstance->productTagsBulkAdd($pin_id, $product_tags_bulk_add_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductTagsApi->productTagsBulkAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pin_id** | **string**| Unique identifier of the hero pin that will receive product tags. | |
| **product_tags_bulk_add_request** | [**\OpenAPI\Client\Model\ProductTagsBulkAddRequest**](../Model/ProductTagsBulkAddRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ProductTagsResponse**](../Model/ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productTagsBulkDelete()`

```php
productTagsBulkDelete($pin_id, $product_tags_bulk_delete_request)
```

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin_id = 'pin_id_example'; // string | Unique identifier of the hero pin that will receive product tags.
$product_tags_bulk_delete_request = new \OpenAPI\Client\Model\ProductTagsBulkDeleteRequest(); // \OpenAPI\Client\Model\ProductTagsBulkDeleteRequest

try {
    $apiInstance->productTagsBulkDelete($pin_id, $product_tags_bulk_delete_request);
} catch (Exception $e) {
    echo 'Exception when calling ProductTagsApi->productTagsBulkDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pin_id** | **string**| Unique identifier of the hero pin that will receive product tags. | |
| **product_tags_bulk_delete_request** | [**\OpenAPI\Client\Model\ProductTagsBulkDeleteRequest**](../Model/ProductTagsBulkDeleteRequest.md)|  | |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productTagsList()`

```php
productTagsList($pin_id): \OpenAPI\Client\Model\ProductTagsResponse
```

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin_id = 'pin_id_example'; // string | Unique identifier of the hero pin that will receive product tags.

try {
    $result = $apiInstance->productTagsList($pin_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductTagsApi->productTagsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pin_id** | **string**| Unique identifier of the hero pin that will receive product tags. | |

### Return type

[**\OpenAPI\Client\Model\ProductTagsResponse**](../Model/ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
