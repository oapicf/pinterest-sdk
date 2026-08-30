# OpenAPI\Client\PromotionsApi

View, create, update, or delete promotions.

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**promotionsCreate()**](PromotionsApi.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions |
| [**promotionsDelete()**](PromotionsApi.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id |
| [**promotionsGet()**](PromotionsApi.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id |
| [**promotionsList()**](PromotionsApi.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions |
| [**promotionsUpdate()**](PromotionsApi.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions |


## `promotionsCreate()`

```php
promotionsCreate($ad_account_id, $promotion_create): \OpenAPI\Client\Model\PromotionsResponse
```

Create promotions

Create multiple new promotions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$promotion_create = array(new \OpenAPI\Client\Model\PromotionCreate()); // \OpenAPI\Client\Model\PromotionCreate[]

try {
    $result = $apiInstance->promotionsCreate($ad_account_id, $promotion_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionsApi->promotionsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **promotion_create** | [**\OpenAPI\Client\Model\PromotionCreate[]**](../Model/PromotionCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\PromotionsResponse**](../Model/PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `promotionsDelete()`

```php
promotionsDelete($promotion_id, $ad_account_id): \OpenAPI\Client\Model\Promotion
```

Delete promotion by id

Delete a promotion within Pinterest.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$promotion_id = 'promotion_id_example'; // string | Promotion ID
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->promotionsDelete($promotion_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionsApi->promotionsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promotion_id** | **string**| Promotion ID | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\Promotion**](../Model/Promotion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `promotionsGet()`

```php
promotionsGet($promotion_id, $ad_account_id): \OpenAPI\Client\Model\Promotion
```

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$promotion_id = 'promotion_id_example'; // string | Promotion ID
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->promotionsGet($promotion_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionsApi->promotionsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **promotion_id** | **string**| Promotion ID | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\Promotion**](../Model/Promotion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `promotionsList()`

```php
promotionsList($ad_account_id, $bookmark, $page_size, $order): \OpenAPI\Client\Model\PromotionsList200Response
```

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.

try {
    $result = $apiInstance->promotionsList($ad_account_id, $bookmark, $page_size, $order);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionsApi->promotionsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |

### Return type

[**\OpenAPI\Client\Model\PromotionsList200Response**](../Model/PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `promotionsUpdate()`

```php
promotionsUpdate($ad_account_id, $promotion_batch_update): \OpenAPI\Client\Model\PromotionsResponse
```

Update promotions

Update multiple promotions.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\PromotionsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$promotion_batch_update = array(new \OpenAPI\Client\Model\PromotionBatchUpdate()); // \OpenAPI\Client\Model\PromotionBatchUpdate[]

try {
    $result = $apiInstance->promotionsUpdate($ad_account_id, $promotion_batch_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PromotionsApi->promotionsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **promotion_batch_update** | [**\OpenAPI\Client\Model\PromotionBatchUpdate[]**](../Model/PromotionBatchUpdate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\PromotionsResponse**](../Model/PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
