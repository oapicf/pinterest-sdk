# LabelCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**LabelCreateItem[]**](LabelCreateItem.md) | Labels that you are applying to the campaign. | 

## Examples

- Prepare the resource
```powershell
$LabelCreateRequest = Initialize-PSOpenAPIToolsLabelCreateRequest  -Labels null
```

- Convert the resource to JSON
```powershell
$LabelCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

