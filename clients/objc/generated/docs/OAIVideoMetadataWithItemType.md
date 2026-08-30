# OAIVideoMetadataWithItemType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageUrl** | **NSString*** |  | [optional] 
**duration** | **NSNumber*** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **NSNumber*** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**itemType** | **NSString*** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**videoUrl** | **NSString*** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**videoUrlHls** | **NSString*** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **NSNumber*** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


