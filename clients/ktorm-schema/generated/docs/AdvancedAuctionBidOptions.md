
# Table `AdvancedAuctionBidOptions`
(mapped from: AdvancedAuctionBidOptions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bidInMicroCurrency** | bid_in_micro_currency | long |  | **kotlin.Long** | Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;. |  [optional]
**appTypeMultipliers** | app_type_multipliers | long |  | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  |  [optional] [foreignkey]
**placementMultipliers** | placement_multipliers | long |  | [**PlacementMultipliers**](PlacementMultipliers.md) |  |  [optional] [foreignkey]





