# DynamicTitlesUploadUrl

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing_filename** | Option<**String**> | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional]
**request_id** | **String** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**upload_url** | **String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


