# LinkedBusiness
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Username** | **String** | Username | [optional] 
**ImageSmallUrl** | **String** | image_small_url | [optional] 
**ImageMediumUrl** | **String** | image_medium_url | [optional] 
**ImageLargeUrl** | **String** | image_large_url | [optional] 
**ImageXlargeUrl** | **String** | image_xlarge_url | [optional] 

## Examples

- Prepare the resource
```powershell
$LinkedBusiness = Initialize-PSOpenAPIToolsLinkedBusiness  -Username username `
 -ImageSmallUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -ImageMediumUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -ImageLargeUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -ImageXlargeUrl https://www.example.com/dj23454f53dfk2324.jpg
```

- Convert the resource to JSON
```powershell
$LinkedBusiness | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

