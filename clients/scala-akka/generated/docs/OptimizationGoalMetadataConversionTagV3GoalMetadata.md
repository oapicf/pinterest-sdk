

# OptimizationGoalMetadataConversionTagV3GoalMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributionWindows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional]
**conversionEvent** | [**ConversionEvent**](#ConversionEvent) |  |  [optional]
**conversionTagId** | **String** |  |  [optional]
**cpaGoalValueInMicroCurrency** | **String** |  |  [optional]
**isRoasOptimized** | **Boolean** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. |  [optional]
**learningModeType** | [**LearningModeType**](#LearningModeType) | Conversion learning model type |  [optional]
**reportingEvent** | **String** | Event name for custom or standard events mapped to an oCPM model |  [optional]


## Enum: ConversionEvent
Allowed values: [PAGE_VISIT, SIGNUP, CHECKOUT, CUSTOM, VIEW_CATEGORY, SEARCH, ADD_TO_CART, WATCH_VIDEO, LEAD, APP_INSTALL]



## Enum: LearningModeType
Allowed values: [NOT_ACTIVE, ACTIVE, ]




