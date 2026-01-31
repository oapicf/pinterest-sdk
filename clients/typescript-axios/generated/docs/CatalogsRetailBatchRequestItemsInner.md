# CatalogsRetailBatchRequestItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [default to undefined]
**item_id** | **string** | The catalog item id in the merchant namespace | [default to undefined]
**operation** | **string** |  | [default to undefined]
**update_mask** | [**Array&lt;UpdateMaskFieldType&gt;**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to undefined]
**last_updated_time** | **number** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsRetailBatchRequestItemsInner } from './api';

const instance: CatalogsRetailBatchRequestItemsInner = {
    attributes,
    item_id,
    operation,
    update_mask,
    last_updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
