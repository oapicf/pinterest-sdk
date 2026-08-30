# AssetGroupUpdateError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupId** | **String** |  | [optional] 
**Code** | **Int32** |  | [optional] 
**Message** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssetGroupUpdateError = Initialize-PSOpenAPIToolsAssetGroupUpdateError  -AssetGroupId null `
 -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$AssetGroupUpdateError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

