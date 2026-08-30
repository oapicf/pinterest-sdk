# AuthRespondInvitesBodyItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Action** | [**AuthRespondInviteAction**](AuthRespondInviteAction.md) |  | 
**InviteId** | **String** | Unique identifier of an invite. | 

## Examples

- Prepare the resource
```powershell
$AuthRespondInvitesBodyItem = Initialize-PSOpenAPIToolsAuthRespondInvitesBodyItem  -Action null `
 -InviteId null
```

- Convert the resource to JSON
```powershell
$AuthRespondInvitesBodyItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

