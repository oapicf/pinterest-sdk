# OpenAPI\Client\SearchApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**searchPartnerPins()**](SearchApi.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term |
| [**searchUserBoardsGet()**](SearchApi.md#searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards |
| [**searchUserPinsList()**](SearchApi.md#searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins |


## `searchPartnerPins()`

```php
searchPartnerPins($term, $country_code, $bookmark, $locale, $limit): \OpenAPI\Client\Model\SearchPartnerPins200Response
```

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SearchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$term = 'term_example'; // string | Search term to look up pins.
$country_code = US; // string | Two letter country code (ISO 3166-1 alpha-2)
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$locale = 'locale_example'; // string | Search locale.
$limit = 4; // int | Max search result size

try {
    $result = $apiInstance->searchPartnerPins($term, $country_code, $bookmark, $locale, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->searchPartnerPins: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **term** | **string**| Search term to look up pins. | |
| **country_code** | **string**| Two letter country code (ISO 3166-1 alpha-2) | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **locale** | **string**| Search locale. | [optional] |
| **limit** | **int**| Max search result size | [optional] [default to 10] |

### Return type

[**\OpenAPI\Client\Model\SearchPartnerPins200Response**](../Model/SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `searchUserBoardsGet()`

```php
searchUserBoardsGet($ad_account_id, $bookmark, $page_size, $query): \OpenAPI\Client\Model\SearchUserBoardsGet200Response
```

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SearchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$query = 'query_example'; // string | Search query. Can contain pin description keywords or comma-separated pin IDs.

try {
    $result = $apiInstance->searchUserBoardsGet($ad_account_id, $bookmark, $page_size, $query);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->searchUserBoardsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**\OpenAPI\Client\Model\SearchUserBoardsGet200Response**](../Model/SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `searchUserPinsList()`

```php
searchUserPinsList($query, $ad_account_id, $bookmark): \OpenAPI\Client\Model\PinsList200Response
```

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SearchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$query = Plants; // string | Search query. Can contain pin description keywords or comma-separated pin IDs.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->searchUserPinsList($query, $ad_account_id, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->searchUserPinsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\PinsList200Response**](../Model/PinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
