# GetBusinessMembers200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UserBusinessRoleBinding[]**](UserBusinessRoleBinding.md) | List of business members. | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessMembers200Response = Initialize-PSOpenAPIToolsGetBusinessMembers200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$GetBusinessMembers200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

