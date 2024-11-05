# AdvancedAuctionBidOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_in_micro_currency** | Option<**i64**> | Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. | [optional]
**app_type_multipliers** | Option<[**models::AppTypeMultipliers**](AppTypeMultipliers.md)> |  | [optional]
**placement_multipliers** | Option<[**models::PlacementMultipliers**](PlacementMultipliers.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


