# LabelsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Label[]**](Label.md) |  | 

## Examples

- Prepare the resource
```powershell
$LabelsList200Response = Initialize-PSOpenAPIToolsLabelsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$LabelsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

