# PinAnalyticsMetricsResponseDailyMetricsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_status** | [**DataStatus**](DataStatus.md) |  | [optional] [default to undefined]
**date** | **string** | Metrics date (UTC): YYYY-MM-DD. | [optional] [default to undefined]
**metrics** | **{ [key: string]: number; }** | The metric name and daily value for each requested metric | [optional] [default to undefined]

## Example

```typescript
import { PinAnalyticsMetricsResponseDailyMetricsInner } from './api';

const instance: PinAnalyticsMetricsResponseDailyMetricsInner = {
    data_status,
    date,
    metrics,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
