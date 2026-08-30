# CatalogsAiContentDisclosure
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Disclosure** | [**CatalogsAiContentDisclosureLabel[]**](CatalogsAiContentDisclosureLabel.md) | Disclosure labels that apply to this asset. | 
**Url** | **String** | URL of the asset. Must match one of image_link, additional_image_link, or video_link. | 

## Examples

- Prepare the resource
```powershell
$CatalogsAiContentDisclosure = Initialize-PSOpenAPIToolsCatalogsAiContentDisclosure  -Disclosure [&quot;ai_modified&quot;] `
 -Url https://scene.example.com/image/image_v2.jpg
```

- Convert the resource to JSON
```powershell
$CatalogsAiContentDisclosure | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

