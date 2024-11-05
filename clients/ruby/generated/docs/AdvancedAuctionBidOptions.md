# PinterestSdkClient::AdvancedAuctionBidOptions

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid_in_micro_currency** | **Integer** | Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;. | [optional] |
| **app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] |
| **placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdvancedAuctionBidOptions.new(
  bid_in_micro_currency: 5000000,
  app_type_multipliers: null,
  placement_multipliers: null
)
```

