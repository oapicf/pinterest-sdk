# openapi::DynamicTitlesUploadURL


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing_filename** | **character** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] 
**request_id** | **character** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**upload_url** | **character** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 


