# OpenAPI\Client\TermsOfServiceApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**termsOfServiceGet()**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |


## `termsOfServiceGet()`

```php
termsOfServiceGet($ad_account_id, $include_html, $tos_type): \OpenAPI\Client\Model\TermsOfService
```

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TermsOfServiceApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$include_html = false; // bool | Return HTML in TOS text.
$tos_type = 'tos_type_example'; // string | Request type.

try {
    $result = $apiInstance->termsOfServiceGet($ad_account_id, $include_html, $tos_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TermsOfServiceApi->termsOfServiceGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **include_html** | **bool**| Return HTML in TOS text. | [optional] [default to false] |
| **tos_type** | **string**| Request type. | [optional] |

### Return type

[**\OpenAPI\Client\Model\TermsOfService**](../Model/TermsOfService.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
