# PinterestSdkClient::IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**integrations_commerce_del**](IntegrationsApi.md#integrations_commerce_del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration |
| [**integrations_commerce_get**](IntegrationsApi.md#integrations_commerce_get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration |
| [**integrations_commerce_patch**](IntegrationsApi.md#integrations_commerce_patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration |
| [**integrations_commerce_post**](IntegrationsApi.md#integrations_commerce_post) | **POST** /integrations/commerce | Create commerce integration |
| [**integrations_get_by_id**](IntegrationsApi.md#integrations_get_by_id) | **GET** /integrations/{id} | Get integration metadata |
| [**integrations_get_list**](IntegrationsApi.md#integrations_get_list) | **GET** /integrations | Get integration metadata list |
| [**integrations_logs_post**](IntegrationsApi.md#integrations_logs_post) | **POST** /integrations/logs | Receives batched logs from integration applications. |


## integrations_commerce_del

> integrations_commerce_del(external_business_id)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
external_business_id = 'external_business_id_example' # String | External business ID for the integration.

begin
  # Delete commerce integration
  api_instance.integrations_commerce_del(external_business_id)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_del: #{e}"
end
```

#### Using the integrations_commerce_del_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> integrations_commerce_del_with_http_info(external_business_id)

```ruby
begin
  # Delete commerce integration
  data, status_code, headers = api_instance.integrations_commerce_del_with_http_info(external_business_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_del_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_business_id** | **String** | External business ID for the integration. |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrations_commerce_get

> <IntegrationMetadata> integrations_commerce_get(external_business_id)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
external_business_id = 'external_business_id_example' # String | External business ID for the integration.

begin
  # Get commerce integration
  result = api_instance.integrations_commerce_get(external_business_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_get: #{e}"
end
```

#### Using the integrations_commerce_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationMetadata>, Integer, Hash)> integrations_commerce_get_with_http_info(external_business_id)

```ruby
begin
  # Get commerce integration
  data, status_code, headers = api_instance.integrations_commerce_get_with_http_info(external_business_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationMetadata>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_business_id** | **String** | External business ID for the integration. |  |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrations_commerce_patch

> <IntegrationMetadata> integrations_commerce_patch(external_business_id, opts)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
external_business_id = 'external_business_id_example' # String | External business ID for the integration.
opts = {
  integration_request_patch: PinterestSdkClient::IntegrationRequestPatch.new # IntegrationRequestPatch | Parameters to get create/update the Integration Metadata
}

begin
  # Update commerce integration
  result = api_instance.integrations_commerce_patch(external_business_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_patch: #{e}"
end
```

#### Using the integrations_commerce_patch_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationMetadata>, Integer, Hash)> integrations_commerce_patch_with_http_info(external_business_id, opts)

```ruby
begin
  # Update commerce integration
  data, status_code, headers = api_instance.integrations_commerce_patch_with_http_info(external_business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationMetadata>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_patch_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **external_business_id** | **String** | External business ID for the integration. |  |
| **integration_request_patch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md) | Parameters to get create/update the Integration Metadata | [optional] |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## integrations_commerce_post

> <IntegrationMetadata> integrations_commerce_post(opts)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
opts = {
  integration_request: PinterestSdkClient::IntegrationRequest.new # IntegrationRequest | Parameters to get create/update the Integration Metadata
}

begin
  # Create commerce integration
  result = api_instance.integrations_commerce_post(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_post: #{e}"
end
```

#### Using the integrations_commerce_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationMetadata>, Integer, Hash)> integrations_commerce_post_with_http_info(opts)

```ruby
begin
  # Create commerce integration
  data, status_code, headers = api_instance.integrations_commerce_post_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationMetadata>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_commerce_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integration_request** | [**IntegrationRequest**](IntegrationRequest.md) | Parameters to get create/update the Integration Metadata | [optional] |

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## integrations_get_by_id

> <IntegrationRecord> integrations_get_by_id(id)

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
id = 'id_example' # String | Integration ID.

begin
  # Get integration metadata
  result = api_instance.integrations_get_by_id(id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_get_by_id: #{e}"
end
```

#### Using the integrations_get_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationRecord>, Integer, Hash)> integrations_get_by_id_with_http_info(id)

```ruby
begin
  # Get integration metadata
  data, status_code, headers = api_instance.integrations_get_by_id_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationRecord>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_get_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Integration ID. |  |

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrations_get_list

> <IntegrationsGetList200Response> integrations_get_list(opts)

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get integration metadata list
  result = api_instance.integrations_get_list(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_get_list: #{e}"
end
```

#### Using the integrations_get_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationsGetList200Response>, Integer, Hash)> integrations_get_list_with_http_info(opts)

```ruby
begin
  # Get integration metadata list
  data, status_code, headers = api_instance.integrations_get_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationsGetList200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_get_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## integrations_logs_post

> <IntegrationLogsSuccessResponse> integrations_logs_post(integration_logs_request)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::IntegrationsApi.new
integration_logs_request = PinterestSdkClient::IntegrationLogsRequest.new({logs: [PinterestSdkClient::IntegrationLog.new({client_timestamp: 37, event_type: 'APP', log_level: 'INFO'})]}) # IntegrationLogsRequest | Ingest log information from external integration application.

begin
  # Receives batched logs from integration applications.
  result = api_instance.integrations_logs_post(integration_logs_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_logs_post: #{e}"
end
```

#### Using the integrations_logs_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IntegrationLogsSuccessResponse>, Integer, Hash)> integrations_logs_post_with_http_info(integration_logs_request)

```ruby
begin
  # Receives batched logs from integration applications.
  data, status_code, headers = api_instance.integrations_logs_post_with_http_info(integration_logs_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IntegrationLogsSuccessResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling IntegrationsApi->integrations_logs_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **integration_logs_request** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md) | Ingest log information from external integration application. |  |

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

