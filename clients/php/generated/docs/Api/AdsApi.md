# OpenAPI\Client\AdsApi

View, create or update ads.

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adPreviewsCreate()**](AdsApi.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**adTargetingAnalyticsGet()**](AdsApi.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads |
| [**adsAnalytics()**](AdsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics |
| [**adsCreate()**](AdsApi.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**adsGet()**](AdsApi.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**adsList()**](AdsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**adsUpdate()**](AdsApi.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |
| [**campaignAdPreviewCreate()**](AdsApi.md#campaignAdPreviewCreate) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups |
| [**campaignAdPreviewDelete()**](AdsApi.md#campaignAdPreviewDelete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups |
| [**campaignAdPreviewRead()**](AdsApi.md#campaignAdPreviewRead) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups |


## `adPreviewsCreate()`

```php
adPreviewsCreate($ad_account_id, $ad_preview_request): \OpenAPI\Client\Model\AdPreviewURLResponse
```

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_preview_request = new \OpenAPI\Client\Model\AdPreviewRequest(); // \OpenAPI\Client\Model\AdPreviewRequest

try {
    $result = $apiInstance->adPreviewsCreate($ad_account_id, $ad_preview_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adPreviewsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_preview_request** | [**\OpenAPI\Client\Model\AdPreviewRequest**](../Model/AdPreviewRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdPreviewURLResponse**](../Model/AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adTargetingAnalyticsGet()`

```php
adTargetingAnalyticsGet($ad_account_id, $ad_ids, $start_date, $end_date, $targeting_types, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $attribution_types, $reporting_timezone, $sort_columns, $sort_ascending): \OpenAPI\Client\Model\MetricsResponse
```

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_ids = array('ad_ids_example'); // string[] | List of Ad Ids to use to filter the results.
$start_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$targeting_types = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AdsAnalyticsAdTargetingType()); // \OpenAPI\Client\Model\AdsAnalyticsAdTargetingType[] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
$columns = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingColumnSync()); // \OpenAPI\Client\Model\ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$granularity = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Granularity(); // \OpenAPI\Client\Model\Granularity | TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$click_window_days = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ConversionAttributionWindowDays(); // \OpenAPI\Client\Model\ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ConversionAttributionWindowDays(); // \OpenAPI\Client\Model\ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
$view_window_days = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ConversionAttributionWindowDays(); // \OpenAPI\Client\Model\ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ConversionReportTimeType(); // \OpenAPI\Client\Model\ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
$attribution_types = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ConversionReportAttributionType()); // \OpenAPI\Client\Model\ConversionReportAttributionType[] | List of types of attribution for the conversion report
$reporting_timezone = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingTimeZone(); // \OpenAPI\Client\Model\ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
$sort_columns = array('sort_columns_example'); // string[] | Sort Columns.
$sort_ascending = True; // bool | Sort ascending.

try {
    $result = $apiInstance->adTargetingAnalyticsGet($ad_account_id, $ad_ids, $start_date, $end_date, $targeting_types, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $attribution_types, $reporting_timezone, $sort_columns, $sort_ascending);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adTargetingAnalyticsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_ids** | [**string[]**](../Model/string.md)| List of Ad Ids to use to filter the results. | |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **targeting_types** | [**\OpenAPI\Client\Model\AdsAnalyticsAdTargetingType[]**](../Model/\OpenAPI\Client\Model\AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | |
| **columns** | [**\OpenAPI\Client\Model\ReportingColumnSync[]**](../Model/\OpenAPI\Client\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | |
| **click_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](../Model/.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] |
| **engagement_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](../Model/.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] |
| **view_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](../Model/.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] |
| **conversion_report_time** | [**\OpenAPI\Client\Model\ConversionReportTimeType**](../Model/.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] |
| **attribution_types** | [**\OpenAPI\Client\Model\ConversionReportAttributionType[]**](../Model/\OpenAPI\Client\Model\ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] |
| **reporting_timezone** | [**\OpenAPI\Client\Model\ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |
| **sort_columns** | [**string[]**](../Model/string.md)| Sort Columns. | [optional] |
| **sort_ascending** | **bool**| Sort ascending. | [optional] |

### Return type

[**\OpenAPI\Client\Model\MetricsResponse**](../Model/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsAnalytics()`

```php
adsAnalytics($start_date, $end_date, $columns, $granularity, $ad_account_id, $pin_ids, $ad_ids, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $campaign_ids, $reporting_timezone): \OpenAPI\Client\Model\AdsAnalytics[]
```

Get ad analytics

Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$columns = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingColumnSync()); // \OpenAPI\Client\Model\ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$granularity = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Granularity(); // \OpenAPI\Client\Model\Granularity | TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$pin_ids = array('pin_ids_example'); // string[] | List of Pin IDs.
$ad_ids = array('ad_ids_example'); // string[] | List of Ad Ids to use to filter the results.
$click_window_days = 30; // float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
$view_window_days = 1; // float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = 'TIME_OF_AD_ACTION'; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$reporting_timezone = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingTimeZone(); // \OpenAPI\Client\Model\ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.

try {
    $result = $apiInstance->adsAnalytics($start_date, $end_date, $columns, $granularity, $ad_account_id, $pin_ids, $ad_ids, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $campaign_ids, $reporting_timezone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **columns** | [**\OpenAPI\Client\Model\ReportingColumnSync[]**](../Model/\OpenAPI\Client\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **pin_ids** | [**string[]**](../Model/string.md)| List of Pin IDs. | [optional] |
| **ad_ids** | [**string[]**](../Model/string.md)| List of Ad Ids to use to filter the results. | [optional] |
| **click_window_days** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagement_window_days** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] |
| **view_window_days** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;] |
| **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional] |
| **reporting_timezone** | [**\OpenAPI\Client\Model\ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdsAnalytics[]**](../Model/AdsAnalytics.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsCreate()`

```php
adsCreate($ad_account_id, $ad_create): \OpenAPI\Client\Model\AdBatchWriteResponseModel
```

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_create = array(new \OpenAPI\Client\Model\AdCreate()); // \OpenAPI\Client\Model\AdCreate[]

try {
    $result = $apiInstance->adsCreate($ad_account_id, $ad_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_create** | [**\OpenAPI\Client\Model\AdCreate[]**](../Model/AdCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdBatchWriteResponseModel**](../Model/AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsGet()`

```php
adsGet($ad_id, $ad_account_id): \OpenAPI\Client\Model\Ad
```

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_id = 'ad_id_example'; // string | The ID of this ad.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->adsGet($ad_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_id** | **string**| The ID of this ad. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\Ad**](../Model/Ad.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsList()`

```php
adsList($ad_account_id, $bookmark, $page_size, $order, $campaign_ids, $ad_group_ids, $ad_ids, $entity_statuses): \OpenAPI\Client\Model\AdsList200Response
```

List ads

List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
$ad_ids = array('ad_ids_example'); // string[] | List of Ad Ids to use to filter the results.
$entity_statuses = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\EntityStatus()); // \OpenAPI\Client\Model\EntityStatus[] | Entity status

try {
    $result = $apiInstance->adsList($ad_account_id, $bookmark, $page_size, $order, $campaign_ids, $ad_group_ids, $ad_ids, $entity_statuses);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional] |
| **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] |
| **ad_ids** | [**string[]**](../Model/string.md)| List of Ad Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**\OpenAPI\Client\Model\EntityStatus[]**](../Model/\OpenAPI\Client\Model\EntityStatus.md)| Entity status | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdsList200Response**](../Model/AdsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsUpdate()`

```php
adsUpdate($ad_account_id, $ad_batch_update): \OpenAPI\Client\Model\AdBatchWriteResponseModel
```

Update ads

Update multiple existing ads

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_batch_update = array(new \OpenAPI\Client\Model\AdBatchUpdate()); // \OpenAPI\Client\Model\AdBatchUpdate[]

try {
    $result = $apiInstance->adsUpdate($ad_account_id, $ad_batch_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->adsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_batch_update** | [**\OpenAPI\Client\Model\AdBatchUpdate[]**](../Model/AdBatchUpdate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdBatchWriteResponseModel**](../Model/AdBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `campaignAdPreviewCreate()`

```php
campaignAdPreviewCreate($ad_account_id, $campaign_ad_preview_create): \OpenAPI\Client\Model\CampaignAdPreviewCreate200ResponseInner[]
```

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$campaign_ad_preview_create = array(new \OpenAPI\Client\Model\CampaignAdPreviewCreate()); // \OpenAPI\Client\Model\CampaignAdPreviewCreate[]

try {
    $result = $apiInstance->campaignAdPreviewCreate($ad_account_id, $campaign_ad_preview_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->campaignAdPreviewCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **campaign_ad_preview_create** | [**\OpenAPI\Client\Model\CampaignAdPreviewCreate[]**](../Model/CampaignAdPreviewCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CampaignAdPreviewCreate200ResponseInner[]**](../Model/CampaignAdPreviewCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `campaignAdPreviewDelete()`

```php
campaignAdPreviewDelete($ad_group_ids, $ad_account_id): \OpenAPI\Client\Model\CampaignAdPreviewDelete200ResponseInner[]
```

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->campaignAdPreviewDelete($ad_group_ids, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->campaignAdPreviewDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\CampaignAdPreviewDelete200ResponseInner[]**](../Model/CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `campaignAdPreviewRead()`

```php
campaignAdPreviewRead($ad_group_ids, $ad_account_id): \OpenAPI\Client\Model\CampaignAdPreview[]
```

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->campaignAdPreviewRead($ad_group_ids, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdsApi->campaignAdPreviewRead: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\CampaignAdPreview[]**](../Model/CampaignAdPreview.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
