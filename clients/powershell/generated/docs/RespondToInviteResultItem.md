# RespondToInviteResultItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**Invite** | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) | An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. | [optional] 

## Examples

- Prepare the resource
```powershell
$RespondToInviteResultItem = Initialize-PSOpenAPIToolsRespondToInviteResultItem  -Exception null `
 -Invite null
```

- Convert the resource to JSON
```powershell
$RespondToInviteResultItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

