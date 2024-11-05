
# Table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`
(mapped from: OptimizationGoalMetadataConversionTagV3GoalMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributionWindows** | attribution_windows | long |  | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional] [foreignkey]
**conversionEvent** | conversion_event | text |  | [**conversion_event**](#ConversionEvent) |  |  [optional]
**conversionTagId** | conversion_tag_id | text |  | **kotlin.String** |  |  [optional]
**cpaGoalValueInMicroCurrency** | cpa_goal_value_in_micro_currency | text |  | **kotlin.String** |  |  [optional]
**isRoasOptimized** | is_roas_optimized | boolean |  | **kotlin.Boolean** | ROAS optimization is not supported |  [optional]
**learningModeType** | learning_mode_type | text |  | [**learning_mode_type**](#LearningModeType) | Conversion learning model type |  [optional]








