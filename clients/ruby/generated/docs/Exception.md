# PinterestSdkClient::Exception

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Integer** | Exception error code. | [optional] |
| **message** | **String** | Exception message. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Exception.new(
  code: 2,
  message: Advertiser not found.
)
```

