

# OptimizationGoalMetadataConversionTagV3GoalMetadata

The class is defined in **[OptimizationGoalMetadataConversionTagV3GoalMetadata.java](../../src/main/java/org/openapitools/model/OptimizationGoalMetadataConversionTagV3GoalMetadata.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributionWindows** | [`OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows`](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional property]
**conversionEvent** | [**ConversionEventEnum**](#ConversionEventEnum) |  |  [optional property]
**conversionTagId** | `String` |  |  [optional property]
**cpaGoalValueInMicroCurrency** | `String` |  |  [optional property]
**isRoasOptimized** | `Boolean` | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. |  [optional property]
**learningModeType** | [**LearningModeTypeEnum**](#LearningModeTypeEnum) | Conversion learning model type |  [optional property]
**reportingEvent** | `String` | Event name for custom or standard events mapped to an oCPM model |  [optional property]


## ConversionEventEnum

Name | Value
---- | -----
PAGE_VISIT | `"PAGE_VISIT"`
SIGNUP | `"SIGNUP"`
CHECKOUT | `"CHECKOUT"`
CUSTOM | `"CUSTOM"`
VIEW_CATEGORY | `"VIEW_CATEGORY"`
SEARCH | `"SEARCH"`
ADD_TO_CART | `"ADD_TO_CART"`
WATCH_VIDEO | `"WATCH_VIDEO"`
LEAD | `"LEAD"`
APP_INSTALL | `"APP_INSTALL"`




## LearningModeTypeEnum

Name | Value
---- | -----
NOT_ACTIVE | `"NOT_ACTIVE"`
ACTIVE | `"ACTIVE"`



