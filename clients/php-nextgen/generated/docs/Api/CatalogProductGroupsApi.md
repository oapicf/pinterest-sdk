# OpenAPI\Client\CatalogProductGroupsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**catalogsProductGroupPinsList()**](CatalogProductGroupsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group |
| [**catalogsProductGroupsCreate()**](CatalogProductGroupsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group |
| [**catalogsProductGroupsCreateMany()**](CatalogProductGroupsApi.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups |
| [**catalogsProductGroupsDelete()**](CatalogProductGroupsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogsProductGroupsDeleteMany()**](CatalogProductGroupsApi.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups |
| [**catalogsProductGroupsGet()**](CatalogProductGroupsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogsProductGroupsList()**](CatalogProductGroupsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups |
| [**catalogsProductGroupsProductCountsGet()**](CatalogProductGroupsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts |
| [**catalogsProductGroupsUpdate()**](CatalogProductGroupsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group |
| [**productsByProductGroupFilterList()**](CatalogProductGroupsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter |


## `catalogsProductGroupPinsList()`

```php
catalogsProductGroupPinsList($product_group_id, $ad_account_id, $pin_metrics, $bookmark, $page_size): \OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response
```

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$pin_metrics = false; // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->catalogsProductGroupPinsList($product_group_id, $ad_account_id, $pin_metrics, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupPinsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **pin_metrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsCreate()`

```php
catalogsProductGroupsCreate($catalogs_product_groups_create_request_schema, $ad_account_id): \OpenAPI\Client\Model\CatalogsVerticalProductGroup
```

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_product_groups_create_request_schema = new \OpenAPI\Client\Model\CatalogsProductGroupCreateRequest(); // \OpenAPI\Client\Model\CatalogsProductGroupsCreateRequestSchema
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsCreate($catalogs_product_groups_create_request_schema, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_product_groups_create_request_schema** | [**\OpenAPI\Client\Model\CatalogsProductGroupsCreateRequestSchema**](../Model/CatalogsProductGroupsCreateRequestSchema.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsCreateMany()`

```php
catalogsProductGroupsCreateMany($catalogs_product_groups_create_many_request_items, $ad_account_id): string[]
```

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_product_groups_create_many_request_items = array(new \OpenAPI\Client\Model\CatalogsProductGroupCreateRequest()); // \OpenAPI\Client\Model\CatalogsProductGroupsCreateManyRequestItems[]
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsCreateMany($catalogs_product_groups_create_many_request_items, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsCreateMany: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_product_groups_create_many_request_items** | [**\OpenAPI\Client\Model\CatalogsProductGroupsCreateManyRequestItems[]**](../Model/CatalogsProductGroupsCreateManyRequestItems.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

**string[]**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsDelete()`

```php
catalogsProductGroupsDelete($product_group_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsVerticalProductGroup
```

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsDelete($product_group_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsDeleteMany()`

```php
catalogsProductGroupsDeleteMany($id, $ad_account_id)
```

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = array(56); // int[] | Comma-separated list of product group ids
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $apiInstance->catalogsProductGroupsDeleteMany($id, $ad_account_id);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsDeleteMany: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**int[]**](../Model/int.md)| Comma-separated list of product group ids | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsGet()`

```php
catalogsProductGroupsGet($product_group_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsVerticalProductGroup
```

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsGet($product_group_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsList()`

```php
catalogsProductGroupsList($id, $feed_id, $catalog_id, $ad_account_id, $bookmark, $page_size): \OpenAPI\Client\Model\CatalogsProductGroupsList200Response
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$id = array(56); // int[] | Comma-separated list of product group ids
$feed_id = 'feed_id_example'; // string | Filter entities for a given feed_id. If not given, all feeds are considered.
$catalog_id = 'catalog_id_example'; // string | Filter entities for a given catalog_id. If not given, all catalogs are considered.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->catalogsProductGroupsList($id, $feed_id, $catalog_id, $ad_account_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | [**int[]**](../Model/int.md)| Comma-separated list of product group ids | [optional] |
| **feed_id** | **string**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] |
| **catalog_id** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupsList200Response**](../Model/CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsProductCountsGet()`

```php
catalogsProductGroupsProductCountsGet($product_group_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupProductCountsVertical
```

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsProductCountsGet($product_group_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsProductCountsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupProductCountsVertical**](../Model/CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsUpdate()`

```php
catalogsProductGroupsUpdate($product_group_id, $catalogs_product_groups_update_request_schema, $ad_account_id): \OpenAPI\Client\Model\CatalogsVerticalProductGroup
```

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$catalogs_product_groups_update_request_schema = new \OpenAPI\Client\Model\CatalogsProductGroupUpdateRequest(); // \OpenAPI\Client\Model\CatalogsProductGroupsUpdateRequestSchema
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsUpdate($product_group_id, $catalogs_product_groups_update_request_schema, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->catalogsProductGroupsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **catalogs_product_groups_update_request_schema** | [**\OpenAPI\Client\Model\CatalogsProductGroupsUpdateRequestSchema**](../Model/CatalogsProductGroupsUpdateRequestSchema.md)|  | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productsByProductGroupFilterList()`

```php
productsByProductGroupFilterList($catalogs_list_products_by_filter_request, $bookmark, $page_size, $ad_account_id, $pin_metrics): \OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response
```

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_list_products_by_filter_request = new \OpenAPI\Client\Model\CatalogsListProductsByFeedBasedFilter(); // \OpenAPI\Client\Model\CatalogsListProductsByFilterRequest
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$pin_metrics = false; // bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

try {
    $result = $apiInstance->productsByProductGroupFilterList($catalogs_list_products_by_filter_request, $bookmark, $page_size, $ad_account_id, $pin_metrics);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogProductGroupsApi->productsByProductGroupFilterList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_list_products_by_filter_request** | [**\OpenAPI\Client\Model\CatalogsListProductsByFilterRequest**](../Model/CatalogsListProductsByFilterRequest.md)|  | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **pin_metrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
