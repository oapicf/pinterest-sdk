# PinMediaSource

Pin media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **string** |  | [default to undefined]
**content_type** | **string** |  | [default to undefined]
**data** | **string** |  | [default to undefined]
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**url** | **string** |  | [default to undefined]
**cover_image_url** | **string** | Cover image url. | [optional] [default to undefined]
**cover_image_content_type** | **string** | Content type for cover image Base64. | [optional] [default to undefined]
**cover_image_data** | **string** | Cover image Base64. | [optional] [default to undefined]
**media_id** | **string** |  | [default to undefined]
**items** | [**Array&lt;PinMediaSourceImagesURLItemsInner&gt;**](PinMediaSourceImagesURLItemsInner.md) | Array with image objects. | [default to undefined]
**index** | **number** |  | [optional] [default to undefined]
**is_affiliate_link** | **boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]

## Example

```typescript
import { PinMediaSource } from './api';

const instance: PinMediaSource = {
    source_type,
    content_type,
    data,
    is_standard,
    url,
    cover_image_url,
    cover_image_content_type,
    cover_image_data,
    media_id,
    items,
    index,
    is_affiliate_link,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
