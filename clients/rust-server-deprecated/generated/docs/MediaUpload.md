# MediaUpload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **String** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**media_type** | [***models::MediaUploadType**](MediaUploadType.md) |  | 
**upload_parameters** | [***models::MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] [readonly] [default to None]
**upload_url** | **String** | The URL where you will POST your media file. | [optional] [readonly] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


