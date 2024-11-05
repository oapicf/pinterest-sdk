

# OptimizationGoalMetadataConversionTagV3GoalMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributionWindows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional] |
|**conversionEvent** | [**ConversionEventEnum**](#ConversionEventEnum) |  |  [optional] |
|**conversionTagId** | **String** |  |  [optional] |
|**cpaGoalValueInMicroCurrency** | **String** |  |  [optional] |
|**isRoasOptimized** | **Boolean** | ROAS optimization is not supported |  [optional] |
|**learningModeType** | [**LearningModeTypeEnum**](#LearningModeTypeEnum) | Conversion learning model type |  [optional] |



## Enum: ConversionEventEnum

| Name | Value |
|---- | -----|
| PAGE_VISIT | &quot;PAGE_VISIT&quot; |
| SIGNUP | &quot;SIGNUP&quot; |
| CHECKOUT | &quot;CHECKOUT&quot; |
| CUSTOM | &quot;CUSTOM&quot; |
| VIEW_CATEGORY | &quot;VIEW_CATEGORY&quot; |
| SEARCH | &quot;SEARCH&quot; |
| ADD_TO_CART | &quot;ADD_TO_CART&quot; |
| WATCH_VIDEO | &quot;WATCH_VIDEO&quot; |
| LEAD | &quot;LEAD&quot; |
| APP_INSTALL | &quot;APP_INSTALL&quot; |



## Enum: LearningModeTypeEnum

| Name | Value |
|---- | -----|
| NOT_ACTIVE | &quot;NOT_ACTIVE&quot; |
| ACTIVE | &quot;ACTIVE&quot; |



