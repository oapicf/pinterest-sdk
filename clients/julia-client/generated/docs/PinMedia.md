# PinMedia



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: PinMediaWithImage, PinMediaWithImageAndVideo, PinMediaWithImages, PinMediaWithVideo, PinMediaWithVideos | Pin media that can be an image, video, or a mix of both. | [optional] 

The discriminator field is `media_type` with the following mapping:
 - `image`: `PinMediaWithImage`
 - `multiple_images`: `PinMediaWithImages`
 - `multiple_mixed`: `PinMediaWithImageAndVideo`
 - `multiple_videos`: `PinMediaWithVideos`
 - `video`: `PinMediaWithVideo`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


