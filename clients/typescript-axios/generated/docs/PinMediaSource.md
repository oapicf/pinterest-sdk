# PinMediaSource

Pin media source that can be an image, video, or a mix of both passed in as a request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | [default to undefined]
**data** | **string** |  | [default to undefined]
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**source_type** | **string** |  | [default to undefined]
**url** | **string** |  | [default to undefined]
**cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] [default to undefined]
**cover_image_data** | **string** | Cover image Base64. | [optional] [default to undefined]
**cover_image_key_frame_time** | **number** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] [default to undefined]
**cover_image_url** | **string** | Cover image URL. | [optional] [default to undefined]
**media_id** | **string** |  | [default to undefined]
**index** | **number** |  | [optional] [default to undefined]
**items** | [**Array&lt;PinMediaSourceImagesURLItem&gt;**](PinMediaSourceImagesURLItem.md) | Array with image objects. | [default to undefined]
**is_affiliate_link** | **boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

## Example

```typescript
import { PinMediaSource } from './api';

const instance: PinMediaSource = {
    content_type,
    data,
    is_standard,
    source_type,
    url,
    cover_image_content_type,
    cover_image_data,
    cover_image_key_frame_time,
    cover_image_url,
    media_id,
    index,
    items,
    is_affiliate_link,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
