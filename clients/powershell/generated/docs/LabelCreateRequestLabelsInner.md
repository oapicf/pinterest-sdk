# LabelCreateRequestLabelsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LabelType** | [**LabelType**](LabelType.md) |  | 
**Value** | **String** | Label name. 100-character limit. | 

## Examples

- Prepare the resource
```powershell
$LabelCreateRequestLabelsInner = Initialize-PSOpenAPIToolsLabelCreateRequestLabelsInner  -LabelType null `
 -Value null
```

- Convert the resource to JSON
```powershell
$LabelCreateRequestLabelsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

