# PinterestSdkClient::CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**items_batch_get**](CatalogItemsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status |
| [**items_batch_post**](CatalogItemsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Operate on item batch |
| [**items_post**](CatalogItemsApi.md#items_post) | **POST** /catalogs/items | Get catalogs items (POST) |


## items_batch_get

> <CatalogsItemsBatch> items_batch_get(batch_id, opts)

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogItemsApi.new
batch_id = 'batch_id_example' # String | Id of a catalogs items batch to fetch
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get item batch status
  result = api_instance.items_batch_get(batch_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogItemsApi->items_batch_get: #{e}"
end
```

#### Using the items_batch_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItemsBatch>, Integer, Hash)> items_batch_get_with_http_info(batch_id, opts)

```ruby
begin
  # Get item batch status
  data, status_code, headers = api_instance.items_batch_get_with_http_info(batch_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItemsBatch>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogItemsApi->items_batch_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of a catalogs items batch to fetch |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## items_batch_post

> <CatalogsItemsBatch> items_batch_post(catalogs_items_batch_post_request, opts)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogItemsApi.new
catalogs_items_batch_post_request = PinterestSdkClient::CatalogsItemsCreateBatchRequest.new({country: PinterestSdkClient::Country::AD, items: [PinterestSdkClient::ItemCreateBatchRecord.new], language: 'af-ZA', operation: 'CREATE'}) # CatalogsItemsBatchPostRequest | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Operate on item batch
  result = api_instance.items_batch_post(catalogs_items_batch_post_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogItemsApi->items_batch_post: #{e}"
end
```

#### Using the items_batch_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItemsBatch>, Integer, Hash)> items_batch_post_with_http_info(catalogs_items_batch_post_request, opts)

```ruby
begin
  # Operate on item batch
  data, status_code, headers = api_instance.items_batch_post_with_http_info(catalogs_items_batch_post_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItemsBatch>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogItemsApi->items_batch_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_items_batch_post_request** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## items_post

> <ItemsPost200Response> items_post(catalogs_items_request, opts)

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogItemsApi.new
catalogs_items_request = PinterestSdkClient::CatalogsItemsRequest.new({country: PinterestSdkClient::Country::AD, filters: PinterestSdkClient::CatalogsCreativeAssetsItemsPostFilter.new({catalog_type: 'CREATIVE_ASSETS', creative_assets_ids: ['creative_assets_ids_example']}), language: 'af-ZA'}) # CatalogsItemsRequest | 
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get catalogs items (POST)
  result = api_instance.items_post(catalogs_items_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogItemsApi->items_post: #{e}"
end
```

#### Using the items_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemsPost200Response>, Integer, Hash)> items_post_with_http_info(catalogs_items_request, opts)

```ruby
begin
  # Get catalogs items (POST)
  data, status_code, headers = api_instance.items_post_with_http_info(catalogs_items_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemsPost200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogItemsApi->items_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_items_request** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md) |  |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**ItemsPost200Response**](ItemsPost200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

