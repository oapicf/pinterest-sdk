# PinterestSdkClient::DynamicTitlesProcessCSVError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **error_type** | **String** | The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. | [optional] |
| **row_number** | **Integer** | The row number with a validation error. -1 indicates a file-level error. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DynamicTitlesProcessCSVError.new(
  error_type: ROW_VALIDATION_FAILED,
  row_number: 15
)
```

