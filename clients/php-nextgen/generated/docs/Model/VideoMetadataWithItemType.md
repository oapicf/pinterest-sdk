# VideoMetadataWithItemType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | **string** |  | [optional]
**duration** | **float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional]
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional]
**item_type** | **string** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. |
**video_url** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional]
**video_url_hls** | **string** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional]
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
