# PinterestSdkClient::AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**audiences_create**](AudiencesApi.md#audiences_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiences_get**](AudiencesApi.md#audiences_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiences_list**](AudiencesApi.md#audiences_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiences_update**](AudiencesApi.md#audiences_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


## audiences_create

> <AdAccountsAudience> audiences_create(ad_account_id, ad_accounts_audience_create)

Create audience

Create a new audience for the ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_accounts_audience_create = PinterestSdkClient::AdAccountsAudienceCreate.new # AdAccountsAudienceCreate | 

begin
  # Create audience
  result = api_instance.audiences_create(ad_account_id, ad_accounts_audience_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_create: #{e}"
end
```

#### Using the audiences_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsAudience>, Integer, Hash)> audiences_create_with_http_info(ad_account_id, ad_accounts_audience_create)

```ruby
begin
  # Create audience
  data, status_code, headers = api_instance.audiences_create_with_http_info(ad_account_id, ad_accounts_audience_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsAudience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_accounts_audience_create** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md) |  |  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## audiences_get

> <AdAccountsAudience> audiences_get(audience_id, ad_account_id)

Get audience

Get a specific audience given the audience ID.

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

api_instance = PinterestSdkClient::AudiencesApi.new
audience_id = 'audience_id_example' # String | Audience ID.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get audience
  result = api_instance.audiences_get(audience_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_get: #{e}"
end
```

#### Using the audiences_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsAudience>, Integer, Hash)> audiences_get_with_http_info(audience_id, ad_account_id)

```ruby
begin
  # Get audience
  data, status_code, headers = api_instance.audiences_get_with_http_info(audience_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsAudience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Audience ID. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiences_list

> <AudiencesList200Response> audiences_list(ad_account_id, opts)

List audiences

Get list of audiences for the ad account.

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

api_instance = PinterestSdkClient::AudiencesApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING, # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  ownership_type: PinterestSdkClient::AudienceOwnershipType::OWNED, # AudienceOwnershipType | 
  exclude_nca: true # Boolean | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
}

begin
  # List audiences
  result = api_instance.audiences_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_list: #{e}"
end
```

#### Using the audiences_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AudiencesList200Response>, Integer, Hash)> audiences_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List audiences
  data, status_code, headers = api_instance.audiences_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AudiencesList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **ownership_type** | [**AudienceOwnershipType**](.md) |  | [optional] |
| **exclude_nca** | **Boolean** | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional][default to false] |

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## audiences_update

> <AdAccountsAudience> audiences_update(audience_id, ad_account_id, ad_accounts_audience_update)

Update audience

Update an existing audience for the ad account.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::AudiencesApi.new
audience_id = 'audience_id_example' # String | Audience ID.
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
ad_accounts_audience_update = PinterestSdkClient::AdAccountsAudienceUpdate.new # AdAccountsAudienceUpdate | 

begin
  # Update audience
  result = api_instance.audiences_update(audience_id, ad_account_id, ad_accounts_audience_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_update: #{e}"
end
```

#### Using the audiences_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdAccountsAudience>, Integer, Hash)> audiences_update_with_http_info(audience_id, ad_account_id, ad_accounts_audience_update)

```ruby
begin
  # Update audience
  data, status_code, headers = api_instance.audiences_update_with_http_info(audience_id, ad_account_id, ad_accounts_audience_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdAccountsAudience>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling AudiencesApi->audiences_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Audience ID. |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **ad_accounts_audience_update** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md) |  |  |

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

