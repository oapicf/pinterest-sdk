# UpdateAssetGroupBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupsToUpdate** | [**UpdateAssetGroupBodyAssetGroupsToUpdateInner[]**](UpdateAssetGroupBodyAssetGroupsToUpdateInner.md) | A list of asset groups and the data that will be used to update them. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateAssetGroupBody = Initialize-PSOpenAPIToolsUpdateAssetGroupBody  -AssetGroupsToUpdate null
```

- Convert the resource to JSON
```powershell
$UpdateAssetGroupBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

