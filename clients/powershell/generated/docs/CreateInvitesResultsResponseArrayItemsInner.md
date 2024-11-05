# CreateInvitesResultsResponseArrayItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**Invite** | [**CreateInvitesResultsResponseArrayItemsInnerInvite**](CreateInvitesResultsResponseArrayItemsInnerInvite.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateInvitesResultsResponseArrayItemsInner = Initialize-PSOpenAPIToolsCreateInvitesResultsResponseArrayItemsInner  -Exception null `
 -Invite null
```

- Convert the resource to JSON
```powershell
$CreateInvitesResultsResponseArrayItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

