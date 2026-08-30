# OpenAPI\Client\CatalogSupplementalApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**catalogsLocalInventoryItemsBatchOperate()**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch |
| [**catalogsLocalInventoryItemsPost()**](CatalogSupplementalApi.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST) |
| [**catalogsLocalStoresCreate()**](CatalogSupplementalApi.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores |
| [**catalogsLocalStoresDelete()**](CatalogSupplementalApi.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores |
| [**catalogsLocalStoresList()**](CatalogSupplementalApi.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores |
| [**catalogsLocalStoresUpdate()**](CatalogSupplementalApi.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores |
| [**catalogsSupplementalItemsBatchGet()**](CatalogSupplementalApi.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status |


## `catalogsLocalInventoryItemsBatchOperate()`

```php
catalogsLocalInventoryItemsBatchOperate($catalog_id, $local_inventory_items_batch_create, $ad_account_id): \OpenAPI\Client\Model\SupplementalItemsBatchResponse
```

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$local_inventory_items_batch_create = new \OpenAPI\Client\Model\LocalInventoryItemsBatchCreate(); // \OpenAPI\Client\Model\LocalInventoryItemsBatchCreate
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsLocalInventoryItemsBatchOperate($catalog_id, $local_inventory_items_batch_create, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsLocalInventoryItemsBatchOperate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **local_inventory_items_batch_create** | [**\OpenAPI\Client\Model\LocalInventoryItemsBatchCreate**](../Model/LocalInventoryItemsBatchCreate.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\SupplementalItemsBatchResponse**](../Model/SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsLocalInventoryItemsPost()`

```php
catalogsLocalInventoryItemsPost($catalog_id, $local_inventory_items_get_create, $ad_account_id): \OpenAPI\Client\Model\LocalInventoryItemsGet
```

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$local_inventory_items_get_create = new \OpenAPI\Client\Model\LocalInventoryItemsGetCreate(); // \OpenAPI\Client\Model\LocalInventoryItemsGetCreate
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsLocalInventoryItemsPost($catalog_id, $local_inventory_items_get_create, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsLocalInventoryItemsPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **local_inventory_items_get_create** | [**\OpenAPI\Client\Model\LocalInventoryItemsGetCreate**](../Model/LocalInventoryItemsGetCreate.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\LocalInventoryItemsGet**](../Model/LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsLocalStoresCreate()`

```php
catalogsLocalStoresCreate($catalog_id, $local_store_create, $ad_account_id): \OpenAPI\Client\Model\CatalogsLocalStoresCreate200ResponseInner[]
```

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$local_store_create = array(new \OpenAPI\Client\Model\LocalStoreCreate()); // \OpenAPI\Client\Model\LocalStoreCreate[]
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsLocalStoresCreate($catalog_id, $local_store_create, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsLocalStoresCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **local_store_create** | [**\OpenAPI\Client\Model\LocalStoreCreate[]**](../Model/LocalStoreCreate.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsLocalStoresCreate200ResponseInner[]**](../Model/CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsLocalStoresDelete()`

```php
catalogsLocalStoresDelete($catalog_id, $ids, $ad_account_id): \OpenAPI\Client\Model\CatalogsLocalStoresDelete200ResponseInner[]
```

Delete local stores

Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$ids = array('ids_example'); // string[] | List of local store IDs to filter by.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsLocalStoresDelete($catalog_id, $ids, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsLocalStoresDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **ids** | [**string[]**](../Model/string.md)| List of local store IDs to filter by. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsLocalStoresDelete200ResponseInner[]**](../Model/CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsLocalStoresList()`

```php
catalogsLocalStoresList($catalog_id, $ids, $ad_account_id, $bookmark, $page_size): \OpenAPI\Client\Model\CatalogsLocalStoresList200Response
```

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$ids = array('ids_example'); // string[] | List of local store IDs to filter by.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->catalogsLocalStoresList($catalog_id, $ids, $ad_account_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsLocalStoresList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **ids** | [**string[]**](../Model/string.md)| List of local store IDs to filter by. | [optional] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\CatalogsLocalStoresList200Response**](../Model/CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsLocalStoresUpdate()`

```php
catalogsLocalStoresUpdate($catalog_id, $local_store_batch_update, $ad_account_id): \OpenAPI\Client\Model\CatalogsLocalStoresCreate200ResponseInner[]
```

Update local stores

Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$local_store_batch_update = array(new \OpenAPI\Client\Model\LocalStoreBatchUpdate()); // \OpenAPI\Client\Model\LocalStoreBatchUpdate[]
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsLocalStoresUpdate($catalog_id, $local_store_batch_update, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsLocalStoresUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **local_store_batch_update** | [**\OpenAPI\Client\Model\LocalStoreBatchUpdate[]**](../Model/LocalStoreBatchUpdate.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsLocalStoresCreate200ResponseInner[]**](../Model/CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsSupplementalItemsBatchGet()`

```php
catalogsSupplementalItemsBatchGet($catalog_id, $batch_id, $ad_account_id): \OpenAPI\Client\Model\SupplementalItemsBatchResponse
```

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogSupplementalApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalog_id = 'catalog_id_example'; // string | Unique identifier of a catalog.
$batch_id = 'batch_id_example'; // string | Unique identifier of an items batch operation.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsSupplementalItemsBatchGet($catalog_id, $batch_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogSupplementalApi->catalogsSupplementalItemsBatchGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalog_id** | **string**| Unique identifier of a catalog. | |
| **batch_id** | **string**| Unique identifier of an items batch operation. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\SupplementalItemsBatchResponse**](../Model/SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
