# DeleteInvitesResultsResponseArrayItemsInnerException
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteId** | **String** | Unique identifier of an invite. | [optional] 
**Message** | **String** | Error message associated with the error in performing the action on the invite/request. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteInvitesResultsResponseArrayItemsInnerException = Initialize-PSOpenAPIToolsDeleteInvitesResultsResponseArrayItemsInnerException  -InviteId null `
 -Message Business Invite request cannot be performed on current invitation status.
```

- Convert the resource to JSON
```powershell
$DeleteInvitesResultsResponseArrayItemsInnerException | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

