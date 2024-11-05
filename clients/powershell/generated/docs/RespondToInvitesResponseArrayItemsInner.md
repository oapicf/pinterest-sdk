# RespondToInvitesResponseArrayItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**Invite** | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RespondToInvitesResponseArrayItemsInner = Initialize-PSOpenAPIToolsRespondToInvitesResponseArrayItemsInner  -Exception null `
 -Invite null
```

- Convert the resource to JSON
```powershell
$RespondToInvitesResponseArrayItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

