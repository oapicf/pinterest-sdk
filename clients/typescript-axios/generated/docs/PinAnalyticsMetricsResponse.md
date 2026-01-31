# PinAnalyticsMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daily_metrics** | [**Array&lt;PinAnalyticsMetricsResponseDailyMetricsInner&gt;**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records | [optional] [default to undefined]
**lifetime_metrics** | **{ [key: string]: number; }** | The lifetime metric name and value. | [optional] [default to undefined]
**summary_metrics** | **{ [key: string]: number; }** | The metric name and value over the requested period for each requested metric | [optional] [default to undefined]

## Example

```typescript
import { PinAnalyticsMetricsResponse } from './api';

const instance: PinAnalyticsMetricsResponse = {
    daily_metrics,
    lifetime_metrics,
    summary_metrics,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
