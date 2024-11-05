# UpdateInvitesResultsResponseArrayItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**Invite** | [**InviteBusinessRoleBinding**](InviteBusinessRoleBinding.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateInvitesResultsResponseArrayItemsInner = Initialize-PSOpenAPIToolsUpdateInvitesResultsResponseArrayItemsInner  -Exception null `
 -Invite null
```

- Convert the resource to JSON
```powershell
$UpdateInvitesResultsResponseArrayItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

