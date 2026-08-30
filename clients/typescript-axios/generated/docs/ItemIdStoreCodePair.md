# ItemIdStoreCodePair

A pair of item_id and store_code that uniquely identifies a local inventory item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | Catalog item id in the merchant namespace | [default to undefined]
**store_code** | **string** | Store code for the local inventory item | [default to undefined]

## Example

```typescript
import { ItemIdStoreCodePair } from './api';

const instance: ItemIdStoreCodePair = {
    item_id,
    store_code,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
