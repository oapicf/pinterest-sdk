# BusinessMemberAssetsSummaryProfilesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Unique identifier of a business profile. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessMemberAssetsSummaryProfilesInner = Initialize-PSOpenAPIToolsBusinessMemberAssetsSummaryProfilesInner  -Id 383791336903426391 `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$BusinessMemberAssetsSummaryProfilesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

