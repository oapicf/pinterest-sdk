# PinAnalyticsMetricsResponseDailyMetricsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataStatus** | [**DataStatus**](DataStatus.md) |  | [optional] 
**Date** | **String** | Metrics date (UTC): YYYY-MM-DD. | [optional] 
**Metrics** | **System.Collections.Hashtable** | The metric name and daily value for each requested metric | [optional] 

## Examples

- Prepare the resource
```powershell
$PinAnalyticsMetricsResponseDailyMetricsInner = Initialize-PSOpenAPIToolsPinAnalyticsMetricsResponseDailyMetricsInner  -DataStatus null `
 -Date 2019-12-01 `
 -Metrics {&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;PIN_CLICK&quot;:37,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031}
```

- Convert the resource to JSON
```powershell
$PinAnalyticsMetricsResponseDailyMetricsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

