# DynamicTitlesUploadUrl

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing_filename** | **String** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] [default to None]
**request_id** | **String** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**upload_url** | **String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


