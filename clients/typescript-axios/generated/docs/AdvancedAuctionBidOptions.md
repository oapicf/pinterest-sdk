# AdvancedAuctionBidOptions

Object describing a retail catalog item\'s bid options (bid price and bid multipliers).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_in_micro_currency** | **number** | Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group\&#39;s &#x60;bid_in_micro_currency&#x60;. | [optional] [default to undefined]
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] [default to undefined]
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AdvancedAuctionBidOptions } from './api';

const instance: AdvancedAuctionBidOptions = {
    bid_in_micro_currency,
    app_type_multipliers,
    placement_multipliers,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
