# LabelErrorData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Label ID. | [optional] 
**LabelType** | [**NullableLabelType**](NullableLabelType.md) |  | [optional] 
**Status** | [**NullableLabelStatus**](NullableLabelStatus.md) |  | [optional] 
**Value** | **String** | Label name. 100-character limit. | [optional] 

## Examples

- Prepare the resource
```powershell
$LabelErrorData = Initialize-PSOpenAPIToolsLabelErrorData  -Id 1106385754497 `
 -LabelType null `
 -Status null `
 -Value null
```

- Convert the resource to JSON
```powershell
$LabelErrorData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

