# PinterestSdkClient::AdvancedAuctionItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_id** | **String** | The catalog retail item id in the merchant namespace |  |
| **country** | [**Country**](Country.md) |  |  |
| **language** | [**Language**](Language.md) |  |  |
| **bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItem.new(
  item_id: DS0294-M,
  country: null,
  language: null,
  bid_options: null
)
```

