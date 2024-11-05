# CreateInvitesResultsResponseArrayItemsInnerInvite
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Unique identifier of the invite/request. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateInvitesResultsResponseArrayItemsInnerInvite = Initialize-PSOpenAPIToolsCreateInvitesResultsResponseArrayItemsInnerInvite  -Id 383791336903426391 `
 -User null
```

- Convert the resource to JSON
```powershell
$CreateInvitesResultsResponseArrayItemsInnerInvite | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

