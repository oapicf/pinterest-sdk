# PinterestSdkClient::AdvancedAuctionItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Response object of item bid options | [optional] |
| **items** | [**Array&lt;AdvancedAuctionItem&gt;**](AdvancedAuctionItem.md) | Array with item bid options | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItems.new(
  catalog_id: 2680059592705,
  items: null
)
```

