# DeleteInvitesResultsResponseArrayItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**DeleteInvitesResultsResponseArrayItemsInnerException**](DeleteInvitesResultsResponseArrayItemsInnerException.md) |  | [optional] 
**Invite** | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteInvitesResultsResponseArrayItemsInner = Initialize-PSOpenAPIToolsDeleteInvitesResultsResponseArrayItemsInner  -Exception null `
 -Invite null
```

- Convert the resource to JSON
```powershell
$DeleteInvitesResultsResponseArrayItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

