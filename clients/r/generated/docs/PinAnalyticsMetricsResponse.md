# openapi::PinAnalyticsMetricsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifetime_metrics** | **map(integer)** | The lifetime metric name and value. | [optional] 
**daily_metrics** | [**array[PinAnalyticsMetricsResponseDailyMetricsInner]**](PinAnalyticsMetricsResponse_daily_metrics_inner.md) | Array with the requested daily metric records | [optional] 
**summary_metrics** | **map(numeric)** | The metric name and value over the requested period for each requested metric | [optional] 


