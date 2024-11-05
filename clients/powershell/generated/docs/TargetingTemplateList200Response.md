# TargetingTemplateList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**TargetingTemplateResponseData[]**](TargetingTemplateResponseData.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateList200Response = Initialize-PSOpenAPIToolsTargetingTemplateList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$TargetingTemplateList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

