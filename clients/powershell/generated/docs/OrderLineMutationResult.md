# OrderLineMutationResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**OrderLineMutationError[]**](OrderLineMutationError.md) | Error list if update(s) fail. | [optional] 
**OrderLine** | [**OrderLine[]**](OrderLine.md) | Order Line object array. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderLineMutationResult = Initialize-PSOpenAPIToolsOrderLineMutationResult  -Errors null `
 -OrderLine null
```

- Convert the resource to JSON
```powershell
$OrderLineMutationResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

