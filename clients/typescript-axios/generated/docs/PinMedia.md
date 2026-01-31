# PinMedia

Pin media that can be an image, video, or a mix of both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  | [optional] [default to undefined]
**media_type** | **string** |  | [default to undefined]
**cover_image_url** | **string** |  | [optional] [default to undefined]
**duration** | **number** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**height** | **number** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**video_url** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to undefined]
**width** | **number** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**items** | [**Array&lt;PinMediaMetadata&gt;**](PinMediaMetadata.md) |  | [optional] [default to undefined]

## Example

```typescript
import { PinMedia } from './api';

const instance: PinMedia = {
    images,
    media_type,
    cover_image_url,
    duration,
    height,
    video_url,
    width,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
