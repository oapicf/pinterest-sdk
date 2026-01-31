# AdvancedAuctionItemsGetRequest

Request object used to get bid options values for a batch of retail catalog items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Catalog id pertaining to the retail item | [default to undefined]
**items** | [**Array&lt;AdvancedAuctionItemsGetRecord&gt;**](AdvancedAuctionItemsGetRecord.md) | A list of retail catalog items to fetch bid options for | [default to undefined]

## Example

```typescript
import { AdvancedAuctionItemsGetRequest } from './api';

const instance: AdvancedAuctionItemsGetRequest = {
    catalog_id,
    items,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
