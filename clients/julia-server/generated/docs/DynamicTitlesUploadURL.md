# DynamicTitlesUploadURL


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`existing_filename`** | **`String`** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] [default to nothing]
**`request_id`** | **`String`** | Unique identifier for this upload session. Must be passed to the process endpoint. | [default to nothing]
**`upload_url`** | **`String`** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


