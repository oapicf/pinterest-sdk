# OpenAPI\Client\ConversionEqsApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**conversionEqsList()**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |


## `conversionEqsList()`

```php
conversionEqsList($lookback_period, $ad_account_id, $source_platform, $ingestion_source): \OpenAPI\Client\Model\EventQualityScore[]
```

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionEqsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$lookback_period = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\LookbackPeriodOptions(); // \OpenAPI\Client\Model\LookbackPeriodOptions | Lookback window (number of days).
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$source_platform = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\SourcePlatformOptions(); // \OpenAPI\Client\Model\SourcePlatformOptions | Source platform of event.
$ingestion_source = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\IngestionSourceOptions(); // \OpenAPI\Client\Model\IngestionSourceOptions | Ingestion source of event.

try {
    $result = $apiInstance->conversionEqsList($lookback_period, $ad_account_id, $source_platform, $ingestion_source);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionEqsApi->conversionEqsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **lookback_period** | [**\OpenAPI\Client\Model\LookbackPeriodOptions**](../Model/.md)| Lookback window (number of days). | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **source_platform** | [**\OpenAPI\Client\Model\SourcePlatformOptions**](../Model/.md)| Source platform of event. | [optional] |
| **ingestion_source** | [**\OpenAPI\Client\Model\IngestionSourceOptions**](../Model/.md)| Ingestion source of event. | [optional] |

### Return type

[**\OpenAPI\Client\Model\EventQualityScore[]**](../Model/EventQualityScore.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
