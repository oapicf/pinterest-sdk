# TopVideoPinsAnalyticsResponsePinsInner

Array with metrics, status, and pin id for the requested metric

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | **{ [key: string]: number; }** | The metric name and daily value for each requested metric | [optional] [default to undefined]
**data_status** | [**{ [key: string]: DataStatus; }**](DataStatus.md) |  | [optional] [default to undefined]
**pin_id** | **string** | The pin id | [optional] [default to undefined]

## Example

```typescript
import { TopVideoPinsAnalyticsResponsePinsInner } from './api';

const instance: TopVideoPinsAnalyticsResponsePinsInner = {
    metrics,
    data_status,
    pin_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
