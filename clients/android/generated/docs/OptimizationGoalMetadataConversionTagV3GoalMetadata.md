

# OptimizationGoalMetadataConversionTagV3GoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributionWindows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional]
**conversionEvent** | [**ConversionEventEnum**](#ConversionEventEnum) |  |  [optional]
**conversionTagId** | **String** |  |  [optional]
**cpaGoalValueInMicroCurrency** | **String** |  |  [optional]
**isRoasOptimized** | **Boolean** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**learningModeType** | [**LearningModeTypeEnum**](#LearningModeTypeEnum) | Conversion learning model type |  [optional]
**reportingEvent** | **String** | Event name for custom or standard events mapped to an oCPM model |  [optional]


## Enum: ConversionEventEnum

Name | Value
---- | -----


## Enum: LearningModeTypeEnum

Name | Value
---- | -----




