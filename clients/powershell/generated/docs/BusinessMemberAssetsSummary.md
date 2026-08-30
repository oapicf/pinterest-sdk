# BusinessMemberAssetsSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccounts** | [**AssetIdWithPermissions[]**](AssetIdWithPermissions.md) | List of ad account IDs and respective permission levels. | [optional] 
**Profiles** | [**AssetIdWithPermissions[]**](AssetIdWithPermissions.md) | List of profile IDs and respective permission levels. | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessMemberAssetsSummary = Initialize-PSOpenAPIToolsBusinessMemberAssetsSummary  -AdAccounts null `
 -Profiles null
```

- Convert the resource to JSON
```powershell
$BusinessMemberAssetsSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

