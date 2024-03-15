# AdPreviewCreateFromImage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageUrl** | **String** | Image URL. | 
**Title** | **String** | Title displayed below ad. | 

## Examples

- Prepare the resource
```powershell
$AdPreviewCreateFromImage = Initialize-PSOpenAPIToolsAdPreviewCreateFromImage  -ImageUrl https://somewebsite.com/someimage.jpg `
 -Title My Preview Image
```

- Convert the resource to JSON
```powershell
$AdPreviewCreateFromImage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

