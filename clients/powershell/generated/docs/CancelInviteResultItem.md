# CancelInviteResultItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**CancelInviteException**](CancelInviteException.md) |  | [optional] 
**Invite** | [**CancelInviteResult**](CancelInviteResult.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CancelInviteResultItem = Initialize-PSOpenAPIToolsCancelInviteResultItem  -Exception null `
 -Invite null
```

- Convert the resource to JSON
```powershell
$CancelInviteResultItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

