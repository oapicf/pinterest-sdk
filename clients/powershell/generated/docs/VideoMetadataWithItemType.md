# VideoMetadataWithItemType
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CoverImageUrl** | **String** |  | [optional] 
**Duration** | **Decimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**Height** | **Int32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**ItemType** | **String** |  | [optional] 
**VideoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**Width** | **Int32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

## Examples

- Prepare the resource
```powershell
$VideoMetadataWithItemType = Initialize-PSOpenAPIToolsVideoMetadataWithItemType  -CoverImageUrl null `
 -Duration null `
 -Height null `
 -ItemType null `
 -VideoUrl null `
 -Width null
```

- Convert the resource to JSON
```powershell
$VideoMetadataWithItemType | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

