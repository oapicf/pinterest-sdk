# CatalogsAiContentDisclosure

AI content disclosure for a single asset of a catalog item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disclosure** | [**Array&lt;CatalogsAiContentDisclosureLabel&gt;**](CatalogsAiContentDisclosureLabel.md) | Disclosure labels that apply to this asset. | [default to undefined]
**url** | **string** | URL of the asset. Must match one of image_link, additional_image_link, or video_link. | [default to undefined]

## Example

```typescript
import { CatalogsAiContentDisclosure } from './api';

const instance: CatalogsAiContentDisclosure = {
    disclosure,
    url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
