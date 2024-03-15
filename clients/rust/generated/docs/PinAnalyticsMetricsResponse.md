# PinAnalyticsMetricsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifetime_metrics** | Option<**std::collections::HashMap<String, i32>**> | The lifetime metric name and value. | [optional]
**daily_metrics** | Option<[**Vec<models::PinAnalyticsMetricsResponseDailyMetricsInner>**](PinAnalyticsMetricsResponse_daily_metrics_inner.md)> | Array with the requested daily metric records | [optional]
**summary_metrics** | Option<**std::collections::HashMap<String, f64>**> | The metric name and value over the requested period for each requested metric | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


