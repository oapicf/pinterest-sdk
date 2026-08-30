# AssetGroupModification
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | [**AssetGroupUpdateError[]**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**UpdatedAssetGroups** | [**AssetGroupBinding[]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$AssetGroupModification = Initialize-PSOpenAPIToolsAssetGroupModification  -Exceptions null `
 -UpdatedAssetGroups null
```

- Convert the resource to JSON
```powershell
$AssetGroupModification | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

