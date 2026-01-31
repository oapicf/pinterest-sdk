# openapi::PinMedia

Pin media that can be an image, video, or a mix of both.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**media_type** | **character** |  | [Enum: [multiple_mixed]] 
**cover_image_url** | **character** |  | [optional] 
**duration** | **numeric** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **integer** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **character** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **integer** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**items** | [**array[PinMediaMetadata]**](PinMediaMetadata.md) |  | [optional] 


