# AdvancedAuctionProcessedItem

Object describing the result of an operation on an item bid option

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**Array&lt;AdvancedAuctionOperationError&gt;**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] [default to undefined]

## Example

```typescript
import { AdvancedAuctionProcessedItem } from './api';

const instance: AdvancedAuctionProcessedItem = {
    errors,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
