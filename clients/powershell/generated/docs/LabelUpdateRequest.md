# LabelUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**LabelUpdateRequestLabelsInner[]**](LabelUpdateRequestLabelsInner.md) | Labels that you are applying to the campaign. | 

## Examples

- Prepare the resource
```powershell
$LabelUpdateRequest = Initialize-PSOpenAPIToolsLabelUpdateRequest  -Labels null
```

- Convert the resource to JSON
```powershell
$LabelUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

