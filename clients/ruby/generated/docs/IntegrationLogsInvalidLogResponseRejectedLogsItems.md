# PinterestSdkClient::IntegrationLogsInvalidLogResponseRejectedLogsItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **field** | **String** | The field name containing an invalid value. |  |
| **log_index** | **Integer** | Index of the log in the batch. | [optional] |
| **reason** | **String** | The reason the value is invalid. |  |
| **value** | **String** | The value that is invalid. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationLogsInvalidLogResponseRejectedLogsItems.new(
  field: null,
  log_index: null,
  reason: null,
  value: null
)
```

