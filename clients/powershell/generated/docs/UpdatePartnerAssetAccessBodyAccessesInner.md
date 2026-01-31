# UpdatePartnerAssetAccessBodyAccessesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of the business asset. | 
**PartnerId** | **String** | Unique identifier of a business partner to update asset access to. | 
**Permissions** | [**Permissions[]**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Examples

- Prepare the resource
```powershell
$UpdatePartnerAssetAccessBodyAccessesInner = Initialize-PSOpenAPIToolsUpdatePartnerAssetAccessBodyAccessesInner  -AssetId 549755885175 `
 -PartnerId 1234567890123 `
 -Permissions [&quot;ANALYST&quot;,&quot;ADMIN&quot;]
```

- Convert the resource to JSON
```powershell
$UpdatePartnerAssetAccessBodyAccessesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

