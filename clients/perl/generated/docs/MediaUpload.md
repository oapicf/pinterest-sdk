# WWW::OpenAPIClient::Object::MediaUpload

## Load the model package
```perl
use WWW::OpenAPIClient::Object::MediaUpload;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | 
**upload_parameters** | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] [readonly] 
**upload_url** | **string** | The URL where you will POST your media file. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


