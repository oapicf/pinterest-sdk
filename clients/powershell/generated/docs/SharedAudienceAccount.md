# SharedAudienceAccount
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AccountId** | **String** | Account ID (ad account or business ID). | 
**AccountName** | **String** | Account name. | 
**AccountType** | **String** | account type | 
**SharedOnTimestamp** | **Int32** | Epoch timestamp in seconds for the shared audience event | 

## Examples

- Prepare the resource
```powershell
$SharedAudienceAccount = Initialize-PSOpenAPIToolsSharedAudienceAccount  -AccountId 549755885175 `
 -AccountName Home Depot USA `
 -AccountType null `
 -SharedOnTimestamp 1677003860
```

- Convert the resource to JSON
```powershell
$SharedAudienceAccount | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

