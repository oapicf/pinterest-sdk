
# Table `AdvancedAuctionProcessedItems`
(mapped from: AdvancedAuctionProcessedItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to all items |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvancedAuctionProcessedItem&gt;**](AdvancedAuctionProcessedItem.md) | Array of advanced auction processed items |  [optional]



# **Table `AdvancedAuctionProcessedItemsAdvancedAuctionProcessedItem`**
(mapped from: AdvancedAuctionProcessedItemsAdvancedAuctionProcessedItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionProcessedItems | advancedAuctionProcessedItems | long | | kotlin.Long | Primary Key | *one*
advancedAuctionProcessedItem | advancedAuctionProcessedItem | long | | kotlin.Long | Foreign Key | *many*



