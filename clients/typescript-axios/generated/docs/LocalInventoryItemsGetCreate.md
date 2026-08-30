# LocalInventoryItemsGetCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_filters** | [**Array&lt;ItemIdStoreCodePair&gt;**](ItemIdStoreCodePair.md) | Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. | [default to undefined]

## Example

```typescript
import { LocalInventoryItemsGetCreate } from './api';

const instance: LocalInventoryItemsGetCreate = {
    item_filters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
