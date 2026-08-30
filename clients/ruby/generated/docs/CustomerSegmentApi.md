# PinterestSdkClient::CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**customer_segment_create**](CustomerSegmentApi.md#customer_segment_create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
| [**customer_segment_list**](CustomerSegmentApi.md#customer_segment_list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
| [**customer_segment_update**](CustomerSegmentApi.md#customer_segment_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |


## customer_segment_create

> <CustomerSegment> customer_segment_create(ad_account_id, customer_segment_create)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerSegmentApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
customer_segment_create = PinterestSdkClient::CustomerSegmentCreate.new({audience_ids: ['audience_ids_example'], name: 'name_example'}) # CustomerSegmentCreate | 

begin
  # Create customer segments
  result = api_instance.customer_segment_create(ad_account_id, customer_segment_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerSegmentApi->customer_segment_create: #{e}"
end
```

#### Using the customer_segment_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerSegment>, Integer, Hash)> customer_segment_create_with_http_info(ad_account_id, customer_segment_create)

```ruby
begin
  # Create customer segments
  data, status_code, headers = api_instance.customer_segment_create_with_http_info(ad_account_id, customer_segment_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerSegment>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerSegmentApi->customer_segment_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **customer_segment_create** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md) |  |  |

### Return type

[**CustomerSegment**](CustomerSegment.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customer_segment_list

> <CustomerSegmentList200Response> customer_segment_list(ad_account_id, opts)

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerSegmentApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  include_sizing: true, # Boolean | Include audience sizing in result or not
  search_query: 'search_query_example' # String | Search query. Can contain pin description keywords or comma-separated pin IDs.
}

begin
  # List customer segments
  result = api_instance.customer_segment_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerSegmentApi->customer_segment_list: #{e}"
end
```

#### Using the customer_segment_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerSegmentList200Response>, Integer, Hash)> customer_segment_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List customer segments
  data, status_code, headers = api_instance.customer_segment_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerSegmentList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerSegmentApi->customer_segment_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **include_sizing** | **Boolean** | Include audience sizing in result or not | [optional][default to false] |
| **search_query** | **String** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customer_segment_update

> customer_segment_update(ad_account_id, customer_segment_update_request_update_with_required_body)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerSegmentApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
customer_segment_update_request_update_with_required_body = PinterestSdkClient::CustomerSegmentUpdateRequestUpdateWithRequiredBody.new({id: 'id_example', operation_type: PinterestSdkClient::AudienceUpdateOperationType::UPDATE}) # CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

begin
  # Update customer segments
  api_instance.customer_segment_update(ad_account_id, customer_segment_update_request_update_with_required_body)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerSegmentApi->customer_segment_update: #{e}"
end
```

#### Using the customer_segment_update_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> customer_segment_update_with_http_info(ad_account_id, customer_segment_update_request_update_with_required_body)

```ruby
begin
  # Update customer segments
  data, status_code, headers = api_instance.customer_segment_update_with_http_info(ad_account_id, customer_segment_update_request_update_with_required_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerSegmentApi->customer_segment_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **customer_segment_update_request_update_with_required_body** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md) |  |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

