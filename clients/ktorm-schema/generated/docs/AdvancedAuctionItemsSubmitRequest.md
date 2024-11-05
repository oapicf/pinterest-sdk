
# Table `AdvancedAuctionItemsSubmitRequest`
(mapped from: AdvancedAuctionItemsSubmitRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to all items | 
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvancedAuctionItemsSubmitRecord&gt;**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations | 



# **Table `AdvancedAuctionItemsSubmitRequestAdvancedAuctionItemsSubmitRecord`**
(mapped from: AdvancedAuctionItemsSubmitRequestAdvancedAuctionItemsSubmitRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionItemsSubmitRequest | advancedAuctionItemsSubmitRequest | long | | kotlin.Long | Primary Key | *one*
advancedAuctionItemsSubmitRecord | advancedAuctionItemsSubmitRecord | long | | kotlin.Long | Foreign Key | *many*



