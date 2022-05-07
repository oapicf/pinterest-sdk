# OpenAPI\Client\AdAccountsApi

All URIs are relative to https://api.pinterest.com/v5.

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics()**](AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountsList()**](AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**adGroupsAnalytics()**](AdAccountsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsList()**](AdAccountsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adsAnalytics()**](AdAccountsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsList()**](AdAccountsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analyticsCreateReport()**](AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsGetReport()**](AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaignsAnalytics()**](AdAccountsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsList()**](AdAccountsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**productGroupsAnalytics()**](AdAccountsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


## `adAccountAnalytics()`

```php
adAccountAnalytics($ad_account_id, $start_date, $end_date, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time): array<string,object>[]
```

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$columns = array('columns_example'); // string[] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | Granularity
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->adAccountAnalytics($ad_account_id, $start_date, $end_date, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adAccountAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **columns** | [**string[]**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array<string,object>[]**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adAccountsList()`

```php
adAccountsList($bookmark, $page_size, $include_shared_accounts): Paginated
```

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
$include_shared_accounts = true; // bool | Include shared ad accounts

try {
    $result = $apiInstance->adAccountsList($bookmark, $page_size, $include_shared_accounts);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adAccountsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **include_shared_accounts** | **bool**| Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adGroupsAnalytics()`

```php
adGroupsAnalytics($ad_account_id, $start_date, $end_date, $ad_group_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time): array<string,object>[]
```

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$columns = array('columns_example'); // string[] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | Granularity
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->adGroupsAnalytics($ad_account_id, $start_date, $end_date, $ad_group_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adGroupsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. |
 **columns** | [**string[]**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array<string,object>[]**

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
adGroupsList($ad_account_id, $campaign_ids, $ad_group_ids, $entity_statuses, $page_size, $order, $bookmark, $translate_interests_to_names): Paginated
```

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$entity_statuses = array('entity_statuses_example'); // string[] | Entity status
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$translate_interests_to_names = false; // bool | Return interests as text names (if value is true) rather than topic IDs.

try {
    $result = $apiInstance->adGroupsList($ad_account_id, $campaign_ids, $ad_group_ids, $entity_statuses, $page_size, $order, $bookmark, $translate_interests_to_names);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adGroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional]
 **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | [optional]
 **entity_statuses** | [**string[]**](../Model/string.md)| Entity status | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **translate_interests_to_names** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsAnalytics()`

```php
adsAnalytics($ad_account_id, $start_date, $end_date, $ad_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time): array<string,object>[]
```

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$ad_ids = array('ad_ids_example'); // string[] | List of Ad Ids to use to filter the results.
$columns = array('columns_example'); // string[] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | Granularity
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->adsAnalytics($ad_account_id, $start_date, $end_date, $ad_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **ad_ids** | [**string[]**](../Model/string.md)| List of Ad Ids to use to filter the results. |
 **columns** | [**string[]**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array<string,object>[]**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `adsList()`

```php
adsList($ad_account_id, $campaign_ids, $ad_group_ids, $ad_ids, $entity_statuses, $page_size, $order, $bookmark): Paginated
```

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$ad_group_ids = array('ad_group_ids_example'); // string[] | List of Ad group Ids to use to filter the results.
$ad_ids = array('ad_ids_example'); // string[] | List of Ad Ids to use to filter the results.
$entity_statuses = array('entity_statuses_example'); // string[] | Entity status
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->adsList($ad_account_id, $campaign_ids, $ad_group_ids, $ad_ids, $entity_statuses, $page_size, $order, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->adsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional]
 **ad_group_ids** | [**string[]**](../Model/string.md)| List of Ad group Ids to use to filter the results. | [optional]
 **ad_ids** | [**string[]**](../Model/string.md)| List of Ad Ids to use to filter the results. | [optional]
 **entity_statuses** | [**string[]**](../Model/string.md)| Entity status | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `analyticsCreateReport()`

```php
analyticsCreateReport($ad_account_id, $ads_analytics_create_async_request): \OpenAPI\Client\Model\AdsAnalyticsCreateAsyncResponse
```

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ads_analytics_create_async_request = new \OpenAPI\Client\Model\AdsAnalyticsCreateAsyncRequest(); // \OpenAPI\Client\Model\AdsAnalyticsCreateAsyncRequest

try {
    $result = $apiInstance->analyticsCreateReport($ad_account_id, $ads_analytics_create_async_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->analyticsCreateReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **ads_analytics_create_async_request** | [**\OpenAPI\Client\Model\AdsAnalyticsCreateAsyncRequest**](../Model/AdsAnalyticsCreateAsyncRequest.md)|  |

### Return type

[**\OpenAPI\Client\Model\AdsAnalyticsCreateAsyncResponse**](../Model/AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `analyticsGetReport()`

```php
analyticsGetReport($ad_account_id, $token): \OpenAPI\Client\Model\AdsAnalyticsGetAsyncResponse
```

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$token = 'token_example'; // string | Token returned from the post request creation call

try {
    $result = $apiInstance->analyticsGetReport($ad_account_id, $token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->analyticsGetReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **token** | **string**| Token returned from the post request creation call |

### Return type

[**\OpenAPI\Client\Model\AdsAnalyticsGetAsyncResponse**](../Model/AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `campaignsAnalytics()`

```php
campaignsAnalytics($ad_account_id, $start_date, $end_date, $campaign_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time): array<string,object>[]
```

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$columns = array('columns_example'); // string[] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | Granularity
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->campaignsAnalytics($ad_account_id, $start_date, $end_date, $campaign_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->campaignsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. |
 **columns** | [**string[]**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array<string,object>[]**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `campaignsList()`

```php
campaignsList($ad_account_id, $campaign_ids, $entity_statuses, $page_size, $order, $bookmark): Paginated
```

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$entity_statuses = array('entity_statuses_example'); // string[] | Entity status
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->campaignsList($ad_account_id, $campaign_ids, $entity_statuses, $page_size, $order, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->campaignsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional]
 **entity_statuses** | [**string[]**](../Model/string.md)| Entity status | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productGroupsAnalytics()`

```php
productGroupsAnalytics($ad_account_id, $start_date, $end_date, $product_group_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time): array<string,object>[]
```

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdAccountsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD
$product_group_ids = array('product_group_ids_example'); // string[] | List of Product group Ids to use to filter the results.
$columns = array('columns_example'); // string[] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
$granularity = DAY; // \OpenAPI\Client\Model\Granularity | Granularity
$click_window_days = 1; // int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$view_window_days = 1; // int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = TIME_OF_AD_ACTION; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.

try {
    $result = $apiInstance->productGroupsAnalytics($ad_account_id, $start_date, $end_date, $product_group_ids, $columns, $granularity, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdAccountsApi->productGroupsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. |
 **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **product_group_ids** | [**string[]**](../Model/string.md)| List of Product group Ids to use to filter the results. |
 **columns** | [**string[]**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array<string,object>[]**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
