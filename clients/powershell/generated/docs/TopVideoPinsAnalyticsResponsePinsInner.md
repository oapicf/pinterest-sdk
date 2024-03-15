# TopVideoPinsAnalyticsResponsePinsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metrics** | **System.Collections.Hashtable** | The metric name and daily value for each requested metric | [optional] 
**DataStatus** | [**System.Collections.Hashtable**](DataStatus.md) |  | [optional] 
**PinId** | **String** | The pin id | [optional] 

## Examples

- Prepare the resource
```powershell
$TopVideoPinsAnalyticsResponsePinsInner = Initialize-PSOpenAPIToolsTopVideoPinsAnalyticsResponsePinsInner  -Metrics {&quot;IMPRESSION&quot;:7,&quot;QUARTILE_95_PERCENT_VIEW&quot;:2,&quot;SAVE&quot;:1,&quot;VIDEO_10S_VIEW&quot;:5,&quot;VIDEO_AVG_WATCH_TIME&quot;:86989,&quot;VIDEO_MRC_VIEW&quot;:2,&quot;VIDEO_START&quot;:2,&quot;VIDEO_V50_WATCH_TIME&quot;:173979,&quot;OUTBOUND_CLICK&quot;:2} `
 -DataStatus null `
 -PinId 642396334344813594
```

- Convert the resource to JSON
```powershell
$TopVideoPinsAnalyticsResponsePinsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

