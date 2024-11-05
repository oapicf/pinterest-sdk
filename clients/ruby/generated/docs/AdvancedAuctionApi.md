# PinterestSdkClient::AdvancedAuctionApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**advanced_auction_items_get_post**](AdvancedAuctionApi.md#advanced_auction_items_get_post) | **POST** /advanced_auction/items/get | Get item bid options (POST) |
| [**advanced_auction_items_submit_post**](AdvancedAuctionApi.md#advanced_auction_items_submit_post) | **POST** /advanced_auction/items/submit | Operate on item level bid options |


## advanced_auction_items_get_post

> <AdvancedAuctionItems> advanced_auction_items_get_post(advanced_auction_items_get_request, opts)

Get item bid options (POST)

Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdvancedAuctionApi.new
advanced_auction_items_get_request = PinterestSdkClient::AdvancedAuctionItemsGetRequest.new({catalog_id: '2680059592705', items: [PinterestSdkClient::AdvancedAuctionItemsGetRecord.new({item_id: 'DS0294-M', country: PinterestSdkClient::Country::AD, language: PinterestSdkClient::Language::AM})]}) # AdvancedAuctionItemsGetRequest | Request object used to get bid options values for a batch of retail catalog items
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get item bid options (POST)
  result = api_instance.advanced_auction_items_get_post(advanced_auction_items_get_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdvancedAuctionApi->advanced_auction_items_get_post: #{e}"
end
```

#### Using the advanced_auction_items_get_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdvancedAuctionItems>, Integer, Hash)> advanced_auction_items_get_post_with_http_info(advanced_auction_items_get_request, opts)

```ruby
begin
  # Get item bid options (POST)
  data, status_code, headers = api_instance.advanced_auction_items_get_post_with_http_info(advanced_auction_items_get_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvancedAuctionItems>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdvancedAuctionApi->advanced_auction_items_get_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **advanced_auction_items_get_request** | [**AdvancedAuctionItemsGetRequest**](AdvancedAuctionItemsGetRequest.md) | Request object used to get bid options values for a batch of retail catalog items |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**AdvancedAuctionItems**](AdvancedAuctionItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## advanced_auction_items_submit_post

> <AdvancedAuctionProcessedItems> advanced_auction_items_submit_post(advanced_auction_items_submit_request, opts)

Operate on item level bid options

This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". <a href=\"/docs/api-features/modify-items-in-batch/\" target=\"_blank\">See detailed documentation here.</a> By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AdvancedAuctionApi.new
advanced_auction_items_submit_request = PinterestSdkClient::AdvancedAuctionItemsSubmitRequest.new({catalog_id: '2680059592705', items: [PinterestSdkClient::AdvancedAuctionItemsSubmitDeleteRecord.new({item_id: 'DS0294-M', country: PinterestSdkClient::Country::AD, language: PinterestSdkClient::Language::AM})]}) # AdvancedAuctionItemsSubmitRequest | Request object used to upsert or delete bid options for a batch of retail catalog items
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Operate on item level bid options
  result = api_instance.advanced_auction_items_submit_post(advanced_auction_items_submit_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdvancedAuctionApi->advanced_auction_items_submit_post: #{e}"
end
```

#### Using the advanced_auction_items_submit_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdvancedAuctionProcessedItems>, Integer, Hash)> advanced_auction_items_submit_post_with_http_info(advanced_auction_items_submit_request, opts)

```ruby
begin
  # Operate on item level bid options
  data, status_code, headers = api_instance.advanced_auction_items_submit_post_with_http_info(advanced_auction_items_submit_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvancedAuctionProcessedItems>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AdvancedAuctionApi->advanced_auction_items_submit_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **advanced_auction_items_submit_request** | [**AdvancedAuctionItemsSubmitRequest**](AdvancedAuctionItemsSubmitRequest.md) | Request object used to upsert or delete bid options for a batch of retail catalog items |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**AdvancedAuctionProcessedItems**](AdvancedAuctionProcessedItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

