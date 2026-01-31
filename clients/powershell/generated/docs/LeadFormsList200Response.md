# LeadFormsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**LeadFormResponse[]**](LeadFormResponse.md) |  | 

## Examples

- Prepare the resource
```powershell
$LeadFormsList200Response = Initialize-PSOpenAPIToolsLeadFormsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$LeadFormsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

