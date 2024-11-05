# CancelInvitesBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteIds** | **String[]** | List of invite/request ids to be cancelled | 

## Examples

- Prepare the resource
```powershell
$CancelInvitesBody = Initialize-PSOpenAPIToolsCancelInvitesBody  -InviteIds [&quot;1234567890123456789&quot;,&quot;1122334455667788991&quot;]
```

- Convert the resource to JSON
```powershell
$CancelInvitesBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

