# MembersToDeleteBodyMembersInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MemberId** | **String** | Unique identifier of the member | 
**BusinessRole** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 

## Examples

- Prepare the resource
```powershell
$MembersToDeleteBodyMembersInner = Initialize-PSOpenAPIToolsMembersToDeleteBodyMembersInner  -MemberId 140943737684417 `
 -BusinessRole null
```

- Convert the resource to JSON
```powershell
$MembersToDeleteBodyMembersInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

