# AssetIdPermissions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AssetIdPermissions = Initialize-PSOpenAPIToolsAssetIdPermissions  -AssetId 549755885175 `
 -AssetType AD_ACCOUNT `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;] `
 -AssetGroupInfo null
```

- Convert the resource to JSON
```powershell
$AssetIdPermissions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

