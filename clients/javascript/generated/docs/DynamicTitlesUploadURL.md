# PinterestSdk.DynamicTitlesUploadURL

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existingFilename** | **String** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] 
**requestId** | **String** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**uploadUrl** | **String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 


