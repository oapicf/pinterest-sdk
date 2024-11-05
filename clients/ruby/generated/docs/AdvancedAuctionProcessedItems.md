# PinterestSdkClient::AdvancedAuctionProcessedItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to all items | [optional] |
| **items** | [**Array&lt;AdvancedAuctionProcessedItem&gt;**](AdvancedAuctionProcessedItem.md) | Array of advanced auction processed items | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionProcessedItems.new(
  catalog_id: 2680059592705,
  items: null
)
```

