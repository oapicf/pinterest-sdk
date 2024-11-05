# GetBusinessPartners200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UserBusinessRoleBinding[]**](UserBusinessRoleBinding.md) | List of business partners. | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessPartners200Response = Initialize-PSOpenAPIToolsGetBusinessPartners200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$GetBusinessPartners200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

