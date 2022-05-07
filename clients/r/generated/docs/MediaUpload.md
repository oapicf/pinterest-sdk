# openapi::MediaUpload

Media upload that has been registered but not uploaded/processed yet.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **character** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [optional] 
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | [optional] 
**upload_url** | **character** | The URL where you will POST your media file. | [optional] 
**upload_parameters** | [**MediaUploadAllOfUploadParameters**](MediaUpload_allOf_upload_parameters.md) |  | [optional] 


