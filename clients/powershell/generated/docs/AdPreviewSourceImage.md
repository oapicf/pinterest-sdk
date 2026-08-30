# AdPreviewSourceImage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageUrl** | **String** | Image URL. | 
**PromotionId** | **String** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] 
**Title** | **String** | Title displayed below ad. | 

## Examples

- Prepare the resource
```powershell
$AdPreviewSourceImage = Initialize-PSOpenAPIToolsAdPreviewSourceImage  -ImageUrl https://somewebsite.com/someimage.jpg `
 -PromotionId 7834020404549 `
 -Title My Preview Image
```

- Convert the resource to JSON
```powershell
$AdPreviewSourceImage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

