# openapi::OptimizationGoalMetadataConversionTagV3GoalMetadata


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.md) |  | [optional] 
**conversion_event** | **character** |  | [optional] [Enum: [PAGE_VISIT, SIGNUP, CHECKOUT, CUSTOM, VIEW_CATEGORY, SEARCH, ADD_TO_CART, WATCH_VIDEO, LEAD, APP_INSTALL]] 
**conversion_tag_id** | **character** |  | [optional] [Pattern: ^[0-9]+$] 
**cpa_goal_value_in_micro_currency** | **character** |  | [optional] [Pattern: ^[0-9]+$] 
**is_roas_optimized** | **character** | Ad group is ROAS optimized | [optional] 
**learning_mode_type** | **character** | Conversion learning model type | [optional] [Enum: [NOT_ACTIVE, ACTIVE, null]] 


