# PinMediaSourceVideoID

Video ID-based media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [default to undefined]
**cover_image_data** | **string** | Cover image Base64. | [optional] [default to undefined]
**cover_image_key_frame_time** | **number** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [default to undefined]
**cover_image_url** | **string** | Cover image URL. | [optional] [default to undefined]
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**media_id** | **string** |  | [default to undefined]
**source_type** | **string** |  | [default to undefined]

## Example

```typescript
import { PinMediaSourceVideoID } from './api';

const instance: PinMediaSourceVideoID = {
    cover_image_content_type,
    cover_image_data,
    cover_image_key_frame_time,
    cover_image_url,
    is_standard,
    media_id,
    source_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
