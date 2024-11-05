# AuthRespondInvitesBodyInvitesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | [**AuthRespondInvitesBodyInvitesInnerAction**](AuthRespondInvitesBodyInvitesInnerAction.md) |  | 
**InviteId** | **String** | Unique identifier of an invite. | 

## Examples

- Prepare the resource
```powershell
$AuthRespondInvitesBodyInvitesInner = Initialize-PSOpenAPIToolsAuthRespondInvitesBodyInvitesInner  -Action null `
 -InviteId null
```

- Convert the resource to JSON
```powershell
$AuthRespondInvitesBodyInvitesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

