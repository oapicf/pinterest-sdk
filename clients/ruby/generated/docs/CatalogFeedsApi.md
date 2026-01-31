# PinterestSdkClient::CatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**feed_processing_results_list**](CatalogFeedsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results |
| [**feeds_create**](CatalogFeedsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed |
| [**feeds_delete**](CatalogFeedsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed |
| [**feeds_get**](CatalogFeedsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed |
| [**feeds_ingest**](CatalogFeedsApi.md#feeds_ingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items |
| [**feeds_list**](CatalogFeedsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds |
| [**feeds_update**](CatalogFeedsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed |
| [**items_issues_list**](CatalogFeedsApi.md#items_issues_list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues |


## feed_processing_results_list

> <FeedProcessingResultsList200Response> feed_processing_results_list(feed_id, opts)

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogFeedsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List feed processing results
  result = api_instance.feed_processing_results_list(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feed_processing_results_list: #{e}"
end
```

#### Using the feed_processing_results_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FeedProcessingResultsList200Response>, Integer, Hash)> feed_processing_results_list_with_http_info(feed_id, opts)

```ruby
begin
  # List feed processing results
  data, status_code, headers = api_instance.feed_processing_results_list_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FeedProcessingResultsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feed_processing_results_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_create

> <CatalogsFeed> feeds_create(feeds_create_request, opts)

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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

api_instance = PinterestSdkClient::CatalogFeedsApi.new
feeds_create_request = PinterestSdkClient::CatalogsFeedsCreateRequest.new({format: PinterestSdkClient::CatalogsFormat::TSV, location: 'location_example', name: 'name_example'}) # FeedsCreateRequest | Request object used to created a feed.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Create feed
  result = api_instance.feeds_create(feeds_create_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_create: #{e}"
end
```

#### Using the feeds_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_create_with_http_info(feeds_create_request, opts)

```ruby
begin
  # Create feed
  data, status_code, headers = api_instance.feeds_create_with_http_info(feeds_create_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feeds_create_request** | [**FeedsCreateRequest**](FeedsCreateRequest.md) | Request object used to created a feed. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## feeds_delete

> feeds_delete(feed_id, opts)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

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

api_instance = PinterestSdkClient::CatalogFeedsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Delete feed
  api_instance.feeds_delete(feed_id, opts)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_delete: #{e}"
end
```

#### Using the feeds_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> feeds_delete_with_http_info(feed_id, opts)

```ruby
begin
  # Delete feed
  data, status_code, headers = api_instance.feeds_delete_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_get

> <CatalogsFeed> feeds_get(feed_id, opts)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

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

api_instance = PinterestSdkClient::CatalogFeedsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Get feed
  result = api_instance.feeds_get(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_get: #{e}"
end
```

#### Using the feeds_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_get_with_http_info(feed_id, opts)

```ruby
begin
  # Get feed
  data, status_code, headers = api_instance.feeds_get_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_ingest

> <CatalogsFeedIngestion> feeds_ingest(feed_id, opts)

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogFeedsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Ingest feed items
  result = api_instance.feeds_ingest(feed_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_ingest: #{e}"
end
```

#### Using the feeds_ingest_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeedIngestion>, Integer, Hash)> feeds_ingest_with_http_info(feed_id, opts)

```ruby
begin
  # Ingest feed items
  data, status_code, headers = api_instance.feeds_ingest_with_http_info(feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeedIngestion>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_ingest_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeedIngestion**](CatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_list

> <FeedsList200Response> feeds_list(opts)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

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

api_instance = PinterestSdkClient::CatalogFeedsApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  catalog_id: 'catalog_id_example', # String | Filter entities for a given catalog_id. If not given, all catalogs are considered.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List feeds
  result = api_instance.feeds_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_list: #{e}"
end
```

#### Using the feeds_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<FeedsList200Response>, Integer, Hash)> feeds_list_with_http_info(opts)

```ruby
begin
  # List feeds
  data, status_code, headers = api_instance.feeds_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <FeedsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **catalog_id** | **String** | Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**FeedsList200Response**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## feeds_update

> <CatalogsFeed> feeds_update(feed_id, feeds_update_request, opts)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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

api_instance = PinterestSdkClient::CatalogFeedsApi.new
feed_id = 'feed_id_example' # String | Unique identifier of a feed
feeds_update_request = PinterestSdkClient::CatalogsFeedsUpdateRequest.new # FeedsUpdateRequest | Request object used to update a feed.
opts = {
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # Update feed
  result = api_instance.feeds_update(feed_id, feeds_update_request, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_update: #{e}"
end
```

#### Using the feeds_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CatalogsFeed>, Integer, Hash)> feeds_update_with_http_info(feed_id, feeds_update_request, opts)

```ruby
begin
  # Update feed
  data, status_code, headers = api_instance.feeds_update_with_http_info(feed_id, feeds_update_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CatalogsFeed>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->feeds_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feed_id** | **String** | Unique identifier of a feed |  |
| **feeds_update_request** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md) | Request object used to update a feed. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## items_issues_list

> <ItemsIssuesList200Response> items_issues_list(processing_result_id, opts)

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CatalogFeedsApi.new
processing_result_id = '5224831246441439241' # String | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  item_numbers: [37], # Array<Integer> | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
  item_validation_issue: PinterestSdkClient::CatalogsItemValidationIssue::AD_IMAGE_0_LINK_LENGTH_TOO_LONG, # CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue.
  ad_account_id: 'ad_account_id_example' # String | Unique identifier of an ad account.
}

begin
  # List item issues
  result = api_instance.items_issues_list(processing_result_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->items_issues_list: #{e}"
end
```

#### Using the items_issues_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemsIssuesList200Response>, Integer, Hash)> items_issues_list_with_http_info(processing_result_id, opts)

```ruby
begin
  # List item issues
  data, status_code, headers = api_instance.items_issues_list_with_http_info(processing_result_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemsIssuesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CatalogFeedsApi->items_issues_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **processing_result_id** | **String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **item_numbers** | [**Array&lt;Integer&gt;**](Integer.md) | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] |
| **item_validation_issue** | [**CatalogsItemValidationIssue**](.md) | Filter item validation issues that have a given type of item validation issue. | [optional] |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

