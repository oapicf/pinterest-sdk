# UsersForIndividualAssetResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**MemberId** | **String** | Unique identifier of the business member with asset access. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 

## Examples

- Prepare the resource
```powershell
$UsersForIndividualAssetResponse = Initialize-PSOpenAPIToolsUsersForIndividualAssetResponse  -AssetId 549755885175 `
 -MemberId 140943737684417 `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$UsersForIndividualAssetResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

