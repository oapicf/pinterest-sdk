# UpdatePartnerAssetsResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**PartnerId** | **String** | Unique identifier of a business partner. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePartnerAssetsResult = Initialize-PSOpenAPIToolsUpdatePartnerAssetsResult  -AssetId 549755885175 `
 -AssetType AD_ACCOUNT `
 -PartnerId 140943737684417 `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$UpdatePartnerAssetsResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

