# AnalyticsMetricsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SummaryMetrics** | **System.Collections.Hashtable** | The metric name and value over the requested period for each requested metric | [optional] 
**DailyMetrics** | [**AnalyticsDailyMetrics[]**](AnalyticsDailyMetrics.md) | Array with the requested daily metric records | [optional] 

## Examples

- Prepare the resource
```powershell
$AnalyticsMetricsResponse = Initialize-PSOpenAPIToolsAnalyticsMetricsResponse  -SummaryMetrics {&quot;CLOSEUP&quot;:1,&quot;CLOSEUP_RATE&quot;:0,&quot;ENGAGEMENT&quot;:1,&quot;ENGAGEMENT_RATE&quot;:0,&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;OUTBOUND_CLICK_RATE&quot;:0.08,&quot;PIN_CLICK&quot;:37,&quot;PIN_CLICK_RATE&quot;:0.15,&quot;PROFILE_VISIT&quot;:0,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031} `
 -DailyMetrics null
```

- Convert the resource to JSON
```powershell
$AnalyticsMetricsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

