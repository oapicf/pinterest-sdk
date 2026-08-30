# ConversionTagV3GoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | Option<[**models::AttributionWindows**](AttributionWindows.md)> |  | [optional]
**conversion_event** | Option<[**models::ConversionEvent**](ConversionEvent.md)> |  | [optional]
**conversion_tag_id** | Option<**String**> |  | [optional]
**cpa_goal_value_in_micro_currency** | Option<**String**> |  | [optional]
**is_roas_optimized** | Option<**bool**> | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional]
**reporting_event** | Option<**String**> | Event name for custom or standard events mapped to an oCPM model | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


