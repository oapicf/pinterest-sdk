# UpdateMemberResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | **String** | The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. | [optional] 
**MemberId** | **String** | Unique identifier of the business member. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateMemberResult = Initialize-PSOpenAPIToolsUpdateMemberResult  -BusinessRole EMPLOYEE `
 -MemberId 140943737684417
```

- Convert the resource to JSON
```powershell
$UpdateMemberResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

