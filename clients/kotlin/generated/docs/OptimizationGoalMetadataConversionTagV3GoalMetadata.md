
# OptimizationGoalMetadataConversionTagV3GoalMetadata

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attributionWindows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  |  [optional] |
| **conversionEvent** | [**inline**](#ConversionEvent) |  |  [optional] |
| **conversionTagId** | **kotlin.String** |  |  [optional] |
| **cpaGoalValueInMicroCurrency** | **kotlin.String** |  |  [optional] |
| **isRoasOptimized** | **kotlin.Boolean** | ROAS optimization is not supported |  [optional] |
| **learningModeType** | [**inline**](#LearningModeType) | Conversion learning model type |  [optional] |


<a id="ConversionEvent"></a>
## Enum: conversion_event
| Name | Value |
| ---- | ----- |
| conversionEvent | PAGE_VISIT, SIGNUP, CHECKOUT, CUSTOM, VIEW_CATEGORY, SEARCH, ADD_TO_CART, WATCH_VIDEO, LEAD, APP_INSTALL |


<a id="LearningModeType"></a>
## Enum: learning_mode_type
| Name | Value |
| ---- | ----- |
| learningModeType | NOT_ACTIVE, ACTIVE,  |



