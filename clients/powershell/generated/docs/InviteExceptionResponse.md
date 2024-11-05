# InviteExceptionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteOrRequestId** | **String** | Unique identifier of the invite/request. | [optional] 
**Code** | **Int32** | Error code associated with the error in performing the action on the invite/request. | [optional] 
**Message** | **String** | Error message associated with the error in performing the action on the invite/request. | [optional] 
**UsersOrPartnerIds** | **String[]** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteExceptionResponse = Initialize-PSOpenAPIToolsInviteExceptionResponse  -InviteOrRequestId 383791336903426391 `
 -Code 403 `
 -Message You hit the maximum number of pending invites allowed. `
 -UsersOrPartnerIds [&quot;businessMember0101&quot;,&quot;business+member@business.com&quot;]
```

- Convert the resource to JSON
```powershell
$InviteExceptionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

