# DeleteInvitesResultsResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**DeleteInvitesResultsResponseArrayItemsInner[]**](DeleteInvitesResultsResponseArrayItemsInner.md) | List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteInvitesResultsResponseArray = Initialize-PSOpenAPIToolsDeleteInvitesResultsResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$DeleteInvitesResultsResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

