# DynamicTitlesProcessCSV
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**DynamicTitlesProcessCSVError[]**](DynamicTitlesProcessCSVError.md) | List of validation errors. Empty on success. | [optional] [readonly] 
**Status** | **String** | Processing status. Present on success. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$DynamicTitlesProcessCSV = Initialize-PSOpenAPIToolsDynamicTitlesProcessCSV  -Errors null `
 -Status SUCCESS
```

- Convert the resource to JSON
```powershell
$DynamicTitlesProcessCSV | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

