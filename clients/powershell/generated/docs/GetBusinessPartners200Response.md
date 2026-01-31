# GetBusinessPartners200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**UserBusinessRoleBinding[]**](UserBusinessRoleBinding.md) | List of business partners. | 

## Examples

- Prepare the resource
```powershell
$GetBusinessPartners200Response = Initialize-PSOpenAPIToolsGetBusinessPartners200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$GetBusinessPartners200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

