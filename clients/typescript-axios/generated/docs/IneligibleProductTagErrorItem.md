# IneligibleProductTagErrorItem

Error item for a product tag that failed eligibility check.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_message** | [**IneligibleProductTagReason**](IneligibleProductTagReason.md) | Reason why the pin is ineligible for tagging. | [default to undefined]
**pin_id** | **string** | Pin ID that failed eligibility check. | [default to undefined]

## Example

```typescript
import { IneligibleProductTagErrorItem } from './api';

const instance: IneligibleProductTagErrorItem = {
    error_message,
    pin_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
