# openapi::AdvancedAuctionItemsSubmitRequest

Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog id pertaining to all items | [Pattern: ^\\d+$] 
**items** | [**array[AdvancedAuctionItemsSubmitRecord]**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations | [Max. items: 10000] [Min. items: 1] 


