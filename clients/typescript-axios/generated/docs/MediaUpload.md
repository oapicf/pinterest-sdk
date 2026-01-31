# MediaUpload

Media upload that has been registered but not uploaded/processed yet.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [optional] [default to undefined]
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | [optional] [default to undefined]
**upload_url** | **string** | The URL where you will POST your media file. | [optional] [default to undefined]
**upload_parameters** | [**MediaUploadAllOfUploadParameters**](MediaUploadAllOfUploadParameters.md) |  | [optional] [default to undefined]

## Example

```typescript
import { MediaUpload } from './api';

const instance: MediaUpload = {
    media_id,
    media_type,
    upload_url,
    upload_parameters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
