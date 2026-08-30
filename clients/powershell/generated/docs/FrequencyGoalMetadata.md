# FrequencyGoalMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Frequency** | **Int32** |  | [optional] 
**Timerange** | [**FrequencyGoalMetadataTimerange**](FrequencyGoalMetadataTimerange.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FrequencyGoalMetadata = Initialize-PSOpenAPIToolsFrequencyGoalMetadata  -Frequency null `
 -Timerange null
```

- Convert the resource to JSON
```powershell
$FrequencyGoalMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

