# PinterestSdkClient::ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**advertiser_defined_events_get**](ConversionsApi.md#advertiser_defined_events_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |


## advertiser_defined_events_get

> <AdvertiserDefinedEventsResponse> advertiser_defined_events_get(ad_account_id)

Get advertiser defined events

<p>Get advertiser defined events for the given ad account.</p>

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

> <Array(<AdvertiserDefinedEventsResponse>, Integer, Hash)> advertiser_defined_events_get_with_http_info(ad_account_id)

```ruby
begin
  # Get advertiser defined events
  data, status_code, headers = api_instance.advertiser_defined_events_get_with_http_info(ad_account_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AdvertiserDefinedEventsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionsApi->advertiser_defined_events_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |

### Return type

[**AdvertiserDefinedEventsResponse**](AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

