# CatalogsHotelMainImage
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Link** | **String** | &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. | [optional] 
**Tag** | **String[]** | Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelMainImage = Initialize-PSOpenAPIToolsCatalogsHotelMainImage  -Link null `
 -Tag null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelMainImage | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

