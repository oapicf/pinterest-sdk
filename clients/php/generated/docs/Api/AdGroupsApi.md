# OpenAPI\Client\AdGroupsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adGroupsAnalytics()**](AdGroupsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics |
| [**adGroupsAudienceSizing()**](AdGroupsApi.md#adGroupsAudienceSizing) | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing |
| [**adGroupsBidFloorGet()**](AdGroupsApi.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |
| [**adGroupsCreate()**](AdGroupsApi.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**adGroupsGet()**](AdGroupsApi.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**adGroupsList()**](AdGroupsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**adGroupsTargetingAnalyticsGet()**](AdGroupsApi.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups |
| [**adGroupsUpdate()**](AdGroupsApi.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |


## `adGroupsAnalytics()`

```php
adGroupsAnalytics($ad_account_id, $start_date, $end_date, $ad_group_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time): \OpenAPI\Client\Model\AdGroupsAnalyticsResponseInner[]
```

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$columns = array('columns_example'); // string[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->adGroupsAnalytics($ad_account_id, $start_date, $end_date, $ad_group_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | |
| **columns** | [**string[]**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | |
| **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | |
| **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;] |

### Return type

[**\OpenAPI\Client\Model\AdGroupsAnalyticsResponseInner[]**](../Model/AdGroupsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsAudienceSizing()`

```php
adGroupsAudienceSizing($ad_account_id, $ad_group_audience_sizing_request): \OpenAPI\Client\Model\AdGroupAudienceSizingResponse
```

Get audience sizing

Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_group_audience_sizing_request = new \OpenAPI\Client\Model\AdGroupAudienceSizingRequest(); // \OpenAPI\Client\Model\AdGroupAudienceSizingRequest

try {
    $result = $apiInstance->adGroupsAudienceSizing($ad_account_id, $ad_group_audience_sizing_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsAudienceSizing: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_group_audience_sizing_request** | [**\OpenAPI\Client\Model\AdGroupAudienceSizingRequest**](../Model/AdGroupAudienceSizingRequest.md)|  | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdGroupAudienceSizingResponse**](../Model/AdGroupAudienceSizingResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsBidFloorGet()`

```php
adGroupsBidFloorGet($ad_account_id, $bid_floor_request): \OpenAPI\Client\Model\BidFloor
```

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bid_floor_request = new \OpenAPI\Client\Model\BidFloorRequest(); // \OpenAPI\Client\Model\BidFloorRequest | Parameters to get bid_floor info

try {
    $result = $apiInstance->adGroupsBidFloorGet($ad_account_id, $bid_floor_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsBidFloorGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bid_floor_request** | [**\OpenAPI\Client\Model\BidFloorRequest**](../Model/BidFloorRequest.md)| Parameters to get bid_floor info | |

### Return type

[**\OpenAPI\Client\Model\BidFloor**](../Model/BidFloor.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsCreate()`

```php
adGroupsCreate($ad_account_id, $ad_group_create_request): \OpenAPI\Client\Model\AdGroupArrayResponse
```

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_group_create_request = array(new \OpenAPI\Client\Model\AdGroupCreateRequest()); // \OpenAPI\Client\Model\AdGroupCreateRequest[] | List of ad groups to create, size limit [1, 30].

try {
    $result = $apiInstance->adGroupsCreate($ad_account_id, $ad_group_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_group_create_request** | [**\OpenAPI\Client\Model\AdGroupCreateRequest[]**](../Model/AdGroupCreateRequest.md)| List of ad groups to create, size limit [1, 30]. | |

### Return type

[**\OpenAPI\Client\Model\AdGroupArrayResponse**](../Model/AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsGet()`

```php
adGroupsGet($ad_account_id, $ad_group_id): \OpenAPI\Client\Model\AdGroupResponse
```

Get ad group

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_group_id = 'ad_group_id_example'; // string | Unique identifier of an ad group.

try {
    $result = $apiInstance->adGroupsGet($ad_account_id, $ad_group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_group_id** | **string**| Unique identifier of an ad group. | |

### Return type

[**\OpenAPI\Client\Model\AdGroupResponse**](../Model/AdGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsList()`

```php
adGroupsList($ad_account_id, $campaign_ids, $ad_group_ids, $entity_statuses, $page_size, $order, $bookmark, $translate_interests_to_names): \OpenAPI\Client\Model\AdGroupsList200Response
```

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$entity_statuses = array('entity_statuses_example'); // string[] | Entity status
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$translate_interests_to_names = false; // bool | Return interests as text names (if value is true) rather than topic IDs.

try {
    $result = $apiInstance->adGroupsList($ad_account_id, $campaign_ids, $ad_group_ids, $entity_statuses, $page_size, $order, $bookmark, $translate_interests_to_names);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional] |
| **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**string[]**](../Model/string.md)| Entity status | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **translate_interests_to_names** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\AdGroupsList200Response**](../Model/AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsTargetingAnalyticsGet()`

```php
adGroupsTargetingAnalyticsGet($ad_account_id, $ad_group_ids, $start_date, $end_date, $targeting_types, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $attribution_types): \OpenAPI\Client\Model\MetricsResponse
```

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$targeting_types = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AdsAnalyticsTargetingType()); // \OpenAPI\Client\Model\AdsAnalyticsTargetingType[] | Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other.
$columns = array('columns_example'); // string[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
$attribution_types = new \OpenAPI\Client\Model\ConversionReportAttributionType(); // ConversionReportAttributionType | List of types of attribution for the conversion report

try {
    $result = $apiInstance->adGroupsTargetingAnalyticsGet($ad_account_id, $ad_group_ids, $start_date, $end_date, $targeting_types, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $attribution_types);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsTargetingAnalyticsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **targeting_types** | [**\OpenAPI\Client\Model\AdsAnalyticsTargetingType[]**](../Model/\OpenAPI\Client\Model\AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. | |
| **columns** | [**string[]**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | |
| **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | |
| **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;] |
| **attribution_types** | [**ConversionReportAttributionType**](../Model/.md)| List of types of attribution for the conversion report | [optional] |

### Return type

[**\OpenAPI\Client\Model\MetricsResponse**](../Model/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsUpdate()`

```php
adGroupsUpdate($ad_account_id, $ad_group_update_request): \OpenAPI\Client\Model\AdGroupArrayResponse
```

Update ad groups

Update multiple existing ad groups.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_group_update_request = array(new \OpenAPI\Client\Model\AdGroupUpdateRequest()); // \OpenAPI\Client\Model\AdGroupUpdateRequest[] | List of ad groups to update, size limit [1, 30].

try {
    $result = $apiInstance->adGroupsUpdate($ad_account_id, $ad_group_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdGroupsApi->adGroupsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_group_update_request** | [**\OpenAPI\Client\Model\AdGroupUpdateRequest[]**](../Model/AdGroupUpdateRequest.md)| List of ad groups to update, size limit [1, 30]. | |

### Return type

[**\OpenAPI\Client\Model\AdGroupArrayResponse**](../Model/AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
