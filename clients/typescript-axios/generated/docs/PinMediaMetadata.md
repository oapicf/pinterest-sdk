# PinMediaMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] [default to undefined]
**images** | [**ImageSize**](ImageSize.md) |  | [optional] [default to undefined]
**item_type** | **string** |  | [optional] [default to undefined]
**link** | **string** |  | [optional] [default to undefined]
**title** | **string** |  | [optional] [default to undefined]
**cover_image_url** | **string** |  | [optional] [default to undefined]
**duration** | **number** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**height** | **number** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to undefined]
**video_url** | **string** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] [default to undefined]
**width** | **number** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] [default to undefined]

## Example

```typescript
import { PinMediaMetadata } from './api';

const instance: PinMediaMetadata = {
    description,
    images,
    item_type,
    link,
    title,
    cover_image_url,
    duration,
    height,
    video_url,
    width,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
