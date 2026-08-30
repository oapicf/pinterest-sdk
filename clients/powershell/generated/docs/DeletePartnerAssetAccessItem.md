# DeletePartnerAssetAccessItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of the business asset. | 
**PartnerId** | **String** | Unique identifier of a business partner to update asset access to. | 
**PartnerType** | **String** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to "INTERNAL"]

## Examples

- Prepare the resource
```powershell
$DeletePartnerAssetAccessItem = Initialize-PSOpenAPIToolsDeletePartnerAssetAccessItem  -AssetId null `
 -PartnerId null `
 -PartnerType null
```

- Convert the resource to JSON
```powershell
$DeletePartnerAssetAccessItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

