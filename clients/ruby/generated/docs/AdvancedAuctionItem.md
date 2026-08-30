# PinterestSdkClient::AdvancedAuctionItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  |  |
| **country** | [**Country**](Country.md) |  |  |
| **item_id** | **String** | The catalog retail item id in the merchant namespace |  |
| **language** | [**Language**](Language.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItem.new(
  bid_options: null,
  country: null,
  item_id: DS0294-M,
  language: null
)
```

