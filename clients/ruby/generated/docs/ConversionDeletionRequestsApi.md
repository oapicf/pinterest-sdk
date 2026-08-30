# PinterestSdkClient::ConversionDeletionRequestsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**conversion_deletion_request_create**](ConversionDeletionRequestsApi.md#conversion_deletion_request_create) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request |
| [**conversion_deletion_request_delete**](ConversionDeletionRequestsApi.md#conversion_deletion_request_delete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request |
| [**conversion_deletion_request_get**](ConversionDeletionRequestsApi.md#conversion_deletion_request_get) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request |
| [**conversion_deletion_request_list**](ConversionDeletionRequestsApi.md#conversion_deletion_request_list) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests |


## conversion_deletion_request_create

> <ConversionDeletionRequest> conversion_deletion_request_create(ad_account_id, conversion_deletion_request_create)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

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

api_instance = PinterestSdkClient::ConversionDeletionRequestsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
conversion_deletion_request_create = PinterestSdkClient::ConversionDeletionRequestCreate.new({deletion_targets: PinterestSdkClient::ConversionDeletionRequestTargets.new({user_emails: ['user_emails_example'], epiks: ['epiks_example']})}) # ConversionDeletionRequestCreate | 

begin
  # Create a conversion deletion request
  result = api_instance.conversion_deletion_request_create(ad_account_id, conversion_deletion_request_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_create: #{e}"
end
```

#### Using the conversion_deletion_request_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionDeletionRequest>, Integer, Hash)> conversion_deletion_request_create_with_http_info(ad_account_id, conversion_deletion_request_create)

```ruby
begin
  # Create a conversion deletion request
  data, status_code, headers = api_instance.conversion_deletion_request_create_with_http_info(ad_account_id, conversion_deletion_request_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionDeletionRequest>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_deletion_request_create** | [**ConversionDeletionRequestCreate**](ConversionDeletionRequestCreate.md) |  |  |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## conversion_deletion_request_delete

> <ConversionDeletionRequest> conversion_deletion_request_delete(request_id, ad_account_id)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

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

api_instance = PinterestSdkClient::ConversionDeletionRequestsApi.new
request_id = 'request_id_example' # String | Unique identifier of the conversion deletion request
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Delete a conversion deletion request
  result = api_instance.conversion_deletion_request_delete(request_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_delete: #{e}"
end
```

#### Using the conversion_deletion_request_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionDeletionRequest>, Integer, Hash)> conversion_deletion_request_delete_with_http_info(request_id, ad_account_id)

```ruby
begin
  # Delete a conversion deletion request
  data, status_code, headers = api_instance.conversion_deletion_request_delete_with_http_info(request_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionDeletionRequest>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **request_id** | **String** | Unique identifier of the conversion deletion request |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversion_deletion_request_get

> <ConversionDeletionRequest> conversion_deletion_request_get(request_id, ad_account_id)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

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

api_instance = PinterestSdkClient::ConversionDeletionRequestsApi.new
request_id = 'request_id_example' # String | Unique identifier of the conversion deletion request
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get a single conversion deletion request
  result = api_instance.conversion_deletion_request_get(request_id, ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_get: #{e}"
end
```

#### Using the conversion_deletion_request_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionDeletionRequest>, Integer, Hash)> conversion_deletion_request_get_with_http_info(request_id, ad_account_id)

```ruby
begin
  # Get a single conversion deletion request
  data, status_code, headers = api_instance.conversion_deletion_request_get_with_http_info(request_id, ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionDeletionRequest>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **request_id** | **String** | Unique identifier of the conversion deletion request |  |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**ConversionDeletionRequest**](ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## conversion_deletion_request_list

> <ConversionDeletionRequestList200Response> conversion_deletion_request_list(ad_account_id, opts)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

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

api_instance = PinterestSdkClient::ConversionDeletionRequestsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  order: PinterestSdkClient::PinterestLibPaginationOrder::ASCENDING # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
}

begin
  # List conversion deletion requests
  result = api_instance.conversion_deletion_request_list(ad_account_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_list: #{e}"
end
```

#### Using the conversion_deletion_request_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionDeletionRequestList200Response>, Integer, Hash)> conversion_deletion_request_list_with_http_info(ad_account_id, opts)

```ruby
begin
  # List conversion deletion requests
  data, status_code, headers = api_instance.conversion_deletion_request_list_with_http_info(ad_account_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionDeletionRequestList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionDeletionRequestsApi->conversion_deletion_request_list_with_http_info: #{e}"
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

[**ConversionDeletionRequestList200Response**](ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

