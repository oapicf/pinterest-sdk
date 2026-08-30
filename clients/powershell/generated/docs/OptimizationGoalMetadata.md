# OptimizationGoalMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionTagV3GoalMetadata** | [**ConversionTagV3GoalMetadata**](ConversionTagV3GoalMetadata.md) |  | [optional] 
**FrequencyGoalMetadata** | [**FrequencyGoalMetadata**](FrequencyGoalMetadata.md) |  | [optional] 
**ScrollupGoalMetadata** | [**ScrollupGoalMetadata**](ScrollupGoalMetadata.md) |  | [optional] 

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

