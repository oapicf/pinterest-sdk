# PinMedia
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**MediaType** | **String** |  | 
**CoverImageUrl** | **String** |  | [optional] 
**Duration** | **Decimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**Height** | **Int32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**VideoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**Width** | **Int32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**Items** | [**PinMediaMetadata[]**](PinMediaMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMedia = Initialize-PSOpenAPIToolsPinMedia  -Images null `
 -MediaType null `
 -CoverImageUrl null `
 -Duration null `
 -Height null `
 -VideoUrl null `
 -Width null `
 -Items null
```

- Convert the resource to JSON
```powershell
$PinMedia | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

