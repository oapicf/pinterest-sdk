# PinterestSdkClient::AdvancedAuctionItemsSubmitRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to all items |  |
| **items** | [**Array&lt;AdvancedAuctionItemsSubmitRecord&gt;**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItemsSubmitRequest.new(
  catalog_id: 2680059592705,
  items: null
)
```

