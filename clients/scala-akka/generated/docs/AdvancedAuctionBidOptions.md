

# AdvancedAuctionBidOptions

Object describing a retail catalog item's bid options (bid price and bid multipliers).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bidInMicroCurrency** | **Long** | Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;. |  [optional]
**appTypeMultipliers** | **AppTypeMultipliers** |  |  [optional]
**placementMultipliers** | **PlacementMultipliers** |  |  [optional]



