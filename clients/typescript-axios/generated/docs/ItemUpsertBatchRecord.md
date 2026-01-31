# ItemUpsertBatchRecord

Object describing an item batch record to upsert items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] [default to undefined]
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]

## Example

```typescript
import { ItemUpsertBatchRecord } from './api';

const instance: ItemUpsertBatchRecord = {
    attributes,
    item_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
