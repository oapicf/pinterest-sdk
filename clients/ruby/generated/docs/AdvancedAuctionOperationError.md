# PinterestSdkClient::AdvancedAuctionOperationError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Integer** | The error code for the item bid option operation validation error | [optional] |
| **message** | **String** | Message describing the item bid option operation validation error | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionOperationError.new(
  code: 6,
  message: Bid in micro currency should be non-negative
)
```

