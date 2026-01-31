# WWW::OpenAPIClient::Object::PinMedia

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PinMedia;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**media_type** | **string** |  | 
**cover_image_url** | **string** |  | [optional] 
**duration** | **double** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**items** | [**ARRAY[PinMediaMetadata]**](PinMediaMetadata.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


