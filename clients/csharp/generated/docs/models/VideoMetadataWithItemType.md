# Org.OpenAPITools.Model.VideoMetadataWithItemType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemType** | **string** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**CoverImageUrl** | **string** |  | [optional] 
**Duration** | **decimal** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**Height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**VideoUrl** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**VideoUrlHls** | **string** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**Width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

