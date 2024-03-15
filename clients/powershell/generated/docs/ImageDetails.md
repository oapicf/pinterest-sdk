# ImageDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Width** | **Int32** |  | 
**Height** | **Int32** |  | 
**Url** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$ImageDetails = Initialize-PSOpenAPIToolsImageDetails  -Width null `
 -Height null `
 -Url null
```

- Convert the resource to JSON
```powershell
$ImageDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

