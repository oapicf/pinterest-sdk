# pin_media_metadata_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **char \*** |  | [optional] 
**images** | [**image_size_t**](image_size.md) \* |  | [optional] 
**item_type** | **pinterest_rest_api_pin_media_metadata_ITEMTYPE_e** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**link** | **char \*** |  | [optional] 
**title** | **char \*** |  | [optional] 
**cover_image_url** | **char \*** |  | [optional] 
**duration** | **double** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **char \*** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**video_url_hls** | **char \*** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


