# OpenAPI\Client\PinsApi

All URIs are relative to https://api.pinterest.com/v5.

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics()**](PinsApi.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate()**](PinsApi.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete()**](PinsApi.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet()**](PinsApi.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin


## `pinsAnalytics()`

```php
pinsAnalytics($pin_id, $start_date, $end_date, $metric_types, $app_types, $split_field, $ad_account_id): array<string,\OpenAPI\Client\Model\AnalyticsMetricsResponse>
```

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin_id = 'pin_id_example'; // string | Unique identifier of a Pin.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$metric_types = array('metric_types_example'); // string[] | Pin metric types to get data for, default is all.
$app_types = 'ALL'; // string | Apps or devices to get data for, default is all.
$split_field = 'NO_SPLIT'; // string | How to split the data into groups. Not including this param means data won't be split.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->pinsAnalytics($pin_id, $start_date, $end_date, $metric_types, $app_types, $split_field, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **string**| Unique identifier of a Pin. |
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **metric_types** | [**string[]**](../Model/string.md)| Pin metric types to get data for, default is all. |
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **split_field** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**array<string,\OpenAPI\Client\Model\AnalyticsMetricsResponse>**](../Model/AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pinsCreate()`

```php
pinsCreate($pin): \OpenAPI\Client\Model\Pin
```

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin = new \OpenAPI\Client\Model\Pin(); // \OpenAPI\Client\Model\Pin | Create a new Pin.

try {
    $result = $apiInstance->pinsCreate($pin);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin** | [**\OpenAPI\Client\Model\Pin**](../Model/Pin.md)| Create a new Pin. |

### Return type

[**\OpenAPI\Client\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pinsDelete()`

```php
pinsDelete($pin_id)
```

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin_id = 'pin_id_example'; // string | Unique identifier of a Pin.

try {
    $apiInstance->pinsDelete($pin_id);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **string**| Unique identifier of a Pin. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pinsGet()`

```php
pinsGet($pin_id, $ad_account_id): \OpenAPI\Client\Model\Pin
```

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PinsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$pin_id = 'pin_id_example'; // string | Unique identifier of a Pin.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->pinsGet($pin_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PinsApi->pinsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **string**| Unique identifier of a Pin. |
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**\OpenAPI\Client\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
