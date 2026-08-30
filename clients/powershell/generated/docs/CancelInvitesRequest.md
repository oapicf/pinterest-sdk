# CancelInvitesRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteIds** | **String[]** | A list of invite/request ids to cancel. | 

## Examples

- Prepare the resource
```powershell
$CancelInvitesRequest = Initialize-PSOpenAPIToolsCancelInvitesRequest  -InviteIds null
```

- Convert the resource to JSON
```powershell
$CancelInvitesRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

