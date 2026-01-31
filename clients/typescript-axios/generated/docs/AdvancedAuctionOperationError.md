# AdvancedAuctionOperationError

Error which occurred when applying a bid options operation to a specific item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **number** | The error code for the item bid option operation validation error | [optional] [default to undefined]
**message** | **string** | Message describing the item bid option operation validation error | [optional] [default to undefined]

## Example

```typescript
import { AdvancedAuctionOperationError } from './api';

const instance: AdvancedAuctionOperationError = {
    code,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
