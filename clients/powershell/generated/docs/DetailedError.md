# DetailedError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **Int32** |  | 
**Details** | [**SystemCollectionsHashtable**](.md) |  | 
**Message** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$DetailedError = Initialize-PSOpenAPIToolsDetailedError  -Code null `
 -Details null `
 -Message null
```

- Convert the resource to JSON
```powershell
$DetailedError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

