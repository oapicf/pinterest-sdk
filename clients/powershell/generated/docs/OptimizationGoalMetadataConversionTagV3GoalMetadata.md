# OptimizationGoalMetadataConversionTagV3GoalMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributionWindows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  | [optional] 
**ConversionEvent** | **String** |  | [optional] 
**ConversionTagId** | **String** |  | [optional] 
**CpaGoalValueInMicroCurrency** | **String** |  | [optional] 
**IsRoasOptimized** | **Boolean** | ROAS optimization is not supported | [optional] 
**LearningModeType** | **String** | Conversion learning model type | [optional] 

## Examples

- Prepare the resource
```powershell
$OptimizationGoalMetadataConversionTagV3GoalMetadata = Initialize-PSOpenAPIToolsOptimizationGoalMetadataConversionTagV3GoalMetadata  -AttributionWindows null `
 -ConversionEvent null `
 -ConversionTagId null `
 -CpaGoalValueInMicroCurrency null `
 -IsRoasOptimized null `
 -LearningModeType ACTIVE
```

- Convert the resource to JSON
```powershell
$OptimizationGoalMetadataConversionTagV3GoalMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

