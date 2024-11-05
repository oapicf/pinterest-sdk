# PinterestSdkClient::AdvancedAuctionProcessedItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionProcessedItem.new(
  errors: null
)
```

