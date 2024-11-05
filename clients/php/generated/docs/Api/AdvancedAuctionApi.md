# OpenAPI\Client\AdvancedAuctionApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**advancedAuctionItemsGetPost()**](AdvancedAuctionApi.md#advancedAuctionItemsGetPost) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
| [**advancedAuctionItemsSubmitPost()**](AdvancedAuctionApi.md#advancedAuctionItemsSubmitPost) | **POST** /advanced_auction/items/submit | Operate on item level bid options |


## `advancedAuctionItemsGetPost()`

```php
advancedAuctionItemsGetPost($advanced_auction_items_get_request, $ad_account_id): \OpenAPI\Client\Model\AdvancedAuctionItems
```

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdvancedAuctionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$advanced_auction_items_get_request = new \OpenAPI\Client\Model\AdvancedAuctionItemsGetRequest(); // \OpenAPI\Client\Model\AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->advancedAuctionItemsGetPost($advanced_auction_items_get_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdvancedAuctionApi->advancedAuctionItemsGetPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **advanced_auction_items_get_request** | [**\OpenAPI\Client\Model\AdvancedAuctionItemsGetRequest**](../Model/AdvancedAuctionItemsGetRequest.md)| Request object used to get bid options values for a batch of retail catalog items | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdvancedAuctionItems**](../Model/AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `advancedAuctionItemsSubmitPost()`

```php
advancedAuctionItemsSubmitPost($advanced_auction_items_submit_request, $ad_account_id): \OpenAPI\Client\Model\AdvancedAuctionProcessedItems
```

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AdvancedAuctionApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$advanced_auction_items_submit_request = new \OpenAPI\Client\Model\AdvancedAuctionItemsSubmitRequest(); // \OpenAPI\Client\Model\AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->advancedAuctionItemsSubmitPost($advanced_auction_items_submit_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdvancedAuctionApi->advancedAuctionItemsSubmitPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **advanced_auction_items_submit_request** | [**\OpenAPI\Client\Model\AdvancedAuctionItemsSubmitRequest**](../Model/AdvancedAuctionItemsSubmitRequest.md)| Request object used to upsert or delete bid options for a batch of retail catalog items | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\AdvancedAuctionProcessedItems**](../Model/AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
