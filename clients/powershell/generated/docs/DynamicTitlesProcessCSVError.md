# DynamicTitlesProcessCSVError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ErrorType** | **String** | The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. | [optional] 
**RowNumber** | **Int32** | The row number with a validation error. -1 indicates a file-level error. | [optional] 

## Examples

- Prepare the resource
```powershell
$DynamicTitlesProcessCSVError = Initialize-PSOpenAPIToolsDynamicTitlesProcessCSVError  -ErrorType ROW_VALIDATION_FAILED `
 -RowNumber 15
```

- Convert the resource to JSON
```powershell
$DynamicTitlesProcessCSVError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

