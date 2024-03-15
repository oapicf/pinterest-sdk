# OrderLineResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**OrderLineError[]**](OrderLineError.md) | Error list if update(s) fail. | [optional] 
**OrderLine** | [**OrderLine[]**](OrderLine.md) | Order Line object array. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderLineResponse = Initialize-PSOpenAPIToolsOrderLineResponse  -Errors null `
 -OrderLine null
```

- Convert the resource to JSON
```powershell
$OrderLineResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

