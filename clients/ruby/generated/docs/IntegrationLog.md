# PinterestSdkClient::IntegrationLog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **advertiser_id** | **String** |  | [optional] |
| **app_version_number** | **String** | Version number of the integration application. | [optional] |
| **client_timestamp** | **Integer** | Timestamp in milliseconds of when the log was executed at the client. |  |
| **error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] |
| **event_type** | [**IntegrationLogEventType**](IntegrationLogEventType.md) | Log event type |  |
| **external_business_id** | **String** |  | [optional] |
| **feed_profile_id** | **String** |  | [optional] |
| **log_level** | [**IntegrationLogLevel**](IntegrationLogLevel.md) | Log level type |  |
| **merchant_id** | **String** |  | [optional] |
| **message** | **String** | Explanation of the event that occured. | [optional] |
| **platform_version_number** | **String** | Version number of the platform the integration application is running on. | [optional] |
| **request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] |
| **tag_id** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationLog.new(
  advertiser_id: null,
  app_version_number: null,
  client_timestamp: null,
  error: null,
  event_type: null,
  external_business_id: null,
  feed_profile_id: null,
  log_level: null,
  merchant_id: null,
  message: null,
  platform_version_number: null,
  request: null,
  tag_id: null
)
```

