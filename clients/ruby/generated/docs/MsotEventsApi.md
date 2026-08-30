# PinterestSdkClient::MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**msot_events_create**](MsotEventsApi.md#msot_events_create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events |


## msot_events_create

> msot_events_create(ad_account_id, conversion_msot_events_create)

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::MsotEventsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
conversion_msot_events_create = PinterestSdkClient::ConversionMSOTEventsCreate.new({ad_group_id: '2680060704746', event_id: 'eventId0001', event_name: PinterestSdkClient::MsotEventName::ADD_TO_CART, event_timestamp: 1451431341}) # ConversionMSOTEventsCreate | 

begin
  # Send Measurement Source Of Truth (MSOT) attributed conversion events
  api_instance.msot_events_create(ad_account_id, conversion_msot_events_create)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MsotEventsApi->msot_events_create: #{e}"
end
```

#### Using the msot_events_create_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> msot_events_create_with_http_info(ad_account_id, conversion_msot_events_create)

```ruby
begin
  # Send Measurement Source Of Truth (MSOT) attributed conversion events
  data, status_code, headers = api_instance.msot_events_create_with_http_info(ad_account_id, conversion_msot_events_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MsotEventsApi->msot_events_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_msot_events_create** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md) |  |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

