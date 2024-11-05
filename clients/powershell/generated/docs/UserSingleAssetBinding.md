# UserSingleAssetBinding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Permissions** | **String[]** | Permission levels member or partner has on an asset. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UserSingleAssetBinding = Initialize-PSOpenAPIToolsUserSingleAssetBinding  -Permissions [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;] `
 -User null
```

- Convert the resource to JSON
```powershell
$UserSingleAssetBinding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

