# optimization_goal_metadata_conversion_tag_v3_goal_metadata_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows_t**](optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows.md) \* |  | [optional] 
**conversion_event** | **pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_CONVERSIONEVENT_e** |  | [optional] 
**conversion_tag_id** | **char \*** |  | [optional] 
**cpa_goal_value_in_micro_currency** | **char \*** |  | [optional] 
**is_roas_optimized** | **int** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**learning_mode_type** | **pinterest_rest_api_optimization_goal_metadata_conversion_tag_v3_goal_metadata_LEARNINGMODETYPE_e** | Conversion learning model type | [optional] 
**reporting_event** | **char \*** | Event name for custom or standard events mapped to an oCPM model | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


