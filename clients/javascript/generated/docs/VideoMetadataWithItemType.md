# PinterestSdk.VideoMetadataWithItemType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageUrl** | **String** |  | [optional] 
**duration** | **Number** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **Number** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**itemType** | **String** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**videoUrlHls** | **String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **Number** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 



## Enum: ItemTypeEnum


* `video` (value: `"video"`)




