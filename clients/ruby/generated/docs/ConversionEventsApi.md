# PinterestSdkClient::ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**events_create**](ConversionEventsApi.md#events_create) | **POST** /ad_accounts/{ad_account_id}/events | Send conversions |


## events_create

> <ConversionApiResponse> events_create(ad_account_id, conversion_events, opts)

Send conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversions/\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'

  # Configure Bearer authorization: conversion_token
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = PinterestSdkClient::ConversionEventsApi.new
ad_account_id = 'ad_account_id_example' # String | Unique identifier of an ad account.
conversion_events = PinterestSdkClient::ConversionEvents.new({data: [PinterestSdkClient::ConversionEventsDataInner.new({event_name: 'checkout', action_source: 'app_ios', event_time: 1451431341, event_id: 'eventId0001', user_data: PinterestSdkClient::ConversionEventsUserData.new})]}) # ConversionEvents | Conversion events.
opts = {
  test: true # Boolean | Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
}

begin
  # Send conversions
  result = api_instance.events_create(ad_account_id, conversion_events, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionEventsApi->events_create: #{e}"
end
```

#### Using the events_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ConversionApiResponse>, Integer, Hash)> events_create_with_http_info(ad_account_id, conversion_events, opts)

```ruby
begin
  # Send conversions
  data, status_code, headers = api_instance.events_create_with_http_info(ad_account_id, conversion_events, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ConversionApiResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling ConversionEventsApi->events_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Unique identifier of an ad account. |  |
| **conversion_events** | [**ConversionEvents**](ConversionEvents.md) | Conversion events. |  |
| **test** | **Boolean** | Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. | [optional] |

### Return type

[**ConversionApiResponse**](ConversionApiResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [conversion_token](../README.md#conversion_token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

