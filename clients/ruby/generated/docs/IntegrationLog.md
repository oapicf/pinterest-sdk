# PinterestSdkClient::IntegrationLog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **client_timestamp** | **Integer** | Timestamp in milliseconds of when the log was executed at the client. |  |
| **event_type** | **String** | Log event type |  |
| **log_level** | **String** | Log level type |  |
| **external_business_id** | **String** |  | [optional] |
| **advertiser_id** | **String** |  | [optional] |
| **merchant_id** | **String** |  | [optional] |
| **tag_id** | **String** |  | [optional] |
| **feed_profile_id** | **String** |  | [optional] |
| **message** | **String** | Explanation of the event that occured. | [optional] |
| **app_version_number** | **String** | Version number of the integration application. | [optional] |
| **platform_version_number** | **String** | Version number of the platform the integration application is running on. | [optional] |
| **error** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] |
| **request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationLog.new(
  client_timestamp: null,
  event_type: null,
  log_level: null,
  external_business_id: null,
  advertiser_id: null,
  merchant_id: null,
  tag_id: null,
  feed_profile_id: null,
  message: null,
  app_version_number: null,
  platform_version_number: null,
  error: null,
  request: null
)
```

