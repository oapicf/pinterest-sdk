# OpenAPI\Client\ConversionTagsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**conversionTagsCreate()**](ConversionTagsApi.md#conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
| [**conversionTagsGet()**](ConversionTagsApi.md#conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
| [**conversionTagsList()**](ConversionTagsApi.md#conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags |
| [**ocpmEligibleConversionTagsGet()**](ConversionTagsApi.md#ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
| [**pageVisitConversionTagsGet()**](ConversionTagsApi.md#pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |


## `conversionTagsCreate()`

```php
conversionTagsCreate($ad_account_id, $conversion_tag_create): \OpenAPI\Client\Model\ConversionTagResponse
```

Create conversion tag

Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$conversion_tag_create = new \OpenAPI\Client\Model\ConversionTagCreate(); // \OpenAPI\Client\Model\ConversionTagCreate | Conversion Tag to create

try {
    $result = $apiInstance->conversionTagsCreate($ad_account_id, $conversion_tag_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionTagsApi->conversionTagsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **conversion_tag_create** | [**\OpenAPI\Client\Model\ConversionTagCreate**](../Model/ConversionTagCreate.md)| Conversion Tag to create | |

### Return type

[**\OpenAPI\Client\Model\ConversionTagResponse**](../Model/ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversionTagsGet()`

```php
conversionTagsGet($ad_account_id, $conversion_tag_id): \OpenAPI\Client\Model\ConversionTagResponse
```

Get conversion tag

Get information about an existing conversion tag.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$conversion_tag_id = 2617998078212; // string | Id of the conversion tag.

try {
    $result = $apiInstance->conversionTagsGet($ad_account_id, $conversion_tag_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionTagsApi->conversionTagsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **conversion_tag_id** | **string**| Id of the conversion tag. | |

### Return type

[**\OpenAPI\Client\Model\ConversionTagResponse**](../Model/ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `conversionTagsList()`

```php
conversionTagsList($ad_account_id, $filter_deleted): \OpenAPI\Client\Model\ConversionTagListResponse
```

Get conversion tags

List conversion tags associated with an ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$filter_deleted = true; // bool | Filter out deleted tags.

try {
    $result = $apiInstance->conversionTagsList($ad_account_id, $filter_deleted);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionTagsApi->conversionTagsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **filter_deleted** | **bool**| Filter out deleted tags. | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\ConversionTagListResponse**](../Model/ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `ocpmEligibleConversionTagsGet()`

```php
ocpmEligibleConversionTagsGet($ad_account_id): array<string,\OpenAPI\Client\Model\ConversionEventResponse[]>
```

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->ocpmEligibleConversionTagsGet($ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionTagsApi->ocpmEligibleConversionTagsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

**array<string,\OpenAPI\Client\Model\ConversionEventResponse[]>**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `pageVisitConversionTagsGet()`

```php
pageVisitConversionTagsGet($ad_account_id, $page_size, $order, $bookmark): \OpenAPI\Client\Model\PageVisitConversionTagsGet200Response
```

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ConversionTagsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->pageVisitConversionTagsGet($ad_account_id, $page_size, $order, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConversionTagsApi->pageVisitConversionTagsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\PageVisitConversionTagsGet200Response**](../Model/PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
