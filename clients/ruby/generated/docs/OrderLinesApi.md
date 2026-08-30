# PinterestSdkClient::OrderLinesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**order_lines_get**](OrderLinesApi.md#order_lines_get) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line |
| [**order_lines_list**](OrderLinesApi.md#order_lines_list) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines. |


## order_lines_get

> <OrderLine> order_lines_get(order_line_id, ad_account_id)

Get order line

Get a specific existing order line associated with an ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::OrderLinesApi.new
order_line_id = 'order_line_id_example' # String | Order line ID.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get order line
  result = api_instance.order_lines_get(order_line_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OrderLinesApi->order_lines_get: #{e}"
end
```

#### Using the order_lines_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrderLine>, Integer, Hash)> order_lines_get_with_http_info(order_line_id, ad_account_id)

```ruby
begin
  # Get order line
  data, status_code, headers = api_instance.order_lines_get_with_http_info(order_line_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrderLine>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OrderLinesApi->order_lines_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_line_id** | **String** | Order line ID. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**OrderLine**](OrderLine.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## order_lines_list

> <OrderLinesList200Response> order_lines_list(ad_account_id, opts)

Get order lines.

List existing order lines associated with an ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::OrderLinesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
}

begin
  # Get order lines.
  result = api_instance.order_lines_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OrderLinesApi->order_lines_list: #{e}"
end
```

#### Using the order_lines_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrderLinesList200Response>, Integer, Hash)> order_lines_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get order lines.
  data, status_code, headers = api_instance.order_lines_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrderLinesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling OrderLinesApi->order_lines_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |

### Return type

[**OrderLinesList200Response**](OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

