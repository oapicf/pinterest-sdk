# PinterestSdkClient::TopPinsAnalyticsResponsePinsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **metrics** | **Hash&lt;String, Float&gt;** | The metric name and daily value for each requested metric | [optional] |
| **data_status** | [**Hash&lt;String, DataStatus&gt;**](DataStatus.md) |  | [optional] |
| **pin_id** | **String** | The pin id | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TopPinsAnalyticsResponsePinsInner.new(
  metrics: {&quot;CLOSEUP&quot;:1,&quot;CLOSEUP_RATE&quot;:0,&quot;ENGAGEMENT&quot;:1,&quot;ENGAGEMENT_RATE&quot;:0,&quot;IMPRESSION&quot;:240,&quot;OUTBOUND_CLICK&quot;:20,&quot;OUTBOUND_CLICK_RATE&quot;:0.08,&quot;PIN_CLICK&quot;:37,&quot;PIN_CLICK_RATE&quot;:0.15,&quot;QUARTILE_95_PERCENT_VIEW&quot;:8,&quot;SAVE&quot;:20,&quot;SAVE_RATE&quot;:0.18,&quot;VIDEO_10S_VIEW&quot;:2,&quot;VIDEO_AVG_WATCH_TIME&quot;:2507.75,&quot;VIDEO_MRC_VIEW&quot;:20,&quot;VIDEO_START&quot;:29,&quot;VIDEO_V50_WATCH_TIME&quot;:10031},
  data_status: null,
  pin_id: 642396334344813594
)
```

