# AssetGroupDeleteError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **String** | Asset group id of the exception. | [optional] 
**Code** | **Int32** | Error code associated with the error deleting asset group. | [optional] 
**Message** | **String** | Error message associated with the error deleting asset group. | [optional] 

## Examples

- Prepare the resource
```powershell
$AssetGroupDeleteError = Initialize-PSOpenAPIToolsAssetGroupDeleteError  -AssetGroupId null `
 -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$AssetGroupDeleteError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

