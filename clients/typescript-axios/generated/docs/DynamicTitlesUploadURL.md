# DynamicTitlesUploadURL


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing_filename** | **string** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] [default to undefined]
**request_id** | **string** | Unique identifier for this upload session. Must be passed to the process endpoint. | [default to undefined]
**upload_url** | **string** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | [default to undefined]

## Example

```typescript
import { DynamicTitlesUploadURL } from './api';

const instance: DynamicTitlesUploadURL = {
    existing_filename,
    request_id,
    upload_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
