# BaseInviteDataResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Unique identifier of the invite/request. | [optional] 
**InviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | **Boolean** | Indicates whether the invite/request was received. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Examples

- Prepare the resource
```powershell
$BaseInviteDataResponse = Initialize-PSOpenAPIToolsBaseInviteDataResponse  -Id 383791336903426391 `
 -InviteData null `
 -IsReceivedInvite null `
 -User null
```

- Convert the resource to JSON
```powershell
$BaseInviteDataResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

