
# Table `AdvancedAuctionItemsSubmitDeleteRecord`
(mapped from: AdvancedAuctionItemsSubmitDeleteRecord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog retail item id in the merchant namespace | 
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]





