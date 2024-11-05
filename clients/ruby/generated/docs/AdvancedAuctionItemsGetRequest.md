# PinterestSdkClient::AdvancedAuctionItemsGetRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_id** | **String** | Catalog id pertaining to the retail item |  |
| **items** | [**Array&lt;AdvancedAuctionItemsGetRecord&gt;**](AdvancedAuctionItemsGetRecord.md) | A list of retail catalog items to fetch bid options for |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionItemsGetRequest.new(
  catalog_id: 2680059592705,
  items: null
)
```

