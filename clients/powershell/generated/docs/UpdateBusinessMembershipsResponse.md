# UpdateBusinessMembershipsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**BusinessMembershipMember[]**](BusinessMembershipMember.md) | List of members with updated business access role. | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateBusinessMembershipsResponse = Initialize-PSOpenAPIToolsUpdateBusinessMembershipsResponse  -Items null
```

- Convert the resource to JSON
```powershell
$UpdateBusinessMembershipsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

