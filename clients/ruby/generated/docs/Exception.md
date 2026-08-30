# PinterestSdkClient::Exception

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Integer** |  | [optional] |
| **message** | **String** |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Exception.new(
  code: 2,
  message: Advertiser not found.
)
```

