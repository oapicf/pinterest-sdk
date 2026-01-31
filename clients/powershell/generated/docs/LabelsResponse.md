# LabelsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**LabelError[]**](LabelError.md) | Labels that were not successfully applied. | [optional] 
**Labels** | [**Label[]**](Label.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$LabelsResponse = Initialize-PSOpenAPIToolsLabelsResponse  -Errors null `
 -Labels null
```

- Convert the resource to JSON
```powershell
$LabelsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

