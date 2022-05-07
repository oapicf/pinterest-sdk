# PinterestSdkClient::CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**catalogs_product_groups_create**](CatalogsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group |
| [**catalogs_product_groups_delete**](CatalogsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group |
| [**catalogs_product_groups_list**](CatalogsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | Get product groups list |
| [**catalogs_product_groups_update**](CatalogsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group |
| [**feed_processing_results_list**](CatalogsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed |
| [**feeds_create**](CatalogsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed |
| [**feeds_delete**](CatalogsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feeds_get**](CatalogsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feeds_list**](CatalogsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds |
| [**feeds_update**](CatalogsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**items_batch_get**](CatalogsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch |
| [**items_batch_post**](CatalogsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Perform an operation on an item batch |
| [**items_get**](CatalogsApi.md#items_get) | **GET** /catalogs/items | Get catalogs items |


## catalogs_product_groups_create

> Object catalogs_product_groups_create(catalogs_product_group_create_request)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
catalogs_product_group_create_request = PinterestSdkClient::CatalogsProductGroupCreateRequest.new({feed_id: '2680059592705', name: 'name_example', filters: PinterestSdkClient::CatalogsProductGroupFilters.new}) # CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

begin
  # Create product group
  result = api_instance.catalogs_product_groups_create(catalogs_product_group_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_create: #{e}"
end
```

#### Using the catalogs_product_groups_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> catalogs_product_groups_create_with_http_info(catalogs_product_group_create_request)

```ruby
begin
  # Create product group
  data, status_code, headers = api_instance.catalogs_product_groups_create_with_http_info(catalogs_product_group_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_product_group_create_request** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md) | Request object used to created a catalogs product group. |  |

### Return type

**Object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## catalogs_product_groups_delete

> catalogs_product_groups_delete(product_group_id)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group

begin
  # Delete product group
  api_instance.catalogs_product_groups_delete(product_group_id)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_delete: #{e}"
end
```

#### Using the catalogs_product_groups_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> catalogs_product_groups_delete_with_http_info(product_group_id)

```ruby
begin
  # Delete product group
  data, status_code, headers = api_instance.catalogs_product_groups_delete_with_http_info(product_group_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_list

> <Paginated> catalogs_product_groups_list(feed_id, opts)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
}

begin
  # Get product groups list
  result = api_instance.catalogs_product_groups_list(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_list: #{e}"
end
```

#### Using the catalogs_product_groups_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> catalogs_product_groups_list_with_http_info(feed_id, opts)

```ruby
begin
  # Get product groups list
  data, status_code, headers = api_instance.catalogs_product_groups_list_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## catalogs_product_groups_update

> <CatalogsProductGroup> catalogs_product_groups_update(product_group_id, catalogs_product_group_update_request)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
product_group_id = 'product_group_id_example' # String | Unique identifier of a product group
catalogs_product_group_update_request = PinterestSdkClient::CatalogsProductGroupUpdateRequest.new({feed_id: '2680059592705', name: 'name_example', filters: PinterestSdkClient::CatalogsProductGroupFilters.new}) # CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

begin
  # Update product group
  result = api_instance.catalogs_product_groups_update(product_group_id, catalogs_product_group_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_update: #{e}"
end
```

#### Using the catalogs_product_groups_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsProductGroup>, Integer, Hash)> catalogs_product_groups_update_with_http_info(product_group_id, catalogs_product_group_update_request)

```ruby
begin
  # Update product group
  data, status_code, headers = api_instance.catalogs_product_groups_update_with_http_info(product_group_id, catalogs_product_group_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsProductGroup>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->catalogs_product_groups_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | Unique identifier of a product group |  |
| **catalogs_product_group_update_request** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md) | Request object used to Update a catalogs product group. |  |

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feed_processing_results_list

> <Paginated> feed_processing_results_list(feed_id, opts)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
}

begin
  # List processing results for a given feed
  result = api_instance.feed_processing_results_list(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feed_processing_results_list: #{e}"
end
```

#### Using the feed_processing_results_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> feed_processing_results_list_with_http_info(feed_id, opts)

```ruby
begin
  # List processing results for a given feed
  data, status_code, headers = api_instance.feed_processing_results_list_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feed_processing_results_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_create

> <CatalogsFeed> feeds_create(catalogs_feeds_create_request)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
catalogs_feeds_create_request = PinterestSdkClient::CatalogsFeedsCreateRequest.new({name: 'name_example', format: PinterestSdkClient::CatalogsFormat::TSV, location: 'location_example'}) # CatalogsFeedsCreateRequest | Request object used to created a feed.

begin
  # Create feed
  result = api_instance.feeds_create(catalogs_feeds_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_create: #{e}"
end
```

#### Using the feeds_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_create_with_http_info(catalogs_feeds_create_request)

```ruby
begin
  # Create feed
  data, status_code, headers = api_instance.feeds_create_with_http_info(catalogs_feeds_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_feeds_create_request** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md) | Request object used to created a feed. |  |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feeds_delete

> feeds_delete(feed_id)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed

begin
  # Delete feed
  api_instance.feeds_delete(feed_id)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_delete: #{e}"
end
```

#### Using the feeds_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> feeds_delete_with_http_info(feed_id)

```ruby
begin
  # Delete feed
  data, status_code, headers = api_instance.feeds_delete_with_http_info(feed_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_get

> <CatalogsFeed> feeds_get(feed_id)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed

begin
  # Get feed
  result = api_instance.feeds_get(feed_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_get: #{e}"
end
```

#### Using the feeds_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_get_with_http_info(feed_id)

```ruby
begin
  # Get feed
  data, status_code, headers = api_instance.feeds_get_with_http_info(feed_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_list

> <Paginated> feeds_list(opts)

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
}

begin
  # List feeds
  result = api_instance.feeds_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_list: #{e}"
end
```

#### Using the feeds_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Paginated>, Integer, Hash)> feeds_list_with_http_info(opts)

```ruby
begin
  # List feeds
  data, status_code, headers = api_instance.feeds_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Paginated>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**Paginated**](Paginated.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_update

> <CatalogsFeed> feeds_update(feed_id, catalogs_feeds_update_request)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
catalogs_feeds_update_request = PinterestSdkClient::CatalogsFeedsUpdateRequest.new # CatalogsFeedsUpdateRequest | Request object used to update a feed.

begin
  # Update feed
  result = api_instance.feeds_update(feed_id, catalogs_feeds_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_update: #{e}"
end
```

#### Using the feeds_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_update_with_http_info(feed_id, catalogs_feeds_update_request)

```ruby
begin
  # Update feed
  data, status_code, headers = api_instance.feeds_update_with_http_info(feed_id, catalogs_feeds_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->feeds_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **catalogs_feeds_update_request** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md) | Request object used to update a feed. |  |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## items_batch_get

> <CatalogsItemsBatch> items_batch_get(batch_id)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
batch_id = '595953100599279259-66753b9bb65c46c49bd8503b27fecf9e' # String | Id of a catalogs items batch to fetch

begin
  # Get catalogs items batch
  result = api_instance.items_batch_get(batch_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_get: #{e}"
end
```

#### Using the items_batch_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItemsBatch>, Integer, Hash)> items_batch_get_with_http_info(batch_id)

```ruby
begin
  # Get catalogs items batch
  data, status_code, headers = api_instance.items_batch_get_with_http_info(batch_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItemsBatch>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **batch_id** | **String** | Id of a catalogs items batch to fetch |  |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## items_batch_post

> <CatalogsItemsBatch> items_batch_post(catalogs_items_batch_request)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
catalogs_items_batch_request = PinterestSdkClient::CatalogsItemsBatchRequest.new # CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

begin
  # Perform an operation on an item batch
  result = api_instance.items_batch_post(catalogs_items_batch_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_post: #{e}"
end
```

#### Using the items_batch_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItemsBatch>, Integer, Hash)> items_batch_post_with_http_info(catalogs_items_batch_request)

```ruby
begin
  # Perform an operation on an item batch
  data, status_code, headers = api_instance.items_batch_post_with_http_info(catalogs_items_batch_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItemsBatch>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_batch_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalogs_items_batch_request** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md) | Request object used to create catalogs items in a batch |  |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## items_get

> <CatalogsItems> items_get(country, item_ids, language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogsApi.new
country = 'US' # String | Country for the Catalogs Items
item_ids = ['inner_example'] # Array<String> | Catalos Item ids
language = 'EN' # String | Language for the Catalogs Items

begin
  # Get catalogs items
  result = api_instance.items_get(country, item_ids, language)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_get: #{e}"
end
```

#### Using the items_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsItems>, Integer, Hash)> items_get_with_http_info(country, item_ids, language)

```ruby
begin
  # Get catalogs items
  data, status_code, headers = api_instance.items_get_with_http_info(country, item_ids, language)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsItems>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogsApi->items_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | **String** | Country for the Catalogs Items |  |
| **item_ids** | [**Array&lt;String&gt;**](String.md) | Catalos Item ids |  |
| **language** | **String** | Language for the Catalogs Items |  |

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

