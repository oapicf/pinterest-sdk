# pin_media_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**image_size_t**](image_size.md) \* |  | [optional] 
**media_type** | **pinterest_rest_api_pin_media_MEDIATYPE_e** |  | 
**cover_image_url** | **char \*** |  | [optional] 
**duration** | **double** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **char \*** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**items** | [**list_t**](pin_media_metadata.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


