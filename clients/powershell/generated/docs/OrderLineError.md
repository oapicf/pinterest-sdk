# OrderLineError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**OrderLine**](.md) |  | [optional] 
**ErrorMessages** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderLineError = Initialize-PSOpenAPIToolsOrderLineError  -VarData null `
 -ErrorMessages null
```

- Convert the resource to JSON
```powershell
$OrderLineError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

