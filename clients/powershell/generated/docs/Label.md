# Label
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Label ID. | 
**LabelType** | [**NullableLabelType**](NullableLabelType.md) |  | 
**Status** | [**NullableLabelStatus**](NullableLabelStatus.md) |  | [optional] 
**Value** | **String** | Label name. 100-character limit. | 

## Examples

- Prepare the resource
```powershell
$Label = Initialize-PSOpenAPIToolsLabel  -Id 1106385754497 `
 -LabelType null `
 -Status null `
 -Value null
```

- Convert the resource to JSON
```powershell
$Label | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

