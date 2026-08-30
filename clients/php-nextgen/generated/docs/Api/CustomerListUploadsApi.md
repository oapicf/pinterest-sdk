# OpenAPI\Client\CustomerListUploadsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerListUploadsCreate()**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
| [**customerListUploadsGet()**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
| [**customerListUploadsRun()**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |


## `customerListUploadsCreate()`

```php
customerListUploadsCreate($ad_account_id, $customer_list_id, $customer_list_upload_create_request): \OpenAPI\Client\Model\CustomerListUploadCreateResponse
```

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListUploadsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$customer_list_id = 'customer_list_id_example'; // string | Customer list ID.
$customer_list_upload_create_request = new \OpenAPI\Client\Model\CustomerListUploadCreateRequest(); // \OpenAPI\Client\Model\CustomerListUploadCreateRequest

try {
    $result = $apiInstance->customerListUploadsCreate($ad_account_id, $customer_list_id, $customer_list_upload_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListUploadsApi->customerListUploadsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **customer_list_id** | **string**| Customer list ID. | |
| **customer_list_upload_create_request** | [**\OpenAPI\Client\Model\CustomerListUploadCreateRequest**](../Model/CustomerListUploadCreateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CustomerListUploadCreateResponse**](../Model/CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerListUploadsGet()`

```php
customerListUploadsGet($ad_account_id, $customer_list_id, $customer_list_upload_id): \OpenAPI\Client\Model\CustomerListUpload
```

Get customer list upload

Get the metadata for a given upload by its ID.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListUploadsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$customer_list_id = 'customer_list_id_example'; // string | Customer list ID.
$customer_list_upload_id = 'customer_list_upload_id_example'; // string | Customer List Upload ID.

try {
    $result = $apiInstance->customerListUploadsGet($ad_account_id, $customer_list_id, $customer_list_upload_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListUploadsApi->customerListUploadsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **customer_list_id** | **string**| Customer list ID. | |
| **customer_list_upload_id** | **string**| Customer List Upload ID. | |

### Return type

[**\OpenAPI\Client\Model\CustomerListUpload**](../Model/CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerListUploadsRun()`

```php
customerListUploadsRun($ad_account_id, $customer_list_id, $customer_list_upload_id): \OpenAPI\Client\Model\CustomerListUpload
```

Run customer list upload

Begin processing a customer list upload.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListUploadsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$customer_list_id = 'customer_list_id_example'; // string | Customer list ID.
$customer_list_upload_id = 'customer_list_upload_id_example'; // string | Customer List Upload ID.

try {
    $result = $apiInstance->customerListUploadsRun($ad_account_id, $customer_list_id, $customer_list_upload_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListUploadsApi->customerListUploadsRun: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **customer_list_id** | **string**| Customer list ID. | |
| **customer_list_upload_id** | **string**| Customer List Upload ID. | |

### Return type

[**\OpenAPI\Client\Model\CustomerListUpload**](../Model/CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
