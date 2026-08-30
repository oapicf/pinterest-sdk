# PinterestSdkClient::AnalyticsDailyMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data_status** | [**DataStatus**](DataStatus.md) |  | [optional] |
| **date** | **String** | Metrics date (UTC): YYYY-MM-DD. | [optional] |
| **metrics** | **Hash&lt;String, Float&gt;** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AnalyticsDailyMetrics.new(
  data_status: null,
  date: 2019-12-01,
  metrics: null
)
```

