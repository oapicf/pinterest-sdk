# PinterestSdkClient::ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**product_tags_bulk_add**](ProductTagsApi.md#product_tags_bulk_add) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin |
| [**product_tags_bulk_delete**](ProductTagsApi.md#product_tags_bulk_delete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin |
| [**product_tags_list**](ProductTagsApi.md#product_tags_list) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin |


## product_tags_bulk_add

> <ProductTagsResponse> product_tags_bulk_add(pin_id, product_tags_bulk_add_request)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductTagsApi.new
pin_id = 'pin_id_example' # String | Unique identifier of the hero pin that will receive product tags.
product_tags_bulk_add_request = PinterestSdkClient::ProductTagsBulkAddRequest.new({product_tags: [PinterestSdkClient::ProductTagItem.new({pin_id: 'pin_id_example'})]}) # ProductTagsBulkAddRequest | 

begin
  # Add product tags to pin
  result = api_instance.product_tags_bulk_add(pin_id, product_tags_bulk_add_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductTagsApi->product_tags_bulk_add: #{e}"
end
```

#### Using the product_tags_bulk_add_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductTagsResponse>, Integer, Hash)> product_tags_bulk_add_with_http_info(pin_id, product_tags_bulk_add_request)

```ruby
begin
  # Add product tags to pin
  data, status_code, headers = api_instance.product_tags_bulk_add_with_http_info(pin_id, product_tags_bulk_add_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductTagsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductTagsApi->product_tags_bulk_add_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of the hero pin that will receive product tags. |  |
| **product_tags_bulk_add_request** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md) |  |  |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## product_tags_bulk_delete

> product_tags_bulk_delete(pin_id, product_tags_bulk_delete_request)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductTagsApi.new
pin_id = 'pin_id_example' # String | Unique identifier of the hero pin that will receive product tags.
product_tags_bulk_delete_request = PinterestSdkClient::ProductTagsBulkDeleteRequest.new({product_tags: [PinterestSdkClient::ProductTagItem.new({pin_id: 'pin_id_example'})]}) # ProductTagsBulkDeleteRequest | 

begin
  # Delete product tags from pin
  api_instance.product_tags_bulk_delete(pin_id, product_tags_bulk_delete_request)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductTagsApi->product_tags_bulk_delete: #{e}"
end
```

#### Using the product_tags_bulk_delete_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> product_tags_bulk_delete_with_http_info(pin_id, product_tags_bulk_delete_request)

```ruby
begin
  # Delete product tags from pin
  data, status_code, headers = api_instance.product_tags_bulk_delete_with_http_info(pin_id, product_tags_bulk_delete_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductTagsApi->product_tags_bulk_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of the hero pin that will receive product tags. |  |
| **product_tags_bulk_delete_request** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md) |  |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## product_tags_list

> <ProductTagsResponse> product_tags_list(pin_id)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::ProductTagsApi.new
pin_id = 'pin_id_example' # String | Unique identifier of the hero pin that will receive product tags.

begin
  # Get product tags for pin
  result = api_instance.product_tags_list(pin_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductTagsApi->product_tags_list: #{e}"
end
```

#### Using the product_tags_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ProductTagsResponse>, Integer, Hash)> product_tags_list_with_http_info(pin_id)

```ruby
begin
  # Get product tags for pin
  data, status_code, headers = api_instance.product_tags_list_with_http_info(pin_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ProductTagsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ProductTagsApi->product_tags_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **pin_id** | **String** | Unique identifier of the hero pin that will receive product tags. |  |

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

