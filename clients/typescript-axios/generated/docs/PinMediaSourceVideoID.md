# PinMediaSourceVideoID

Video ID-based media source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **string** |  | [default to undefined]
**cover_image_url** | **string** | Cover image url. | [optional] [default to undefined]
**cover_image_content_type** | **string** | Content type for cover image Base64. | [optional] [default to undefined]
**cover_image_data** | **string** | Cover image Base64. | [optional] [default to undefined]
**media_id** | **string** |  | [default to undefined]
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]

## Example

```typescript
import { PinMediaSourceVideoID } from './api';

const instance: PinMediaSourceVideoID = {
    source_type,
    cover_image_url,
    cover_image_content_type,
    cover_image_data,
    media_id,
    is_standard,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
