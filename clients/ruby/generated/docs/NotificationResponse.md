# PinterestSdkClient::NotificationResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **error_msg** | **String** | error message when success is false | [optional] |
| **received_at** | **Integer** | Received time. Unix timestamp in seconds. | [optional] |
| **success** | **Boolean** | Returns true if the notification accepted. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::NotificationResponse.new(
  error_msg: null,
  received_at: null,
  success: null
)
```

