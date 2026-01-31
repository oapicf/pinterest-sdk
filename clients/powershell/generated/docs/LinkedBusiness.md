# LinkedBusiness
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageLargeUrl** | **String** | image_large_url | [optional] 
**ImageMediumUrl** | **String** | image_medium_url | [optional] 
**ImageSmallUrl** | **String** | image_small_url | [optional] 
**ImageXlargeUrl** | **String** | image_xlarge_url | [optional] 
**Username** | **String** | Username | [optional] 

## Examples

- Prepare the resource
```powershell
$LinkedBusiness = Initialize-PSOpenAPIToolsLinkedBusiness  -ImageLargeUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -ImageMediumUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -ImageSmallUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -ImageXlargeUrl https://www.example.com/dj23454f53dfk2324.jpg `
 -Username username
```

- Convert the resource to JSON
```powershell
$LinkedBusiness | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

