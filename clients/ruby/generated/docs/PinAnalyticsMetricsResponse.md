# PinterestSdkClient::PinAnalyticsMetricsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **lifetime_metrics** | **Hash&lt;String, Integer&gt;** | The lifetime metric name and value. | [optional] |
| **daily_metrics** | [**Array&lt;PinAnalyticsMetricsResponseDailyMetricsInner&gt;**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records | [optional] |
| **summary_metrics** | **Hash&lt;String, Float&gt;** | The metric name and value over the requested period for each requested metric | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinAnalyticsMetricsResponse.new(
  lifetime_metrics: {&quot;TOTAL_COMMENTS&quot;:10,&quot;TOTAL_REACTIONS&quot;:12},
  daily_metrics: null,
  summary_metrics: {&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;PIN_CLICK&quot;:37,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031}
)
```

