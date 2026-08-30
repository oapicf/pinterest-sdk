# CancelInviteResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**InviteData** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**IsReceivedInvite** | **Boolean** |  | [optional] 
**User** | [**CancelInviteResultUser**](CancelInviteResultUser.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CancelInviteResult = Initialize-PSOpenAPIToolsCancelInviteResult  -Id null `
 -InviteData null `
 -IsReceivedInvite null `
 -User null
```

- Convert the resource to JSON
```powershell
$CancelInviteResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

