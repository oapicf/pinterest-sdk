# VideoMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_type** | **string** |  | [optional] [default to undefined]
**cover_image_url** | **string** |  | [optional] [default to undefined]
**video_url** | **string** | Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps. | [optional] [default to undefined]
**duration** | **number** | Duration (in milliseconds) | [optional] [default to undefined]
**height** | **number** | Height (in pixels) | [optional] [default to undefined]
**width** | **number** | Width (in pixels) | [optional] [default to undefined]

## Example

```typescript
import { VideoMetadata } from './api';

const instance: VideoMetadata = {
    item_type,
    cover_image_url,
    video_url,
    duration,
    height,
    width,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
