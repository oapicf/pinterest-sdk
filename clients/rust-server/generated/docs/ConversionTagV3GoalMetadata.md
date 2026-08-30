# ConversionTagV3GoalMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [***models::AttributionWindows**](AttributionWindows.md) |  | [optional] [default to None]
**conversion_event** | [***models::ConversionEvent**](ConversionEvent.md) |  | [optional] [default to None]
**conversion_tag_id** | **String** |  | [optional] [default to None]
**cpa_goal_value_in_micro_currency** | **String** |  | [optional] [default to None]
**is_roas_optimized** | **swagger::Nullable<bool>** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional] [default to None]
**reporting_event** | **String** | Event name for custom or standard events mapped to an oCPM model | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


