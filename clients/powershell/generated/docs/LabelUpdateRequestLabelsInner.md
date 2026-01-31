# LabelUpdateRequestLabelsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Label ID. | 
**Status** | [**LabelStatus**](LabelStatus.md) |  | [optional] 
**Value** | **String** | Label name. 100-character limit. | [optional] 

## Examples

- Prepare the resource
```powershell
$LabelUpdateRequestLabelsInner = Initialize-PSOpenAPIToolsLabelUpdateRequestLabelsInner  -Id 1106385754497 `
 -Status null `
 -Value null
```

- Convert the resource to JSON
```powershell
$LabelUpdateRequestLabelsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

