# CancelInviteResultUser
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **String** | Email of the business member/partner. | [optional] 
**Id** | **String** | Unique identifier of the business member/partner. | [optional] 
**Username** | **String** | Username of the business member/partner. | [optional] 

## Examples

- Prepare the resource
```powershell
$CancelInviteResultUser = Initialize-PSOpenAPIToolsCancelInviteResultUser  -Email null `
 -Id null `
 -Username null
```

- Convert the resource to JSON
```powershell
$CancelInviteResultUser | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

