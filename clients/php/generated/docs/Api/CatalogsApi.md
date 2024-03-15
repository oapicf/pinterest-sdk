# OpenAPI\Client\CatalogsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**catalogsList()**](CatalogsApi.md#catalogsList) | **GET** /catalogs | List catalogs |
| [**catalogsProductGroupPinsList()**](CatalogsApi.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group |
| [**catalogsProductGroupsCreate()**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group |
| [**catalogsProductGroupsDelete()**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogsProductGroupsGet()**](CatalogsApi.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group |
| [**catalogsProductGroupsList()**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups |
| [**catalogsProductGroupsProductCountsGet()**](CatalogsApi.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group |
| [**catalogsProductGroupsUpdate()**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**feedProcessingResultsList()**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**feedsCreate()**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed |
| [**feedsDelete()**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feedsGet()**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feedsList()**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds |
| [**feedsUpdate()**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**itemsBatchGet()**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status |
| [**itemsBatchPost()**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch |
| [**itemsGet()**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items |
| [**itemsIssuesList()**](CatalogsApi.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result |
| [**productsByProductGroupFilterList()**](CatalogsApi.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products |


## `catalogsList()`

```php
catalogsList($bookmark, $page_size, $ad_account_id): \OpenAPI\Client\Model\CatalogsList200Response
```

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsList($bookmark, $page_size, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsList200Response**](../Model/CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupPinsList()`

```php
catalogsProductGroupPinsList($product_group_id, $bookmark, $page_size, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response
```

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupPinsList($product_group_id, $bookmark, $page_size, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupPinsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `catalogsProductGroupsCreate()`

```php
catalogsProductGroupsCreate($catalogs_product_groups_create_request, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupsCreate201Response
```

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_product_groups_create_request = {"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","featured":false,"filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}}; // \OpenAPI\Client\Model\CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsCreate($catalogs_product_groups_create_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_product_groups_create_request** | [**\OpenAPI\Client\Model\CatalogsProductGroupsCreateRequest**](../Model/CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupsCreate201Response**](../Model/CatalogsProductGroupsCreate201Response.md)

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
catalogsProductGroupsDelete($product_group_id, $ad_account_id)
```

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $apiInstance->catalogsProductGroupsDelete($product_group_id, $ad_account_id);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
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
catalogsProductGroupsGet($product_group_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupsCreate201Response
```

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
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
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupsCreate201Response**](../Model/CatalogsProductGroupsCreate201Response.md)

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
catalogsProductGroupsList($feed_id, $catalog_id, $bookmark, $page_size, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupsList200Response
```

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$feed_id = 'feed_id_example'; // string | Filter entities for a given feed_id. If not given, all feeds are considered.
$catalog_id = 'catalog_id_example'; // string | Filter entities for a given catalog_id. If not given, all catalogs are considered.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsList($feed_id, $catalog_id, $bookmark, $page_size, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feed_id** | **string**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] |
| **catalog_id** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

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
catalogsProductGroupsProductCountsGet($product_group_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupProductCounts
```

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
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
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsProductCountsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupProductCounts**](../Model/CatalogsProductGroupProductCounts.md)

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
catalogsProductGroupsUpdate($product_group_id, $catalogs_product_groups_update_request, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupsCreate201Response
```

Update product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$product_group_id = 'product_group_id_example'; // string | Unique identifier of a product group
$catalogs_product_groups_update_request = new \OpenAPI\Client\Model\CatalogsProductGroupsUpdateRequest(); // \OpenAPI\Client\Model\CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->catalogsProductGroupsUpdate($product_group_id, $catalogs_product_groups_update_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product_group_id** | **string**| Unique identifier of a product group | |
| **catalogs_product_groups_update_request** | [**\OpenAPI\Client\Model\CatalogsProductGroupsUpdateRequest**](../Model/CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroupsCreate201Response**](../Model/CatalogsProductGroupsCreate201Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `feedProcessingResultsList()`

```php
feedProcessingResultsList($feed_id, $bookmark, $page_size, $ad_account_id): \OpenAPI\Client\Model\FeedProcessingResultsList200Response
```

List processing results for a given feed

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$feed_id = 'feed_id_example'; // string | Unique identifier of a feed
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->feedProcessingResultsList($feed_id, $bookmark, $page_size, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedProcessingResultsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feed_id** | **string**| Unique identifier of a feed | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\FeedProcessingResultsList200Response**](../Model/FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `feedsCreate()`

```php
feedsCreate($feeds_create_request, $ad_account_id): \OpenAPI\Client\Model\CatalogsFeed
```

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$feeds_create_request = new \OpenAPI\Client\Model\FeedsCreateRequest(); // \OpenAPI\Client\Model\FeedsCreateRequest | Request object used to created a feed.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->feedsCreate($feeds_create_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feeds_create_request** | [**\OpenAPI\Client\Model\FeedsCreateRequest**](../Model/FeedsCreateRequest.md)| Request object used to created a feed. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `feedsDelete()`

```php
feedsDelete($feed_id, $ad_account_id)
```

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$feed_id = 'feed_id_example'; // string | Unique identifier of a feed
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $apiInstance->feedsDelete($feed_id, $ad_account_id);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feed_id** | **string**| Unique identifier of a feed | |
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

## `feedsGet()`

```php
feedsGet($feed_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsFeed
```

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$feed_id = 'feed_id_example'; // string | Unique identifier of a feed
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->feedsGet($feed_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feed_id** | **string**| Unique identifier of a feed | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `feedsList()`

```php
feedsList($bookmark, $page_size, $catalog_id, $ad_account_id): \OpenAPI\Client\Model\FeedsList200Response
```

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$catalog_id = 'catalog_id_example'; // string | Filter entities for a given catalog_id. If not given, all catalogs are considered.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->feedsList($bookmark, $page_size, $catalog_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **catalog_id** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\FeedsList200Response**](../Model/FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `feedsUpdate()`

```php
feedsUpdate($feed_id, $feeds_update_request, $ad_account_id): \OpenAPI\Client\Model\CatalogsFeed
```

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$feed_id = 'feed_id_example'; // string | Unique identifier of a feed
$feeds_update_request = new \OpenAPI\Client\Model\FeedsUpdateRequest(); // \OpenAPI\Client\Model\FeedsUpdateRequest | Request object used to update a feed.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->feedsUpdate($feed_id, $feeds_update_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feed_id** | **string**| Unique identifier of a feed | |
| **feeds_update_request** | [**\OpenAPI\Client\Model\FeedsUpdateRequest**](../Model/FeedsUpdateRequest.md)| Request object used to update a feed. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `itemsBatchGet()`

```php
itemsBatchGet($batch_id, $ad_account_id): \OpenAPI\Client\Model\CatalogsItemsBatch
```

Get catalogs item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$batch_id = 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e; // string | Id of a catalogs items batch to fetch
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->itemsBatchGet($batch_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsBatchGet: ', $e->getMessage(), PHP_EOL;
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

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `itemsBatchPost()`

```php
itemsBatchPost($items_batch_post_request, $ad_account_id): \OpenAPI\Client\Model\CatalogsItemsBatch
```

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$items_batch_post_request = new \OpenAPI\Client\Model\ItemsBatchPostRequest(); // \OpenAPI\Client\Model\ItemsBatchPostRequest | Request object used to create catalogs items in a batch
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->itemsBatchPost($items_batch_post_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsBatchPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **items_batch_post_request** | [**\OpenAPI\Client\Model\ItemsBatchPostRequest**](../Model/ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `itemsGet()`

```php
itemsGet($country, $language, $ad_account_id, $item_ids, $filters): \OpenAPI\Client\Model\CatalogsItems
```

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$country = US; // string | Country for the Catalogs Items
$language = EN; // string | Language for the Catalogs Items
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$item_ids = ["CR123"]; // string[] | This parameter is deprecated. Use filters instead.
$filters = new \OpenAPI\Client\Model\CatalogsItemsFilters(); // CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter.

try {
    $result = $apiInstance->itemsGet($country, $language, $ad_account_id, $item_ids, $filters);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **country** | **string**| Country for the Catalogs Items | |
| **language** | **string**| Language for the Catalogs Items | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **item_ids** | [**string[]**](../Model/string.md)| This parameter is deprecated. Use filters instead. | [optional] |
| **filters** | [**CatalogsItemsFilters**](../Model/.md)| Identifies items to be retrieved. This is a required parameter. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CatalogsItems**](../Model/CatalogsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `itemsIssuesList()`

```php
itemsIssuesList($processing_result_id, $bookmark, $page_size, $item_numbers, $item_validation_issue, $ad_account_id): \OpenAPI\Client\Model\ItemsIssuesList200Response
```

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$processing_result_id = 5224831246441439241; // string | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$item_numbers = [1,5]; // int[] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
$item_validation_issue = TITLE_MISSING; // CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->itemsIssuesList($processing_result_id, $bookmark, $page_size, $item_numbers, $item_validation_issue, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsIssuesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **processing_result_id** | **string**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **item_numbers** | [**int[]**](../Model/int.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] |
| **item_validation_issue** | [**CatalogsItemValidationIssue**](../Model/.md)| Filter item validation issues that have a given type of item validation issue. | [optional] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\ItemsIssuesList200Response**](../Model/ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `productsByProductGroupFilterList()`

```php
productsByProductGroupFilterList($catalogs_list_products_by_filter_request, $bookmark, $page_size, $ad_account_id): \OpenAPI\Client\Model\CatalogsProductGroupPinsList200Response
```

List filtered products

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CatalogsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$catalogs_list_products_by_filter_request = new \OpenAPI\Client\Model\CatalogsListProductsByFilterRequest(); // \OpenAPI\Client\Model\CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->productsByProductGroupFilterList($catalogs_list_products_by_filter_request, $bookmark, $page_size, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->productsByProductGroupFilterList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogs_list_products_by_filter_request** | [**\OpenAPI\Client\Model\CatalogsListProductsByFilterRequest**](../Model/CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

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
