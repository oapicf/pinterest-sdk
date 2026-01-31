# openapi::OptimizationGoalMetadataConversionTagV3GoalMetadata


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.md) |  | [optional] 
**conversion_event** | **character** |  | [optional] [Enum: [PAGE_VISIT, SIGNUP, CHECKOUT, CUSTOM, VIEW_CATEGORY, SEARCH, ADD_TO_CART, WATCH_VIDEO, LEAD, APP_INSTALL]] 
**conversion_tag_id** | **character** |  | [optional] [Pattern: ^[0-9]+$] 
**cpa_goal_value_in_micro_currency** | **character** |  | [optional] [Pattern: ^[0-9]+$] 
**is_roas_optimized** | **character** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**learning_mode_type** | **character** | Conversion learning model type | [optional] [Enum: [NOT_ACTIVE, ACTIVE]] 
**reporting_event** | **character** | Event name for custom or standard events mapped to an oCPM model | [optional] 


