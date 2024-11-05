
# Table `AdvancedAuctionItemsGetRequest`
(mapped from: AdvancedAuctionItemsGetRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the retail item | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvancedAuctionItemsGetRecord&gt;**](AdvancedAuctionItemsGetRecord.md) | A list of retail catalog items to fetch bid options for | 



# **Table `AdvancedAuctionItemsGetRequestAdvancedAuctionItemsGetRecord`**
(mapped from: AdvancedAuctionItemsGetRequestAdvancedAuctionItemsGetRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionItemsGetRequest | advancedAuctionItemsGetRequest | long | | kotlin.Long | Primary Key | *one*
advancedAuctionItemsGetRecord | advancedAuctionItemsGetRecord | long | | kotlin.Long | Foreign Key | *many*



