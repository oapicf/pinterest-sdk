
# Table `AdvancedAuctionItemsSubmitDeleteRecord`
(mapped from: AdvancedAuctionItemsSubmitDeleteRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog retail item id in the merchant namespace | 
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. |  [optional]





# **Table `AdvancedAuctionItemsSubmitDeleteRecordAdvancedAuctionOperationError`**
(mapped from: AdvancedAuctionItemsSubmitDeleteRecordAdvancedAuctionOperationError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionItemsSubmitDeleteRecord | advancedAuctionItemsSubmitDeleteRecord | long | | kotlin.Long | Primary Key | *one*
advancedAuctionOperationError | advancedAuctionOperationError | long | | kotlin.Long | Foreign Key | *many*



