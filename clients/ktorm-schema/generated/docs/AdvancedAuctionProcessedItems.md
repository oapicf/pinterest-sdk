
# Table `AdvancedAuctionProcessedItems`
(mapped from: AdvancedAuctionProcessedItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to all items |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvancedAuctionItemsSubmitRecord&gt;**](AdvancedAuctionItemsSubmitRecord.md) | Array of advanced auction processed items |  [optional]



# **Table `AdvancedAuctionProcessedItemsAdvancedAuctionItemsSubmitRecord`**
(mapped from: AdvancedAuctionProcessedItemsAdvancedAuctionItemsSubmitRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionProcessedItems | advancedAuctionProcessedItems | long | | kotlin.Long | Primary Key | *one*
advancedAuctionItemsSubmitRecord | advancedAuctionItemsSubmitRecord | long | | kotlin.Long | Foreign Key | *many*



