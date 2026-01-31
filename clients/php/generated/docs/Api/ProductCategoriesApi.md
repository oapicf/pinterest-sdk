# OpenAPI\Client\ProductCategoriesApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**trendsFeaturedTopicsList()**](ProductCategoriesApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics |
| [**trendsProductCategoriesDetailsList()**](ProductCategoriesApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details |
| [**trendsProductCategoriesTrendingList()**](ProductCategoriesApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |


## `trendsFeaturedTopicsList()`

```php
trendsFeaturedTopicsList($region, $interest): \OpenAPI\Client\Model\FeaturedTrend[]
```

Get featured topics

Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductCategoriesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$region = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoryRegion(); // \OpenAPI\Client\Model\ProductCategoryRegion | The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
$interest = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\InterestsEnum(); // \OpenAPI\Client\Model\InterestsEnum | Interest to filter by

try {
    $result = $apiInstance->trendsFeaturedTopicsList($region, $interest);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductCategoriesApi->trendsFeaturedTopicsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | [**\OpenAPI\Client\Model\ProductCategoryRegion**](../Model/.md)| The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | |
| **interest** | [**\OpenAPI\Client\Model\InterestsEnum**](../Model/.md)| Interest to filter by | [optional] |

### Return type

[**\OpenAPI\Client\Model\FeaturedTrend[]**](../Model/FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `trendsProductCategoriesDetailsList()`

```php
trendsProductCategoriesDetailsList($product_categories, $region, $lookback_window, $engagement_type): \OpenAPI\Client\Model\ProductCategoryDetails[]
```

Get product category details

Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductCategoriesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_categories = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoryEnum()); // \OpenAPI\Client\Model\ProductCategoryEnum[] | List of product categories
$region = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoryRegion(); // \OpenAPI\Client\Model\ProductCategoryRegion | The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
$lookback_window = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoryDetailLookbackWindow(); // \OpenAPI\Client\Model\ProductCategoryDetailLookbackWindow | Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
$engagement_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoriesEngagementType(); // \OpenAPI\Client\Model\ProductCategoriesEngagementType | Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves

try {
    $result = $apiInstance->trendsProductCategoriesDetailsList($product_categories, $region, $lookback_window, $engagement_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductCategoriesApi->trendsProductCategoriesDetailsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_categories** | [**\OpenAPI\Client\Model\ProductCategoryEnum[]**](../Model/\OpenAPI\Client\Model\ProductCategoryEnum.md)| List of product categories | |
| **region** | [**\OpenAPI\Client\Model\ProductCategoryRegion**](../Model/.md)| The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | |
| **lookback_window** | [**\OpenAPI\Client\Model\ProductCategoryDetailLookbackWindow**](../Model/.md)| Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] |
| **engagement_type** | [**\OpenAPI\Client\Model\ProductCategoriesEngagementType**](../Model/.md)| Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] |

### Return type

[**\OpenAPI\Client\Model\ProductCategoryDetails[]**](../Model/ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `trendsProductCategoriesTrendingList()`

```php
trendsProductCategoriesTrendingList($region, $verticals, $ages, $genders, $engagement_type): \OpenAPI\Client\Model\TrendingProductCategory[]
```

Get a list of growing Shopping Product Categories

Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductCategoriesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$region = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoryRegion(); // \OpenAPI\Client\Model\ProductCategoryRegion | The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
$verticals = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\VerticalProductCategory()); // \OpenAPI\Client\Model\VerticalProductCategory[] | List of verticals to filter by
$ages = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AgeTrendsBucket()); // \OpenAPI\Client\Model\AgeTrendsBucket[] | Age to filter by. If not provided, the results will be filtered by all ages.
$genders = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\GenderBucket()); // \OpenAPI\Client\Model\GenderBucket[] | Gender to filter by, If not provided, the results will be filtered by all genders.
$engagement_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ProductCategoriesEngagementType(); // \OpenAPI\Client\Model\ProductCategoriesEngagementType | Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves

try {
    $result = $apiInstance->trendsProductCategoriesTrendingList($region, $verticals, $ages, $genders, $engagement_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductCategoriesApi->trendsProductCategoriesTrendingList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **region** | [**\OpenAPI\Client\Model\ProductCategoryRegion**](../Model/.md)| The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | |
| **verticals** | [**\OpenAPI\Client\Model\VerticalProductCategory[]**](../Model/\OpenAPI\Client\Model\VerticalProductCategory.md)| List of verticals to filter by | [optional] |
| **ages** | [**\OpenAPI\Client\Model\AgeTrendsBucket[]**](../Model/\OpenAPI\Client\Model\AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] |
| **genders** | [**\OpenAPI\Client\Model\GenderBucket[]**](../Model/\OpenAPI\Client\Model\GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] |
| **engagement_type** | [**\OpenAPI\Client\Model\ProductCategoriesEngagementType**](../Model/.md)| Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] |

### Return type

[**\OpenAPI\Client\Model\TrendingProductCategory[]**](../Model/TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
