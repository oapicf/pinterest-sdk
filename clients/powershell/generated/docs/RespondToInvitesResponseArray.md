# RespondToInvitesResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**RespondToInvitesResponseArrayItemsInner[]**](RespondToInvitesResponseArrayItemsInner.md) | List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. | [optional] 

## Examples

- Prepare the resource
```powershell
$RespondToInvitesResponseArray = Initialize-PSOpenAPIToolsRespondToInvitesResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$RespondToInvitesResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

