# DeletePartnerAssetAccessResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**IsSharedPartner** | **Boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**PartnerId** | **String** | Unique identifier of a business partner. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePartnerAssetAccessResult = Initialize-PSOpenAPIToolsDeletePartnerAssetAccessResult  -AssetId null `
 -AssetType null `
 -IsSharedPartner null `
 -PartnerId null `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$DeletePartnerAssetAccessResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

