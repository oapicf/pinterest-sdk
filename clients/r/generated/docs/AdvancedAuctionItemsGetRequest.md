# openapi::AdvancedAuctionItemsGetRequest

Request object used to get bid options values for a batch of retail catalog items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog id pertaining to the retail item | [Pattern: ^\\d+$] 
**items** | [**array[AdvancedAuctionItemsGetRecord]**](AdvancedAuctionItemsGetRecord.md) | A list of retail catalog items to fetch bid options for | [Max. items: 10000] [Min. items: 1] 


