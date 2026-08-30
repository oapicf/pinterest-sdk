# DynamicTitlesUploadURL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existingFilename** | **string** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] 
**requestId** | **string** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**uploadUrl** | **string** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


