# PinMediaWithVideo

Pin with video.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | **string** |  | [optional] [default to undefined]
**duration** | **number** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**height** | **number** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**images** | [**ImageSize**](ImageSize.md) |  | [optional] [default to undefined]
**media_type** | **string** |  | [default to undefined]
**video_url** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to undefined]
**video_url_hls** | **string** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] [default to undefined]
**width** | **number** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to undefined]

## Example

```typescript
import { PinMediaWithVideo } from './api';

const instance: PinMediaWithVideo = {
    cover_image_url,
    duration,
    height,
    images,
    media_type,
    video_url,
    video_url_hls,
    width,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
