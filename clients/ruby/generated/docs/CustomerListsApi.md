# PinterestSdkClient::CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**customer_lists_create**](CustomerListsApi.md#customer_lists_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
| [**customer_lists_get**](CustomerListsApi.md#customer_lists_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
| [**customer_lists_list**](CustomerListsApi.md#customer_lists_list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
| [**customer_lists_update**](CustomerListsApi.md#customer_lists_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |


## customer_lists_create

> <CustomerList> customer_lists_create(ad_account_id, customer_list_request)

Create customer lists

<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
customer_list_request = PinterestSdkClient::CustomerListRequest.new({name: 'The Glengarry Glen Ross leads', records: 'email1@pinterest.com,email2@pinterest.com,..<more records>'}) # CustomerListRequest | Parameters to get Customer lists info

begin
  # Create customer lists
  result = api_instance.customer_lists_create(ad_account_id, customer_list_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_create: #{e}"
end
```

#### Using the customer_lists_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerList>, Integer, Hash)> customer_lists_create_with_http_info(ad_account_id, customer_list_request)

```ruby
begin
  # Create customer lists
  data, status_code, headers = api_instance.customer_lists_create_with_http_info(ad_account_id, customer_list_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerList>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **customer_list_request** | [**CustomerListRequest**](CustomerListRequest.md) | Parameters to get Customer lists info |  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## customer_lists_get

> <CustomerList> customer_lists_get(ad_account_id, customer_list_id)

Get customer list

Gets a specific customer list given the customer list ID.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
customer_list_id = 'customer_list_id_example' # String | Unique identifier of a customer list

begin
  # Get customer list
  result = api_instance.customer_lists_get(ad_account_id, customer_list_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_get: #{e}"
end
```

#### Using the customer_lists_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerList>, Integer, Hash)> customer_lists_get_with_http_info(ad_account_id, customer_list_id)

```ruby
begin
  # Get customer list
  data, status_code, headers = api_instance.customer_lists_get_with_http_info(ad_account_id, customer_list_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerList>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **customer_list_id** | **String** | Unique identifier of a customer list |  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customer_lists_list

> <CustomerListsList200Response> customer_lists_list(ad_account_id, opts)

Get customer lists

<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  order: 'ASCENDING', # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get customer lists
  result = api_instance.customer_lists_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_list: #{e}"
end
```

#### Using the customer_lists_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerListsList200Response>, Integer, Hash)> customer_lists_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # Get customer lists
  data, status_code, headers = api_instance.customer_lists_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerListsList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customer_lists_update

> <CustomerList> customer_lists_update(ad_account_id, customer_list_id, customer_list_update_request)

Update customer list

<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
customer_list_id = 'customer_list_id_example' # String | Unique identifier of a customer list
customer_list_update_request = PinterestSdkClient::CustomerListUpdateRequest.new({records: 'email2@pinterest.com,email6@pinterest.com,', operation_type: PinterestSdkClient::UserListOperationType::ADD}) # CustomerListUpdateRequest | 

begin
  # Update customer list
  result = api_instance.customer_lists_update(ad_account_id, customer_list_id, customer_list_update_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_update: #{e}"
end
```

#### Using the customer_lists_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerList>, Integer, Hash)> customer_lists_update_with_http_info(ad_account_id, customer_list_id, customer_list_update_request)

```ruby
begin
  # Update customer list
  data, status_code, headers = api_instance.customer_lists_update_with_http_info(ad_account_id, customer_list_id, customer_list_update_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CustomerList>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **customer_list_id** | **String** | Unique identifier of a customer list |  |
| **customer_list_update_request** | [**CustomerListUpdateRequest**](CustomerListUpdateRequest.md) |  |  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

