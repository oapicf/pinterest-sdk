# OpenAPI\Client\BulkApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**bulkDownloadCreate()**](BulkApi.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk |
| [**bulkRequestGet()**](BulkApi.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk |
| [**bulkUpsertCreate()**](BulkApi.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk |


## `bulkDownloadCreate()`

```php
bulkDownloadCreate($ad_account_id, $bulk_download_request): \OpenAPI\Client\Model\BulkDownloadResponse
```

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bulk_download_request = new \OpenAPI\Client\Model\BulkDownloadRequest(); // \OpenAPI\Client\Model\BulkDownloadRequest | Parameters to get ad entities in bulk

try {
    $result = $apiInstance->bulkDownloadCreate($ad_account_id, $bulk_download_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->bulkDownloadCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bulk_download_request** | [**\OpenAPI\Client\Model\BulkDownloadRequest**](../Model/BulkDownloadRequest.md)| Parameters to get ad entities in bulk | |

### Return type

[**\OpenAPI\Client\Model\BulkDownloadResponse**](../Model/BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `bulkRequestGet()`

```php
bulkRequestGet($ad_account_id, $bulk_request_id, $include_details): \OpenAPI\Client\Model\BulkUpsertStatusResponse
```

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bulk_request_id = 'bulk_request_id_example'; // string | Unique identifier of a bulk upsert request.
$include_details = false; // bool | if set to True then attach the errors/details to all the requests

try {
    $result = $apiInstance->bulkRequestGet($ad_account_id, $bulk_request_id, $include_details);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->bulkRequestGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bulk_request_id** | **string**| Unique identifier of a bulk upsert request. | |
| **include_details** | **bool**| if set to True then attach the errors/details to all the requests | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\BulkUpsertStatusResponse**](../Model/BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `bulkUpsertCreate()`

```php
bulkUpsertCreate($ad_account_id, $bulk_upsert_request): \OpenAPI\Client\Model\BulkUpsertResponse
```

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BulkApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bulk_upsert_request = new \OpenAPI\Client\Model\BulkUpsertRequest(); // \OpenAPI\Client\Model\BulkUpsertRequest | Parameters to get create/update ad entities in bulk

try {
    $result = $apiInstance->bulkUpsertCreate($ad_account_id, $bulk_upsert_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BulkApi->bulkUpsertCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bulk_upsert_request** | [**\OpenAPI\Client\Model\BulkUpsertRequest**](../Model/BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | |

### Return type

[**\OpenAPI\Client\Model\BulkUpsertResponse**](../Model/BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
