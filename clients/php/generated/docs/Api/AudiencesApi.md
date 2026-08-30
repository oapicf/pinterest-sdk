# OpenAPI\Client\AudiencesApi

View, create, or update audiences.

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**audiencesCreate()**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiencesGet()**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiencesList()**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiencesUpdate()**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


## `audiencesCreate()`

```php
audiencesCreate($ad_account_id, $ad_accounts_audience_create): \OpenAPI\Client\Model\AdAccountsAudience
```

Create audience

Create a new audience for the ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_accounts_audience_create = new \OpenAPI\Client\Model\AdAccountsAudienceCreate(); // \OpenAPI\Client\Model\AdAccountsAudienceCreate

try {
    $result = $apiInstance->audiencesCreate($ad_account_id, $ad_accounts_audience_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_accounts_audience_create** | [**\OpenAPI\Client\Model\AdAccountsAudienceCreate**](../Model/AdAccountsAudienceCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdAccountsAudience**](../Model/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audiencesGet()`

```php
audiencesGet($audience_id, $ad_account_id): \OpenAPI\Client\Model\AdAccountsAudience
```

Get audience

Get a specific audience given the audience ID.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$audience_id = 'audience_id_example'; // string | Audience ID.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->audiencesGet($audience_id, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **audience_id** | **string**| Audience ID. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |

### Return type

[**\OpenAPI\Client\Model\AdAccountsAudience**](../Model/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audiencesList()`

```php
audiencesList($ad_account_id, $bookmark, $page_size, $order, $ownership_type, $exclude_nca): \OpenAPI\Client\Model\AudiencesList200Response
```

List audiences

Get list of audiences for the ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$ownership_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AudienceOwnershipType(); // \OpenAPI\Client\Model\AudienceOwnershipType
$exclude_nca = false; // bool | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).

try {
    $result = $apiInstance->audiencesList($ad_account_id, $bookmark, $page_size, $order, $ownership_type, $exclude_nca);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **ownership_type** | [**\OpenAPI\Client\Model\AudienceOwnershipType**](../Model/.md)|  | [optional] |
| **exclude_nca** | **bool**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false] |

### Return type

[**\OpenAPI\Client\Model\AudiencesList200Response**](../Model/AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audiencesUpdate()`

```php
audiencesUpdate($audience_id, $ad_account_id, $ad_accounts_audience_update): \OpenAPI\Client\Model\AdAccountsAudience
```

Update audience

Update an existing audience for the ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$audience_id = 'audience_id_example'; // string | Audience ID.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_accounts_audience_update = new \OpenAPI\Client\Model\AdAccountsAudienceUpdate(); // \OpenAPI\Client\Model\AdAccountsAudienceUpdate

try {
    $result = $apiInstance->audiencesUpdate($audience_id, $ad_account_id, $ad_accounts_audience_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **audience_id** | **string**| Audience ID. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_accounts_audience_update** | [**\OpenAPI\Client\Model\AdAccountsAudienceUpdate**](../Model/AdAccountsAudienceUpdate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdAccountsAudience**](../Model/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
