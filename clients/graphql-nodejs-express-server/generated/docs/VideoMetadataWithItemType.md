# VideoMetadataWithItemType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverImageUrl** | **String!** |  | [optional] [default to null]
**duration** | **Float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to null]
**height** | **Int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to null]
**itemType** | **String!** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | [default to null]
**videoUrl** | **String** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to null]
**videoUrlHls** | **String** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] [default to null]
**width** | **Int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


