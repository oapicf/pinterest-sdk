# ModelError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** |  | 
**Message** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ModelError = Initialize-PSOpenAPIToolsModelError  -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$ModelError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

