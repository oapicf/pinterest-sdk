# OpenAPI\Client\UserAccountApi

All URIs are relative to https://api.pinterest.com/v5.

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics()**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet()**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account


## `userAccountAnalytics()`

```php
userAccountAnalytics($start_date, $end_date, $from_claimed_content, $pin_format, $app_types, $metric_types, $split_field, $ad_account_id): array<string,\OpenAPI\Client\Model\AnalyticsMetricsResponse>
```

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$from_claimed_content = 'BOTH'; // string | Filter on Pins that match your claimed domain.
$pin_format = 'ALL'; // string | Pin formats to get data for, default is all.
$app_types = 'ALL'; // string | Apps or devices to get data for, default is all.
$metric_types = array('metric_types_example'); // string[] | Metric types to get data for, default is all.
$split_field = 'NO_SPLIT'; // string | How to split the data into groups. Not including this param means data won't be split.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userAccountAnalytics($start_date, $end_date, $from_claimed_content, $pin_format, $app_types, $metric_types, $split_field, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**string[]**](../Model/string.md)| Metric types to get data for, default is all. | [optional]
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

## `userAccountGet()`

```php
userAccountGet($ad_account_id): \OpenAPI\Client\Model\Account
```

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userAccountGet($ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**\OpenAPI\Client\Model\Account**](../Model/Account.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
