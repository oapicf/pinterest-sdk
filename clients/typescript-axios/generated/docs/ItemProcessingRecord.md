# ItemProcessingRecord

Object describing an item processing record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to undefined]
**warnings** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to undefined]
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ItemProcessingRecord } from './api';

const instance: ItemProcessingRecord = {
    item_id,
    errors,
    warnings,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
