# AdPreviewSourceImage

Ad preview source from an image URL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | **string** | Image URL. | [default to undefined]
**promotion_id** | **string** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] [default to undefined]
**title** | **string** | Title displayed below ad. | [default to undefined]

## Example

```typescript
import { AdPreviewSourceImage } from './api';

const instance: AdPreviewSourceImage = {
    image_url,
    promotion_id,
    title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
