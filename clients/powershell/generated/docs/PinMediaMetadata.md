# PinMediaMetadata
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | **String** |  | [optional] 
**Title** | **String** |  | [optional] 
**Description** | **String** |  | [optional] 
**Link** | **String** |  | [optional] 
**Images** | [**ImageMetadataImages**](ImageMetadataImages.md) |  | [optional] 
**CoverImageUrl** | **String** |  | [optional] 
**VideoUrl** | **String** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. | [optional] 
**Duration** | **Decimal** | Duration (in milliseconds) | [optional] 
**Height** | **Int32** | Height (in pixels) | [optional] 
**Width** | **Int32** | Width (in pixels) | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaMetadata = Initialize-PSOpenAPIToolsPinMediaMetadata  -ItemType null `
 -Title null `
 -Description null `
 -Link null `
 -Images null `
 -CoverImageUrl null `
 -VideoUrl null `
 -Duration null `
 -Height null `
 -Width null
```

- Convert the resource to JSON
```powershell
$PinMediaMetadata | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

