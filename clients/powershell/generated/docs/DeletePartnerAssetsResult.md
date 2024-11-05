# DeletePartnerAssetsResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 
**IsSharedPartner** | **Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**PartnerId** | **String** | Unique identifier of a business partner. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePartnerAssetsResult = Initialize-PSOpenAPIToolsDeletePartnerAssetsResult  -AssetId 549755885175 `
 -AssetType AD_ACCOUNT `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;] `
 -IsSharedPartner false `
 -PartnerId 140943737684417
```

- Convert the resource to JSON
```powershell
$DeletePartnerAssetsResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

