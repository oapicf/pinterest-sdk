# InviteBusinessRoleBinding
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedByBusinessId** | **String** | Unique identifier for the business that created the invite/request. | [optional] 
**CreatedByUserId** | **String** | Unique identifier for the user that created the invite/request. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. | [optional] 
**Id** | **String** | Unique identifier of the invite/request. | [optional] 
**InviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | **Boolean** | Indicates whether the invite/request was received. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteBusinessRoleBinding = Initialize-PSOpenAPIToolsInviteBusinessRoleBinding  -CreatedByBusinessId 1234567890123 `
 -CreatedByUserId 1234567890123 `
 -User null `
 -Id 383791336903426391 `
 -InviteData null `
 -IsReceivedInvite null
```

- Convert the resource to JSON
```powershell
$InviteBusinessRoleBinding | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

