# DeletedMembersResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletedMembers** | **String[]** | List of members whose business membership have been terminated. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletedMembersResponse = Initialize-PSOpenAPIToolsDeletedMembersResponse  -DeletedMembers [&quot;809944451643622187&quot;,&quot;383791336903426391&quot;]
```

- Convert the resource to JSON
```powershell
$DeletedMembersResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

