# PinMediaWithVideo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | **String** |  | [optional] [default to None]
**duration** | **swagger::Nullable<f64>** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to None]
**height** | **i32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to None]
**images** | [***models::ImageSize**](ImageSize.md) |  | [optional] [default to None]
**media_type** | [***models::PinMediaWithVideoMediaType**](PinMediaWithVideo_media_type.md) |  | 
**video_url** | **swagger::Nullable<String>** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to None]
**video_url_hls** | **swagger::Nullable<String>** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] [default to None]
**width** | **i32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


