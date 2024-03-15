# TopPinsAnalyticsResponsePinsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metrics** | **System.Collections.Hashtable** | The metric name and daily value for each requested metric | [optional] 
**DataStatus** | [**System.Collections.Hashtable**](DataStatus.md) |  | [optional] 
**PinId** | **String** | The pin id | [optional] 

## Examples

- Prepare the resource
```powershell
$TopPinsAnalyticsResponsePinsInner = Initialize-PSOpenAPIToolsTopPinsAnalyticsResponsePinsInner  -Metrics {&quot;CLOSEUP&quot;:1,&quot;CLOSEUP_RATE&quot;:0,&quot;ENGAGEMENT&quot;:1,&quot;ENGAGEMENT_RATE&quot;:0,&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;OUTBOUND_CLICK_RATE&quot;:0.08,&quot;PIN_CLICK&quot;:37,&quot;PIN_CLICK_RATE&quot;:0.15,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031} `
 -DataStatus null `
 -PinId 642396334344813594
```

- Convert the resource to JSON
```powershell
$TopPinsAnalyticsResponsePinsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

