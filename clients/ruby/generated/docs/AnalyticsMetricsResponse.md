# PinterestSdkClient::AnalyticsMetricsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **daily_metrics** | [**Array&lt;AnalyticsDailyMetrics&gt;**](AnalyticsDailyMetrics.md) | Array with the requested daily metric records | [optional] |
| **summary_metrics** | **Hash&lt;String, Float&gt;** | The metric name and value over the requested period for each requested metric | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AnalyticsMetricsResponse.new(
  daily_metrics: null,
  summary_metrics: {&quot;CLOSEUP&quot;:1,&quot;CLOSEUP_RATE&quot;:0,&quot;ENGAGEMENT&quot;:1,&quot;ENGAGEMENT_RATE&quot;:0,&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;OUTBOUND_CLICK_RATE&quot;:0.08,&quot;PIN_CLICK&quot;:37,&quot;PIN_CLICK_RATE&quot;:0.15,&quot;PROFILE_VISIT&quot;:0,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031}
)
```

