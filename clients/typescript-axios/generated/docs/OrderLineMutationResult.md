# OrderLineMutationResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**Array&lt;OrderLineMutationError&gt;**](OrderLineMutationError.md) | Error list if update(s) fail. | [optional] [default to undefined]
**order_line** | [**Array&lt;OrderLine&gt;**](OrderLine.md) | Order Line object array. | [optional] [default to undefined]

## Example

```typescript
import { OrderLineMutationResult } from './api';

const instance: OrderLineMutationResult = {
    errors,
    order_line,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
