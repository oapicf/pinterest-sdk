# OrderLineResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**Array&lt;OrderLineError&gt;**](OrderLineError.md) | Error list if update(s) fail. | [optional] [default to undefined]
**order_line** | [**Array&lt;OrderLine&gt;**](OrderLine.md) | Order Line object array. | [optional] [default to undefined]

## Example

```typescript
import { OrderLineResponse } from './api';

const instance: OrderLineResponse = {
    errors,
    order_line,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
