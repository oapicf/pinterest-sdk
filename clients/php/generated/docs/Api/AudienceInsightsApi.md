# OpenAPI\Client\AudienceInsightsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**audienceInsightsGet()**](AudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights |
| [**audienceInsightsScopeAndTypeGet()**](AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type |


## `audienceInsightsGet()`

```php
audienceInsightsGet($ad_account_id, $audience_insight_type): \OpenAPI\Client\Model\AudienceInsightsResponse
```

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceInsightsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$audience_insight_type = new \OpenAPI\Client\Model\AudienceInsightType(); // AudienceInsightType | Type of audience insights.

try {
    $result = $apiInstance->audienceInsightsGet($ad_account_id, $audience_insight_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceInsightsApi->audienceInsightsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **audience_insight_type** | [**AudienceInsightType**](../Model/.md)| Type of audience insights. | |

### Return type

[**\OpenAPI\Client\Model\AudienceInsightsResponse**](../Model/AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audienceInsightsScopeAndTypeGet()`

```php
audienceInsightsScopeAndTypeGet($ad_account_id): \OpenAPI\Client\Model\AudienceDefinitionResponse
```

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceInsightsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->audienceInsightsScopeAndTypeGet($ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceInsightsApi->audienceInsightsScopeAndTypeGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\AudienceDefinitionResponse**](../Model/AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
