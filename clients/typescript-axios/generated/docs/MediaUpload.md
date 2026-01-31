# MediaUpload

Media upload that has been registered but not uploaded/processed yet.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] [default to undefined]
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | [default to undefined]
**upload_parameters** | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] [readonly] [default to undefined]
**upload_url** | **string** | The URL where you will POST your media file. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { MediaUpload } from './api';

const instance: MediaUpload = {
    media_id,
    media_type,
    upload_parameters,
    upload_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
