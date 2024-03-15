# OptimizationGoalMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionTagV3GoalMetadata** | [**OptimizationGoalMetadataConversionTagV3GoalMetadata**](OptimizationGoalMetadataConversionTagV3GoalMetadata.md) |  | [optional] 
**FrequencyGoalMetadata** | [**OptimizationGoalMetadataFrequencyGoalMetadata**](OptimizationGoalMetadataFrequencyGoalMetadata.md) |  | [optional] 
**ScrollupGoalMetadata** | [**OptimizationGoalMetadataScrollupGoalMetadata**](OptimizationGoalMetadataScrollupGoalMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OptimizationGoalMetadata = Initialize-PSOpenAPIToolsOptimizationGoalMetadata  -ConversionTagV3GoalMetadata null `
 -FrequencyGoalMetadata null `
 -ScrollupGoalMetadata null
```

- Convert the resource to JSON
```powershell
$OptimizationGoalMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

