# LabelCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**LabelCreateRequestLabelsInner[]**](LabelCreateRequestLabelsInner.md) | Labels that you are applying to the campaign. | 
**ParentId** | **String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 

## Examples

- Prepare the resource
```powershell
$LabelCreateRequest = Initialize-PSOpenAPIToolsLabelCreateRequest  -Labels null `
 -ParentId 626753052072
```

- Convert the resource to JSON
```powershell
$LabelCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

