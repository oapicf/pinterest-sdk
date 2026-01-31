# PinterestSdkClient::TrendingTopic

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | Description of the trending topic |  |
| **percent_growth_mom** | **Integer** | Month-over-month growth percentage |  |
| **pins** | [**Array&lt;TrendingPin&gt;**](TrendingPin.md) | Array of pin images related to this trend (up to 6) |  |
| **related_interests** | **Array&lt;String&gt;** | List of related interest categories |  |
| **related_searches** | **Array&lt;String&gt;** | List of related search terms |  |
| **time_series** | **Hash&lt;String, Float&gt;** | Time series data showing trend values over time, with dates as keys and values as numeric |  |
| **title** | **String** | Title of the trending topic |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TrendingTopic.new(
  description: null,
  percent_growth_mom: null,
  pins: null,
  related_interests: null,
  related_searches: null,
  time_series: null,
  title: null
)
```

