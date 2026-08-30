# OpenAPI\Client\CatalogItemsApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**itemsBatchGet()**](CatalogItemsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status |
| [**itemsBatchPost()**](CatalogItemsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch |
| [**itemsPost()**](CatalogItemsApi.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST) |


## `itemsBatchGet()`

```php
itemsBatchGet($batch_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsItemsBatch
```

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogItemsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$batch_id = 'batch_id_example'; // string | Id of a catalogs items batch to fetch
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->itemsBatchGet($batch_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogItemsApi->itemsBatchGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **batch_id** | **string**| Id of a catalogs items batch to fetch | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `itemsBatchPost()`

```php
itemsBatchPost($catalogs_items_batch_post_request, $ad_account_id): \OpenAPI\Client\Model\CatalogsItemsBatch
```

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogItemsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_items_batch_post_request = new \OpenAPI\Client\Model\CatalogsItemsBatchPostRequest(); // \OpenAPI\Client\Model\CatalogsItemsBatchPostRequest
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->itemsBatchPost($catalogs_items_batch_post_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogItemsApi->itemsBatchPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_items_batch_post_request** | [**\OpenAPI\Client\Model\CatalogsItemsBatchPostRequest**](../Model/CatalogsItemsBatchPostRequest.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `itemsPost()`

```php
itemsPost($catalogs_items_request, $ad_account_id): \OpenAPI\Client\Model\ItemsPost200Response
```

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogItemsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_items_request = new \OpenAPI\Client\Model\CatalogsItemsRequest(); // \OpenAPI\Client\Model\CatalogsItemsRequest
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->itemsPost($catalogs_items_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogItemsApi->itemsPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_items_request** | [**\OpenAPI\Client\Model\CatalogsItemsRequest**](../Model/CatalogsItemsRequest.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ItemsPost200Response**](../Model/ItemsPost200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
