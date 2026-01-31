# UserSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** | Always &quot;&quot;user&quot;&quot; | [optional] 
**Username** | **String** | Username | [optional] 

## Examples

- Prepare the resource
```powershell
$UserSummary = Initialize-PSOpenAPIToolsUserSummary  -Type user `
 -Username username
```

- Convert the resource to JSON
```powershell
$UserSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

