# TemplatesList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**TemplateResponse[]**](TemplateResponse.md) |  | 

## Examples

- Prepare the resource
```powershell
$TemplatesList200Response = Initialize-PSOpenAPIToolsTemplatesList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$TemplatesList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

