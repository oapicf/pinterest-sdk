# Media


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **string** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] [default to undefined]
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | [default to undefined]
**status** | [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional] [readonly] [default to undefined]

## Example

```typescript
import { Media } from './api';

const instance: Media = {
    media_id,
    media_type,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
