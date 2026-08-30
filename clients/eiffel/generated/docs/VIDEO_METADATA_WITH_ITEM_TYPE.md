# VIDEO_METADATA_WITH_ITEM_TYPE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**duration** | **REAL_32** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to null]
**height** | **INTEGER_32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to null]
**item_type** | [**STRING_32**](STRING_32.md) | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | [default to null]
**video_url** | [**STRING_32**](STRING_32.md) | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to null]
**video_url_hls** | [**STRING_32**](STRING_32.md) | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] [default to null]
**width** | **INTEGER_32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


