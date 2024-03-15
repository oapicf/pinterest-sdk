# OptimizationGoalMetadataFrequencyGoalMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Frequency** | **Int32** |  | [optional] 
**Timerange** | **String** | User entity counts time range | [optional] 

## Examples

- Prepare the resource
```powershell
$OptimizationGoalMetadataFrequencyGoalMetadata = Initialize-PSOpenAPIToolsOptimizationGoalMetadataFrequencyGoalMetadata  -Frequency null `
 -Timerange DAY
```

- Convert the resource to JSON
```powershell
$OptimizationGoalMetadataFrequencyGoalMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

