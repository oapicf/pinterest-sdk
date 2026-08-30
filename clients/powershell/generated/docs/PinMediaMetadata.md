# PinMediaMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | [optional] 
**Images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**ItemType** | **String** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**Link** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**CoverImageUrl** | **String** |  | [optional] 
**Duration** | **Decimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**Height** | **Int32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**VideoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**VideoUrlHls** | **String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**Width** | **Int32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaMetadata = Initialize-PSOpenAPIToolsPinMediaMetadata  -Description null `
 -Images null `
 -ItemType null `
 -Link null `
 -Title null `
 -CoverImageUrl null `
 -Duration null `
 -Height null `
 -VideoUrl null `
 -VideoUrlHls null `
 -Width null
```

- Convert the resource to JSON
```powershell
$PinMediaMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

