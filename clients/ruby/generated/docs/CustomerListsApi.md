# PinterestSdkClient::CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**customer_lists_create**](CustomerListsApi.md#customer_lists_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
| [**customer_lists_get**](CustomerListsApi.md#customer_lists_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
| [**customer_lists_list**](CustomerListsApi.md#customer_lists_list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
| [**customer_lists_update**](CustomerListsApi.md#customer_lists_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |


## customer_lists_create

> <CustomerList> customer_lists_create(ad_account_id, customer_list_create)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

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
ad_account_id = 'ad_account_id_example' # String | 
customer_list_create = PinterestSdkClient::CustomerListCreate.new({name: 'The Glengarry Glen Ross leads'}) # CustomerListCreate | 

begin
  # Create customer lists
  result = api_instance.customer_lists_create(ad_account_id, customer_list_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_create: #{e}"
end
```

#### Using the customer_lists_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerList>, Integer, Hash)> customer_lists_create_with_http_info(ad_account_id, customer_list_create)

```ruby
begin
  # Create customer lists
  data, status_code, headers = api_instance.customer_lists_create_with_http_info(ad_account_id, customer_list_create)
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
| **ad_account_id** | **String** |  |  |
| **customer_list_create** | [**CustomerListCreate**](CustomerListCreate.md) |  |  |

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

  # Configure OAuth2 access token for authorization: client_credentials
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::CustomerListsApi.new
ad_account_id = 'ad_account_id_example' # String | 
customer_list_id = 'customer_list_id_example' # String | Customer list ID.

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
| **ad_account_id** | **String** |  |  |
| **customer_list_id** | **String** | Customer list ID. |  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customer_lists_list

> <CustomerListsList200Response> customer_lists_list(ad_account_id, opts)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

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
ad_account_id = 'ad_account_id_example' # String | 
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  exclude_nca: true # Boolean | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
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
| **ad_account_id** | **String** |  |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **exclude_nca** | **Boolean** | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional][default to false] |

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## customer_lists_update

> <CustomerList> customer_lists_update(ad_account_id, customer_list_id, customer_list_update_with_required_body)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

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
ad_account_id = 'ad_account_id_example' # String | 
customer_list_id = 'customer_list_id_example' # String | Customer list ID.
customer_list_update_with_required_body = PinterestSdkClient::CustomerListUpdateWithRequiredBody.new({operation_type: PinterestSdkClient::UserListOperationType::ADD}) # CustomerListUpdateWithRequiredBody | 

begin
  # Update customer list
  result = api_instance.customer_lists_update(ad_account_id, customer_list_id, customer_list_update_with_required_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling CustomerListsApi->customer_lists_update: #{e}"
end
```

#### Using the customer_lists_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CustomerList>, Integer, Hash)> customer_lists_update_with_http_info(ad_account_id, customer_list_id, customer_list_update_with_required_body)

```ruby
begin
  # Update customer list
  data, status_code, headers = api_instance.customer_lists_update_with_http_info(ad_account_id, customer_list_id, customer_list_update_with_required_body)
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
| **ad_account_id** | **String** |  |  |
| **customer_list_id** | **String** | Customer list ID. |  |
| **customer_list_update_with_required_body** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md) |  |  |

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

