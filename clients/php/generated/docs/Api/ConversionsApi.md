# OpenAPI\Client\ConversionsApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**advertiserDefinedEventsCreate()**](ConversionsApi.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
| [**advertiserDefinedEventsDelete()**](ConversionsApi.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
| [**advertiserDefinedEventsGet()**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
| [**advertiserDefinedEventsUpdate()**](ConversionsApi.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |


## `advertiserDefinedEventsCreate()`

```php
advertiserDefinedEventsCreate($ad_account_id, $advertiser_defined_events_create_request): \OpenAPI\Client\Model\AdvertiserDefinedEventsCreate200Response
```

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$advertiser_defined_events_create_request = new \OpenAPI\Client\Model\AdvertiserDefinedEventsCreateRequest(); // \OpenAPI\Client\Model\AdvertiserDefinedEventsCreateRequest

try {
    $result = $apiInstance->advertiserDefinedEventsCreate($ad_account_id, $advertiser_defined_events_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionsApi->advertiserDefinedEventsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **advertiser_defined_events_create_request** | [**\OpenAPI\Client\Model\AdvertiserDefinedEventsCreateRequest**](../Model/AdvertiserDefinedEventsCreateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdvertiserDefinedEventsCreate200Response**](../Model/AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `advertiserDefinedEventsDelete()`

```php
advertiserDefinedEventsDelete($ad_account_id, $event_names): \OpenAPI\Client\Model\AdvertiserDefinedEventsCreate200Response
```

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$event_names = array('event_names_example'); // string[] | List of event names to delete

try {
    $result = $apiInstance->advertiserDefinedEventsDelete($ad_account_id, $event_names);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionsApi->advertiserDefinedEventsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **event_names** | [**string[]**](../Model/string.md)| List of event names to delete | |

### Return type

[**\OpenAPI\Client\Model\AdvertiserDefinedEventsCreate200Response**](../Model/AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `advertiserDefinedEventsGet()`

```php
advertiserDefinedEventsGet($ad_account_id): \OpenAPI\Client\Model\AdvertiserDefinedEventsGet200Response
```

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->advertiserDefinedEventsGet($ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionsApi->advertiserDefinedEventsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\AdvertiserDefinedEventsGet200Response**](../Model/AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `advertiserDefinedEventsUpdate()`

```php
advertiserDefinedEventsUpdate($ad_account_id, $advertiser_defined_events_create_request): \OpenAPI\Client\Model\AdvertiserDefinedEventsCreate200Response
```

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$advertiser_defined_events_create_request = new \OpenAPI\Client\Model\AdvertiserDefinedEventsCreateRequest(); // \OpenAPI\Client\Model\AdvertiserDefinedEventsCreateRequest

try {
    $result = $apiInstance->advertiserDefinedEventsUpdate($ad_account_id, $advertiser_defined_events_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionsApi->advertiserDefinedEventsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **advertiser_defined_events_create_request** | [**\OpenAPI\Client\Model\AdvertiserDefinedEventsCreateRequest**](../Model/AdvertiserDefinedEventsCreateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdvertiserDefinedEventsCreate200Response**](../Model/AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
