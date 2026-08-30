# LabelBulkCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | [**LabelCreateItem[]**](LabelCreateItem.md) | Labels that you are applying to the campaign. | 
**ParentId** | **String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 

## Examples

- Prepare the resource
```powershell
$LabelBulkCreateRequest = Initialize-PSOpenAPIToolsLabelBulkCreateRequest  -Labels null `
 -ParentId null
```

- Convert the resource to JSON
```powershell
$LabelBulkCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

