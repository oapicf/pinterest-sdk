# ImageDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Height** | **Int32** |  | 
**Url** | **String** |  | 
**Width** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$ImageDetails = Initialize-PSOpenAPIToolsImageDetails  -Height null `
 -Url null `
 -Width null
```

- Convert the resource to JSON
```powershell
$ImageDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

