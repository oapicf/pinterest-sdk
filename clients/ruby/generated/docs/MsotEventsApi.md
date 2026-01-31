# PinterestSdkClient::MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**msot_events_create**](MsotEventsApi.md#msot_events_create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events |


## msot_events_create

> msot_events_create(ad_account_id, conversion_msot_events)

Send Measurement Source Of Truth (MSOT) attributed conversion events

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong> <br> <p>Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their <code>ad_account_id</code>. The request body should be a JSON object.</p> - These events will NOT be used in Reporting.

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
conversion_msot_events = PinterestSdkClient::ConversionMSOTEvents.new({ad_group_id: '2680060704746', attribution_scope: 'view', event_id: 'eventId0001', event_name: 'add_to_cart', event_timestamp: 1451431341}) # ConversionMSOTEvents | Attributed MSOT conversion events

begin
  # Send Measurement Source Of Truth (MSOT) attributed conversion events
  api_instance.msot_events_create(ad_account_id, conversion_msot_events)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling MsotEventsApi->msot_events_create: #{e}"
end
```

#### Using the msot_events_create_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> msot_events_create_with_http_info(ad_account_id, conversion_msot_events)

```ruby
begin
  # Send Measurement Source Of Truth (MSOT) attributed conversion events
  data, status_code, headers = api_instance.msot_events_create_with_http_info(ad_account_id, conversion_msot_events)
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
| **conversion_msot_events** | [**ConversionMSOTEvents**](ConversionMSOTEvents.md) | Attributed MSOT conversion events |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

