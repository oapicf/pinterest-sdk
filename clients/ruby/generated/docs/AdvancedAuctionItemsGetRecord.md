# PinterestSdkClient::AdvancedAuctionItemsGetRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_id** | **String** | The catalog retail item id in the merchant namespace |  |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**Language**](Language.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItemsGetRecord.new(
  item_id: DS0294-M,
  country: null,
  language: null
)
```

