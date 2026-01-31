# PinterestSdkClient::AdvancedAuctionItemsSubmitDeleteRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  |  |
| **item_id** | **String** | The catalog retail item id in the merchant namespace |  |
| **language** | [**Language**](Language.md) |  |  |
| **errors** | [**Array&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItemsSubmitDeleteRecord.new(
  country: null,
  item_id: DS0294-M,
  language: null,
  errors: null
)
```

