# openapi::PinMediaMetadata

Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **character** |  | [optional] 
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**item_type** | **character** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | [Enum: [video]] 
**link** | **character** |  | [optional] 
**title** | **character** |  | [optional] 
**cover_image_url** | **character** |  | [optional] 
**duration** | **numeric** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **integer** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **character** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**video_url_hls** | **character** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **integer** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 


