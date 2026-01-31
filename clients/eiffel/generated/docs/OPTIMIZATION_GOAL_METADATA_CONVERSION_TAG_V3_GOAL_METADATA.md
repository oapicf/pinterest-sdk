# OPTIMIZATION_GOAL_METADATA_CONVERSION_TAG_V3_GOAL_METADATA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**OPTIMIZATION_GOAL_METADATA_CONVERSION_TAG_V3_GOAL_METADATA_ATTRIBUTION_WINDOWS**](OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.md) |  | [optional] [default to null]
**conversion_event** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**conversion_tag_id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**cpa_goal_value_in_micro_currency** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**is_roas_optimized** | **BOOLEAN** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. | [optional] [default to null]
**learning_mode_type** | [**STRING_32**](STRING_32.md) | Conversion learning model type | [optional] [default to null]
**reporting_event** | [**STRING_32**](STRING_32.md) | Event name for custom or standard events mapped to an oCPM model | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


