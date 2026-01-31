# CatalogsDeleteRetailItem

An item to be deleted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | [default to undefined]
**last_updated_time** | **number** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] [default to undefined]
**operation** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsDeleteRetailItem } from './api';

const instance: CatalogsDeleteRetailItem = {
    item_id,
    last_updated_time,
    operation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
