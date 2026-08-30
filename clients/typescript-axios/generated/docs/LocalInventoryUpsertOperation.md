# LocalInventoryUpsertOperation

Upsert operation for local inventory item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**RetailLocalInventoryItemAttributes**](RetailLocalInventoryItemAttributes.md) |  | [default to undefined]
**item_id** | **string** | Catalog item id in the merchant namespace | [default to undefined]
**operation** | **string** |  | [default to undefined]
**store_code** | **string** | Store code for the local inventory item | [default to undefined]

## Example

```typescript
import { LocalInventoryUpsertOperation } from './api';

const instance: LocalInventoryUpsertOperation = {
    attributes,
    item_id,
    operation,
    store_code,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
