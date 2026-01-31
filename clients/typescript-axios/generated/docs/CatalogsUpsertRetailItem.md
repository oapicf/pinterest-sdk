# CatalogsUpsertRetailItem

An item to be upserted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | [default to undefined]
**operation** | **string** |  | [default to undefined]
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [default to undefined]

## Example

```typescript
import { CatalogsUpsertRetailItem } from './api';

const instance: CatalogsUpsertRetailItem = {
    item_id,
    operation,
    attributes,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
