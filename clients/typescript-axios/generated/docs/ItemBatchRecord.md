# ItemBatchRecord

Object describing an item batch record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] [default to undefined]
**update_mask** | [**Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to undefined]

## Example

```typescript
import { ItemBatchRecord } from './api';

const instance: ItemBatchRecord = {
    item_id,
    attributes,
    update_mask,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
