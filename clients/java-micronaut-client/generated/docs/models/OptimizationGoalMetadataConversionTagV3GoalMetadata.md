

# OptimizationGoalMetadataConversionTagV3GoalMetadata

The class is defined in **[OptimizationGoalMetadataConversionTagV3GoalMetadata.java](../../src/main/java/org/openapitools/model/OptimizationGoalMetadataConversionTagV3GoalMetadata.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributionWindows** | [`OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows`](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional property]
**conversionEvent** | [**ConversionEventEnum**](#ConversionEventEnum) |  |  [optional property]
**conversionTagId** | `String` |  |  [optional property]
**cpaGoalValueInMicroCurrency** | `String` |  |  [optional property]
**isRoasOptimized** | `Boolean` | Ad group is ROAS optimized |  [optional property]
**learningModeType** | [**LearningModeTypeEnum**](#LearningModeTypeEnum) | Conversion learning model type |  [optional property]


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
NULL | `"null"`


