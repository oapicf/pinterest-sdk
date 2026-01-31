
# Table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`
(mapped from: OptimizationGoalMetadataConversionTagV3GoalMetadata)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributionWindows** | attribution_windows | long |  | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional] [foreignkey]
**conversionEvent** | conversion_event | text |  | [**conversion_event**](#ConversionEvent) |  |  [optional]
**conversionTagId** | conversion_tag_id | text |  | **kotlin.String** |  |  [optional]
**cpaGoalValueInMicroCurrency** | cpa_goal_value_in_micro_currency | text |  | **kotlin.String** |  |  [optional]
**isRoasOptimized** | is_roas_optimized | boolean |  | **kotlin.Boolean** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**learningModeType** | learning_mode_type | text |  | [**learning_mode_type**](#LearningModeType) | Conversion learning model type |  [optional]
**reportingEvent** | reporting_event | text |  | **kotlin.String** | Event name for custom or standard events mapped to an oCPM model |  [optional]









