# LabelError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**LabelErrorData**](LabelErrorData.md) |  | [optional] 
**ErrorMessages** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$LabelError = Initialize-PSOpenAPIToolsLabelError  -VarData null `
 -ErrorMessages null
```

- Convert the resource to JSON
```powershell
$LabelError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

