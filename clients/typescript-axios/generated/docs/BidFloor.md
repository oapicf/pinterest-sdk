# BidFloor

Bid floor request and response model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_floors** | **Array&lt;number&gt;** | A list of bid floors in micro currency. For example, [100000, 200000] | [optional] [readonly] [default to undefined]
**type** | **string** | Always the string \&#39;bidfloor\&#39;. | [optional] [readonly] [default to 'bidfloor']

## Example

```typescript
import { BidFloor } from './api';

const instance: BidFloor = {
    bid_floors,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
