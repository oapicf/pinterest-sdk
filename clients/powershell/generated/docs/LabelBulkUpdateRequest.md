# LabelBulkUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Label ID. | 
**ParentId** | **String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 
**Status** | [**LabelStatusBulkUpdate**](LabelStatusBulkUpdate.md) |  | 

## Examples

- Prepare the resource
```powershell
$LabelBulkUpdateRequest = Initialize-PSOpenAPIToolsLabelBulkUpdateRequest  -Id null `
 -ParentId null `
 -Status null
```

- Convert the resource to JSON
```powershell
$LabelBulkUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

