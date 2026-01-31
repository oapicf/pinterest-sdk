# PinterestSdkClient::ErrorDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **count** | **Integer** | Number of records with this error |  |
| **error_code** | **Integer** | Numeric error code |  |
| **message** | **String** | Error message description |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ErrorDetail.new(
  count: 20,
  error_code: 42,
  message: Invalid email
)
```

