# OpenAPI\Client\NotificationApi

Send notifications.

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**notificationPost()**](NotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners. |


## `notificationPost()`

```php
notificationPost($notification_post_request): \OpenAPI\Client\Model\NotificationResponse
```

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\NotificationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$notification_post_request = new \OpenAPI\Client\Model\NotificationPostRequest(); // \OpenAPI\Client\Model\NotificationPostRequest

try {
    $result = $apiInstance->notificationPost($notification_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling NotificationApi->notificationPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notification_post_request** | [**\OpenAPI\Client\Model\NotificationPostRequest**](../Model/NotificationPostRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\NotificationResponse**](../Model/NotificationResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
