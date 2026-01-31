# PinterestSdkClient::NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**notification_post**](NotificationApi.md#notification_post) | **POST** /notifications | Receive notifications from external partners. |


## notification_post

> <NotificationResponse> notification_post(notification_post_request)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

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

api_instance = PinterestSdkClient::NotificationApi.new
notification_post_request = nil # NotificationPostRequest | notification event.

begin
  # Receive notifications from external partners.
  result = api_instance.notification_post(notification_post_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling NotificationApi->notification_post: #{e}"
end
```

#### Using the notification_post_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<NotificationResponse>, Integer, Hash)> notification_post_with_http_info(notification_post_request)

```ruby
begin
  # Receive notifications from external partners.
  data, status_code, headers = api_instance.notification_post_with_http_info(notification_post_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <NotificationResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling NotificationApi->notification_post_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **notification_post_request** | [**NotificationPostRequest**](NotificationPostRequest.md) | notification event. |  |

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

