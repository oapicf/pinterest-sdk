# EntityLabelError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**EntityLabel**](EntityLabel.md) |  | [optional] 
**ErrorMessages** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$EntityLabelError = Initialize-PSOpenAPIToolsEntityLabelError  -VarData null `
 -ErrorMessages null
```

- Convert the resource to JSON
```powershell
$EntityLabelError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

