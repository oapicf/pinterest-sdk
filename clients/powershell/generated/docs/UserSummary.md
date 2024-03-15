# UserSummary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **String** | Username | [optional] 
**Type** | **String** | Always &quot;&quot;user&quot;&quot; | [optional] 

## Examples

- Prepare the resource
```powershell
$UserSummary = Initialize-PSOpenAPIToolsUserSummary  -Username username `
 -Type user
```

- Convert the resource to JSON
```powershell
$UserSummary | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

