# AdvancedAuctionItemsSubmitDeleteRecord

Object describing an item bid option deletion operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [default to undefined]
**item_id** | **string** | The catalog retail item id in the merchant namespace | [default to undefined]
**language** | [**Language**](Language.md) |  | [default to undefined]
**errors** | [**Array&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] [default to undefined]

## Example

```typescript
import { AdvancedAuctionItemsSubmitDeleteRecord } from './api';

const instance: AdvancedAuctionItemsSubmitDeleteRecord = {
    country,
    item_id,
    language,
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
