# PinterestSdkClient::ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**advertiser_defined_events_create**](ConversionsApi.md#advertiser_defined_events_create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
| [**advertiser_defined_events_delete**](ConversionsApi.md#advertiser_defined_events_delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
| [**advertiser_defined_events_get**](ConversionsApi.md#advertiser_defined_events_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
| [**advertiser_defined_events_update**](ConversionsApi.md#advertiser_defined_events_update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |


## advertiser_defined_events_create

> <AdvertiserDefinedEventsCreate200Response> advertiser_defined_events_create(ad_account_id, advertiser_defined_events_create_request)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

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

api_instance = PinterestSdkClient::ConversionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
advertiser_defined_events_create_request = PinterestSdkClient::AdvertiserDefinedEventsCreateRequest.new({items: [PinterestSdkClient::AdvertiserDefinedEventInput.new({mapped_conversion_type: PinterestSdkClient::AdvertiserDefinedEventMappingType::SIGNUP, name: 'newsletter_signup'})]}) # AdvertiserDefinedEventsCreateRequest | 

begin
  # Create advertiser defined events
  result = api_instance.advertiser_defined_events_create(ad_account_id, advertiser_defined_events_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_create: #{e}"
end
```

#### Using the advertiser_defined_events_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdvertiserDefinedEventsCreate200Response>, Integer, Hash)> advertiser_defined_events_create_with_http_info(ad_account_id, advertiser_defined_events_create_request)

```ruby
begin
  # Create advertiser defined events
  data, status_code, headers = api_instance.advertiser_defined_events_create_with_http_info(ad_account_id, advertiser_defined_events_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvertiserDefinedEventsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  |  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## advertiser_defined_events_delete

> <AdvertiserDefinedEventsCreate200Response> advertiser_defined_events_delete(ad_account_id, event_names)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

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

api_instance = PinterestSdkClient::ConversionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
event_names = ['inner_example'] # Array<String> | List of event names to delete

begin
  # Delete advertiser defined events
  result = api_instance.advertiser_defined_events_delete(ad_account_id, event_names)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_delete: #{e}"
end
```

#### Using the advertiser_defined_events_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdvertiserDefinedEventsCreate200Response>, Integer, Hash)> advertiser_defined_events_delete_with_http_info(ad_account_id, event_names)

```ruby
begin
  # Delete advertiser defined events
  data, status_code, headers = api_instance.advertiser_defined_events_delete_with_http_info(ad_account_id, event_names)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvertiserDefinedEventsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **event_names** | [**Array&lt;String&gt;**](String.md) | List of event names to delete |  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## advertiser_defined_events_get

> <AdvertiserDefinedEventsGet200Response> advertiser_defined_events_get(ad_account_id)

Get advertiser defined events

Get advertiser defined events for the given ad account.

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

api_instance = PinterestSdkClient::ConversionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.

begin
  # Get advertiser defined events
  result = api_instance.advertiser_defined_events_get(ad_account_id)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_get: #{e}"
end
```

#### Using the advertiser_defined_events_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdvertiserDefinedEventsGet200Response>, Integer, Hash)> advertiser_defined_events_get_with_http_info(ad_account_id)

```ruby
begin
  # Get advertiser defined events
  data, status_code, headers = api_instance.advertiser_defined_events_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvertiserDefinedEventsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## advertiser_defined_events_update

> <AdvertiserDefinedEventsCreate200Response> advertiser_defined_events_update(ad_account_id, advertiser_defined_events_create_request)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

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

api_instance = PinterestSdkClient::ConversionsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
advertiser_defined_events_create_request = PinterestSdkClient::AdvertiserDefinedEventsCreateRequest.new({items: [PinterestSdkClient::AdvertiserDefinedEventInput.new({mapped_conversion_type: PinterestSdkClient::AdvertiserDefinedEventMappingType::SIGNUP, name: 'newsletter_signup'})]}) # AdvertiserDefinedEventsCreateRequest | 

begin
  # Update advertiser defined events
  result = api_instance.advertiser_defined_events_update(ad_account_id, advertiser_defined_events_create_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_update: #{e}"
end
```

#### Using the advertiser_defined_events_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AdvertiserDefinedEventsCreate200Response>, Integer, Hash)> advertiser_defined_events_update_with_http_info(ad_account_id, advertiser_defined_events_create_request)

```ruby
begin
  # Update advertiser defined events
  data, status_code, headers = api_instance.advertiser_defined_events_update_with_http_info(ad_account_id, advertiser_defined_events_create_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvertiserDefinedEventsCreate200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  |  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

