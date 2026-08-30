# CancelInviteException
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteId** | **String** |  | [optional] 
**Message** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CancelInviteException = Initialize-PSOpenAPIToolsCancelInviteException  -InviteId null `
 -Message null
```

- Convert the resource to JSON
```powershell
$CancelInviteException | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

