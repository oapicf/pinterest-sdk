# TopPinsAnalyticsResponsePinsItems

Array with metrics, status, and pin id for the requested metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**{ [key: string]: DataStatus; }**](DataStatus.md) |  | [optional] [default to undefined]
**metrics** | **{ [key: string]: number; }** |  | [optional] [default to undefined]
**pin_id** | **string** | The pin id | [optional] [default to undefined]

## Example

```typescript
import { TopPinsAnalyticsResponsePinsItems } from './api';

const instance: TopPinsAnalyticsResponsePinsItems = {
    data_status,
    metrics,
    pin_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
