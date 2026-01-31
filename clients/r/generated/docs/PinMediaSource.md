# openapi::PinMediaSource

Pin media source that can be an image, video, or a mix of both passed in as a request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | [Enum: ] 
**data** | **character** |  | [Pattern: ^[a-zA-Z0-9+/&#x3D;]+$] 
**is_standard** | **character** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to TRUE] 
**source_type** | **character** |  | [Enum: [pin_url]] 
**url** | **character** |  | 
**cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [Enum: ] 
**cover_image_data** | **character** | Cover image Base64. | [optional] 
**cover_image_key_frame_time** | **integer** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [Min: 0] 
**cover_image_url** | **character** | Cover image URL. | [optional] 
**media_id** | **character** |  | [Pattern: ^\\d+$] 
**index** | **integer** |  | [optional] [Min: 0] 
**items** | [**array[PinMediaSourceImagesURLItem]**](PinMediaSourceImagesURLItem.md) | Array with image objects. | [Max. items: 5] [Min. items: 2] 
**is_affiliate_link** | **character** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to FALSE] 


