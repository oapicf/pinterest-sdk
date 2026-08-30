
# DynamicTitlesUploadURL

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | **kotlin.String** | Unique identifier for this upload session. Must be passed to the process endpoint. |  |
| **uploadUrl** | **kotlin.String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. |  |
| **existingFilename** | **kotlin.String** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. |  [optional] |



