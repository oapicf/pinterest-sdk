# PinAnalyticsMetricsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LifetimeMetrics** | **System.Collections.Hashtable** | The lifetime metric name and value. | [optional] 
**DailyMetrics** | [**PinAnalyticsMetricsResponseDailyMetricsInner[]**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records | [optional] 
**SummaryMetrics** | **System.Collections.Hashtable** | The metric name and value over the requested period for each requested metric | [optional] 

## Examples

- Prepare the resource
```powershell
$PinAnalyticsMetricsResponse = Initialize-PSOpenAPIToolsPinAnalyticsMetricsResponse  -LifetimeMetrics {&quot;TOTAL_COMMENTS&quot;:10,&quot;TOTAL_REACTIONS&quot;:12} `
 -DailyMetrics null `
 -SummaryMetrics {&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;PIN_CLICK&quot;:37,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031}
```

- Convert the resource to JSON
```powershell
$PinAnalyticsMetricsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

