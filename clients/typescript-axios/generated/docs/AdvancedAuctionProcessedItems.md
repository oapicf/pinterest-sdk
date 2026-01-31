# AdvancedAuctionProcessedItems

Response object containing the results of an operation on an item bid option

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to all items | [optional] [default to undefined]
**items** | [**Array&lt;AdvancedAuctionItemsSubmitRecord&gt;**](AdvancedAuctionItemsSubmitRecord.md) | Array of advanced auction processed items | [optional] [default to undefined]

## Example

```typescript
import { AdvancedAuctionProcessedItems } from './api';

const instance: AdvancedAuctionProcessedItems = {
    catalog_id,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
