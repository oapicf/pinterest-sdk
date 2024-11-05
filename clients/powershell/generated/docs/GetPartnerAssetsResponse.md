# GetPartnerAssetsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | **String[]** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] 
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPartnerAssetsResponse = Initialize-PSOpenAPIToolsGetPartnerAssetsResponse  -AssetId 549755885175 `
 -AssetType AD_ACCOUNT `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;] `
 -AssetGroupInfo null
```

- Convert the resource to JSON
```powershell
$GetPartnerAssetsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

