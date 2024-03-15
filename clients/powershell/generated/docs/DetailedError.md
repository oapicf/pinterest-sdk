# DetailedError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** |  | 
**Message** | **String** |  | 
**Details** | [**SystemCollectionsHashtable**](.md) |  | 

## Examples

- Prepare the resource
```powershell
$DetailedError = Initialize-PSOpenAPIToolsDetailedError  -Code null `
 -Message null `
 -Details null
```

- Convert the resource to JSON
```powershell
$DetailedError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

