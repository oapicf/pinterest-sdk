# AdArrayResponseElement
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**AdResponse**](AdResponse.md) |  | [optional] 
**Exceptions** | [**Exception**](Exception.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdArrayResponseElement = Initialize-PSOpenAPIToolsAdArrayResponseElement  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$AdArrayResponseElement | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

