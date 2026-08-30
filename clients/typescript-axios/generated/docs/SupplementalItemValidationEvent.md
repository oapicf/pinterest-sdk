# SupplementalItemValidationEvent

Item validation event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute** | **string** | The item attribute referenced by the validation event eg. price, availability, ad_link | [default to undefined]
**code** | **number** | The event code that the item validation event references | [default to undefined]
**message** | **string** | Title message describing the item validation event | [default to undefined]

## Example

```typescript
import { SupplementalItemValidationEvent } from './api';

const instance: SupplementalItemValidationEvent = {
    attribute,
    code,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
