# InviteAssetsSummaryAdAccountsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Unique identifier of a business ad account. | [optional] 
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteAssetsSummaryAdAccountsInner = Initialize-PSOpenAPIToolsInviteAssetsSummaryAdAccountsInner  -Id 549755885175 `
 -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
```

- Convert the resource to JSON
```powershell
$InviteAssetsSummaryAdAccountsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

