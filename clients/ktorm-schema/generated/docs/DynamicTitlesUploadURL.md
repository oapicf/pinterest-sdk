
# Table `DynamicTitlesUploadURL`
(mapped from: DynamicTitlesUploadURL)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**requestId** | request_id | text NOT NULL |  | **kotlin.String** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**uploadUrl** | upload_url | text NOT NULL |  | **kotlin.String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 
**existingFilename** | existing_filename | text |  | **kotlin.String** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. |  [optional]





