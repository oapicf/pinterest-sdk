# OpenAPI\Client\OauthApi

All URIs are relative to https://api.pinterest.com/v5.

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthToken()**](OauthApi.md#oauthToken) | **POST** /oauth/token | Generate OAuth access token


## `oauthToken()`

```php
oauthToken($grant_type): \OpenAPI\Client\Model\OauthAccessTokenResponse
```

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\OauthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$grant_type = 'grant_type_example'; // string

try {
    $result = $apiInstance->oauthToken($grant_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OauthApi->oauthToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | **string**|  |

### Return type

[**\OpenAPI\Client\Model\OauthAccessTokenResponse**](../Model/OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
