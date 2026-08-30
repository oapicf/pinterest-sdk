# DeleteBusinessMembershipMember
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 
**MemberId** | **String** | Unique identifier of the member | 

## Examples

- Prepare the resource
```powershell
$DeleteBusinessMembershipMember = Initialize-PSOpenAPIToolsDeleteBusinessMembershipMember  -BusinessRole null `
 -MemberId 140943737684417
```

- Convert the resource to JSON
```powershell
$DeleteBusinessMembershipMember | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

