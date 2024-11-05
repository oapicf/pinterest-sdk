# UpdatePartnerAssetAccessBodyAccessesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PartnerId** | **String** | Unique identifier of a business partner to update asset access to. | 
**AssetId** | **String** | Unique identifier of the business asset. | 
**Permissions** | [**Permissions[]**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Examples

- Prepare the resource
```powershell
$UpdatePartnerAssetAccessBodyAccessesInner = Initialize-PSOpenAPIToolsUpdatePartnerAssetAccessBodyAccessesInner  -PartnerId 1234567890123 `
 -AssetId 549755885175 `
 -Permissions [&quot;ANALYST&quot;,&quot;ADMIN&quot;]
```

- Convert the resource to JSON
```powershell
$UpdatePartnerAssetAccessBodyAccessesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

