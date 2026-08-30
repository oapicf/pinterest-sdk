# AssetIdPermissions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**AssetId** | **String** | Unique identifier of a business asset. | 
**AssetType** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | 

## Examples

- Prepare the resource
```powershell
$AssetIdPermissions = Initialize-PSOpenAPIToolsAssetIdPermissions  -AssetGroupInfo null `
 -AssetId 549755885175 `
 -AssetType null `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$AssetIdPermissions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

