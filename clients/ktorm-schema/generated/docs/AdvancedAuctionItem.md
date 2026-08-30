
# Table `AdvancedAuctionItem`
(mapped from: AdvancedAuctionItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bidOptions** | bid_options | long NOT NULL |  | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  |  [foreignkey]
**country** | country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**itemId** | item_id | text NOT NULL |  | **kotlin.String** | The catalog retail item id in the merchant namespace | 
**language** | language | long NOT NULL |  | [**Language**](Language.md) |  |  [foreignkey]






