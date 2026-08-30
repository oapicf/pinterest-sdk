# PinMediaMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] 
**images** | [**OpenAPI\Server\Model\ImageSize**](ImageSize.md) |  | [optional] 
**itemType** | **string** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**link** | **string** |  | [optional] 
**title** | **string** |  | [optional] 
**coverImageUrl** | **string** |  | [optional] 
**duration** | **float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**videoUrl** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**videoUrlHls** | **string** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


