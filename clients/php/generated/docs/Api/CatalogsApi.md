# OpenAPI\Client\CatalogsApi

All URIs are relative to https://api.pinterest.com/v5.

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate()**](CatalogsApi.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete()**](CatalogsApi.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList()**](CatalogsApi.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate()**](CatalogsApi.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList()**](CatalogsApi.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate()**](CatalogsApi.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete()**](CatalogsApi.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet()**](CatalogsApi.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList()**](CatalogsApi.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate()**](CatalogsApi.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet()**](CatalogsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost()**](CatalogsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet()**](CatalogsApi.md#itemsGet) | **GET** /catalogs/items | Get catalogs items


## `catalogsProductGroupsCreate()`

```php
catalogsProductGroupsCreate($catalogs_product_group_create_request): object
```

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

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
$catalogs_product_group_create_request = new \OpenAPI\Client\Model\CatalogsProductGroupCreateRequest(); // \OpenAPI\Client\Model\CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

try {
    $result = $apiInstance->catalogsProductGroupsCreate($catalogs_product_group_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_group_create_request** | [**\OpenAPI\Client\Model\CatalogsProductGroupCreateRequest**](../Model/CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. |

### Return type

**object**

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
catalogsProductGroupsDelete($product_group_id)
```

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

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

try {
    $apiInstance->catalogsProductGroupsDelete($product_group_id);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group |

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

## `catalogsProductGroupsList()`

```php
catalogsProductGroupsList($feed_id, $bookmark, $page_size): Paginated
```

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

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
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

try {
    $result = $apiInstance->catalogsProductGroupsList($feed_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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

## `catalogsProductGroupsUpdate()`

```php
catalogsProductGroupsUpdate($product_group_id, $catalogs_product_group_update_request): \OpenAPI\Client\Model\CatalogsProductGroup
```

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

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
$catalogs_product_group_update_request = new \OpenAPI\Client\Model\CatalogsProductGroupUpdateRequest(); // \OpenAPI\Client\Model\CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

try {
    $result = $apiInstance->catalogsProductGroupsUpdate($product_group_id, $catalogs_product_group_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->catalogsProductGroupsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **string**| Unique identifier of a product group |
 **catalogs_product_group_update_request** | [**\OpenAPI\Client\Model\CatalogsProductGroupUpdateRequest**](../Model/CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. |

### Return type

[**\OpenAPI\Client\Model\CatalogsProductGroup**](../Model/CatalogsProductGroup.md)

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
feedProcessingResultsList($feed_id, $bookmark, $page_size): Paginated
```

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

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
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

try {
    $result = $apiInstance->feedProcessingResultsList($feed_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedProcessingResultsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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

## `feedsCreate()`

```php
feedsCreate($catalogs_feeds_create_request): \OpenAPI\Client\Model\CatalogsFeed
```

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

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
$catalogs_feeds_create_request = new \OpenAPI\Client\Model\CatalogsFeedsCreateRequest(); // \OpenAPI\Client\Model\CatalogsFeedsCreateRequest | Request object used to created a feed.

try {
    $result = $apiInstance->feedsCreate($catalogs_feeds_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_feeds_create_request** | [**\OpenAPI\Client\Model\CatalogsFeedsCreateRequest**](../Model/CatalogsFeedsCreateRequest.md)| Request object used to created a feed. |

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
feedsDelete($feed_id)
```

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

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

try {
    $apiInstance->feedsDelete($feed_id);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed |

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
feedsGet($feed_id): \OpenAPI\Client\Model\CatalogsFeed
```

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

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

try {
    $result = $apiInstance->feedsGet($feed_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed |

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
feedsList($bookmark, $page_size): Paginated
```

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

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
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

try {
    $result = $apiInstance->feedsList($bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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

## `feedsUpdate()`

```php
feedsUpdate($feed_id, $catalogs_feeds_update_request): \OpenAPI\Client\Model\CatalogsFeed
```

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

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
$catalogs_feeds_update_request = new \OpenAPI\Client\Model\CatalogsFeedsUpdateRequest(); // \OpenAPI\Client\Model\CatalogsFeedsUpdateRequest | Request object used to update a feed.

try {
    $result = $apiInstance->feedsUpdate($feed_id, $catalogs_feeds_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->feedsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **string**| Unique identifier of a feed |
 **catalogs_feeds_update_request** | [**\OpenAPI\Client\Model\CatalogsFeedsUpdateRequest**](../Model/CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. |

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
itemsBatchGet($batch_id): \OpenAPI\Client\Model\CatalogsItemsBatch
```

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

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

try {
    $result = $apiInstance->itemsBatchGet($batch_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsBatchGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| Id of a catalogs items batch to fetch |

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
itemsBatchPost($catalogs_items_batch_request): \OpenAPI\Client\Model\CatalogsItemsBatch
```

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

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
$catalogs_items_batch_request = new \OpenAPI\Client\Model\CatalogsItemsBatchRequest(); // \OpenAPI\Client\Model\CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

try {
    $result = $apiInstance->itemsBatchPost($catalogs_items_batch_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsBatchPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_batch_request** | [**\OpenAPI\Client\Model\CatalogsItemsBatchRequest**](../Model/CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch |

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
itemsGet($country, $item_ids, $language): \OpenAPI\Client\Model\CatalogsItems
```

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

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
$item_ids = CR123; // string[] | Catalos Item ids
$language = EN; // string | Language for the Catalogs Items

try {
    $result = $apiInstance->itemsGet($country, $item_ids, $language);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CatalogsApi->itemsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string**| Country for the Catalogs Items |
 **item_ids** | [**string[]**](../Model/string.md)| Catalos Item ids |
 **language** | **string**| Language for the Catalogs Items |

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
