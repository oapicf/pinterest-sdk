# PinAnalyticsMetricsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifetime_metrics** | **std::collections::HashMap<String, i32>** | The lifetime metric name and value. | [optional] [default to None]
**daily_metrics** | [**Vec<models::PinAnalyticsMetricsResponseDailyMetricsInner>**](PinAnalyticsMetricsResponse_daily_metrics_inner.md) | Array with the requested daily metric records | [optional] [default to None]
**summary_metrics** | **std::collections::HashMap<String, f64>** | The metric name and value over the requested period for each requested metric | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


