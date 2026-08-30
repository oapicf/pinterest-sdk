# PinMediaWithVideo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | Option<**String**> |  | [optional]
**duration** | Option<**f64**> | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional]
**height** | Option<**i32**> | Height (in pixels). Field maybe null after creation due to video processing time. | [optional]
**images** | Option<[**models::ImageSize**](ImageSize.md)> |  | [optional]
**media_type** | **MediaType** |  (enum: video) | 
**video_url** | Option<**String**> | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional]
**video_url_hls** | Option<**String**> | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional]
**width** | Option<**i32**> | Width (in pixels). Field maybe null after creation due to video processing time. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


