# PinterestSdkClient::NotificationResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **success** | **Boolean** | Returns true if the notification accepted. | [optional] |
| **received_at** | **Integer** | Received time. Unix timestamp in seconds. | [optional] |
| **error_msg** | **String** | error message when success is false | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::NotificationResponse.new(
  success: false,
  received_at: 1677003860,
  error_msg: null
)
```

