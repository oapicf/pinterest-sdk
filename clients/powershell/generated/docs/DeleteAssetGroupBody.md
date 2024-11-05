# DeleteAssetGroupBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupsToDelete** | **String[]** | List of ids of asset groups to be deleted | 

## Examples

- Prepare the resource
```powershell
$DeleteAssetGroupBody = Initialize-PSOpenAPIToolsDeleteAssetGroupBody  -AssetGroupsToDelete [&quot;666791336903426391&quot;,&quot;666791336903426392&quot;]
```

- Convert the resource to JSON
```powershell
$DeleteAssetGroupBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

