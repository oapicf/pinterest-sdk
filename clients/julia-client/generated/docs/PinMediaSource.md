# PinMediaSource



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: PinMediaSourceImageBase64, PinMediaSourceImageURL, PinMediaSourceImagesBase64, PinMediaSourceImagesURL, PinMediaSourcePinURL, PinMediaSourceVideoID | Pin media source that can be an image, video, or a mix of both passed in as a request. | [optional] 

The discriminator field is `source_type` with the following mapping:
 - `image_base64`: `PinMediaSourceImageBase64`
 - `image_url`: `PinMediaSourceImageURL`
 - `multiple_image_base64`: `PinMediaSourceImagesBase64`
 - `multiple_image_urls`: `PinMediaSourceImagesURL`
 - `pin_url`: `PinMediaSourcePinURL`
 - `video_id`: `PinMediaSourceVideoID`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


