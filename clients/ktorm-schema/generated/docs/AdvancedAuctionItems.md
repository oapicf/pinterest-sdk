
# Table `AdvancedAuctionItems`
(mapped from: AdvancedAuctionItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogId** | catalog_id | text |  | **kotlin.String** | Response object of item bid options |  [optional]
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvancedAuctionItem&gt;**](AdvancedAuctionItem.md) | Array with item bid options |  [optional]



# **Table `AdvancedAuctionItemsAdvancedAuctionItem`**
(mapped from: AdvancedAuctionItemsAdvancedAuctionItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionItems | advancedAuctionItems | long | | kotlin.Long | Primary Key | *one*
advancedAuctionItem | advancedAuctionItem | long | | kotlin.Long | Foreign Key | *many*



