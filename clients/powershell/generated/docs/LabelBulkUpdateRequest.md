# LabelBulkUpdateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Label ID. | 
**Status** | **String** | Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity. | [optional] 
**Value** | **String** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit. | [optional] 

## Examples

- Prepare the resource
```powershell
$LabelBulkUpdateRequest = Initialize-PSOpenAPIToolsLabelBulkUpdateRequest  -Id 1106385754497 `
 -Status ARCHIVED `
 -Value null
```

- Convert the resource to JSON
```powershell
$LabelBulkUpdateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

