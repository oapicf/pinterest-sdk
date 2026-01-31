# ItemCreateBatchRecord

Object describing an item batch record to create items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | [optional] [default to undefined]
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ItemCreateBatchRecord } from './api';

const instance: ItemCreateBatchRecord = {
    item_id,
    attributes,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
