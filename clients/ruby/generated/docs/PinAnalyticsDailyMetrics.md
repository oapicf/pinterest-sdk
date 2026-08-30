# PinterestSdkClient::PinAnalyticsDailyMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data_status** | [**DataStatus**](DataStatus.md) |  | [optional] |
| **date** | **String** | Metrics date (UTC): YYYY-MM-DD. | [optional] |
| **metrics** | **Hash&lt;String, Float&gt;** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PinAnalyticsDailyMetrics.new(
  data_status: null,
  date: null,
  metrics: null
)
```

