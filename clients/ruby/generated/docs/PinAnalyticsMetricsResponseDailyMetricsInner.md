# PinterestSdkClient::PinAnalyticsMetricsResponseDailyMetricsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data_status** | [**DataStatus**](DataStatus.md) |  | [optional] |
| **date** | **String** | Metrics date (UTC): YYYY-MM-DD. | [optional] |
| **metrics** | **Hash&lt;String, Float&gt;** | The metric name and daily value for each requested metric | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinAnalyticsMetricsResponseDailyMetricsInner.new(
  data_status: null,
  date: 2019-12-01,
  metrics: {&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;PIN_CLICK&quot;:37,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031}
)
```

