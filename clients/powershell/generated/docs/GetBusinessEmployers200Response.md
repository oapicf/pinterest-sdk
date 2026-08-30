# GetBusinessEmployers200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**UserBusinessRoleBinding[]**](UserBusinessRoleBinding.md) |  | 

## Examples

- Prepare the resource
```powershell
$GetBusinessEmployers200Response = Initialize-PSOpenAPIToolsGetBusinessEmployers200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$GetBusinessEmployers200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

