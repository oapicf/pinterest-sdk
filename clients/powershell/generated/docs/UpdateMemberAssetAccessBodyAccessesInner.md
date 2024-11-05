# UpdateMemberAssetAccessBodyAccessesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Id of the asset to update. | 
**MemberId** | **String** | Unique identifier of the member on which to perform the update | 
**Permissions** | [**Permissions[]**](Permissions.md) | A non-empty array of permissions to assign to the member. | 

## Examples

- Prepare the resource
```powershell
$UpdateMemberAssetAccessBodyAccessesInner = Initialize-PSOpenAPIToolsUpdateMemberAssetAccessBodyAccessesInner  -AssetId 549755885175 `
 -MemberId 140943737684417 `
 -Permissions [&quot;ANALYST&quot;,&quot;ADMIN&quot;]
```

- Convert the resource to JSON
```powershell
$UpdateMemberAssetAccessBodyAccessesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

