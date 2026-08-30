# ProductTagsError

Error response for requests containing ineligible product tags.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **number** |  | [default to undefined]
**details** | [**IneligibleProductTagsErrorDetails**](IneligibleProductTagsErrorDetails.md) | Details about which product tags failed eligibility check. | [optional] [default to undefined]
**message** | **string** |  | [default to undefined]

## Example

```typescript
import { ProductTagsError } from './api';

const instance: ProductTagsError = {
    code,
    details,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
