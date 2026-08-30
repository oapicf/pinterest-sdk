# ImageMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** |  | [optional] [default to undefined]
**images** | [**ImageSize**](ImageSize.md) |  | [optional] [default to undefined]
**item_type** | **string** | Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload. | [default to undefined]
**link** | **string** |  | [optional] [default to undefined]
**title** | **string** |  | [optional] [default to undefined]

## Example

```typescript
import { ImageMetadata } from './api';

const instance: ImageMetadata = {
    description,
    images,
    item_type,
    link,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
