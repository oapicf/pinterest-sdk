# OpenAPI\Client\TargetingTemplateApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**targetingTemplateCreate()**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplateList()**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplateUpdate()**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


## `targetingTemplateCreate()`

```php
targetingTemplateCreate($ad_account_id, $targeting_template_create): \OpenAPI\Client\Model\TargetingTemplate
```

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TargetingTemplateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$targeting_template_create = new \OpenAPI\Client\Model\TargetingTemplateCreate(); // \OpenAPI\Client\Model\TargetingTemplateCreate

try {
    $result = $apiInstance->targetingTemplateCreate($ad_account_id, $targeting_template_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TargetingTemplateApi->targetingTemplateCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **targeting_template_create** | [**\OpenAPI\Client\Model\TargetingTemplateCreate**](../Model/TargetingTemplateCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\TargetingTemplate**](../Model/TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `targetingTemplateList()`

```php
targetingTemplateList($ad_account_id, $bookmark, $page_size, $order, $include_sizing, $search_query): \OpenAPI\Client\Model\TargetingTemplateList200Response
```

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TargetingTemplateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$include_sizing = false; // bool | Include audience sizing in result or not
$search_query = 'search_query_example'; // string | Search query. Can contain pin description keywords or comma-separated pin IDs.

try {
    $result = $apiInstance->targetingTemplateList($ad_account_id, $bookmark, $page_size, $order, $include_sizing, $search_query);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TargetingTemplateApi->targetingTemplateList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **include_sizing** | **bool**| Include audience sizing in result or not | [optional] [default to false] |
| **search_query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**\OpenAPI\Client\Model\TargetingTemplateList200Response**](../Model/TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `targetingTemplateUpdate()`

```php
targetingTemplateUpdate($ad_account_id, $targeting_template_update_request_read_or_update)
```

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TargetingTemplateApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$targeting_template_update_request_read_or_update = new \OpenAPI\Client\Model\TargetingTemplateUpdateRequestReadOrUpdate(); // \OpenAPI\Client\Model\TargetingTemplateUpdateRequestReadOrUpdate

try {
    $apiInstance->targetingTemplateUpdate($ad_account_id, $targeting_template_update_request_read_or_update);
} catch (Exception $e) {
    echo 'Exception when calling TargetingTemplateApi->targetingTemplateUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **targeting_template_update_request_read_or_update** | [**\OpenAPI\Client\Model\TargetingTemplateUpdateRequestReadOrUpdate**](../Model/TargetingTemplateUpdateRequestReadOrUpdate.md)|  | |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
