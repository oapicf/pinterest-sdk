# Org.OpenAPITools.Model.MediaUpload
Media upload that has been registered but not uploaded/processed yet.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaId** | **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**MediaType** | **MediaUploadType** |  | 
**UploadParameters** | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] [readonly] 
**UploadUrl** | **string** | The URL where you will POST your media file. | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

