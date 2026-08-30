# BaseBusinessAssets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] 
**Permissions** | **String[]** | Permission levels the requesting business has on an asset. | [optional] 

## Examples

- Prepare the resource
```powershell
$BaseBusinessAssets = Initialize-PSOpenAPIToolsBaseBusinessAssets  -AssetGroupInfo null `
 -AssetId 549755885175 `
 -AssetType null `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$BaseBusinessAssets | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

