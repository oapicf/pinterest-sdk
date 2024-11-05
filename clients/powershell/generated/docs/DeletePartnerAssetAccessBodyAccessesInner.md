# DeletePartnerAssetAccessBodyAccessesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerId** | **String** | Unique identifier of a business partner to update asset access to. | 
**AssetId** | **String** | Unique identifier of the business asset. | 
**PartnerType** | **String** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to "INTERNAL"]

## Examples

- Prepare the resource
```powershell
$DeletePartnerAssetAccessBodyAccessesInner = Initialize-PSOpenAPIToolsDeletePartnerAssetAccessBodyAccessesInner  -PartnerId 1234567890123 `
 -AssetId 549755885175 `
 -PartnerType INTERNAL
```

- Convert the resource to JSON
```powershell
$DeletePartnerAssetAccessBodyAccessesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

