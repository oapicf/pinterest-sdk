# PinterestSdkClient::AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **custom_event_metrics_type** | **String** | Metrics for custom defined conversion event. |  |
| **custom_event_name** | **String** | Name of the advertiser-defined custom conversion event |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.new(
  custom_event_metrics_type: ADE_COST_PER_ACTION,
  custom_event_name: null
)
```

