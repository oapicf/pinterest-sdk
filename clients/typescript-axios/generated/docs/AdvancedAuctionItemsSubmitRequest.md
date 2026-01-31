# AdvancedAuctionItemsSubmitRequest

Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to all items | [default to undefined]
**items** | [**Array&lt;AdvancedAuctionItemsSubmitRecord&gt;**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations | [default to undefined]

## Example

```typescript
import { AdvancedAuctionItemsSubmitRequest } from './api';

const instance: AdvancedAuctionItemsSubmitRequest = {
    catalog_id,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
