# AdvancedAuctionBidOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type_multipliers** | [***swagger::Nullable<models::AppTypeMultipliers>**](AppTypeMultipliers.md) |  | [optional] [default to None]
**bid_in_micro_currency** | **swagger::Nullable<i64>** | Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`. | [optional] [default to None]
**placement_multipliers** | [***swagger::Nullable<models::PlacementMultipliers>**](PlacementMultipliers.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


