# OpenAPI\Client\TargetingTemplateApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**targetingTemplateCreate()**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplateList()**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplateUpdate()**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


## `targetingTemplateCreate()`

```php
targetingTemplateCreate($ad_account_id, $targeting_template_create): \OpenAPI\Client\Model\TargetingTemplateGetResponseData
```

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

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
$targeting_template_create = new \OpenAPI\Client\Model\TargetingTemplateCreate(); // \OpenAPI\Client\Model\TargetingTemplateCreate | targeting template creation entity

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
| **targeting_template_create** | [**\OpenAPI\Client\Model\TargetingTemplateCreate**](../Model/TargetingTemplateCreate.md)| targeting template creation entity | |

### Return type

[**\OpenAPI\Client\Model\TargetingTemplateGetResponseData**](../Model/TargetingTemplateGetResponseData.md)

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
targetingTemplateList($ad_account_id, $order, $include_sizing, $search_query, $page_size, $bookmark): \OpenAPI\Client\Model\TargetingTemplateList200Response
```

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

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
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$include_sizing = false; // bool | Include audience sizing in result or not
$search_query = gaming; // string | Search keyword for targeting templates
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->targetingTemplateList($ad_account_id, $order, $include_sizing, $search_query, $page_size, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TargetingTemplateApi->targetingTemplateList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **include_sizing** | **bool**| Include audience sizing in result or not | [optional] [default to false] |
| **search_query** | **string**| Search keyword for targeting templates | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\TargetingTemplateList200Response**](../Model/TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `targetingTemplateUpdate()`

```php
targetingTemplateUpdate($ad_account_id, $targeting_template_update_request)
```

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

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
$targeting_template_update_request = new \OpenAPI\Client\Model\TargetingTemplateUpdateRequest(); // \OpenAPI\Client\Model\TargetingTemplateUpdateRequest | Operation type and targeting template ID

try {
    $apiInstance->targetingTemplateUpdate($ad_account_id, $targeting_template_update_request);
} catch (Exception $e) {
    echo 'Exception when calling TargetingTemplateApi->targetingTemplateUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **targeting_template_update_request** | [**\OpenAPI\Client\Model\TargetingTemplateUpdateRequest**](../Model/TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | |

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
