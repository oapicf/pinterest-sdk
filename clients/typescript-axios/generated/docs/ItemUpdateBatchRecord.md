# ItemUpdateBatchRecord

Object describing an item batch record to update items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | [optional] [default to undefined]
**update_mask** | [**Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to undefined]

## Example

```typescript
import { ItemUpdateBatchRecord } from './api';

const instance: ItemUpdateBatchRecord = {
    item_id,
    attributes,
    update_mask,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
