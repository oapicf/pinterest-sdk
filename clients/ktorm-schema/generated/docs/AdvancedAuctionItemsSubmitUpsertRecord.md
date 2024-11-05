
# Table `AdvancedAuctionItemsSubmitUpsertRecord`
(mapped from: AdvancedAuctionItemsSubmitUpsertRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog retail item id in the merchant namespace | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]
**bidOptions** | bid_options | long NOT NULL |  | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  |  [foreignkey]
**updateMask** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMaskBidOptionField&gt;**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 






# **Table `AdvancedAuctionItemsSubmitUpsertRecordUpdateMaskBidOptionField`**
(mapped from: AdvancedAuctionItemsSubmitUpsertRecordUpdateMaskBidOptionField)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
advancedAuctionItemsSubmitUpsertRecord | advancedAuctionItemsSubmitUpsertRecord | long | | kotlin.Long | Primary Key | *one*
updateMaskBidOptionField | updateMaskBidOptionField | long | | kotlin.Long | Foreign Key | *many*



