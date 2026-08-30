# LocalInventoryOperationResult

Result model for local inventory operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**Array&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to undefined]
**item_id** | **string** | Catalog item id in the merchant namespace | [default to undefined]
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | [default to undefined]
**store_code** | **string** | Store code for the local inventory item | [default to undefined]
**supplemental_type** | **string** |  | [default to undefined]
**warnings** | [**Array&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to undefined]

## Example

```typescript
import { LocalInventoryOperationResult } from './api';

const instance: LocalInventoryOperationResult = {
    errors,
    item_id,
    status,
    store_code,
    supplemental_type,
    warnings,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
