# PinterestSdkClient::IntegrationLogsInvalidLogResponseRejectedLogsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **log_index** | **Integer** | Index of the log in the batch. | [optional] |
| **field** | **String** | The field name containing an invalid value. |  |
| **value** | **String** | The value that is invalid. |  |
| **reason** | **String** | The reason the value is invalid. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationLogsInvalidLogResponseRejectedLogsInner.new(
  log_index: null,
  field: null,
  value: null,
  reason: null
)
```

