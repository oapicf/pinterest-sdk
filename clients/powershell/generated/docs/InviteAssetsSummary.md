# InviteAssetsSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccounts** | [**InviteAssetsSummaryAdAccountsInner[]**](InviteAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels that will be assigned. | [optional] 
**Profiles** | [**InviteAssetsSummaryProfilesInner[]**](InviteAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels that will be assigned. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteAssetsSummary = Initialize-PSOpenAPIToolsInviteAssetsSummary  -AdAccounts null `
 -Profiles null
```

- Convert the resource to JSON
```powershell
$InviteAssetsSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

