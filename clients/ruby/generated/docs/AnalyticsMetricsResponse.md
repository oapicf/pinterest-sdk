# PinterestSdkClient::AnalyticsMetricsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **daily_metrics** | [**Array&lt;AnalyticsMetricsResponseDailyMetrics&gt;**](AnalyticsMetricsResponseDailyMetrics.md) | Array with the requested daily metric records | [optional] |
| **summary_metrics** | **Hash&lt;String, Float&gt;** | The metric name and value over the requested period for each requested metric | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AnalyticsMetricsResponse.new(
  daily_metrics: null,
  summary_metrics: {&quot;ENGAGEMENT&quot;:100,&quot;CLICKTHROUGH_RATE&quot;:0.2,&quot;CLICKTHROUGH&quot;:200,&quot;CLOSEUP&quot;:37,&quot;CLOSEUP_RATE&quot;:0.5,&quot;ENGAGEMENT_RATE&quot;:0.2,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;IMPRESSION&quot;:240}
)
```

