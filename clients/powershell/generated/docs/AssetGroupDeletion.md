# AssetGroupDeletion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedAssetGroups** | **String[]** |  | [optional] [readonly] 
**Exceptions** | [**AssetGroupDeleteError[]**](AssetGroupDeleteError.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssetGroupDeletion = Initialize-PSOpenAPIToolsAssetGroupDeletion  -DeletedAssetGroups null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$AssetGroupDeletion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

