# VideoMetadataWithItemType


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`cover_image_url`** | **`String`** |  | [optional] [default to nothing]
**`duration`** | **`Float64`** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to nothing]
**`height`** | **`Int64`** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to nothing]
**`item_type`** | **`String`** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | [default to nothing]
**`video_url`** | **`String`** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to nothing]
**`video_url_hls`** | **`String`** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] [default to nothing]
**`width`** | **`Int64`** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


