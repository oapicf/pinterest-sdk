# PinterestSdkClient::SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**search_partner_pins**](SearchApi.md#search_partner_pins) | **GET** /search/partner/pins | Search pins by a given search term |
| [**search_user_boards_get**](SearchApi.md#search_user_boards_get) | **GET** /search/boards | Search user&#39;s boards |
| [**search_user_pins_list**](SearchApi.md#search_user_pins_list) | **GET** /search/pins | Search user&#39;s Pins |


## search_partner_pins

> <SearchPartnerPins200Response> search_partner_pins(term, country_code, opts)

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::SearchApi.new
term = 'term_example' # String | Search term to look up pins.
country_code = 'US' # String | Two letter country code (ISO 3166-1 alpha-2)
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  locale: 'locale_example', # String | Search locale.
  limit: 4 # Integer | Max search result size
}

begin
  # Search pins by a given search term
  result = api_instance.search_partner_pins(term, country_code, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SearchApi->search_partner_pins: #{e}"
end
```

#### Using the search_partner_pins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SearchPartnerPins200Response>, Integer, Hash)> search_partner_pins_with_http_info(term, country_code, opts)

```ruby
begin
  # Search pins by a given search term
  data, status_code, headers = api_instance.search_partner_pins_with_http_info(term, country_code, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SearchPartnerPins200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SearchApi->search_partner_pins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **term** | **String** | Search term to look up pins. |  |
| **country_code** | **String** | Two letter country code (ISO 3166-1 alpha-2) |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **locale** | **String** | Search locale. | [optional] |
| **limit** | **Integer** | Max search result size | [optional][default to 10] |

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_user_boards_get

> <SearchUserBoardsGet200Response> search_user_boards_get(opts)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::SearchApi.new
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  query: 'query_example' # String | Search query. Can contain pin description keywords or comma-separated pin IDs.
}

begin
  # Search user's boards
  result = api_instance.search_user_boards_get(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SearchApi->search_user_boards_get: #{e}"
end
```

#### Using the search_user_boards_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SearchUserBoardsGet200Response>, Integer, Hash)> search_user_boards_get_with_http_info(opts)

```ruby
begin
  # Search user's boards
  data, status_code, headers = api_instance.search_user_boards_get_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SearchUserBoardsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SearchApi->search_user_boards_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_user_pins_list

> <PinsList200Response> search_user_pins_list(query, opts)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::SearchApi.new
query = 'Plants' # String | Search query. Can contain pin description keywords or comma-separated pin IDs.
opts = {
  ad_account_id: 'ad_account_id_example', # String | Unique identifier of an ad account.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Search user's Pins
  result = api_instance.search_user_pins_list(query, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SearchApi->search_user_pins_list: #{e}"
end
```

#### Using the search_user_pins_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PinsList200Response>, Integer, Hash)> search_user_pins_list_with_http_info(query, opts)

```ruby
begin
  # Search user's Pins
  data, status_code, headers = api_instance.search_user_pins_list_with_http_info(query, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PinsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling SearchApi->search_user_pins_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**PinsList200Response**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

