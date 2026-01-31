# AdvancedAuctionItemsSubmitDeleteRecord

Object describing an item bid option deletion operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog retail item id in the merchant namespace | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**language** | [**Language**](Language.md) |  | [default to undefined]

## Example

```typescript
import { AdvancedAuctionItemsSubmitDeleteRecord } from './api';

const instance: AdvancedAuctionItemsSubmitDeleteRecord = {
    item_id,
    country,
    language,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
