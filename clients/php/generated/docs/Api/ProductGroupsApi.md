# OpenAPI\Client\ProductGroupsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adAccountsCatalogsProductGroupsList()**](ProductGroupsApi.md#adAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups |


## `adAccountsCatalogsProductGroupsList()`

```php
adAccountsCatalogsProductGroupsList($ad_account_id, $feed_profile_id): \OpenAPI\Client\Model\AdAccountsCatalogsProductGroupsList200Response
```

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\ProductGroupsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$feed_profile_id = 'feed_profile_id_example'; // string | The feed profile id whose catalog product groups we want to return.

try {
    $result = $apiInstance->adAccountsCatalogsProductGroupsList($ad_account_id, $feed_profile_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductGroupsApi->adAccountsCatalogsProductGroupsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **feed_profile_id** | **string**| The feed profile id whose catalog product groups we want to return. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdAccountsCatalogsProductGroupsList200Response**](../Model/AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
