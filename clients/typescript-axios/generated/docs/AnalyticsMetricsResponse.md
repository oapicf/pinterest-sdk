# AnalyticsMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**summary_metrics** | **{ [key: string]: number; }** | The metric name and value over the requested period for each requested metric | [optional] [default to undefined]
**daily_metrics** | [**Array&lt;AnalyticsDailyMetrics&gt;**](AnalyticsDailyMetrics.md) | Array with the requested daily metric records | [optional] [default to undefined]

## Example

```typescript
import { AnalyticsMetricsResponse } from './api';

const instance: AnalyticsMetricsResponse = {
    summary_metrics,
    daily_metrics,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
