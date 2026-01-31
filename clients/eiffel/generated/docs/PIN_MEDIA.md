# PIN_MEDIA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**IMAGE_SIZE**](ImageSize.md) |  | [optional] [default to null]
**media_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**cover_image_url** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**duration** | **REAL_32** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to null]
**height** | **INTEGER_32** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to null]
**video_url** | [**STRING_32**](STRING_32.md) | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to null]
**width** | **INTEGER_32** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to null]
**items** | [**LIST [PIN_MEDIA_METADATA]**](PinMediaMetadata.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


