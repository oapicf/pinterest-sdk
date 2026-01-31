# OptimizationGoalMetadataConversionTagV3GoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | Option<[**models::OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.md)> |  | [optional]
**conversion_event** | Option<**String**> |  | [optional]
**conversion_tag_id** | Option<**String**> |  | [optional]
**cpa_goal_value_in_micro_currency** | Option<**String**> |  | [optional]
**is_roas_optimized** | Option<**bool**> | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>. | [optional]
**learning_mode_type** | Option<**String**> | Conversion learning model type | [optional]
**reporting_event** | Option<**String**> | Event name for custom or standard events mapped to an oCPM model | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


