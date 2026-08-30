# OrderLineMutationError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**OrderLine**](OrderLine.md) |  | [optional] 
**ErrorMessages** | **String[]** | Error messages. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderLineMutationError = Initialize-PSOpenAPIToolsOrderLineMutationError  -VarData null `
 -ErrorMessages null
```

- Convert the resource to JSON
```powershell
$OrderLineMutationError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

