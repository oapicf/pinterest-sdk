# AdPreviewRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageUrl** | **String** | Image URL. | 
**Title** | **String** | Title displayed below ad. | 
**PinId** | **String** | Pin ID. | 

## Examples

- Prepare the resource
```powershell
$AdPreviewRequest = Initialize-PSOpenAPIToolsAdPreviewRequest  -ImageUrl https://somewebsite.com/someimage.jpg `
 -Title My Preview Image `
 -PinId 7389479023
```

- Convert the resource to JSON
```powershell
$AdPreviewRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

