# openapi::VideoMetadataWithItemType


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | **character** |  | [optional] 
**duration** | **numeric** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **integer** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**item_type** | **character** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | [Enum: [video]] 
**video_url** | **character** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**video_url_hls** | **character** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **integer** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 


