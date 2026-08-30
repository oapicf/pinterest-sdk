# OpenAPI\Client\ProductGroupPromotionsApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**productGroupPromotionsCreate()**](ProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
| [**productGroupPromotionsGet()**](ProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
| [**productGroupPromotionsList()**](ProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions |
| [**productGroupPromotionsUpdate()**](ProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
| [**productGroupsAnalytics()**](ProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |


## `productGroupPromotionsCreate()`

```php
productGroupPromotionsCreate($ad_account_id, $product_group_promotions_create): \OpenAPI\Client\Model\ProductGroupPromotions
```

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductGroupPromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$product_group_promotions_create = new \OpenAPI\Client\Model\ProductGroupPromotionsCreate(); // \OpenAPI\Client\Model\ProductGroupPromotionsCreate

try {
    $result = $apiInstance->productGroupPromotionsCreate($ad_account_id, $product_group_promotions_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductGroupPromotionsApi->productGroupPromotionsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **product_group_promotions_create** | [**\OpenAPI\Client\Model\ProductGroupPromotionsCreate**](../Model/ProductGroupPromotionsCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ProductGroupPromotions**](../Model/ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productGroupPromotionsGet()`

```php
productGroupPromotionsGet($ad_account_id, $product_group_promotion_id): \OpenAPI\Client\Model\ProductGroupPromotion
```

Get a product group promotion by id

Get a product group promotion by id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductGroupPromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$product_group_promotion_id = 'product_group_promotion_id_example'; // string | Unique identifier of a product group promotion

try {
    $result = $apiInstance->productGroupPromotionsGet($ad_account_id, $product_group_promotion_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductGroupPromotionsApi->productGroupPromotionsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **product_group_promotion_id** | **string**| Unique identifier of a product group promotion | |

### Return type

[**\OpenAPI\Client\Model\ProductGroupPromotion**](../Model/ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productGroupPromotionsList()`

```php
productGroupPromotionsList($ad_account_id, $bookmark, $page_size, $order, $product_group_promotion_ids, $entity_statuses, $ad_group_id): \OpenAPI\Client\Model\ProductGroupPromotionsList200Response
```

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductGroupPromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$product_group_promotion_ids = array('product_group_promotion_ids_example'); // string[] | List of Product group promotion Ids.
$entity_statuses = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\EntityStatus()); // \OpenAPI\Client\Model\EntityStatus[] | Entity status
$ad_group_id = 'ad_group_id_example'; // string | Ad group Id.

try {
    $result = $apiInstance->productGroupPromotionsList($ad_account_id, $bookmark, $page_size, $order, $product_group_promotion_ids, $entity_statuses, $ad_group_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductGroupPromotionsApi->productGroupPromotionsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **product_group_promotion_ids** | [**string[]**](../Model/string.md)| List of Product group promotion Ids. | [optional] |
| **entity_statuses** | [**\OpenAPI\Client\Model\EntityStatus[]**](../Model/\OpenAPI\Client\Model\EntityStatus.md)| Entity status | [optional] |
| **ad_group_id** | **string**| Ad group Id. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProductGroupPromotionsList200Response**](../Model/ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productGroupPromotionsUpdate()`

```php
productGroupPromotionsUpdate($ad_account_id, $product_group_promotions_update_with_required_body): \OpenAPI\Client\Model\ProductGroupPromotions
```

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductGroupPromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$product_group_promotions_update_with_required_body = new \OpenAPI\Client\Model\ProductGroupPromotionsUpdateWithRequiredBody(); // \OpenAPI\Client\Model\ProductGroupPromotionsUpdateWithRequiredBody

try {
    $result = $apiInstance->productGroupPromotionsUpdate($ad_account_id, $product_group_promotions_update_with_required_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductGroupPromotionsApi->productGroupPromotionsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **product_group_promotions_update_with_required_body** | [**\OpenAPI\Client\Model\ProductGroupPromotionsUpdateWithRequiredBody**](../Model/ProductGroupPromotionsUpdateWithRequiredBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\ProductGroupPromotions**](../Model/ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productGroupsAnalytics()`

```php
productGroupsAnalytics($start_date, $end_date, $product_group_ids, $columns, $granularity, $ad_account_id, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $reporting_timezone): \OpenAPI\Client\Model\ProductGroupAnalyticsItems[]
```

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductGroupPromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime('2013-10-20T19:20:30+01:00'); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$product_group_ids = array('product_group_ids_example'); // string[] | List of Product group Ids to use to filter the results.
$columns = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingColumnSync()); // \OpenAPI\Client\Model\ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$granularity = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Granularity(); // \OpenAPI\Client\Model\Granularity | TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$click_window_days = 30; // float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
$engagement_window_days = 30; // float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
$view_window_days = 1; // float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
$conversion_report_time = 'TIME_OF_AD_ACTION'; // string | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
$reporting_timezone = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ReportingTimeZone(); // \OpenAPI\Client\Model\ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.

try {
    $result = $apiInstance->productGroupsAnalytics($start_date, $end_date, $product_group_ids, $columns, $granularity, $ad_account_id, $click_window_days, $engagement_window_days, $view_window_days, $conversion_report_time, $reporting_timezone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductGroupPromotionsApi->productGroupsAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **product_group_ids** | [**string[]**](../Model/string.md)| List of Product group Ids to use to filter the results. | |
| **columns** | [**\OpenAPI\Client\Model\ReportingColumnSync[]**](../Model/\OpenAPI\Client\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**\OpenAPI\Client\Model\Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **click_window_days** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **engagement_window_days** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] |
| **view_window_days** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] |
| **conversion_report_time** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;] |
| **reporting_timezone** | [**\OpenAPI\Client\Model\ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProductGroupAnalyticsItems[]**](../Model/ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
