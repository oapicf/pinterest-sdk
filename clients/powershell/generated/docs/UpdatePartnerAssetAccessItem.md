# UpdatePartnerAssetAccessItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of the business asset. | 
**PartnerId** | **String** | Unique identifier of a business partner to update asset access to. | 
**Permissions** | [**Permissions[]**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Examples

- Prepare the resource
```powershell
$UpdatePartnerAssetAccessItem = Initialize-PSOpenAPIToolsUpdatePartnerAssetAccessItem  -AssetId null `
 -PartnerId null `
 -Permissions null
```

- Convert the resource to JSON
```powershell
$UpdatePartnerAssetAccessItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

