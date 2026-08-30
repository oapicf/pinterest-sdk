# AssetGroupModificationReadOrUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupsToUpdate** | [**AssetGroupUpdateItemReadOrUpdateItem[]**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. | [optional] 
**Exceptions** | [**AssetGroupUpdateError[]**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**UpdatedAssetGroups** | [**AssetGroupBinding[]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$AssetGroupModificationReadOrUpdate = Initialize-PSOpenAPIToolsAssetGroupModificationReadOrUpdate  -AssetGroupsToUpdate null `
 -Exceptions null `
 -UpdatedAssetGroups null
```

- Convert the resource to JSON
```powershell
$AssetGroupModificationReadOrUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

